package com.micros.harvester.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.micros.harvester.constant.IMicrosHarvester;
import com.micros.harvester.dao.MicrosDAOImpl;
import com.micros.harvester.logger.DataHarvesterLogger;
/**
 * This class will generate unique transaction identifier to be for tracking the keypr request.
 * 
 * @author vinayk2
 *
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

		int transactionId = IMicrosHarvester.COUNT_ZERO;
		
		boolean isEmptyResultSet = true;

		try {

			Connection conn = MicrosDAOImpl.getConnection();
			
			String query = IMicrosHarvester.QUERY_TRANSACTION_SELECT_BY_ID;
			
			DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," Select Query is " + query );
			
			PreparedStatement pStmt = conn.prepareStatement(query);

			ResultSet rowsSet = pStmt.executeQuery();

			if( rowsSet != null ) { // block executes when result set is retrieved from the database.

				isEmptyResultSet = false;
				rowsSet.next();

				transactionId = rowsSet.getInt( IMicrosHarvester.TRANSACTION_ID );

				DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," transaction id " + transactionId);
			}
			else { // block executes when no result set is retrieved from the database.

				DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," result set object not created" );
			}

			if( !isEmptyResultSet) { // block executes when result set contains rows.

				DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," result set contains data" );

				int transId = transactionId + IMicrosHarvester.COUNT_ONE; 
				
				query = IMicrosHarvester.QUERY_TRANSACTION_UPDATE_BY_ID;
				
				DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," Update Query " + query );
				
				pStmt = conn.prepareStatement( query );
				pStmt.setInt( IMicrosHarvester.COUNT_ONE, transId);

				int rowsUpdated = pStmt.executeUpdate();

				if( rowsUpdated != IMicrosHarvester.ROWS_UPDATED) { // block executes when database has been updated with the incremented value.

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
		catch( Exception exc ) {

			DataHarvesterLogger.logError( TransIdGenerator.class, " getTransactionId ", exc );
		}

		DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," returning tranaction id " + transactionId );
		DataHarvesterLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," exit getTransactioId" );

		return transactionId;
	}

}
