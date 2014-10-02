package com.cloudkey.pms.micros.ows

import java.util.Currency
import javax.annotation.Nullable

import com.cloudkey.pms.common.payment.MonetaryAmount
import com.cloudkey.pms.common.profile.{CustomerProfile, NativeName, PersonName, StreetAddress}
import com.cloudkey.pms.common.reservation.{DepositRequirement, Discount, RatePlan, Room, RoomRate, RoomType, _}
import com.cloudkey.pms.micros.og.common.Amount
import com.cloudkey.pms.micros.og.hotelcommon
import com.cloudkey.pms.micros.og.hotelcommon._
import com.cloudkey.pms.micros.og.name.{CompanyCompanyType, NameAddress, Profile}
import com.cloudkey.pms.micros.og.reservation.{HotelReservation, ResGuest}
import com.cloudkey.pms.micros.ows.IdUtils._
import com.google.common.collect.Iterables
import com.google.inject.{Singleton, Inject}
import com.keypr.pms.micros.oxi.ids.MicrosIds.OWS.PhoneNumberRole
import com.keypr.scala.OptionalConverters._
import com.micros.pms.util.ParagraphHelper

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import scala.collection.mutable

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
class ReservationConverter extends ConverterUtils {
  /**
   * Converts an OWS [[HotelReservation]] to a Keypr [[Reservation]].
   *
   * @param from
   * @return
   */
  def convertReservation(from: HotelReservation): Reservation = {
    val resv = Reservation.builder

    resv.pmsReservationId(
      findPmsReservationId(from.getUniqueIDList).orNull
    )

    resv.confirmationNo(
      findConfirmationNumId(from.getUniqueIDList).orNull
    )

    resv.legNumber(
      findlegNumber(from.getUniqueIDList).orNull
    )

    resv.reservationStatus(
      fromMicrosEnum(from.getReservationStatus)
    )

    // There will only be one resGuest.
    from.getResGuests.headOption.foreach(resGuest => {
      resv.expectedArrivalTime(resGuest.getArrivalTime)
      resv.expectedDepartureTime(resGuest.getDepartureTime)

      resGuest.getProfiles.find(_.getCustomer != null).map(convertCustomerProfile).foreach(resv.customerProfile)

      // There will be only up to one profile of each type, except for contacts which may be numerous
      convertProfiles(resGuest, CompanyCompanyType.COMPANY).headOption.foreach(resv.companyProfile)
      convertProfiles(resGuest, CompanyCompanyType.TRAVEL_AGENT).headOption.foreach(resv.travelAgentProfile)
      convertProfiles(resGuest, CompanyCompanyType.GROUP).headOption.foreach(resv.groupProfile)
      convertProfiles(resGuest, CompanyCompanyType.SOURCE).headOption.foreach(resv.sourceProfile)
      resv.contactProfiles(convertProfiles(resGuest, CompanyCompanyType.CONTACT).toList)
    })

    from.getRoomStays.headOption.foreach(roomStay => {
      resv.adultCount(
        countGuests(roomStay, AgeQualifyingCode.ADULT)
      )

      resv.childrenCount(
        countGuests(roomStay, AgeQualifyingCode.CHILD, AgeQualifyingCode.CHILDBUCKET_1, AgeQualifyingCode.CHILDBUCKET_2, AgeQualifyingCode.CHILDBUCKET_3)
      )

      val creditCardOpt = Option(roomStay.getGuarantee).toSeq
        .flatMap(_.getGuaranteesAccepted.asScala)
        .collectFirst({
        case guarantee if guarantee.getGuaranteeCreditCard != null => guarantee.getGuaranteeCreditCard
      })

//      creditCardOpt.foreach(creditCard => {
//        resv.creditCardType(creditCard.getCardType)
//        resv.creditCardExpirationDate(creditCard.getExpirationDate)
//        resv.creditCardHolderName(creditCard.getCardHolderName)
//        resv.creditCardNumber(creditCard.getCardNumber)
//      })

      Option(roomStay.getTimeSpan).foreach(timeSpan => {
        Option(timeSpan.getStartDate).map(_.toLocalDate)
          .foreach(resv.startDate)

        Option(timeSpan.getEndDate).map(_.toLocalDate)
          .foreach(resv.endDate)
      })

      roomStay.getRatePlans.headOption.map(convertRatePlan).foreach(resv.roomRatePlan)

      resv.roomRates(convertRoomRates(roomStay.getRoomRates))

      roomStay.getRoomTypes.headOption.foreach(roomType => {
        resv.room(convertRoomType(roomType))

        resv.additionalReservedRoomCount(
          Option(roomType.getNumberOfUnits)
            .map(_ - 1) // Do not count the first room towards the additional count
            .map(Int.box) // Convert to java Integer
            .orNull
        )
      })

      Option(roomStay.getCurrentBalance).map(convertAmount)
        .foreach(resv.currentBalance)

      Option(roomStay.getTotal).map(convertAmount)
        .foreach(resv.totalCost)

      Option(roomStay.getMemberAwardInfo).flatMap(info => Option(info.getMembershipID)).map(_.toString)
        .foreach(resv.membershipId)

      resv.comments(roomStay.getComments.map(comment =>
        new Comment(ParagraphHelper.getFirstString(comment).orNull,
          comment.isGuestViewable)
      ))
    })

    resv.hasRoomPreferences(from.isRoomPreferenceExists)
    resv.hasSpecialRequests(from.isSpecialsExists)

    resv.build
  }

