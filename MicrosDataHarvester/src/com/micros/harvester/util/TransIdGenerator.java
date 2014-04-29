package com.micros.harvester.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.micros.harvester.dao.MicrosDAOImpl;
import com.micros.harvester.logger.DataHarvesterLogger;
/*
 * This class will generate unique transaction identifier to be for tracking the keypr request.
 */
public class TransIdGenerator {

	/**
	 * This method returns the unique transaction identifier to be used in the current transaction.
	 * It retrieves the value of transaction identifier from the database. It returns the retrieved
	 * data and increment the retrieve value by one and then store the incremented value back 
	 * in the database.
	 * 
	 * @return - current transaction identifier.
	 */
	public synchronized static int getTransactionId()	{

		DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," enter getTransactioId" );

		int transactionId = 0;
		boolean isEmptyResultSet = true;

		try {

			Connection conn = MicrosDAOImpl.getConnection();
			String query = " Select transId from IdGenerator ";
			PreparedStatement pStmt = conn.prepareStatement(query);

			ResultSet rowsSet = pStmt.executeQuery();

			if( rowsSet != null ) { // block executes when result set is retrieved from the database.

				isEmptyResultSet = false;
				rowsSet.next();

				transactionId = rowsSet.getInt("transId");

				DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," transaction id " + transactionId);
			}
			else { // block executes when no result set is retrieved from the database.

				DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," result set object not created" );
			}

			if( !isEmptyResultSet) { // block executes when result set contains rows.

				DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," result set contains data" );

				int transId = transactionId + 1; 
				query = " update IdGenerator set transId = ? ";

				pStmt = conn.prepareStatement( query );
				pStmt.setInt(1, transId);

				int rowsUpdated = pStmt.executeUpdate();

				if( rowsUpdated != 0) { // block executes when database has been updated with the incremented value.

					DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," IdGenerator Table updated " );
				}
				else { // block executes when database has not been updated with the incremented value.

					DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," IdGenerator table not updated " );
				}

			}
			else { // block executes when the result set is empty.

				DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," result set is empty " );
			}
		}
		catch( Exception exc){

			DataHarvesterLogger.logError( TransIdGenerator.class, " getTransactionId ", exc );
		}

		DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," returning tranaction id " + transactionId );
		DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," exit getTransactioId" );

		return transactionId;
	}

}
