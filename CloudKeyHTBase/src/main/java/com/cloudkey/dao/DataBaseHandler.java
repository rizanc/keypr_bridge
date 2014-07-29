package com.cloudkey.dao;

import com.cloudkey.constant.ICloudKeyConstants;
import com.cloudkey.util.BaseConfigurationReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class return the connection object.
 *
 * @author niveditat
 */
public class DataBaseHandler {

    private final static Logger log = LoggerFactory.getLogger(DataBaseHandler.class);

    /**
     * This method reads the database configurations from properties file.
     * It connects with database and returns connection .
     *
     * @return connection
     */
    public static Connection getConnection() {
        /* Reference variables to store connection related operation data. */
        Connection conn = null;
        String userName = null;
        String passWord = null;
        String dbUrl = null;
        String dbName = null;
        String dbDriverName = null;

        userName = BaseConfigurationReader.getProperty(ICloudKeyConstants.DATABASE_USERNAME);
        passWord = BaseConfigurationReader.getProperty(ICloudKeyConstants.DATABASE_PASSWORD);
        dbUrl = BaseConfigurationReader.getProperty(ICloudKeyConstants.DATABASE_URL);
        dbName = BaseConfigurationReader.getProperty(ICloudKeyConstants.DATABASE_SCHEMA);
        dbDriverName = BaseConfigurationReader.getProperty(ICloudKeyConstants.DATABASE_DRIVER_NAME);

        // TODO: This seems unnecessary.
        try {
            Class.forName(dbDriverName).newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e) {
            log.error("Error creating database driver", e);
        }

        try {
            conn = DriverManager.getConnection(dbUrl + dbName, userName, passWord);
        } catch (SQLException e) {
            log.error("Could not connect to database", e);
        }

        log.info("Successfully connected to database");

        return conn;
    }
}
