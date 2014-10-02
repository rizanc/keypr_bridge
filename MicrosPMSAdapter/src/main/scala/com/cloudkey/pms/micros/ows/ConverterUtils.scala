package com.cloudkey.pms.micros.ows

import java.lang.Integer
import java.util.Currency
import java.lang
import java.util.{List => JavaList}
import javax.annotation.Nullable

import com.cloudkey.pms.common.Restriction
import com.cloudkey.pms.common.payment.MonetaryAmount
import com.cloudkey.pms.common.profile.{PersonName, CustomerProfile, NativeName, StreetAddress}
import com.cloudkey.pms.common.reservation.DepositRequirement
import com.cloudkey.pms.common.reservation.Discount
import com.cloudkey.pms.common.reservation.RatePlan
import com.cloudkey.pms.common.reservation.RoomRate
import com.cloudkey.pms.common.reservation._
import com.cloudkey.pms.micros.og.common.{UniqueID, Amount}
import com.cloudkey.pms.micros.og.hotelcommon
import com.cloudkey.pms.micros.og.hotelcommon.{AdditionalDetailType, AdditionalDetail}
import com.cloudkey.pms.micros.og.name.{NativeName => OWSNativeName, Profile, NameAddress}
import com.cloudkey.pms.micros.ows.IdUtils._
import com.cloudkey.pms.response.rooms
import com.cloudkey.pms.response.rooms.{DayCharges, RoomStayCharges}
import com.google.inject.{Singleton, Inject}
import com.keypr.pms.micros.oxi.ids.MicrosIds.OWS.PhoneNumberRole
import com.keypr.scala.OptionalConverters._
import com.micros.pms.util.ParagraphHelper
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
class ConverterUtils  {

  @Inject
  var defaultCurrency: Currency = _

  def getCurrency(@Nullable optionalCode: String): Currency = {
    if (optionalCode == null || optionalCode.isEmpty) {
      defaultCurrency
    } else {
      Currency.getInstance(optionalCode)
    }
  }

  def convertAmount(nullableFrom: Amount): MonetaryAmount = {
    Option(nullableFrom) match {
      case Some(from ) => {
        val decimals: Short = if (from.getDecimals == null) {
          2.toShort
        } else {
          from.getDecimals.toShort
        }

        new MonetaryAmount(from.getValue, decimals, getCurrency(from.getCurrencyCode))
      }

      case None => {
        null
      }
    }
  }

  def convertRatePlan(ratePlan: hotelcommon.RatePlan): RatePlan = {
    val details: Iterable[hotelcommon.AdditionalDetail] = ratePlan.getAdditionalDetails.asScala

    new RatePlan(
      ratePlan.getRatePlanCode,
      ratePlan.getRatePlanName,
      ParagraphHelper.getFirstString(ratePlan.getRatePlanShortDescription).orNull,
      ParagraphHelper.getFirstString(ratePlan.getRatePlanDescription).orNull,
      Option(ratePlan.getDepositRequired).map(convertDeposit).orNull,
      Option(ratePlan.getDiscount).flatMap(convertDiscount).orNull,
      getAdditionalDetail(details, hotelcommon.AdditionalDetailType.RATE_RULES).orNull,
      getAdditionalDetail(details, hotelcommon.AdditionalDetailType.MARKETING_INFORMATION).orNull,
      getAdditionalDetail(details, hotelcommon.AdditionalDetailType.DEPOSIT_POLICY).orNull,
      getAdditionalDetail(details, hotelcommon.AdditionalDetailType.PROMOTION).orNull,
      getAdditionalDetail(details, hotelcommon.AdditionalDetailType.COMMISSION_POLICY).orNull,
      getAdditionalDetail(details, hotelcommon.AdditionalDetailType.GUARANTEE_POLICY).orNull,
      getAdditionalDetail(details, hotelcommon.AdditionalDetailType.MISCELLANEOUS).orNull,
      getAdditionalDetail(details, hotelcommon.AdditionalDetailType.PACKAGE_OPTIONS).orNull,
      getAdditionalDetail(details, hotelcommon.AdditionalDetailType.PENALTY_POLICY).orNull,
      getAdditionalDetail(details, hotelcommon.AdditionalDetailType.TA_SPECIAL_REQUEST).orNull,
      getAdditionalDetail(details, hotelcommon.AdditionalDetailType.TAX_INFORMATION).orNull,
      getAdditionalDetail(details, hotelcommon.AdditionalDetailType.CANCEL_POLICY).orNull,
      getAdditionalDetail(details, hotelcommon.AdditionalDetailType.POINTS_POLICY).orNull,
      getAdditionalDetails(details, hotelcommon.AdditionalDetailType.OTHER).toList,
      ratePlan.isHold,
      ratePlan.isMandatoryDeposit,
      ratePlan.isHasPackage,
      Option(ratePlan.getCancellationDateTime).map(_.getValue).orNull
    )
  }

  def convertRestrictions(restrictions: JavaList[hotelcommon.Restriction]): JavaList[Restriction] = {
    restrictions.map(from => {
      new Restriction(
        fromMicrosEnum(from.getRestrictionType),
        Option(from.getNumberOfDays).map(bigInt => bigInt.intValue(): Integer).orNull,
        from.getRoomType,
        from.getRateCode
      )
    })
  }

  def convertRoomRates(roomRates: JavaList[hotelcommon.RoomRate]) = {
    roomRates.flatMap(roomRate => roomRate.getRates.asScala.map(convertRate(_, roomRate))).asJava
  }

