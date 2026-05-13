
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MMMPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MMMPerformanceReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="AssetGroupId"/>
 *     <enumeration value="AssetGroupName"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="Country"/>
 *     <enumeration value="State"/>
 *     <enumeration value="Impressions"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="Spend"/>
 *     <enumeration value="ConversionsQualified"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MMMPerformanceReportColumn")
@XmlEnum
public enum MMMPerformanceReportColumn {

    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AssetGroupId")
    ASSET_GROUP_ID("AssetGroupId"),
    @XmlEnumValue("AssetGroupName")
    ASSET_GROUP_NAME("AssetGroupName"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("Impressions")
    IMPRESSIONS("Impressions"),
    @XmlEnumValue("Clicks")
    CLICKS("Clicks"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("ConversionsQualified")
    CONVERSIONS_QUALIFIED("ConversionsQualified");
    private final String value;

    MMMPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MMMPerformanceReportColumn fromValue(String v) {
        for (MMMPerformanceReportColumn c: MMMPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
