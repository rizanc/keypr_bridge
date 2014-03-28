package com.micros.harvester.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;

import com.cloudkey.constant.ICloudKeyConstants;
import com.micros.harvester.logger.DataHarvesterLogger;
import com.micros.harvester.util.HarvesterConfigurationReader;
import com.micros.pms.bean.FetchRoomStatusResponse;
import com.micros.pms.bean.RoomStatus;

/**
 * This class handles the database related operations for the data harvester service.
 * It connects with the database and stores data collected from the property management
 * system to the database.
 * 
 * @author vinayk2
 *
 */
public class MicrosDAOImpl  implements IMicrosDAO {

	/**
	 * This method reads the database configurations from properties file.
	 * It connects with database and returns connection .
	 * 
	 * @return  connection
	 */
	public static Connection getConnection() {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " getConnection ", " Enter getConnection method " );

		/* Reference variables to store connection related operation data. */
		Connection conn = null;
		String userName = null;
		String passWord = null;
		String dbUrl = null;
		String dbName = null;
		String dbDriverName = null;

		try {

			userName = HarvesterConfigurationReader.getProperty( ICloudKeyConstants.DATABASE_USERNAME );
			passWord = HarvesterConfigurationReader.getProperty( ICloudKeyConstants.DATABASE_PASSWORD );
			dbUrl = HarvesterConfigurationReader.getProperty( ICloudKeyConstants.DATABASE_URL  );

			dbName = HarvesterConfigurationReader.getProperty( ICloudKeyConstants.DATABASE_SCHEMA  );
			dbDriverName = HarvesterConfigurationReader.getProperty( ICloudKeyConstants.DATABASE_DRIVER_NAME );

			Class.forName(dbDriverName).newInstance();

			conn = DriverManager.getConnection( dbUrl + dbName, userName, passWord );

			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " getConnection", " DataBase connection created " );

		}
		catch( Exception exc ) {

			DataHarvesterLogger.logError( MicrosDAOImpl.class, " getConnection ", exc);
		}

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " getConnection ", " Exit  getConnection method " );

		return  conn;

	}

	@Override
	public boolean persistRoomStatusData( FetchRoomStatusResponse objFetchRoomStatusResponse ) {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusData ", " Enter  persistRoomStatusData method " );

		Connection objConnection = null;
		PreparedStatement pStatement = null;
		String sqlQuery = null;


		List<RoomStatus> objRoomStatus = objFetchRoomStatusResponse.getRoomStatus();

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusData ", " Number of Rows is " + objRoomStatus.size() );

		Iterator<RoomStatus> iterateElements = objRoomStatus.iterator();
		com.micros.harvester.communicator.ObjectFactory objFactory = new com.micros.harvester.communicator.ObjectFactory();

		RoomStatus objRoomSatus = objFactory.createRoomStatus();

		try {

			objConnection = MicrosDAOImpl.getConnection();
			sqlQuery = " insert into keypr_upload_db.room_details ( room_number, room_type, front_office_status, "
					+ " house_keeping_status, room_status ) values ( ?,?,?,?,? )";

			pStatement = objConnection.prepareStatement( sqlQuery );

			while( iterateElements.hasNext()) {

				objRoomSatus = iterateElements.next();

				pStatement.setInt( 1, Integer.parseInt(objRoomSatus.getRoomNumber()));
				pStatement.setString( 2, objRoomSatus.getRoomType() );
				pStatement.setString ( 3, objRoomSatus.getFrontOfficeStatus() );
				pStatement.setString( 4,  objRoomSatus.getHouseKeepingStatus() );
				pStatement.setString( 5, objRoomSatus.getRoomStatus());

				int rowInserted = pStatement.executeUpdate();

				if ( rowInserted != 0 ) {

					DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusData ", " Row inserted in Room_Details " );
				}
				else {

					DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusData ", " Row cannot be inserted in Room_Details " );
				}

			}
		}
		catch ( Exception exc ) {

			DataHarvesterLogger.logError( MicrosDAOImpl.class, " persistRoomStatusData ", exc) ;
		}
		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusData ", " Exit persistRoomStatusData method " );

		return false;
	}

}
