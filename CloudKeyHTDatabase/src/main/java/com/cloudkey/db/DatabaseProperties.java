package com.cloudkey.db;

import java.io.IOException;
import java.util.Properties;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public enum DatabaseProperties {
	DB_URL("keypr.bridge.db.url"),
	DB_USERNAME("keypr.bridge.db.username"),
	DB_PASSWORD("keypr.bridge.db.db.password");

	private final static Properties applicationProperties = new Properties();
	private static String propsFilename = "db.properties";

	private final String key;

	static {
		try {
			applicationProperties.load(DatabaseProperties.class.getResourceAsStream(propsFilename));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String val() {
		return applicationProperties.getProperty(key, "");
	}

	private DatabaseProperties(String key) {
		this.key = key;
	}
}