  def convertRate(rate: hotelcommon.Rate, roomRate: hotelcommon.RoomRate): RoomRate = {
    new RoomRate(
      roomRate.getRoomTypeCode,
      roomRate.getRatePlanCode,
      roomRate.isSuppressRate,
      roomRate.isHasPackage,
      fromMicrosEnum(rate.getRateOccurrence),
      rate.getEffectiveDate,
      rate.getExpirationDate,
      convertAmount(rate.getBase),
      rate.getPoints
    )
  }


  def getAdditionalDetails(details: Traversable[hotelcommon.AdditionalDetail], detailType: hotelcommon.AdditionalDetailType): Traversable[String] = {
    details.collect({
      case detail if detail.getDetailType == detailType =>
        ParagraphHelper.getFirstString(detail.getAdditionalDetailDescription): Option[String]
    }).flatten
  }

  def getAdditionalDetail(details: Traversable[AdditionalDetail], detailType: AdditionalDetailType): Option[String] = {
    details.collectFirst({
      case detail if detail.getDetailType == detailType =>
        ParagraphHelper.getFirstString(detail.getAdditionalDetailDescription): Option[String]
    }).flatten
  }

  def convertDeposit(from: hotelcommon.DepositRequirement): DepositRequirement = {
    new DepositRequirement(
      from.getDueDate,
      convertAmount(from.getDepositAmount),
      convertAmount(from.getDepositDueAmount)
    )
  }

  def convertDiscount(from: hotelcommon.Discount): Option[Discount] = {
    from.getDiscountType match {
      case hotelcommon.DiscountType.FLAT =>
        Some(new FlatDiscount(from.getDiscountReason, new MonetaryAmount(from.getDiscountAmount, 2.toShort, defaultCurrency)))

      case hotelcommon.DiscountType.PERCENT =>
        Some(new PercentDiscount(from.getDiscountReason, from.getDiscountAmount))

      case _ =>
        None
    }
  }

  def convertAddress(address: NameAddress): StreetAddress = {
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

  def convertNativeName(from: OWSNativeName): NativeName = {
    new NativeName(
      from.getLanguageCode,
      from.getNameTitles,
      from.getFirstName,
      from.getMiddleNames,
      from.getLastName,
      from.getNameSuffixes,
      from.getProfession,
      from.getFamiliarName
    )
  }

  def convertDailyChargeList(expectedCharges: hotelcommon.DailyChargeList): RoomStayCharges = {
    if (expectedCharges == null) {
      return null
    }

    val dayCharges = expectedCharges.getChargesForPostingDates.map(chargesForTheDay => {
      val builder: DayCharges.DayChargesBuilder = DayCharges.builder

      val roomRateAndPackages: hotelcommon.ChargeList = chargesForTheDay.getRoomRateAndPackages

      if (roomRateAndPackages != null) {
        val roomRateDecimals: Short = if (roomRateAndPackages.getDecimals == null) 2 else roomRateAndPackages.getDecimals
        builder.roomAndPackageTotal(new MonetaryAmount(roomRateAndPackages.getTotalCharges, roomRateDecimals, defaultCurrency))
        builder.roomAndPackageCharges(roomRateAndPackages.getCharges.map(toCharge))
      }

      val taxesAndFees: hotelcommon.ChargeList = chargesForTheDay.getTaxesAndFees

      if (taxesAndFees != null) {
        val roomRateDecimals: Short = if (taxesAndFees.getDecimals == null) 2 else taxesAndFees.getDecimals
        builder.taxAndFeeTotal(new MonetaryAmount(taxesAndFees.getTotalCharges, roomRateDecimals, defaultCurrency))
        builder.taxAndFeeCharges(roomRateAndPackages.getCharges.map(toCharge))
      }

      chargesForTheDay.getPostingDate -> builder.build
    }).toMap

    val decimals: Short = Option(expectedCharges.getDecimals).map(_.toShort).getOrElse(2.toShort)

    return new RoomStayCharges(
      new MonetaryAmount(expectedCharges.getTotalRoomRateAndPackages, decimals, defaultCurrency),
      new MonetaryAmount(expectedCharges.getTotalTaxesAndFees, decimals, defaultCurrency),
      expectedCharges.isTaxInclusive,
      dayCharges
    )
  }

  def toCharge(from: hotelcommon.Charge): rooms.Charge = {
    new rooms.Charge(
      from.getDescription,
      convertAmount(from.getAmount),
      from.getCodeType,
      from.getCode
    )
  }

  def convertCustomerProfiles(profiles: JavaList[Profile]): JavaList[CustomerProfile] = {
    profiles.map(convertCustomerProfile)
  }

  def convertCustomerProfile(profile: Profile) = {
    val customerOpt = Option(profile.getCustomer)

    new CustomerProfile(
      IdUtils.findInternalProfileId(profile.getProfileIDs).orNull,
      customerOpt.flatMap(customer => Option(customer.getPersonName)).map(personName => {
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
      customerOpt.flatMap(customer => Option(customer.getNativeName)).map(convertNativeName).orNull,
      customerOpt.map(customer => customer.getBusinessTitle).orNull,
      customerOpt.map(customer => fromMicrosEnum(customer.getGender)).orNull,
      customerOpt.map(_.getBirthDate).orNull,
      profile.getAddresses.map(convertAddress),
      profile.getEMails.map(_.getValue),
      profile.getPhones.filter(ph => ph.getPhoneRole == PhoneNumberRole.PHONE.name || ph.getPhoneRole == null).map(_.getPhoneNumber),
      profile.getPhones.filter(_.getPhoneRole == PhoneNumberRole.FAX.name).map(_.getPhoneNumber)
    )
  }

  def nullsafeUniqueIdValue(id: UniqueID): Option[String] = {
    Option(id).flatMap(nullsafeId => Option(nullsafeId.getValue))
  }
}
