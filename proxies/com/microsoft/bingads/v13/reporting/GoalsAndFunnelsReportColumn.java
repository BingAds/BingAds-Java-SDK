
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoalsAndFunnelsReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GoalsAndFunnelsReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="Keyword"/>
 *     <enumeration value="KeywordId"/>
 *     <enumeration value="Goal"/>
 *     <enumeration value="AllConversions"/>
 *     <enumeration value="Assists"/>
 *     <enumeration value="AllRevenue"/>
 *     <enumeration value="GoalId"/>
 *     <enumeration value="DeviceType"/>
 *     <enumeration value="DeviceOS"/>
 *     <enumeration value="AccountStatus"/>
 *     <enumeration value="CampaignStatus"/>
 *     <enumeration value="AdGroupStatus"/>
 *     <enumeration value="KeywordStatus"/>
 *     <enumeration value="GoalType"/>
 *     <enumeration value="ViewThroughConversions"/>
 *     <enumeration value="AllConversionsQualified"/>
 *     <enumeration value="ViewThroughConversionsQualified"/>
 *     <enumeration value="ViewThroughRevenue"/>
 *     <enumeration value="CampaignType"/>
 *     <enumeration value="AssetGroupId"/>
 *     <enumeration value="AssetGroupName"/>
 *     <enumeration value="AssetGroupStatus"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GoalsAndFunnelsReportColumn")
@XmlEnum
public enum GoalsAndFunnelsReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("KeywordId")
    KEYWORD_ID("KeywordId"),
    @XmlEnumValue("Goal")
    GOAL("Goal"),
    @XmlEnumValue("AllConversions")
    ALL_CONVERSIONS("AllConversions"),
    @XmlEnumValue("Assists")
    ASSISTS("Assists"),
    @XmlEnumValue("AllRevenue")
    ALL_REVENUE("AllRevenue"),
    @XmlEnumValue("GoalId")
    GOAL_ID("GoalId"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("DeviceOS")
    DEVICE_OS("DeviceOS"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus"),
    @XmlEnumValue("KeywordStatus")
    KEYWORD_STATUS("KeywordStatus"),
    @XmlEnumValue("GoalType")
    GOAL_TYPE("GoalType"),
    @XmlEnumValue("ViewThroughConversions")
    VIEW_THROUGH_CONVERSIONS("ViewThroughConversions"),
    @XmlEnumValue("AllConversionsQualified")
    ALL_CONVERSIONS_QUALIFIED("AllConversionsQualified"),
    @XmlEnumValue("ViewThroughConversionsQualified")
    VIEW_THROUGH_CONVERSIONS_QUALIFIED("ViewThroughConversionsQualified"),
    @XmlEnumValue("ViewThroughRevenue")
    VIEW_THROUGH_REVENUE("ViewThroughRevenue"),
    @XmlEnumValue("CampaignType")
    CAMPAIGN_TYPE("CampaignType"),
    @XmlEnumValue("AssetGroupId")
    ASSET_GROUP_ID("AssetGroupId"),
    @XmlEnumValue("AssetGroupName")
    ASSET_GROUP_NAME("AssetGroupName"),
    @XmlEnumValue("AssetGroupStatus")
    ASSET_GROUP_STATUS("AssetGroupStatus");
    private final String value;

    GoalsAndFunnelsReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GoalsAndFunnelsReportColumn fromValue(String v) {
        for (GoalsAndFunnelsReportColumn c: GoalsAndFunnelsReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
