package com.micros.pms.processors.rooms

import com.cloudkey.pms.common.room.RoomStatusInfo
import com.cloudkey.pms.micros.og.reservation.advanced.{FetchRoomStatusRequest, FetchRoomStatusResponse}
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap
import com.cloudkey.pms.request.rooms.GetRoomStatusRequest
import com.cloudkey.pms.response.rooms.GetRoomStatusResponse
import com.google.inject.Inject
import com.keypr.bridge.ids.BridgeIds.{GuestServiceStatus, RoomStatus}
import com.micros.pms.processors.{AbstractProcessorTest, MicrosMock}
import org.apache.commons.io.IOUtils
import org.joda.time
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.collection.JavaConversions._

/**
 * Test suite for [[GetRoomStatusProcessor]]
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@RunWith(classOf[JUnitRunner])
class GetRoomStatusProcessorTest extends AbstractProcessorTest {

  @Inject
  var processor: GetRoomStatusProcessor = _

  var service: ResvAdvancedServiceSoap = _

  var realService: ResvAdvancedServiceSoap = _

  var getRoomStatusMock: MicrosMock[FetchRoomStatusRequest, FetchRoomStatusResponse, GetRoomStatusRequest, GetRoomStatusResponse] = _

  val fetchRoomStatusResponseXml = getClass.getResource("FetchRoomStatusResponse.xml")

  override protected def beforeAll() {
    super.beforeAll()

    // Mock the SOAP service client
    service = mock[ResvAdvancedServiceSoap]
    realService = processor.service
    processor.service = service

    getRoomStatusMock = new MicrosMock(service.fetchRoomStatus, processor.process)
  }

  override protected def afterAll(): Unit = {
    super.afterAll()

    processor.service = realService
  }

  describe("A " + nameOf[GetRoomStatusProcessor]) {
    it("should correctly process a hotel-wide request") {
      val result = getRoomStatusMock.run(new GetRoomStatusRequest(), fetchRoomStatusResponseXml)

      result.microsRequest shouldBe
        new FetchRoomStatusRequest()
          .withHotelReference(owsTools.getDefaultHotelReference)

      result.response.getRoomStatusInfos should have size 12
      result.response.getRoomStatusInfos.toSet shouldBe Set(
          new RoomStatusInfo("101", RoomStatus.CLEAN, true, GuestServiceStatus.DO_NOT_DISTURB, "DLX", null, false),
          new RoomStatusInfo("102", RoomStatus.DIRTY, false, GuestServiceStatus.MAKE_UP_ROOM, "STD", null, false),
          new RoomStatusInfo("103", RoomStatus.INSPECTED, false, GuestServiceStatus.NONE, "DLX", new time.LocalDate(2014, 10, 11), true),
          new RoomStatusInfo("105", RoomStatus.CLEAN, false, GuestServiceStatus.NONE, "DLX", null, false),
          new RoomStatusInfo("106", RoomStatus.CLEAN, false, GuestServiceStatus.NONE, "STD", null, false),
          new RoomStatusInfo("107", RoomStatus.PICKUP, false, GuestServiceStatus.NONE, "DLX", null, false),
          new RoomStatusInfo("108", RoomStatus.INSPECTED, true, GuestServiceStatus.NONE, "STD", null, false),
          new RoomStatusInfo("109", RoomStatus.OUT_OF_SERVICE, false, GuestServiceStatus.NONE, "DLX", null, false),
          new RoomStatusInfo("111", RoomStatus.OUT_OF_ORDER, false, GuestServiceStatus.NONE, "DLX", null, false),
          new RoomStatusInfo("5000", RoomStatus.DIRTY, false, GuestServiceStatus.NONE, "CABIN", null, false),
          new RoomStatusInfo("6000", RoomStatus.DIRTY, false, GuestServiceStatus.NONE, "LODGE", null, false),
          new RoomStatusInfo("9000", RoomStatus.CLEAN, false, GuestServiceStatus.NONE, "PM", null, false)
      )
    }

    it("should correctly convert a roomNumber-specific request to an OWS request") {
      val result = getRoomStatusMock.run(new GetRoomStatusRequest("101"), fetchRoomStatusResponseXml)

      result.microsRequest shouldBe
        new FetchRoomStatusRequest()
          .withHotelReference(owsTools.getDefaultHotelReference)
          .withRoomNumber("101")
    }

    it("should correctly convert a roomType, roomClass and floor-specific request to an OWS request") {
      val result = getRoomStatusMock.run(new GetRoomStatusRequest("DLX", "TOWER1", "Floor 1"), fetchRoomStatusResponseXml)

      result.microsRequest shouldBe
        new FetchRoomStatusRequest()
          .withHotelReference(owsTools.getDefaultHotelReference)
          .withRoomType("DLX")
          .withRoomClass("TOWER1")
          .withFloorNumber("Floor 1")
    }
  }

}
