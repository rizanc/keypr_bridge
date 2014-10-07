package com.micros.pms.processors.hotels

import com.cloudkey.pms.common.hotel.HotelAmenity
import com.cloudkey.pms.common.profile.StreetAddress
import com.cloudkey.pms.common.{GeoCode, RoomType}
import com.cloudkey.pms.micros.ows.{information => ows}
import com.cloudkey.pms.micros.services.InformationSoap
import com.cloudkey.pms.request.hotels.HotelInformationRequest
import com.cloudkey.pms.response.hotels.{Attraction, HotelInformationResponse}
import com.google.inject.Inject
import com.micros.pms.processors.{AbstractProcessorTest, MicrosMock}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._

/**
 * Test suite for [[HotelInformationProcessor]]
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@RunWith(classOf[JUnitRunner])
class HotelInformationProcessorTest extends AbstractProcessorTest {

  @Inject
  var processor: HotelInformationProcessor = _

  var service: InformationSoap = _

  var realService: InformationSoap = _

  var hotelInformationMock: MicrosMock[ows.HotelInformationRequest, ows.HotelInformationResponse, HotelInformationRequest, HotelInformationResponse] = _

  val hotelInformationResponseXml = getClass.getResource("HotelInformationResponse.xml")

  override protected def beforeAll() {
    super.beforeAll()

    // Mock the SOAP service client
    service = mock[InformationSoap]
    realService = processor.service
    processor.service = service

    hotelInformationMock = new MicrosMock(service.queryHotelInformation, processor.process)
  }

  override protected def afterAll(): Unit = {
    super.afterAll()

    processor.service = realService
  }

  describe("A " + nameOf[HotelInformationProcessor]) {
    it("should correctly process a hotel-wide request") {
      val result = hotelInformationMock.run(new HotelInformationRequest(), hotelInformationResponseXml)

      result.microsRequest shouldBe
        new ows.HotelInformationRequest()
          .withHotelInformationQuery(owsTools.getDefaultHotelReference)

      val info: HotelInformationResponse = result.response
      info.getHotelName shouldBe "Opera Demo Hotel, Small"
      info.getAddresses.toList shouldBe List(
        new StreetAddress(
          List("913 Finnegan Street", "Apt. B"),
          "WASHINGTON",
          "CA",
          "US",
          "30542",
          "4236",
          "352",
          "OTHER",
          "Mailing",
          "EN"
        ),
        new StreetAddress(
          List("184 Main Street"),
          "PORTLAND",
          "OR",
          "US",
          "97433",
          "4832",
          "234",
          "PHYSICAL",
          null,
          "ES"
        )
      )
      info.getHotelPosition shouldBe new GeoCode("48.5216364 N", "9.057644799999935 E", null)
      info.getDirections shouldBe "Take a left after the rainbow"
      info.getContactEmails.toList shouldBe List(
        "hotelemail@keypr.com",
        "anotheremail@keypr.com"
      )
      info.getPhoneNumbers.toList shouldBe List(
        "(514) 131-2363",
        "+1 (182) 424-7682 3",
        "(182) 424-7682 3",
        "(124) 259-1823"
      )
      info.getFaxNumbers.toList shouldBe List(
        "(514) 285-5469"
      )
      info.getCheckInInfo shouldBe "After 3pm"
      info.getCheckOutInfo shouldBe "By 12pm"
      info.getOtherInfo.toList shouldBe List(
        "We have marble floors",
        "There are crocodiles in the moat"
      )
      info.getAcceptedCreditCards.toList shouldBe List(
        "DC",
        "MC",
        "DS",
        "VA",
        "AX"
      )
      info.getRoomTypes.toList shouldBe List(
        new RoomType("DLX", "Deluxe Room", List.empty[HotelAmenity].asJava, 5),
        new RoomType("STD", "Standard Room", List.empty[HotelAmenity].asJava, 5),
        new RoomType("CABIN", "Cabin Suites", List.empty[HotelAmenity].asJava, null),
        new RoomType("LODGE", "Lodge Suites", List.empty[HotelAmenity].asJava, null)
      )
      info.getAttractions.toList shouldBe List(
        new Attraction(
          "FRONTIER TOWN",
          null,
          "Frontier Town",
          "Located near Ocean City Maryland",
          13.toDouble,
          "MI",
          "20 Minutes",
          new StreetAddress(
            List.empty[String].asJava,
            "Ocean City",
            "MD",
            null,
            null,
            null,
            null,
            null,
            null,
            null
          ),
          null,
          new GeoCode(null, null, null),
          "12.00 - 24.00",
          List.empty[String].asJava
        ),
        new Attraction(
          "HISTORIC-1",
          null,
          "Antietam National Battlefield",
          "Traveling east-west on Interstate 70--exit 29",
          12.toDouble,
          "MI",
          null,
          new StreetAddress(
            List.empty[String].asJava,
            "Antietam",
            "MD",
            null,
            null,
            null,
            null,
            null,
            null,
            null
          ),
          "8:30 a.m. - 6:00 p.m",
          new GeoCode(null, null, null),
          "Free",
          List.empty[String].asJava
        ),
        new Attraction(
          "HISTORIC-2",
          null,
          "Canal Place Heritage Area",
          "Take Exit 43-C, Downtown. At the bottom of the exit ramp, turn left onto Queen City Drive",
          40.toDouble,
          "MI",
          null,
          new StreetAddress(
            List.empty[String].asJava,
            "Cumberland",
            "MD",
            null,
            null,
            null,
            null,
            null,
            null,
            null
          ),
          "8:30a.m. - 5:00p.m.",
          new GeoCode(null, null, null),
          null,
          List.empty[String].asJava
        ),
        new Attraction(
          "MU-2",
          null,
          "The Baltimore Museum of Art",
          "Take I-695 West (toward Towson), then take exit #23",
          5.toDouble,
          "MI",
          "5 Minutes",
          new StreetAddress(
            List.empty[String].asJava,
            "Baltimore",
            "MD",
            null,
            null,
            null,
            null,
            null,
            null,
            null
          ),
          "11 a.m - 5 p.m.",
          new GeoCode(null, null, null),
          "22.00",
          List.empty[String].asJava
        ),
        new Attraction(
          "ZOO-2",
          null,
          "The National Zoo",
          "Follow Route I-66 East to the Theodore Roosevelt Bridge",
          3.toDouble,
          "MI",
          null,
          new StreetAddress(
            List.empty[String].asJava,
            "Washington, DC",
            "DC",
            null,
            null,
            null,
            null,
            null,
            null,
            null
          ),
          "10:00a.m. - 5p.m.",
          new GeoCode(null, null, null),
          "12.00",
          List.empty[String].asJava
        ),
        new Attraction(
          "PARK-GE",
          null,
          "Glen Echo Park",
          "Accessible from the Capital Beltway I-495",
          30.toDouble,
          "MI",
          "22",
          new StreetAddress(
            List.empty[String].asJava,
            "Glen Echo",
            "MD",
            null,
            null,
            null,
            null,
            null,
            null,
            null
          ),
          "6am-1am",
          new GeoCode(null, null, null),
          "Free",
          List.empty[String].asJava
        ),
        new Attraction(
          "SIX FLAGS",
          null,
          "Six Flags America",
          "Follow I-95 North to the I-95/395/495 interchange",
          22.toDouble,
          "MI",
          "40 minutes",
          new StreetAddress(
            List.empty[String].asJava,
            "Baltimore",
            "MD",
            null,
            null,
            null,
            null,
            null,
            null,
            null
          ),
          "9am - 8pm",
          new GeoCode(null, null, null),
          "29.99 - 35.99",
          List.empty[String].asJava
        ),
        new Attraction(
          "STADIUM-1",
          null,
          "Byrd Stadium Complex",
          "Interstate 95 south to Exit 25, College Park/U.S",
          10.toDouble,
          "MI",
          null,
          new StreetAddress(
            List.empty[String].asJava,
            "College Park",
            "MD",
            null,
            null,
            null,
            null,
            null,
            null,
            null
          ),
          null,
          new GeoCode(null, null, null),
          null,
          List.empty[String].asJava
        ),
        new Attraction(
          "ZOO-1",
          null,
          "The Baltimore Zoo",
          "From I-83 North and South - Take Exit 7",
          5.toDouble,
          "MI",
          null,
          new StreetAddress(
            List.empty[String].asJava,
            "Baltimore",
            "MD",
            null,
            null,
            null,
            null,
            null,
            null,
            null
          ),
          "10:00a.m. - 4:30p.m.",
          new GeoCode(null, null, null),
          "12.00",
          List.empty[String].asJava
        ),
        new Attraction(
          "MUS-1",
          null,
          "American Visionary Art Museum",
          "Follow I-95 north to exit 55/Key Highway.",
          22.toDouble,
          "MI",
          "40 minutes",
          new StreetAddress(
            List.empty[String].asJava,
            "Baltimore",
            "MD",
            null,
            null,
            null,
            null,
            null,
            null,
            null
          ),
          "10:00 a.m. -6:00 p.m",
          new GeoCode(null, null, null),
          "3.00 - 9.00",
          List.empty[String].asJava
        )
      )
    }
  }

}
