package com.micros.harvester.handlers;

import com.micros.harvester.exceptions.HandlingException;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public interface OXIPushHandler<T> {
	void handle(T oxiMessage) throws HandlingException;
}
