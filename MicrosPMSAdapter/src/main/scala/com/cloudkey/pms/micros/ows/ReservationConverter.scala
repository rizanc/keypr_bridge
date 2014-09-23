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
import com.keypr.scala.OptionalConverters
import com.micros.pms.util.ParagraphHelper
import OptionalConverters._

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import scala.collection.mutable

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
@Singleton
class ReservationConverter {
  @Inject
  var defaultCurrency: Currency = _

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

      resv.roomRates(roomStay.getRoomRates.flatMap(_.getRates.asScala).map(convertRate))

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
      Option(customer.getNativeName).map(nativeName => {
        new NativeName(
          customer.getNativeName.getLanguageCode,
          customer.getNativeName.getNameTitles,
          customer.getNativeName.getFirstName,
          customer.getNativeName.getMiddleNames,
          customer.getNativeName.getLastName,
          customer.getNativeName.getNameSuffixes,
          customer.getNativeName.getProfession,
          customer.getNativeName.getFamiliarName
        )
      }).orNull,
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

  private def convertAddress(address: NameAddress): StreetAddress = {
    new StreetAddress(
      address.getAddressLines,
      address.getCityName,
      address.getStateProv,
      address.getCountryCode,
      address.getPostalCode,
      address.getBarCode,
      address.getCityExtension,
      address.getAddressType,
      address.getOtherAddressType,
      address.getLanguageCode
    )
  }

  private def convertRate(rate: hotelcommon.Rate): RoomRate = {
    new RoomRate(
      fromMicrosEnum(rate.getRateOccurrence),
      rate.getEffectiveDate,
      rate.getExpirationDate,
      convertAmount(rate.getBase),
      rate.getPoints
    )
  }

  private def convertRatePlan(ratePlan: hotelcommon.RatePlan): RatePlan = {
    val details: Iterable[AdditionalDetail] = ratePlan.getAdditionalDetails.asScala

    new RatePlan(
      ratePlan.getRatePlanCode,
      ratePlan.getRatePlanName,
      ParagraphHelper.getFirstString(ratePlan.getRatePlanShortDescription).orNull,
      ParagraphHelper.getFirstString(ratePlan.getRatePlanDescription).orNull,
      Option(ratePlan.getDepositRequired).map(convertDeposit).orNull,
      Option(ratePlan.getDiscount).flatMap(convertDiscount).orNull,
      getAdditionalDetail(details, AdditionalDetailType.RATE_RULES).orNull,
      getAdditionalDetail(details, AdditionalDetailType.MARKETING_INFORMATION).orNull,
      getAdditionalDetail(details, AdditionalDetailType.DEPOSIT_POLICY).orNull,
      getAdditionalDetail(details, AdditionalDetailType.PROMOTION).orNull,
      getAdditionalDetail(details, AdditionalDetailType.COMMISSION_POLICY).orNull,
      getAdditionalDetail(details, AdditionalDetailType.GUARANTEE_POLICY).orNull,
      getAdditionalDetail(details, AdditionalDetailType.MISCELLANEOUS).orNull,
      getAdditionalDetail(details, AdditionalDetailType.PACKAGE_OPTIONS).orNull,
      getAdditionalDetail(details, AdditionalDetailType.PENALTY_POLICY).orNull,
      getAdditionalDetail(details, AdditionalDetailType.TA_SPECIAL_REQUEST).orNull,
      getAdditionalDetail(details, AdditionalDetailType.TAX_INFORMATION).orNull,
      getAdditionalDetail(details, AdditionalDetailType.CANCEL_POLICY).orNull,
      getAdditionalDetail(details, AdditionalDetailType.POINTS_POLICY).orNull,
      getAdditionalDetails(details, AdditionalDetailType.OTHER).toList
    )
  }

  private def convertDeposit(from: hotelcommon.DepositRequirement): DepositRequirement = {
    new DepositRequirement(
      from.getDueDate,
      convertAmount(from.getDepositAmount),
      convertAmount(from.getDepositDueAmount)
    )
  }

  private def convertDiscount(from: hotelcommon.Discount): Option[Discount] = {
    from.getDiscountType match {
      case DiscountType.FLAT =>
        Some(new FlatDiscount(from.getDiscountReason, new MonetaryAmount(from.getDiscountAmount, 2.toShort, defaultCurrency)))

      case DiscountType.PERCENT =>
        Some(new PercentDiscount(from.getDiscountReason, from.getDiscountAmount))

      case _ =>
        None
    }
  }

  private def getCurrency(@Nullable optionalCode: String): Currency = {
    if (optionalCode == null || optionalCode.isEmpty) {
      defaultCurrency
    } else {
      Currency.getInstance(optionalCode)
    }
  }

  private def convertAmount(from: Amount): MonetaryAmount = {
    new MonetaryAmount(from.getValue, from.getDecimals, getCurrency(from.getCurrencyCode))
  }

  private def getAdditionalDetails(details: Traversable[AdditionalDetail], detailType: AdditionalDetailType): Traversable[String] = {
    details.collect({
      case detail if detail.getDetailType == detailType =>
        ParagraphHelper.getFirstString(detail.getAdditionalDetailDescription): Option[String]
    }).flatten
  }

  private def getAdditionalDetail(details: Traversable[AdditionalDetail], detailType: AdditionalDetailType): Option[String] = {
    details.collectFirst({
      case detail if detail.getDetailType == detailType =>
        ParagraphHelper.getFirstString(detail.getAdditionalDetailDescription): Option[String]
    }).flatten
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