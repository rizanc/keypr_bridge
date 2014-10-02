package com.cloudkey.pms.micros.ows

import java.util.Currency
import javax.annotation.Nullable

import com.cloudkey.pms.common.payment.MonetaryAmount
import com.cloudkey.pms.common.profile.{CustomerProfile, NativeName, PersonName, StreetAddress}
import com.cloudkey.pms.common.reservation.{DepositRequirement, Discount, RatePlan, Room, RoomRate, RoomType, _}
import com.cloudkey.pms.micros.og.common.Amount
import com.cloudkey.pms.micros.og.{reservation, hotelcommon}
import com.cloudkey.pms.micros.og.hotelcommon._
import com.cloudkey.pms.micros.og.name.{CompanyCompanyType, NameAddress, Profile}
import com.cloudkey.pms.micros.og.reservation.{BillHeader, HotelReservation, ResGuest,
                          BillItem => OWSBillItem, BillTax => OWSBillTax, CreditCardSurcharge => OWSCreditCardSurcharge}
import com.cloudkey.pms.micros.ows.IdUtils._
import com.cloudkey.pms.response.invoice.{BillTax, CreditCardSurcharge, BillItem, Bill}
import com.google.common.collect.Iterables
import com.google.inject.{Singleton, Inject}
import com.keypr.pms.micros.oxi.ids.MicrosIds.OWS.PhoneNumberRole
import com.keypr.scala.OptionalConverters._
import com.micros.pms.util.ParagraphHelper
import java.util

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import scala.collection.mutable

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
class BillConverter extends ConverterUtils {
  def convertBillHeaders(from: util.List[BillHeader]): util.List[Bill] = from.map(convertBillHeader)

  /**
   * Converts an OWS [[BillHeader]] to a Keypr [[Bill]].
   *
   * @param from
   * @return
   */
  def convertBillHeader(from: BillHeader): Bill = {
    val bill = Bill.builder

    Option(from.getAddress).map(convertAddress).foreach(bill.address)

    Option(from.getName).map(convertNativeName).foreach(bill.name)

    findProfileNameId(from.getProfileIDs).foreach(bill.nameId)

    nullsafeUniqueIdValue(from.getBillNumber).foreach(bill.billNumber)

    bill.billItems(from.getBillItems.map(convertBillItem))

    bill.billTaxes(from.getBillTaxes.map(convertBillTax))

    bill.creditCardSurcharges(from.getCreditCardSurcharges.map(convertCreditCardSurcharge))

    Option(from.getCurrentBalance).map(convertAmount).foreach(bill.currentBalance)

    Option(from.getFolioViewNo).foreach(bill.folioViewNo)

    bill.build
  }

  def convertBillItem(from: OWSBillItem): BillItem = {
    val billItem = BillItem.builder

    nullsafeUniqueIdValue(from.getAccount).foreach(billItem.account)
    Option(from.getAmount).map(convertAmount).foreach(billItem.amount)
    nullsafeUniqueIdValue(from.getVatCode).foreach(billItem.vatCode)
    Option(from.getRevenueGroup).foreach(billItem.revenueGroup)
    Option(from.getDate).foreach(billItem.date)
    Option(from.getTime).foreach(billItem.time)
    Option(from.getDescription).foreach(billItem.description)
    Option(from.getTransactionCode).foreach(billItem.transactionCode)
    Option(from.getTransactionNo).foreach(billItem.transactionNo)
    Option(from.getSupplement).foreach(billItem.supplement)
    Option(from.getReference).foreach(billItem.reference)
    Option(from.getOriginalRoom).foreach(billItem.originalRoom)

    billItem.build
  }

  def convertBillTax(from: OWSBillTax): BillTax = {
    new BillTax(convertAmount(from.getVatAmount), convertAmount(from.getVatAmountEuro), from.getDescription)
  }

  def convertCreditCardSurcharge(from: OWSCreditCardSurcharge): CreditCardSurcharge = {
    val surcharge = CreditCardSurcharge.builder

    Option(from.getSurchargeAmount).map(convertAmount).foreach(surcharge.surchargeAmount)
    Option(from.getSurchargeThreshold).map(convertAmount).foreach(surcharge.surchargeThreshold)
    Option(from.getTaxAmount).map(convertAmount).foreach(surcharge.taxAmount)
    Option(from.getTotalBillAmount).map(convertAmount).foreach(surcharge.totalBillAmount)
    Option(from.getCreditCardType).foreach(surcharge.creditCardType)
    Option(from.getSurchargePercentage).foreach(surcharge.surchargePercentage)

    surcharge.build
  }
}