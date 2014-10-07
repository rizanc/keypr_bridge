package com.micros.pms.processors.rooms

import java.util
import java.util.{Collections, Currency}

import com.cloudkey.pms.common.payment.MonetaryAmount
import com.cloudkey.pms.common.room.{RoomFeature, RoomSetupInfo}
import com.cloudkey.pms.micros.og.reservation.advanced.{FetchRoomSetupRequest, FetchRoomSetupResponse, FetchRoomStatusRequest, FetchRoomStatusResponse}
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap
import com.cloudkey.pms.request.rooms.GetRoomSetupRequest
import com.cloudkey.pms.response.rooms.GetRoomSetupResponse
import com.google.inject.Inject
import com.keypr.bridge.ids.BridgeIds.SuiteType
import com.micros.pms.processors.{AbstractProcessorTest, MicrosMock}
import com.micros.pms.rawprocessors.RawFetchRoomStatusProcessor
import org.joda.time.LocalDate
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._

/**
 * Test suite for [[GetRoomSetupProcessor]]
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@RunWith(classOf[JUnitRunner])
class GetRoomSetupProcessorTest extends AbstractProcessorTest {

  @Inject
  var processor: GetRoomSetupProcessor = _

  @Inject
  var roomStatusProcessor: RawFetchRoomStatusProcessor = _

  @Inject
  var defaultCurrency: Currency = _

  var service: ResvAdvancedServiceSoap = _

  var realService: ResvAdvancedServiceSoap = _

  var getRoomSetupMock: MicrosMock[FetchRoomSetupRequest, FetchRoomSetupResponse, GetRoomSetupRequest, GetRoomSetupResponse] = _
  var getRoomStatusMock: MicrosMock[FetchRoomStatusRequest, FetchRoomStatusResponse, FetchRoomStatusRequest, FetchRoomStatusResponse] = _

  val fetchRoomStatusResponseXml = getClass.getResource("FetchRoomStatusResponse-features.xml")
  val fetchRoomSetupResponseXml = getClass.getResource("FetchRoomSetupResponse.xml")
  
  override protected def beforeAll() {
    super.beforeAll()

    // Mock the SOAP service client
    service = mock[ResvAdvancedServiceSoap]
    realService = processor.service

    processor.service = service
    roomStatusProcessor.service = service

    getRoomSetupMock = new MicrosMock(service.fetchRoomSetup, processor.process)
    getRoomStatusMock = new MicrosMock(service.fetchRoomStatus, roomStatusProcessor.process)
  }

  override protected def afterAll(): Unit = {
    super.afterAll()

    processor.service = realService
    roomStatusProcessor.service = realService
  }

  describe("A " + nameOf[GetRoomSetupProcessor]) {
    it("should correctly process a hotel-wide request") {
      val request: GetRoomSetupRequest = new GetRoomSetupRequest(null, null)
      getRoomSetupMock.respondToRequestWith(request, fetchRoomSetupResponseXml)

      val roomStatusRequest: FetchRoomStatusRequest = new FetchRoomStatusRequest()
        .withHotelReference(owsTools.getDefaultHotelReference)
        .withStartDate(new LocalDate(5010, 1, 1))
        .withEndDate(new LocalDate(5010, 1, 2))

      getRoomStatusMock.respondToRequestWith(roomStatusRequest, fetchRoomStatusResponseXml)

      val roomSetupResponse: GetRoomSetupResponse = processor.process(request)

      getRoomSetupMock.verify()
      getRoomStatusMock.verify()
      getRoomStatusMock.getMicrosRequest shouldBe roomStatusRequest

      getRoomSetupMock.getMicrosRequest shouldBe new FetchRoomSetupRequest(
        owsTools.getDefaultHotelReference,
        null, null
      )


      val internetFeatures: util.List[RoomFeature] = List(new RoomFeature("INT", "Internet Access from Guest Room")).asJava

      val expectedRoomSetups: Set[RoomSetupInfo] = Set(
        new RoomSetupInfo("101", internetFeatures, "MAIN", "Floor 1", "DLX", null, "Deluxe", null, SuiteType.STANDARD, 5.toLong, new MonetaryAmount(400, 0, defaultCurrency), null, null, "RACK"),
        new RoomSetupInfo("102", Collections.emptyList[RoomFeature], "MAIN", null, "STD", "Standard", "Standard", null, SuiteType.STANDARD, 5.toLong, new MonetaryAmount(300, 0, defaultCurrency), false, "HKSECTION1", "AAA"),
        new RoomSetupInfo("103", internetFeatures, "MAIN", null, "DLX", "Deluxe", null, null, SuiteType.STANDARD, 5.toLong, new MonetaryAmount(400, 0, defaultCurrency), null, "HKSECTION2", "BBB"),
        new RoomSetupInfo("104", Collections.emptyList[RoomFeature], null, null, "STD", "Standard", "Standard", null, SuiteType.STANDARD, 5.toLong, new MonetaryAmount(300, 0, defaultCurrency), false, "OTHERhkCODE", null),
        new RoomSetupInfo("105", internetFeatures, "MAIN", null, "DLX", null, null, null, SuiteType.STANDARD, 5.toLong, new MonetaryAmount(400, 0, defaultCurrency), null, null, null),
        new RoomSetupInfo("106", Collections.emptyList[RoomFeature], "MAIN", null, "STD", "Standard", "Standard", null, SuiteType.STANDARD, 5.toLong, new MonetaryAmount(300, 0, defaultCurrency), false, null, null),
        new RoomSetupInfo("107", internetFeatures, "MAIN", null, "DLX", "Deluxe", "Deluxe", null, SuiteType.STANDARD, 5.toLong, new MonetaryAmount(400, 0, defaultCurrency), null, null, null),
        new RoomSetupInfo("108", Collections.emptyList[RoomFeature], "MAIN", null, "STD", "Standard", "Standard", null, SuiteType.STANDARD, 5.toLong, new MonetaryAmount(300, 0, defaultCurrency), false, null, null),
        new RoomSetupInfo("109", internetFeatures, "MAIN", null, "DLX", "Deluxe", "Deluxe", null, SuiteType.STANDARD, 5.toLong, new MonetaryAmount(400, 0, defaultCurrency), null, null, null),
        new RoomSetupInfo("110", Collections.emptyList[RoomFeature], null, null, "STD", "Standard", "Standard", null, SuiteType.STANDARD, 5.toLong, new MonetaryAmount(300, 0, defaultCurrency), false, null, null),
        new RoomSetupInfo("111", internetFeatures, "MAIN", null, "DLX", "Deluxe", "Deluxe", "541-141-1244", SuiteType.STANDARD, 5.toLong, new MonetaryAmount(400, 0, defaultCurrency), null, null, null),
        new RoomSetupInfo("5000", Collections.emptyList[RoomFeature], "COMP1", null, "CABIN", "Cabin Suites", "Cabin Suites", null, SuiteType.SUITE, null, null, null, null, null),
        new RoomSetupInfo("6000", Collections.emptyList[RoomFeature], "COMP2", null, "LODGE", "Lodge Suites", "Lodge Suites", null, SuiteType.SUITE, null, null, null, null, null),
        new RoomSetupInfo("9000", Collections.emptyList[RoomFeature], null, null, "PM", "Posting Master", "Posting Master", null, SuiteType.PSUEDO, 1.toLong, null, null, null, null)
      )

      roomSetupResponse.getRoomSetupInfos should have size expectedRoomSetups.size
      expectedRoomSetups.foreach(roomSetup => {
        roomSetupResponse.getRoomSetupInfos should contain (roomSetup)
      })
    }

    it("should create the correct OWS requests for a room-number-specific request") {
      val request: GetRoomSetupRequest = new GetRoomSetupRequest("101", null)

      getRoomSetupMock.respondToRequestWith(request, fetchRoomSetupResponseXml)

      val roomStatusRequest: FetchRoomStatusRequest = new FetchRoomStatusRequest()
        .withHotelReference(owsTools.getDefaultHotelReference)
        .withStartDate(new LocalDate(5010, 1, 1))
        .withEndDate(new LocalDate(5010, 1, 2))
        .withRoomNumber("101")

      getRoomStatusMock.respondToRequestWith(roomStatusRequest, fetchRoomStatusResponseXml)

      processor.process(request)

      getRoomSetupMock.verify()
      getRoomStatusMock.verify()
      getRoomStatusMock.getMicrosRequest shouldBe roomStatusRequest

      getRoomSetupMock.getMicrosRequest shouldBe new FetchRoomSetupRequest(
        owsTools.getDefaultHotelReference,
        null, "101"
      )
    }

    it("should create the correct OWS requests for a room-type-specific request") {
      val request: GetRoomSetupRequest = new GetRoomSetupRequest(null, "STD")

      getRoomSetupMock.respondToRequestWith(request, fetchRoomSetupResponseXml)

      val roomStatusRequest: FetchRoomStatusRequest = new FetchRoomStatusRequest()
        .withHotelReference(owsTools.getDefaultHotelReference)
        .withStartDate(new LocalDate(5010, 1, 1))
        .withEndDate(new LocalDate(5010, 1, 2))
        .withRoomType("STD")

      getRoomStatusMock.respondToRequestWith(roomStatusRequest, fetchRoomStatusResponseXml)

      processor.process(request)

      getRoomSetupMock.verify()
      getRoomStatusMock.verify()
      getRoomStatusMock.getMicrosRequest shouldBe roomStatusRequest

      getRoomSetupMock.getMicrosRequest shouldBe new FetchRoomSetupRequest(
        owsTools.getDefaultHotelReference,
        "STD", null
      )
    }
  }
}