  private def convertCustomerProfile(profile: Profile) = {
    val customer = profile.getCustomer

    new CustomerProfile(
      IdUtils.findInternalProfileId(profile.getProfileIDs).orNull,
      Option(customer.getPersonName).map(personName => {
        new PersonName(
          personName.getNameTitles,
          personName.getFirstName,
          personName.getMiddleNames,
          personName.getLastName,
          personName.getNameSuffixes,
          personName.getProfession,
          personName.getFamiliarName
        )
      }).orNull,
      Option(customer.getNativeName).map(convertNativeName).orNull,
      customer.getBusinessTitle,
      fromMicrosEnum(customer.getGender),
      customer.getBirthDate,
      profile.getAddresses.map(convertAddress),
      profile.getEMails.map(_.getValue),
      profile.getPhones.filter(_.getPhoneRole == PhoneNumberRole.PHONE.name).map(_.getPhoneNumber),
      profile.getPhones.filter(_.getPhoneRole == PhoneNumberRole.FAX.name).map(_.getPhoneNumber)
    )
  }

  private def convertProfiles(resGuest: ResGuest, profileType: CompanyCompanyType) = {
    resGuest.getProfiles.filter(profile => profile.getCompany != null && profile.getCompany.getCompanyType == profileType)
      .map(p => new ProfileReference(
      IdUtils.findInternalProfileId(p.getProfileIDs).orNull,
      p.getCompany.getCompanyID,
      p.getCompany.getCompanyName
    ))
  }

  private def countGuests(roomStay: hotelcommon.RoomStay, ageCodes: AgeQualifyingCode*): Integer = {
    // Find the count for each GuestCount object for one of the given ageCodes
    val counts = Option(roomStay.getGuestCounts).toSeq
      .flatMap(_.getGuestCounts.asScala)
      .collect({
      case guestCount: GuestCount if ageCodes.contains(guestCount.getAgeQualifyingCode) =>
        Option(guestCount.getCount).map(_.toInt).getOrElse(0)
    })

    // Sum them
    counts.sum
  }

  private def convertRoomType(from: hotelcommon.RoomType): Room = {
    val roomType: RoomType = new RoomType(
      from.getRoomTypeCode,
      from.getRoomTypeName,
      ParagraphHelper.getFirstString(from.getRoomTypeDescription).orNull,
      from.getRoomClass
    )

    new Room(
      roomType,
      Iterables.getFirst(from.getRoomNumbers, null),
      from.getInvBlockCode
    )
  }
}