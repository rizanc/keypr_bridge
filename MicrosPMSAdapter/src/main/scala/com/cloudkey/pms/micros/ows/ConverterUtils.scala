package com.cloudkey.pms.micros.ows

import java.util.Currency
import java.lang
import java.util.{List => JavaList}
import javax.annotation.Nullable

import com.cloudkey.pms.common.payment.MonetaryAmount
import com.cloudkey.pms.common.profile.{NativeName, StreetAddress}
import com.cloudkey.pms.common.reservation._
import com.cloudkey.pms.micros.og.common.{UniqueID, Amount}
import com.cloudkey.pms.micros.og.hotelcommon
import com.cloudkey.pms.micros.og.hotelcommon.{DiscountType, AdditionalDetailType, AdditionalDetail}
import com.cloudkey.pms.micros.og.name.NameAddress
import com.cloudkey.pms.micros.og.name.{NativeName => OWSNativeName}
import com.cloudkey.pms.micros.ows.IdUtils._
import com.google.inject.{Singleton, Inject}
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

  def convertAmount(from: Amount): MonetaryAmount = {
    val decimals: Short = if (from.getDecimals == null) {
      2.toShort
    } else {
      from.getDecimals.toShort
    }

    new MonetaryAmount(from.getValue, decimals, getCurrency(from.getCurrencyCode))
  }

  def convertRatePlan(ratePlan: hotelcommon.RatePlan): RatePlan = {
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
      getAdditionalDetails(details, AdditionalDetailType.OTHER).toList,
      ratePlan.isHold,
      ratePlan.isMandatoryDeposit,
      ratePlan.isHasPackage,
      Option(ratePlan.getCancellationDateTime).map(_.getValue).orNull
    )
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


  def getAdditionalDetails(details: Traversable[AdditionalDetail], detailType: AdditionalDetailType): Traversable[String] = {
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
      case DiscountType.FLAT =>
        Some(new FlatDiscount(from.getDiscountReason, new MonetaryAmount(from.getDiscountAmount, 2.toShort, defaultCurrency)))

      case DiscountType.PERCENT =>
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

  def nullsafeUniqueIdValue(id: UniqueID): Option[String] = {
    Option(id).flatMap(nullsafeId => Option(nullsafeId.getValue))
  }
}
