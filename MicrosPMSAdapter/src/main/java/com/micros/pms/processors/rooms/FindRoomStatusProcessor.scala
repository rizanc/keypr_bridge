//package com.micros.pms.processors.rooms
//
//import com.cloudkey.pms.common.room.RoomStatusInfo
//import com.cloudkey.pms.micros.og.common.ResultStatus
//import com.cloudkey.pms.micros.og.core.OGHeader
//import com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusRequest
//import com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusResponse
//import com.cloudkey.pms.micros.ows.IdUtils
//import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap
//import com.cloudkey.pms.request.rooms.FindRoomStatusRequest
//import com.cloudkey.pms.response.EmptyResponse
//import com.cloudkey.pms.response.rooms.FindRoomStatusResponse
//import com.google.common.collect.Lists
//import com.google.inject.Inject
//import com.google.inject.Singleton
//import com.keypr.bridge.ids.BridgeIds
//import com.keypr.bridge.ids.BridgeIds.RoomStatus
//import com.keypr.pms.micros.oxi.ids.MicrosIds
//import com.keypr.pms.micros.oxi.ids.MicrosIds.OWS
//import com.keypr.pms.micros.oxi.ids.MicrosIds.OWS.FrontOfficeStatus
//import com.micros.pms.processors.OWSProcessor
//import org.joda.time.LocalDate
//import javax.xml.ws.Holder
//import scala.collection.JavaConversions._
//
///**
// * @author Charlie La Mothe (charlie@keypr.com)
// */
//@Singleton
//class FindRoomStatusProcessor extends OWSProcessor[FindRoomStatusRequest, FindRoomStatusResponse, FetchRoomStatusRequest, FetchRoomStatusResponse] {
//  @Inject
//  protected var service: ResvAdvancedServiceSoap = _
//
//  protected def getResultStatus(fetchRoomStatusResponse: FetchRoomStatusResponse): ResultStatus = {
//    fetchRoomStatusResponse.getResult
//  }
//
//  protected def callService(fetchRoomStatusRequest: FetchRoomStatusRequest, header: Holder[OGHeader]): FetchRoomStatusResponse = {
//    service.fetchRoomStatus(fetchRoomStatusRequest, header)
//  }
//
//  protected def toMicrosRequest(request: FindRoomStatusRequest): FetchRoomStatusRequest = {
//    val microsRequest: FetchRoomStatusRequest = new FetchRoomStatusRequest().withHotelReference(getDefaultHotelReference)
//
//    microsRequest.setStartDate(new LocalDate(1000, 1, 1))
//    microsRequest.setEndDate(new LocalDate(1000, 1, 2))
//
//    if (request.isRoomNumberSpecified) {
//      microsRequest.setRoomNumber(request.getRoomNumber)
//    }
//
//    if (request.isRoomTypeCodeSpecified) {
//      microsRequest.setRoomType(request.getRoomTypeCode)
//    }
//
//    if (request.isRoomClassCodeSpecified) {
//      microsRequest.withRoomClass(request.getRoomClassCode)
//    }
//
//    if (request.isFloorNumberSpecified) {
//      microsRequest.withFloorNumber(request.getFloor)
//    }
//
//    microsRequest
//  }
//
//  protected def toPmsResponse(microsResponse: FetchRoomStatusResponse): FindRoomStatusResponse = {
//    new FindRoomStatusResponse(
//      microsResponse.getRoomStatuses.map(status => {
//        new RoomStatusInfo(
//          status.getRoomNumber,
//          IdUtils.parseRoomStatusString(status.getRoomStatus),
//          IdUtils.parseFrontOfficeStatusString(status.getFrontOfficeStatus),
//          status.getRoomType,
//          status.getRoomClass,
//          IdUtils.parseYNString(status.getHouseKeepingInspectionFlag)
//        )
//      })
//    )
//  }
//
//}