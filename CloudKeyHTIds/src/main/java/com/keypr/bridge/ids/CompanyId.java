package com.keypr.bridge.ids;

/**
 * Identifies a company which might book a room for an employee
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class CompanyId extends TypedStringIdentifier {
    protected CompanyId(String identifier) {
        super(identifier);
    }
}
