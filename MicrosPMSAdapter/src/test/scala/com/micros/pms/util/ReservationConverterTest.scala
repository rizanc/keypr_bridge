package com.micros.pms.util

import java.util.{Locale, Currency}

import com.cloudkey.pms.common.profile.{StreetAddress, CustomerProfile}
import com.cloudkey.pms.common.reservation
import com.cloudkey.pms.common.reservation.Reservation
import com.cloudkey.pms.micros.og.common.{Amount, CreditCard, Gender, PersonName}
import com.cloudkey.pms.micros.og.hotelcommon
import com.cloudkey.pms.micros.og.hotelcommon._
import com.cloudkey.pms.micros.og.name._
import com.cloudkey.pms.micros.og.reservation.{HotelReservation, ResGuest, ReservationStatusType}
import com.cloudkey.pms.micros.ows.IdUtils
import com.keypr.bridge.ids.BridgeIds
import com.keypr.bridge.ids.BridgeIds.ReservationStatus
import org.joda.time.{Period, DateTime, LocalDate, LocalTime}
import org.scalatest.{ShouldMatchers, FunSpec}

import scala.collection.JavaConversions._

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
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

      val owsCard: CreditCard = new CreditCard()
      val owsStartDate: DateTime = new DateTime(2014, 8, 14, 0, 0)
      val owsEndDate: DateTime = new DateTime(2014, 8, 16, 0, 0)
      val ratePlanShortDescription = "Rate Plan Short Description"
      val ratePlanFullDescription = "Rate Plan Full Description"
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
        .withCancellationDateTime(new CancelDateTime(new DateTime(2014, 12, 1, 0, 0), Period.days(1)))
        .withAdditionalDetails(
          new AdditionalDetail("Rate rules detail", AdditionalDetailType.RATE_RULES, null),
          new AdditionalDetail("Marketing info detail", AdditionalDetailType.MARKETING_INFORMATION, null),
          new AdditionalDetail("Deposit policy detail", AdditionalDetailType.DEPOSIT_POLICY, null),
          new AdditionalDetail("Promotion detail", AdditionalDetailType.PROMOTION, null),
          new AdditionalDetail("Commission policy detail", AdditionalDetailType.COMMISSION_POLICY, null),
          new AdditionalDetail("Guarantee policy detail", AdditionalDetailType.GUARANTEE_POLICY, null),
          new AdditionalDetail("Misc detail", AdditionalDetailType.MISCELLANEOUS, null),
          new AdditionalDetail("Package options detail", AdditionalDetailType.PACKAGE_OPTIONS, null),
          new AdditionalDetail("Penalty policy detail", AdditionalDetailType.PENALTY_POLICY, null),
          new AdditionalDetail("Ta special request detail", AdditionalDetailType.TA_SPECIAL_REQUEST, null),
          new AdditionalDetail("Tax information detail", AdditionalDetailType.TAX_INFORMATION, null),
          new AdditionalDetail("Cancel policy detail", AdditionalDetailType.CANCEL_POLICY, null),
          new AdditionalDetail("Points policy detail", AdditionalDetailType.POINTS_POLICY, null),
          new AdditionalDetail("No pets", AdditionalDetailType.OTHER, "PET_POLICY"),
          new AdditionalDetail("No smoking", AdditionalDetailType.OTHER, "SMOKING_POLICY")
        )

      val owsReservation = new HotelReservation()
        .withUniqueIDList(IdUtils.internalReservationId(pmsReservationId), IdUtils.confirmationNumId(confirmationNo), IdUtils.legNumberId(legNo))
        .withReservationStatus(ReservationStatusType.RESERVED)
        .withRoomPreferenceExists(false)
        .withSpecialsExists(true)
        .withRoomStays(new hotelcommon.RoomStay()
          .withCurrentBalance(new Amount(24.99, "USD", 2.toShort, null))
          .withTotal(new Amount(224.99, "USD", 2.toShort, null))
          .withMemberAwardInfo(new MemberAwardInfo().withMembershipID(8213129.toLong))
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
            .withRoomTypeDescription("It's nicer than standard")
            .withRoomClass("TOWER1")
            .withInvBlockCode("MICROSOFT")
          )
          .withRoomRates(
            new RoomRate().withRates(
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
          )
        )
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

      /*
            owsCompany,
            owsContact1,
            owsContact2,
            owsContact3

       */

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

      resv.getContactProfiles.size should be === 3

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

      resv.getCreditCardExpirationDate shouldBe owsCard.getExpirationDate
      resv.getCreditCardHolderName shouldBe owsCard.getCardHolderName
      resv.getCreditCardNumber shouldBe owsCard.getCardNumber
      resv.getCreditCardType shouldBe owsCard.getCardType

      resv.getStartDate should be === owsStartDate.toLocalDate
      resv.getEndDate should be === owsEndDate.toLocalDate

      val ratePlan = resv.getRoomRatePlan
      ratePlan should not be (null)
      ratePlan.getCode should be === owsRatePlan.getRatePlanCode
      ratePlan.getName should be === owsRatePlan.getRatePlanName
      ratePlan.getShortDescription should be === ratePlanShortDescription
      ratePlan.getDescription should be === ratePlanFullDescription
      ratePlan.getDepositRequirement should not be (null)
//      ratePlan.getDepositRequirement.getDepositAmount.getAmount
    }
  }

  implicit def toParagraph(str: String): Paragraph = ParagraphHelper.createParagraph(str)
}
