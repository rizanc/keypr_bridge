package com.cloudkey.util;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class GuiceUtils {
	public static Logger log = LoggerFactory.getLogger(GuiceUtils.class);

	public static void bindProperties(Binder binder, InputStream propFile) {
		Properties properties = new Properties();

		try {
			properties.load(propFile);
			propFile.close();

			Names.bindProperties(binder, properties);
		} catch (IOException e) {
			log.error("Could not load property file", propFile, e);
		}

	}
}
