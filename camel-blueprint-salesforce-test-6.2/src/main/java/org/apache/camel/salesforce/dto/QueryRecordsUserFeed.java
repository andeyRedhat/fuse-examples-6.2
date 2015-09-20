/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type UserFeed
 */
public class QueryRecordsUserFeed extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<UserFeed> records;

    public List<UserFeed> getRecords() {
        return records;
    }

    public void setRecords(List<UserFeed> records) {
        this.records = records;
    }
}