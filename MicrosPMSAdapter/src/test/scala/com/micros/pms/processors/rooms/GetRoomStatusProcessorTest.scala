package com.micros.pms.processors.rooms

import com.cloudkey.pms.common.room.RoomStatusInfo
import com.cloudkey.pms.micros.og.reservation.advanced.{FetchRoomStatusRequest, FetchRoomStatusResponse}
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap
import com.cloudkey.pms.request.rooms.GetRoomStatusRequest
import com.cloudkey.pms.response.rooms.GetRoomStatusResponse
import com.google.inject.Inject
import com.keypr.bridge.ids.BridgeIds.{GuestServiceStatus, RoomStatus}
import com.micros.pms.processors.{AbstractProcessorTest, MicrosMock}
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
class GetRoomStatusProcessorTest extends AbstractProcessorTest[FetchRoomStatusRequest, FetchRoomStatusResponse] {

  @Inject
  var processor: GetRoomStatusProcessor = _

  var service: ResvAdvancedServiceSoap = _

  var realService: ResvAdvancedServiceSoap = _

  var getRoomStatusMock: MicrosMock[FetchRoomStatusRequest, FetchRoomStatusResponse, GetRoomStatusRequest, GetRoomStatusResponse] = _

  val microsResponseXml = """<FetchRoomStatusResponse
        xmlns:hc="http://webservices.micros.com/og/4.3/HotelCommon/"
        xmlns:c="http://webservices.micros.com/og/4.3/Common/"
        xmlns="http://webservices.micros.com/og/4.3/ResvAdvanced/">
          <RoomStatus RoomStatus="CL" FrontOfficeStatus="OCC" HouseKeepingStatus="VAC" HouseKeepingInspectionFlag="N" TurnDownYn="Y" ServiceStatus="DND" RoomNumber="101" RoomType="DLX" />
          <RoomStatus RoomStatus="DI" FrontOfficeStatus="VAC" HouseKeepingStatus="VAC" HouseKeepingInspectionFlag="N" TurnDownYn="N" ServiceStatus="MUP" RoomNumber="102" RoomType="STD" />
          <RoomStatus NextReservationDate="2014-10-11" RoomStatus="IP" FrontOfficeStatus="VAC" HouseKeepingStatus="VAC" HouseKeepingInspectionFlag="Y" TurnDownYn="Y" RoomNumber="103" RoomType="DLX" />
          <RoomStatus RoomStatus="CL" FrontOfficeStatus="VAC" HouseKeepingStatus="VAC" HouseKeepingInspectionFlag="N" TurnDownYn="Y" RoomNumber="105" RoomType="DLX" />
          <RoomStatus RoomStatus="CL" FrontOfficeStatus="VAC" HouseKeepingStatus="VAC" HouseKeepingInspectionFlag="N" TurnDownYn="Y" RoomNumber="106" RoomType="STD" />
          <RoomStatus RoomStatus="PU" FrontOfficeStatus="VAC" HouseKeepingStatus="VAC" HouseKeepingInspectionFlag="N" TurnDownYn="Y" RoomNumber="107" RoomType="DLX" />
          <RoomStatus RoomStatus="IP" FrontOfficeStatus="OCC" HouseKeepingStatus="OCC" HouseKeepingInspectionFlag="N" TurnDownYn="Y" RoomNumber="108" RoomType="STD" />
          <RoomStatus RoomStatus="OS" FrontOfficeStatus="VAC" HouseKeepingStatus="VAC" HouseKeepingInspectionFlag="N" TurnDownYn="Y" RoomNumber="109" RoomType="DLX" />
          <RoomStatus RoomStatus="OO" FrontOfficeStatus="VAC" HouseKeepingStatus="VAC" HouseKeepingInspectionFlag="N" TurnDownYn="Y" RoomNumber="111" RoomType="DLX" />
          <RoomStatus RoomStatus="DI" FrontOfficeStatus="VAC" HouseKeepingStatus="VAC" HouseKeepingInspectionFlag="N" RoomNumber="5000" RoomType="CABIN" />
          <RoomStatus RoomStatus="DI" FrontOfficeStatus="VAC" HouseKeepingStatus="VAC" HouseKeepingInspectionFlag="N" RoomNumber="6000" RoomType="LODGE" />
          <RoomStatus RoomStatus="CL" FrontOfficeStatus="VAC" HouseKeepingStatus="VAC" HouseKeepingInspectionFlag="N" TurnDownYn="N" RoomNumber="9000" RoomType="PM" />
          <Result resultStatusFlag="SUCCESS" />
        </FetchRoomStatusResponse>"""

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
      val result = getRoomStatusMock.run(new GetRoomStatusRequest(), microsResponseXml)

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
      val result = getRoomStatusMock.run(new GetRoomStatusRequest("101"), microsResponseXml)

      result.microsRequest shouldBe
        new FetchRoomStatusRequest()
          .withHotelReference(owsTools.getDefaultHotelReference)
          .withRoomNumber("101")
    }

    it("should correctly convert a roomType, roomClass and floor-specific request to an OWS request") {
      val result = getRoomStatusMock.run(new GetRoomStatusRequest("DLX", "TOWER1", "Floor 1"), microsResponseXml)

      result.microsRequest shouldBe
        new FetchRoomStatusRequest()
          .withHotelReference(owsTools.getDefaultHotelReference)
          .withRoomType("DLX")
          .withRoomClass("TOWER1")
          .withFloorNumber("Floor 1")
    }
  }

}
