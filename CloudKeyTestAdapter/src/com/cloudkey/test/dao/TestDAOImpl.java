package com.cloudkey.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cloudkey.commons.Reservation;
import com.cloudkey.dao.DataBaseHandler;
import com.cloudkey.pms.request.CheckInRequest;
import com.cloudkey.pms.request.GetAvailabilityRequest;
import com.cloudkey.pms.request.GetFolioRequest;
import com.cloudkey.pms.request.SearchReservationRequest;
import com.cloudkey.pms.request.UpdateBookingRequest;
import com.cloudkey.pms.request.UpdatePaymentRequest;
import com.cloudkey.pms.response.CheckInResponse;
import com.cloudkey.pms.response.GetAvailabilityResponse;
import com.cloudkey.pms.response.GetFolioResponse;
import com.cloudkey.pms.response.SearchReservationResponse;
import com.cloudkey.pms.response.UpdateBookingResponse;
import com.cloudkey.pms.response.UpdatePaymentResponse;

public class TestDAOImpl implements ITestDAO {



	@Override
	public SearchReservationResponse searchReservationData(
			SearchReservationRequest reservationRquest) {
		
	
		Connection conn = null;
		PreparedStatement pstatement = null;
		ResultSet rSet = null;
		SearchReservationResponse resvObj = null;
		
		boolean isEmptySet = true;
		
		String roomNumber = "";
		String roomType = "";
		
		String query = "";
		

		try {	
			
			conn=DataBaseHandler.getConnection();
			
			query = "select ROOM_NUMBER , ROOM_TYPE from RESERVATIONINFO where CONFIRMATION_NUM = ? ";

			pstatement = conn.prepareStatement(query);

			pstatement.setString(1,reservationRquest.getConfirmationNumber());

			rSet = pstatement.executeQuery();

			while(rSet.next()) {
			
				roomNumber=rSet.getString(1);
				roomType=rSet.getString(2);
				
				isEmptySet = false;

			}
			
            resvObj=new SearchReservationResponse();
			resvObj.setStatus("Clean");
			ArrayList<Reservation> arrResv=new ArrayList<Reservation>();
			
			Reservation resv=new Reservation();
			resv.setRoomType(roomType);
			resv.setRoomNumber(roomNumber);
			
			arrResv.add(resv);
		//	resvObj.setArrayList(arrResv);
			resvObj.setReservationList(arrResv);

			if(isEmptySet){

				System.out.println( " No Resultset found from database");
			}

		} catch (SQLException e) {

			System.out.println("Exception::");
			e.printStackTrace();
		}
		finally{

			if(conn != null){

				try {

					conn.close();
					pstatement.close();

				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
		return resvObj;
	}

	@Override
	public GetFolioResponse retrieveFolioInfo(GetFolioRequest folioReq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CheckInResponse guestCheckIn(CheckInRequest checkInReq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateBookingResponse updateBooking(UpdateBookingRequest upBookingReq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdatePaymentResponse updatePayment(UpdatePaymentRequest upPatmentReq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetAvailabilityResponse checkAvailability(
			GetAvailabilityRequest availReq) {
		// TODO Auto-generated method stub
		return null;
	}

}

