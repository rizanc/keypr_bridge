package com.cloudkey.db;

import com.keypr.guice.GuiceUtils;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;

/**
 * Guice module which provides a {@link javax.sql.DataSource} as configured by db.properties.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class DatabaseModule extends AbstractModule {

	protected final Logger log = LoggerFactory.getLogger(getClass());

	protected final static String dbPropsFilename = "db.properties";

	@Override
	protected void configure() {
		GuiceUtils.bindProperties(binder(), getClass().getResourceAsStream(dbPropsFilename));
	}

	/**
	 * Provide the {@link MysqlDataSource} from which to get a database connection.
	 *
	 * @param serverName
	 * @param portNumber
	 * @param databaseName
	 * @param user
	 * @param password
	 * @return
	 */
	@Provides
	@Singleton
	protected DataSource provideDataSource(
		@Named("keypr.bridge.db.serverName") String serverName,
		@Named("keypr.bridge.db.portNumber") int portNumber,
		@Named("keypr.bridge.db.name") String databaseName,
		@Named("keypr.bridge.db.user") String user,
		@Named("keypr.bridge.db.password") String password
	) {
		MysqlDataSource ds = new MysqlDataSource();
		ds.setServerName(serverName);
		ds.setPortNumber(portNumber);
		ds.setDatabaseName(databaseName);
		ds.setUser(user);
		ds.setPassword(password);

		return ds;
	}
}
