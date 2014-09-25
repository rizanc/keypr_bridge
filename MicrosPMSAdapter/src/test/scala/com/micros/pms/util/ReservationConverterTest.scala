package com.micros.pms.util

import java.util.{Currency, Locale}

import com.cloudkey.pms.common.payment.MonetaryAmount
import com.cloudkey.pms.common.profile.{CustomerProfile, StreetAddress}
import com.cloudkey.pms.common.reservation
import com.cloudkey.pms.common.reservation.{FlatDiscount, Reservation}
import com.cloudkey.pms.micros.og.common.{Amount, CreditCard, Gender, PersonName}
import com.cloudkey.pms.micros.og.hotelcommon
import com.cloudkey.pms.micros.og.hotelcommon._
import com.cloudkey.pms.micros.og.name._
import com.cloudkey.pms.micros.og.reservation.{HotelReservation, ResGuest, ReservationStatusType}
import com.cloudkey.pms.micros.ows.{IdUtils, ReservationConverter}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

//import com.fasterxml.jackson.databind.ObjectMapper
import com.keypr.bridge.ids.BridgeIds
import com.keypr.bridge.ids.BridgeIds.ReservationStatus
//import com.keypr.jackson.KeyprJacksonModule
import org.joda.time.{DateTime, LocalDate, LocalTime}
import org.scalatest.{FunSpec, ShouldMatchers}

import scala.collection.JavaConversions._

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@RunWith(classOf[JUnitRunner])
class ReservationConverterTest extends FunSpec with ShouldMatchers {

  protected val pmsReservationId = "919843"

  protected val confirmationNo = "12384"

  protected val legNo = 1

  protected val arrivalTime = new LocalTime(18, 30)

  protected val departureTime = new LocalTime(12, 20)

  protected val customerProfileId = "21492"

