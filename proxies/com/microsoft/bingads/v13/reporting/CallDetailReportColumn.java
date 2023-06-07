
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallDetailReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CallDetailReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AccountName"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="StartTime"/>
 *     <enumeration value="EndTime"/>
 *     <enumeration value="Duration"/>
 *     <enumeration value="AreaCode"/>
 *     <enumeration value="City"/>
 *     <enumeration value="State"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="AccountStatus"/>
 *     <enumeration value="CampaignStatus"/>
 *     <enumeration value="AdGroupStatus"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CallDetailReportColumn")
@XmlEnum
public enum CallDetailReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("StartTime")
    START_TIME("StartTime"),
    @XmlEnumValue("EndTime")
    END_TIME("EndTime"),
    @XmlEnumValue("Duration")
    DURATION("Duration"),
    @XmlEnumValue("AreaCode")
    AREA_CODE("AreaCode"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus");
    private final String value;

    CallDetailReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallDetailReportColumn fromValue(String v) {
        for (CallDetailReportColumn c: CallDetailReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
