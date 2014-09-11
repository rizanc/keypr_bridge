package com.micros.pms.util

import java.util.Currency
import javax.annotation.Nullable

import com.cloudkey.pms.common.payment.MonetaryAmount
import com.cloudkey.pms.common.profile.{StreetAddress, NativeName, PersonName, CustomerProfile}
import com.cloudkey.pms.common.reservation.{DepositRequirement, Discount, RatePlan, Room, RoomType, RoomRate, _}
import com.cloudkey.pms.micros.og.common.Amount
import com.cloudkey.pms.micros.og.hotelcommon
import com.cloudkey.pms.micros.og.hotelcommon._
import com.cloudkey.pms.micros.og.name.{Profile, CompanyCompanyType, NameAddress, Customer}
import com.cloudkey.pms.micros.og.reservation.{ResGuest, HotelReservation}
import com.cloudkey.pms.micros.ows.IdUtils
import com.cloudkey.pms.micros.ows.IdUtils._
import com.google.common.collect.Iterables
import com.google.inject.Inject
import com.keypr.pms.micros.oxi.ids.MicrosIds.OWS.PhoneNumberRole
import keypr.scala.OptionalConverters._

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import scala.collection.mutable

/**
* @author Charlie La Mothe (charlie@concentricsky.com)
*/
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
    val resv = new ReservationBuilder

    resv.setPmsReservationId(
      findPmsReservationId(from.getUniqueIDList).orNull
    )

    resv.setConfirmationNo(
      findConfirmationNumId(from.getUniqueIDList).orNull
    )

    resv.setLegNumber(
      findlegNumber(from.getUniqueIDList).orNull
    )

    resv.setReservationStatus(
      fromMicrosEnum(from.getReservationStatus)
    )

    // There will only be one resGuest.
    from.getResGuests.headOption.foreach(resGuest => {
      resv.setExpectedArrivalTime(resGuest.getArrivalTime)
      resv.setExpectedDepartureTime(resGuest.getDepartureTime)

      resGuest.getProfiles.find(_.getCustomer != null).map(convertCustomerProfile).foreach(resv.setCustomerProfile)

      // There will be only up to one profile of each type, except for contacts which may be numerous
      convertProfiles(resGuest, CompanyCompanyType.COMPANY).headOption.foreach(resv.setCompanyProfile)
      convertProfiles(resGuest, CompanyCompanyType.TRAVEL_AGENT).headOption.foreach(resv.setTravelAgentProfile)
      convertProfiles(resGuest, CompanyCompanyType.GROUP).headOption.foreach(resv.setGroupProfile)
      convertProfiles(resGuest, CompanyCompanyType.SOURCE).headOption.foreach(resv.setSourceProfile)
      resv.setContactProfiles(convertProfiles(resGuest, CompanyCompanyType.CONTACT).toList)
    })

    from.getRoomStays.headOption.foreach(roomStay => {
      resv.setAdultCount(
        countGuests(roomStay, AgeQualifyingCode.ADULT)
      )

      resv.setChildrenCount(
        countGuests(roomStay, AgeQualifyingCode.CHILD, AgeQualifyingCode.CHILDBUCKET_1, AgeQualifyingCode.CHILDBUCKET_2, AgeQualifyingCode.CHILDBUCKET_3)
      )

      val creditCardOpt = Option(roomStay.getGuarantee).toSeq
        .flatMap(_.getGuaranteesAccepted.asScala)
        .collectFirst({
          case guarantee if guarantee.getGuaranteeCreditCard != null => guarantee.getGuaranteeCreditCard
        })

      creditCardOpt.foreach(creditCard => {
        resv.setCreditCardType(creditCard.getCardType)
        resv.setCreditCardExpirationDate(creditCard.getExpirationDate)
        resv.setCreditCardHolderName(creditCard.getCardHolderName)
        resv.setCreditCardNumber(creditCard.getCardNumber)
      })

      Option(roomStay.getTimeSpan).foreach(timeSpan => {
        Option(timeSpan.getStartDate).map(_.toLocalDate)
          .foreach(resv.setStartDate)

        Option(timeSpan.getEndDate).map(_.toLocalDate)
          .foreach(resv.setEndDate)
      })

      roomStay.getRatePlans.headOption.map(convertRatePlan).foreach(resv.setRoomRatePlan)

      resv.setRoomRates(roomStay.getRoomRates.headOption.toSeq.flatMap(_.getRates.asScala).map(convertRate).toList)

      roomStay.getRoomTypes.headOption.foreach(roomType => {
        resv.setRoom(convertRoomType(roomType))

        resv.setAdditionalReservedRoomCount(
          Option(roomType.getNumberOfUnits)
            .map(_ - 1) // Do not count the first room towards the additional count
            .map(Int.box) // Convert to java Integer
            .orNull
        )
      })

      Option(roomStay.getCurrentBalance).map(convertAmount)
        .foreach(resv.setCurrentBalance)

      Option(roomStay.getTotal).map(convertAmount)
        .foreach(resv.setTotalCost)

      Option(roomStay.getMemberAwardInfo).flatMap(info => Option(info.getMembershipID)).map(_.toString)
        .foreach(resv.setMembershipId)

      resv.setComments(roomStay.getComments.map(comment =>
        new Comment(ParagraphHelper.getFirstString(comment).orNull,
          comment.isGuestViewable)
      ))
    })

    resv.setHasRoomPreferences(from.isRoomPreferenceExists)
    resv.setHasSpecialRequests(from.isSpecialsExists)

    resv.createReservation()
  }

  private def convertCustomerProfile(profile: Profile) = {
    val customer = profile.getCustomer

    new CustomerProfile(
      IdUtils.findInternalProfileId(profile.getProfileIDs).orNull,
      new PersonName(
        customer.getPersonName.getNameTitles,
        customer.getPersonName.getFirstName,
        customer.getPersonName.getMiddleNames,
        customer.getPersonName.getLastName,
        customer.getPersonName.getNameSuffixes,
        customer.getPersonName.getProfession,
        customer.getPersonName.getFamiliarName
      ),
      new NativeName(
        customer.getNativeName.getLanguageCode,
        customer.getNativeName.getNameTitles,
        customer.getNativeName.getFirstName,
        customer.getNativeName.getMiddleNames,
        customer.getNativeName.getLastName,
        customer.getNativeName.getNameSuffixes,
        customer.getNativeName.getProfession,
        customer.getNativeName.getFamiliarName
      ),
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
    val details: mutable.Buffer[AdditionalDetail] = ratePlan.getAdditionalDetails

    new RatePlan(
      ratePlan.getRatePlanCode,
      ratePlan.getRatePlanName,
      ParagraphHelper.getFirstString(ratePlan.getRatePlanShortDescription).orNull,
      ParagraphHelper.getFirstString(ratePlan.getRatePlanDescription).orNull,
      new DepositRequirement(
        ratePlan.getDepositRequired.getDueDate,
        convertAmount(ratePlan.getDepositRequired.getDepositAmount),
        convertAmount(ratePlan.getDepositRequired.getDepositDueAmount)
      ),
      Option(ratePlan.getDiscount).flatMap(convertDiscount).orNull,
      ratePlan.getCancellationDateTime.getValue,
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

  private def convertDiscount(from: hotelcommon.Discount): Option[Discount] = {
    from.getDiscountType match {
      case DiscountType.FLAT =>
        Some(new NominalDiscount(from.getDiscountReason, new MonetaryAmount(from.getDiscountAmount, 2.toShort, defaultCurrency)))

      case DiscountType.PERCENT =>
        Some(new PercentDiscount(from.getDiscountReason, from.getDiscountAmount))
    }

    None
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
          guestCount.getCount.toInt
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