  describe("A " + classOf[ReservationConverter].getName) {

    it("should correctly convert a typical reservation") {

      val owsCustomer: Customer = new Customer()
        .withPersonName(new PersonName(
          List("Sir", "Mr"),
          "Charles",
          List("Thomas", "Phillips"),
          "La Mothe",
          List("0th", "1st"),
          "account2",
          "account3",
          "Software Engineer",
          "name ordered",
          "Charlie",
          null
        ))
        .withNativeName(new NativeName(
          List("Sir", "Mr"),
          "Charles",
          List("Thomas", "Phillips"),
          "La Mothe",
          List("0th", "1st"),
          "account2",
          "account3",
          "Software Engineer",
          "name ordered",
          "Charlie",
          null,
          "en"
        ))
        .withBusinessTitle("CFO")
        .withBirthDate(new LocalDate(1967, 8, 20))
        .withGender(Gender.MALE)

      val owsCustomerProfile: Profile = new Profile()
        .withProfileIDs(IdUtils.internalProfileId(customerProfileId))
        .withCustomer(owsCustomer)
        .withEMails(new NameEmail().withValue("charlie@clamothe.com"), new NameEmail().withValue("charlie@keypr.com"))
        .withAddresses(
          new NameAddress(
            List("19000 Ingomar St", "Rear"),
            "Reseda",
            "CA",
            "USA",
            "91335",
            "4321",
            "cityExt",
            "Home",
            "CA",
            "en", null, null, null, null, null, null, null, null, null
          ),
          new NameAddress(
            List("2400 Olive St"),
            "Eugene",
            "CA",
            "USA",
            "97405",
            "3213",
            "cityExtEugene",
            "Home",
            "OR",
            "en", null, null, null, null, null, null, null, null, null
          )
        )
        .withPhones(
          new NamePhone().withPhoneNumber("541-357-7774").withPhoneRole("PHONE"),
          new NamePhone().withPhoneNumber("541-337-0431").withPhoneRole("PHONE"),
          new NamePhone().withPhoneNumber("541-344-6631").withPhoneRole("FAX"),
          new NamePhone().withPhoneNumber("541-343-6631").withPhoneRole("FAX")
        )

      val companyProfileId = "181247"
      val owsCompany: Profile = new Profile()
        .withProfileIDs(IdUtils.internalProfileId(companyProfileId))
        .withCompany(new Company()
          .withCompanyType(CompanyCompanyType.COMPANY)
          .withCompanyID("08123")
          .withCompanyName("KEYPR")
        )

      val travelAgentProfileId: String = "012024"
      val owsTravelAgent: Profile = new Profile()
        .withProfileIDs(IdUtils.internalProfileId(travelAgentProfileId))
        .withCompany(new Company()
          .withCompanyType(CompanyCompanyType.TRAVEL_AGENT)
          .withCompanyID("09823")
          .withCompanyName("Cruises & Curses, Inc.")
        )

      val sourceProfileId: String = "239423984"
      val owsSource: Profile = new Profile()
        .withProfileIDs(IdUtils.internalProfileId(sourceProfileId))
        .withCompany(new Company()
          .withCompanyType(CompanyCompanyType.SOURCE)
          .withCompanyID("81523")
          .withCompanyName("American Airlines")
        )

      val groupProfileId: String = "7892345"
      val owsGroup: Profile = new Profile()
        .withProfileIDs(IdUtils.internalProfileId(groupProfileId))
        .withCompany(new Company()
          .withCompanyType(CompanyCompanyType.GROUP)
          .withCompanyID("09812")
          .withCompanyName("Some Reservation Group")
        )

      val contact1ProfileId: String = "981723"
      val owsContact1: Profile = new Profile()
        .withProfileIDs(IdUtils.internalProfileId(contact1ProfileId))
        .withCompany(new Company()
          .withCompanyType(CompanyCompanyType.CONTACT)
          .withCompanyID("50234")
          .withCompanyName("Their mother")
        )

      val contact2ProfileId: String = "234072"
      val owsContact2: Profile = new Profile()
        .withProfileIDs(IdUtils.internalProfileId(contact2ProfileId))
        .withCompany(new Company()
          .withCompanyType(CompanyCompanyType.CONTACT)
          .withCompanyID("90834")
          .withCompanyName("Their doctor")
        )

      val contact3ProfileId = "235087032"
      val owsContact3: Profile = new Profile()
        .withProfileIDs(IdUtils.internalProfileId(contact3ProfileId))
        .withCompany(new Company()
          .withCompanyType(CompanyCompanyType.CONTACT)
          .withCompanyID("982341")
          .withCompanyName("Their lawyer")
        )

      val owsRates = List(
        new Rate()
          .withEffectiveDate(new LocalDate(2014, 8, 14))
          .withExpirationDate(new LocalDate(2014, 8, 15))
          .withRateOccurrence(RateOccurrenceType.DAILY)
          .withBase(new Amount(20.49, "USD", 2.toShort, null))
          .withPoints(20.0),
        new Rate()
          .withEffectiveDate(new LocalDate(2014, 8, 14))
          .withExpirationDate(new LocalDate(2014, 8, 15))
          .withRateOccurrence(RateOccurrenceType.DAILY)
          .withBase(new Amount(20.49, "USD", 2.toShort, null))
          .withPoints(20.0),
        new Rate()
          .withEffectiveDate(new LocalDate(2014, 8, 15))
          .withExpirationDate(new LocalDate(2014, 8, 16))
          .withRateOccurrence(RateOccurrenceType.DAILY)
          .withBase(new Amount(21.49, "USD", 2.toShort, null))
          .withPoints(21.0),
        new Rate()
          .withEffectiveDate(new LocalDate(2014, 8, 16))
          .withRateOccurrence(RateOccurrenceType.OTHER)
          .withBase(new Amount(22.49, "USD", 2.toShort, null))
          .withPoints(22.0),
        new Rate()
          .withRateOccurrence(RateOccurrenceType.WEEKLY)
          .withBase(new Amount(23.49, "USD", 2.toShort, null))
          .withPoints(23.0)
      )

      val owsCard: CreditCard = new CreditCard()
      val owsStartDate: DateTime = new DateTime(2014, 8, 14, 0, 0)
      val owsEndDate: DateTime = new DateTime(2014, 8, 16, 0, 0)
      val ratePlanShortDescription = "Rate Plan Short Description"
      val ratePlanFullDescription = "Rate Plan Full Description"
      val detailRateRules = "Rate rules detail"
      val detailMarketingInfo = "Marketing info detail"
      val detailDepositPolicy = "Deposit policy detail"
      val detailPromotionDetail = "Promotion detail"
      val detailCommissionPolicy = "Commission policy detail"
      val detailGuaranteePolicy = "Guarantee policy detail"
      val detailMisc = "Misc detail"
      val detailPackageOptions = "Package options detail"
      val detailPenaltyPolicy = "Penalty policy detail"
      val detailTaSpecialRequest = "Ta special request detail"
      val detailTaxInfo = "Tax information detail"
      val detailCancelPolicy = "Cancel policy detail"
      val detailPointsPolicy = "Points policy detail"
      val detailPetPolicy = "No pets"
      val detailSmokingPolicy = "No smoking"
      val owsRatePlan: RatePlan = new RatePlan()
        .withRatePlanCode("RACK")
        .withRatePlanName("Rack rate")
        .withRatePlanShortDescription(ratePlanShortDescription)
        .withRatePlanDescription(ratePlanFullDescription)
        .withDepositRequired(new DepositRequirement(
          new Amount(200, "USD", 2.toShort, null),
          new LocalDate(2014, 8, 13),
          new Amount(20, "USD", 2.toShort, null)
        ))
        .withDiscount(new Discount(
          19.99, DiscountType.FLAT, "Nepotism"
        ))
        .withAdditionalDetails(
          new AdditionalDetail(detailRateRules, AdditionalDetailType.RATE_RULES, null),
          new AdditionalDetail(detailMarketingInfo, AdditionalDetailType.MARKETING_INFORMATION, null),
          new AdditionalDetail(detailDepositPolicy, AdditionalDetailType.DEPOSIT_POLICY, null),
          new AdditionalDetail(detailPromotionDetail, AdditionalDetailType.PROMOTION, null),
          new AdditionalDetail(detailCommissionPolicy, AdditionalDetailType.COMMISSION_POLICY, null),
          new AdditionalDetail(detailGuaranteePolicy, AdditionalDetailType.GUARANTEE_POLICY, null),
          new AdditionalDetail(detailMisc, AdditionalDetailType.MISCELLANEOUS, null),
          new AdditionalDetail(detailPackageOptions, AdditionalDetailType.PACKAGE_OPTIONS, null),
          new AdditionalDetail(detailPenaltyPolicy, AdditionalDetailType.PENALTY_POLICY, null),
          new AdditionalDetail(detailTaSpecialRequest, AdditionalDetailType.TA_SPECIAL_REQUEST, null),
          new AdditionalDetail(detailTaxInfo, AdditionalDetailType.TAX_INFORMATION, null),
          new AdditionalDetail(detailCancelPolicy, AdditionalDetailType.CANCEL_POLICY, null),
          new AdditionalDetail(detailPointsPolicy, AdditionalDetailType.POINTS_POLICY, null),
          new AdditionalDetail(detailPetPolicy, AdditionalDetailType.OTHER, "PET_POLICY"),
          new AdditionalDetail(detailSmokingPolicy, AdditionalDetailType.OTHER, "SMOKING_POLICY")
        )

      val roomTypeDescription = "It's nicer than standard"
      val membershipId: Long = 8213129.toLong
      val roomStay = new hotelcommon.RoomStay()
        .withCurrentBalance(new Amount(24.99, "USD", 2.toShort, null))
        .withTotal(new Amount(224.99, "USD", 2.toShort, null))
        .withMemberAwardInfo(new MemberAwardInfo().withMembershipID(membershipId))
        .withComments(
          new ReservationComment().withImagesAndURLSAndTexts(ParagraphHelper.createParagraphElement("One comment"))
            .withGuestViewable(true),
          new ReservationComment().withImagesAndURLSAndTexts(ParagraphHelper.createParagraphElement("Another comment"))
            .withGuestViewable(true),
          new ReservationComment().withImagesAndURLSAndTexts(ParagraphHelper.createParagraphElement("A staff-only comment"))
            .withGuestViewable(false)
        )
        .withGuestCounts(new GuestCountList().withGuestCounts(
          new GuestCount()
            .withAgeQualifyingCode(AgeQualifyingCode.ADULT)
            .withCount(1),
          new GuestCount()
            .withAgeQualifyingCode(AgeQualifyingCode.CHILD)
            .withCount(2),
          new GuestCount()
            .withAgeQualifyingCode(AgeQualifyingCode.CHILDBUCKET_1)
            .withCount(1),
          new GuestCount()
            .withAgeQualifyingCode(AgeQualifyingCode.CHILDBUCKET_2)
            .withCount(1),
          new GuestCount()
            .withAgeQualifyingCode(AgeQualifyingCode.CHILDBUCKET_3)
            .withCount(3)
        ))
        .withGuarantee(new Guarantee().withGuaranteesAccepted(new GuaranteeAccepted().withGuaranteeCreditCard(
          owsCard
            .withCardType("AX")
            .withCardHolderName("Charles La Mothe")
            .withCardNumber("1234123412341234")
            .withExpirationDate(new LocalDate(2016, 6, 1))
        )))
        .withTimeSpan(new TimeSpan()
          .withStartDate(owsStartDate)
          .withEndDate(owsEndDate)
        )
        .withRatePlans(owsRatePlan)
        .withRoomTypes(new RoomType()
          .withNumberOfUnits(3)
          .withRoomTypeCode("DLX")
          .withRoomTypeName("Deluxe")
          .withRoomTypeDescription(roomTypeDescription)
          .withRoomClass("TOWER1")
          .withRoomNumbers("1238")
          .withInvBlockCode("MICROSOFT")
        )
        .withRoomRates(
          owsRates.map(rate => new RoomRate().withRates(rate))
        )

      val owsReservation = new HotelReservation()
        .withUniqueIDList(IdUtils.internalReservationId(pmsReservationId), IdUtils.confirmationNumId(confirmationNo), IdUtils.legNumberId(legNo))
        .withReservationStatus(ReservationStatusType.RESERVED)
        .withRoomPreferenceExists(false)
        .withSpecialsExists(true)
        .withRoomStays(roomStay)
        .withResGuests(new ResGuest()
          .withArrivalTime(arrivalTime)
          .withDepartureTime(departureTime)
          .withProfiles(
            owsCustomerProfile,
            owsCompany,
            owsGroup,
            owsSource,
            owsTravelAgent,
            owsContact1,
            owsContact2,
            owsContact3
          )
        )

      val converter: ReservationConverter = new ReservationConverter
      converter.defaultCurrency = Currency.getInstance(Locale.US)

      val resv: Reservation = converter.convertReservation(owsReservation)

      resv should not be (null)

      resv.getPmsReservationId shouldBe pmsReservationId
      resv.getConfirmationNo shouldBe confirmationNo
      resv.getLegNumber.toInt shouldBe legNo
      resv.getReservationStatus shouldBe ReservationStatus.RESERVED
      resv.getExpectedArrivalTime shouldBe arrivalTime
      resv.getExpectedDepartureTime shouldBe departureTime

      val customer: CustomerProfile = resv.getCustomerProfile
      customer should not be (null)
      customer.getId shouldBe customerProfileId

      customer.getPersonName should not be (null)
      customer.getPersonName.getNameTitles shouldBe owsCustomer.getPersonName.getNameTitles
      customer.getPersonName.getFirstName shouldBe owsCustomer.getPersonName.getFirstName
      customer.getPersonName.getMiddleNames shouldBe owsCustomer.getPersonName.getMiddleNames
      customer.getPersonName.getLastName shouldBe owsCustomer.getPersonName.getLastName
      customer.getPersonName.getNameSuffixes shouldBe owsCustomer.getPersonName.getNameSuffixes
      customer.getPersonName.getProfession shouldBe owsCustomer.getPersonName.getProfession
      customer.getPersonName.getFamiliarName shouldBe owsCustomer.getPersonName.getFamiliarName

      customer.getNativeName should not be (null)
      customer.getNativeName.getNameTitles shouldBe owsCustomer.getNativeName.getNameTitles
      customer.getNativeName.getFirstName shouldBe owsCustomer.getNativeName.getFirstName
      customer.getNativeName.getMiddleNames shouldBe owsCustomer.getNativeName.getMiddleNames
      customer.getNativeName.getLastName shouldBe owsCustomer.getNativeName.getLastName
      customer.getNativeName.getNameSuffixes shouldBe owsCustomer.getNativeName.getNameSuffixes
      customer.getNativeName.getProfession shouldBe owsCustomer.getNativeName.getProfession
      customer.getNativeName.getFamiliarName shouldBe owsCustomer.getNativeName.getFamiliarName
      customer.getNativeName.getLanguageCode shouldBe owsCustomer.getNativeName.getLanguageCode

      customer.getBusinessTitle shouldBe owsCustomer.getBusinessTitle
      customer.getGender shouldBe BridgeIds.Gender.MALE
      customer.getBirthDate shouldBe owsCustomer.getBirthDate
      customer.getStreetAddresses.toList shouldBe owsCustomerProfile.getAddresses.map(from => {
        new StreetAddress(
          from.getAddressLines,
          from.getCityName,
          from.getStateProv,
          from.getCountryCode,
          from.getPostalCode,
          from.getBarCode,
          from.getCityExtension,
          from.getAddressType,
          from.getOtherAddressType,
          from.getLanguageCode
        )
      })

      customer.getEmailAddresses.toList shouldBe List("charlie@clamothe.com", "charlie@keypr.com")
      customer.getPhoneNumbers.toList shouldBe List("541-357-7774", "541-337-0431")
      customer.getFaxNumbers.toList shouldBe List("541-344-6631", "541-343-6631")

      val company = resv.getCompanyProfile
      company should not be (null)
      company.getProfileId shouldBe companyProfileId
      company.getOtherId shouldBe owsCompany.getCompany.getCompanyID
      company.getName shouldBe owsCompany.getCompany.getCompanyName
      
      val travelAgent = resv.getTravelAgentProfile
      travelAgent should not be (null)
      travelAgent.getProfileId shouldBe travelAgentProfileId
      travelAgent.getOtherId shouldBe owsTravelAgent.getCompany.getCompanyID
      travelAgent.getName shouldBe owsTravelAgent.getCompany.getCompanyName

      val source = resv.getSourceProfile
      source should not be (null)
      source.getProfileId shouldBe sourceProfileId
      source.getOtherId shouldBe owsSource.getCompany.getCompanyID
      source.getName shouldBe owsSource.getCompany.getCompanyName

      val group = resv.getGroupProfile
      group should not be (null)
      group.getProfileId shouldBe groupProfileId
      group.getOtherId shouldBe owsGroup.getCompany.getCompanyID
      group.getName shouldBe owsGroup.getCompany.getCompanyName

      resv.getContactProfiles.size shouldBe 3

      val contact1 = resv.getContactProfiles()(0)
      contact1 should not be (null)
      contact1.getProfileId shouldBe contact1ProfileId
      contact1.getOtherId shouldBe owsContact1.getCompany.getCompanyID
      contact1.getName shouldBe owsContact1.getCompany.getCompanyName

      val contact2 = resv.getContactProfiles()(1)
      contact2 should not be (null)
      contact2.getProfileId shouldBe contact2ProfileId
      contact2.getOtherId shouldBe owsContact2.getCompany.getCompanyID
      contact2.getName shouldBe owsContact2.getCompany.getCompanyName

      val contact3 = resv.getContactProfiles()(2)
      contact3 should not be (null)
      contact3.getProfileId shouldBe contact3ProfileId
      contact3.getOtherId shouldBe owsContact3.getCompany.getCompanyID
      contact3.getName shouldBe owsContact3.getCompany.getCompanyName

      resv.getAdultCount shouldBe Int.box(1)
      resv.getChildrenCount shouldBe Int.box(7)

//      resv.getCreditCardExpirationDate shouldBe owsCard.getExpirationDate
//      resv.getCreditCardHolderName shouldBe owsCard.getCardHolderName
//      resv.getCreditCardNumber shouldBe owsCard.getCardNumber
//      resv.getCreditCardType shouldBe owsCard.getCardType

      resv.getStartDate shouldBe owsStartDate.toLocalDate
      resv.getEndDate shouldBe owsEndDate.toLocalDate

      val ratePlan = resv.getRoomRatePlan
      ratePlan should not be (null)
      ratePlan.getCode shouldBe owsRatePlan.getRatePlanCode
      ratePlan.getName shouldBe owsRatePlan.getRatePlanName
      ratePlan.getShortDescription shouldBe ratePlanShortDescription
      ratePlan.getDescription shouldBe ratePlanFullDescription
      ratePlan.getDepositRequirement should not be (null)
      verifyAmount(ratePlan.getDepositRequirement.getDepositAmount, owsRatePlan.getDepositRequired.getDepositAmount)
      verifyAmount(ratePlan.getDepositRequirement.getDepositDueAmount, owsRatePlan.getDepositRequired.getDepositDueAmount)
      ratePlan.getDepositRequirement.getDueDate shouldBe owsRatePlan.getDepositRequired.getDueDate

      ratePlan.getDiscount.isInstanceOf[FlatDiscount] shouldBe true
      val discount: FlatDiscount = ratePlan.getDiscount.asInstanceOf[FlatDiscount]
      discount.getDiscountReason shouldBe owsRatePlan.getDiscount.getDiscountReason
      verifyAmount(discount.getDiscountAmount, new Amount(owsRatePlan.getDiscount.getDiscountAmount, "USD", 2.toShort, null))

      ratePlan.getRateRules shouldBe detailRateRules
      ratePlan.getMarketingInformation shouldBe detailMarketingInfo
      ratePlan.getDepositPolicy shouldBe detailDepositPolicy
      ratePlan.getPromotion shouldBe detailPromotionDetail
      ratePlan.getCommissionPolicy shouldBe detailCommissionPolicy
      ratePlan.getGuaranteePolicy shouldBe detailGuaranteePolicy
      ratePlan.getMiscellaneous shouldBe detailMisc
      ratePlan.getPackageOptions shouldBe detailPackageOptions
      ratePlan.getPenaltyPolicy shouldBe detailPenaltyPolicy
      ratePlan.getTaSpecialRequest shouldBe detailTaSpecialRequest
      ratePlan.getTaxInformation shouldBe detailTaxInfo
      ratePlan.getCancelPolicy shouldBe detailCancelPolicy
      ratePlan.getPointsPolicy shouldBe detailPointsPolicy
      ratePlan.getOtherNotes.toList shouldBe List(detailPetPolicy, detailSmokingPolicy)

      val roomRates = resv.getRoomRates
      roomRates.size shouldBe owsRates.size
      roomRates(0).getRateOccurrence shouldBe BridgeIds.RateOccurrence.DAILY
      roomRates(0).getBaseAmount shouldBe new MonetaryAmount(new java.math.BigDecimal("20.49"), converter.defaultCurrency)
      roomRates(0).getEffectiveDate shouldBe owsRates(0).getEffectiveDate
      roomRates(0).getExpirationDate shouldBe owsRates(0).getExpirationDate
      roomRates(0).getPoints shouldBe 20.0
      
      roomRates(1).getRateOccurrence shouldBe BridgeIds.RateOccurrence.DAILY
      roomRates(1).getBaseAmount shouldBe new MonetaryAmount(new java.math.BigDecimal("20.49"), converter.defaultCurrency)
      roomRates(1).getEffectiveDate shouldBe owsRates(1).getEffectiveDate
      roomRates(1).getExpirationDate shouldBe owsRates(1).getExpirationDate
      roomRates(1).getPoints shouldBe 20.0
      
      roomRates(2).getRateOccurrence shouldBe BridgeIds.RateOccurrence.DAILY
      roomRates(2).getBaseAmount shouldBe new MonetaryAmount(new java.math.BigDecimal("21.49"), converter.defaultCurrency)
      roomRates(2).getEffectiveDate shouldBe owsRates(2).getEffectiveDate
      roomRates(2).getExpirationDate shouldBe owsRates(2).getExpirationDate
      roomRates(2).getPoints shouldBe 21.0
      
      roomRates(3).getRateOccurrence shouldBe BridgeIds.RateOccurrence.OTHER
      roomRates(3).getBaseAmount shouldBe new MonetaryAmount(new java.math.BigDecimal("22.49"), converter.defaultCurrency)
      roomRates(3).getEffectiveDate shouldBe owsRates(3).getEffectiveDate
      roomRates(3).getExpirationDate shouldBe owsRates(3).getExpirationDate
      roomRates(3).getPoints.toDouble shouldBe 22.0
      
      roomRates(4).getRateOccurrence shouldBe BridgeIds.RateOccurrence.WEEKLY
      roomRates(4).getBaseAmount shouldBe new MonetaryAmount(new java.math.BigDecimal("23.49"), converter.defaultCurrency)
      roomRates(4).getEffectiveDate shouldBe owsRates(4).getEffectiveDate
      roomRates(4).getExpirationDate shouldBe owsRates(4).getExpirationDate
      roomRates(4).getPoints.toDouble shouldBe 23.0

      roomRates.foreach(roomRate => {
        roomRate.getSuppressRate shouldBe null
        roomRate.getHasPackage shouldBe null
        roomRate.getRateCode shouldBe null
        roomRate.getRoomType shouldBe null
      })

      val owsRoomType: RoomType = roomStay.getRoomTypes.head
      resv.getRoom.getRoomBlockCode shouldBe owsRoomType.getInvBlockCode
      resv.getRoom.getRoomNumber shouldBe owsRoomType.getRoomNumbers.head
      resv.getRoom.getRoomType.getRoomTypeCode shouldBe owsRoomType.getRoomTypeCode
      resv.getRoom.getRoomType.getRoomTypeName shouldBe owsRoomType.getRoomTypeName
      resv.getRoom.getRoomType.getRoomTypeDescription shouldBe roomTypeDescription
      resv.getRoom.getRoomType.getRoomClassCode shouldBe owsRoomType.getRoomClass
      
      resv.getAdditionalReservedRoomCount shouldBe 2
      verifyAmount(resv.getCurrentBalance, roomStay.getCurrentBalance)
      verifyAmount(resv.getTotalCost, roomStay.getTotal)
      resv.getMembershipId shouldBe membershipId.toString

      resv.getComments.toList shouldBe List(
        new reservation.Comment("One comment", true),
        new reservation.Comment("Another comment", true),
        new reservation.Comment("A staff-only comment", false)
      )

      resv.getHasSpecialRequests shouldBe true
      resv.getHasRoomPreferences shouldBe false

//
//      val injector: Injector = Guice.createInjector(new KeyprJacksonModule)
//      val m = injector.getInstance(classOf[ObjectMapper])
//
//      println(m.writeValueAsString(resv))
    }
  }

  protected def verifyAmount(monetaryAmount: MonetaryAmount, amount: Amount) = {
    monetaryAmount.getAmount.scale() shouldBe amount.getDecimals
    monetaryAmount.getAmount.doubleValue() shouldBe amount.getValue
    monetaryAmount.getCurrencyCode.getCurrencyCode shouldBe amount.getCurrencyCode
  }

  implicit def toParagraph(str: String): Paragraph = ParagraphHelper.createParagraph(str)
}
