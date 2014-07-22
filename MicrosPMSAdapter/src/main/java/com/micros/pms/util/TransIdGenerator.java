package com.micros.pms.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cloudkey.dao.DataBaseHandler;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
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

		MicrosPMSLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," enter getTransactioId" );

		int transactionId = IMicrosConstants.COUNT_ZERO;
		
		boolean isEmptyResultSet = true;

		try {

			Connection conn = DataBaseHandler.getConnection();
			
			String query = IMicrosConstants.QUERY_TRANSACTION_SELECT_BY_ID;
			
			MicrosPMSLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," Select Query is " + query );
			
			PreparedStatement pStmt = conn.prepareStatement(query);

			ResultSet rowsSet = pStmt.executeQuery();

			if( rowsSet != null ) { // block executes when result set is retrieved from the database.

				isEmptyResultSet = false;
				rowsSet.next();

				transactionId = rowsSet.getInt( IMicrosConstants.TRANSACTION_ID );

				MicrosPMSLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," transaction id " + transactionId);
			}
			else { // block executes when no result set is retrieved from the database.

				MicrosPMSLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," result set object not created" );
			}

			if( !isEmptyResultSet) { // block executes when result set contains rows.

				MicrosPMSLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," result set contains data" );

				int transId = transactionId + IMicrosConstants.COUNT_ONE; 
				
				query = IMicrosConstants.QUERY_TRANSACTION_UPDATE_BY_ID;
				
				MicrosPMSLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," Update Query " + query );
				
				pStmt = conn.prepareStatement( query );
				pStmt.setInt( IMicrosConstants.COUNT_ONE, transId);

				int rowsUpdated = pStmt.executeUpdate();

				if( rowsUpdated != IMicrosConstants.ROWS_UPDATED) { // block executes when database has been updated with the incremented value.

					MicrosPMSLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," IdGenerator Table updated " );
				}
				else { // block executes when database has not been updated with the incremented value.

					MicrosPMSLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," IdGenerator table not updated " );
				}

			}
			else { // block executes when the result set is empty.

				MicrosPMSLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," result set is empty " );
			}
		}
		catch( Exception exc ) {

			MicrosPMSLogger.logError( TransIdGenerator.class, " getTransactionId ", exc );
		}

		MicrosPMSLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," returning tranaction id " + transactionId );
		MicrosPMSLogger.logInfo( TransIdGenerator.class, " getTransactionId " ," exit getTransactioId" );

		return transactionId;
	}

}
