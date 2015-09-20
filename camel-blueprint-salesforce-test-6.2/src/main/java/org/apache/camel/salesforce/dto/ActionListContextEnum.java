/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ActionListContext
 */
public enum ActionListContextEnum {

    // Chatter
    CHATTER("Chatter"),
    // FeedElement
    FEEDELEMENT("FeedElement"),
    // Flexipage
    FLEXIPAGE("Flexipage"),
    // Global
    GLOBAL("Global"),
    // ListView
    LISTVIEW("ListView"),
    // ListViewRecord
    LISTVIEWRECORD("ListViewRecord"),
    // MruList
    MRULIST("MruList"),
    // MruRow
    MRUROW("MruRow"),
    // Record
    RECORD("Record"),
    // RelatedList
    RELATEDLIST("RelatedList"),
    // RelatedListRecord
    RELATEDLISTRECORD("RelatedListRecord");

    final String value;

    private ActionListContextEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ActionListContextEnum fromValue(String value) {
        for (ActionListContextEnum e : ActionListContextEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}