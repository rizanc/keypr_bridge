package com.cloudkey.upload;

import com.cloudkey.db.DatabaseModule;
import com.keypr.guice.GuiceUtils;
import com.google.inject.AbstractModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class UploadServiceModule extends AbstractModule {
	protected Logger log = LoggerFactory.getLogger(getClass());

	protected final static String propsFilename = "uploadservice.properties";

	@Override
	protected void configure() {
		install(new DatabaseModule());
		GuiceUtils.bindProperties(binder(), getClass().getResourceAsStream(propsFilename));
	}
}
