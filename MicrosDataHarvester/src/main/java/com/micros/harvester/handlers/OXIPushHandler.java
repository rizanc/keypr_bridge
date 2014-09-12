package com.micros.harvester.handlers;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public interface OXIPushHandler<T> {
	void handle(T oxiMessage);
}
