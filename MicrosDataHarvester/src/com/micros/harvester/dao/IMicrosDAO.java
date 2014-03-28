package com.micros.harvester.dao;

import com.micros.pms.bean.FetchRoomStatusResponse;

/**
 * This interface declares method to be implemented for performing data base
 * specific operations.
 * 
 * @author vinayk2
 *
 */
public interface IMicrosDAO {

	/**
	 * This method will persist the informations collected from property management system 
	 * for room status in the database. 
	 * 
	 * @param objFetchRoomStatusResponse - reference of FetchRoomStatusResponse
	 * @return
	 */
	boolean persistRoomStatusData ( FetchRoomStatusResponse objFetchRoomStatusResponse ) ;

}
