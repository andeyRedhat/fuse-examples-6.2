/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ContactAccessForAccountOwner
 */
public enum ContactAccessForAccountOwnerEnum {

    // Edit
    EDIT("Edit"),
    // None
    NONE("None"),
    // Read
    READ("Read");

    final String value;

    private ContactAccessForAccountOwnerEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ContactAccessForAccountOwnerEnum fromValue(String value) {
        for (ContactAccessForAccountOwnerEnum e : ContactAccessForAccountOwnerEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
