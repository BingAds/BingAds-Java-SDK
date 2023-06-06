
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExtensionByAdReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdExtensionByAdReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AccountName"/>
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="AdTitle"/>
 *     <enumeration value="AdId"/>
 *     <enumeration value="AdExtensionType"/>
 *     <enumeration value="DeviceType"/>
 *     <enumeration value="DeviceOS"/>
 *     <enumeration value="ClickType"/>
 *     <enumeration value="Impressions"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="TotalClicks"/>
 *     <enumeration value="Conversions"/>
 *     <enumeration value="Ctr"/>
 *     <enumeration value="AverageCpc"/>
 *     <enumeration value="ConversionRate"/>
 *     <enumeration value="Spend"/>
 *     <enumeration value="AdExtensionId"/>
 *     <enumeration value="AdExtensionVersion"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="BidMatchType"/>
 *     <enumeration value="DeliveredMatchType"/>
 *     <enumeration value="Network"/>
 *     <enumeration value="TopVsOther"/>
 *     <enumeration value="Assists"/>
 *     <enumeration value="Revenue"/>
 *     <enumeration value="ReturnOnAdSpend"/>
 *     <enumeration value="CostPerConversion"/>
 *     <enumeration value="CostPerAssist"/>
 *     <enumeration value="RevenuePerConversion"/>
 *     <enumeration value="RevenuePerAssist"/>
 *     <enumeration value="AccountStatus"/>
 *     <enumeration value="CampaignStatus"/>
 *     <enumeration value="AdGroupStatus"/>
 *     <enumeration value="AdStatus"/>
 *     <enumeration value="TitlePart1"/>
 *     <enumeration value="TitlePart2"/>
 *     <enumeration value="TitlePart3"/>
 *     <enumeration value="AllConversions"/>
 *     <enumeration value="AllRevenue"/>
 *     <enumeration value="AllConversionRate"/>
 *     <enumeration value="AllCostPerConversion"/>
 *     <enumeration value="AllReturnOnAdSpend"/>
 *     <enumeration value="AllRevenuePerConversion"/>
 *     <enumeration value="Goal"/>
 *     <enumeration value="GoalType"/>
 *     <enumeration value="AverageCpm"/>
 *     <enumeration value="ConversionsQualified"/>
 *     <enumeration value="AllConversionsQualified"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdExtensionByAdReportColumn")
@XmlEnum
public enum AdExtensionByAdReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
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
    @XmlEnumValue("AdTitle")
    AD_TITLE("AdTitle"),
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("AdExtensionType")
    AD_EXTENSION_TYPE("AdExtensionType"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("DeviceOS")
    DEVICE_OS("DeviceOS"),
    @XmlEnumValue("ClickType")
    CLICK_TYPE("ClickType"),
    @XmlEnumValue("Impressions")
    IMPRESSIONS("Impressions"),
    @XmlEnumValue("Clicks")
    CLICKS("Clicks"),
    @XmlEnumValue("TotalClicks")
    TOTAL_CLICKS("TotalClicks"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("Ctr")
    CTR("Ctr"),
    @XmlEnumValue("AverageCpc")
    AVERAGE_CPC("AverageCpc"),
    @XmlEnumValue("ConversionRate")
    CONVERSION_RATE("ConversionRate"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("AdExtensionId")
    AD_EXTENSION_ID("AdExtensionId"),
    @XmlEnumValue("AdExtensionVersion")
    AD_EXTENSION_VERSION("AdExtensionVersion"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("DeliveredMatchType")
    DELIVERED_MATCH_TYPE("DeliveredMatchType"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("TopVsOther")
    TOP_VS_OTHER("TopVsOther"),
    @XmlEnumValue("Assists")
    ASSISTS("Assists"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("ReturnOnAdSpend")
    RETURN_ON_AD_SPEND("ReturnOnAdSpend"),
    @XmlEnumValue("CostPerConversion")
    COST_PER_CONVERSION("CostPerConversion"),
    @XmlEnumValue("CostPerAssist")
    COST_PER_ASSIST("CostPerAssist"),
    @XmlEnumValue("RevenuePerConversion")
    REVENUE_PER_CONVERSION("RevenuePerConversion"),
    @XmlEnumValue("RevenuePerAssist")
    REVENUE_PER_ASSIST("RevenuePerAssist"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus"),
    @XmlEnumValue("AdStatus")
    AD_STATUS("AdStatus"),
    @XmlEnumValue("TitlePart1")
    TITLE_PART_1("TitlePart1"),
    @XmlEnumValue("TitlePart2")
    TITLE_PART_2("TitlePart2"),
    @XmlEnumValue("TitlePart3")
    TITLE_PART_3("TitlePart3"),
    @XmlEnumValue("AllConversions")
    ALL_CONVERSIONS("AllConversions"),
    @XmlEnumValue("AllRevenue")
    ALL_REVENUE("AllRevenue"),
    @XmlEnumValue("AllConversionRate")
    ALL_CONVERSION_RATE("AllConversionRate"),
    @XmlEnumValue("AllCostPerConversion")
    ALL_COST_PER_CONVERSION("AllCostPerConversion"),
    @XmlEnumValue("AllReturnOnAdSpend")
    ALL_RETURN_ON_AD_SPEND("AllReturnOnAdSpend"),
    @XmlEnumValue("AllRevenuePerConversion")
    ALL_REVENUE_PER_CONVERSION("AllRevenuePerConversion"),
    @XmlEnumValue("Goal")
    GOAL("Goal"),
    @XmlEnumValue("GoalType")
    GOAL_TYPE("GoalType"),
    @XmlEnumValue("AverageCpm")
    AVERAGE_CPM("AverageCpm"),
    @XmlEnumValue("ConversionsQualified")
    CONVERSIONS_QUALIFIED("ConversionsQualified"),
    @XmlEnumValue("AllConversionsQualified")
    ALL_CONVERSIONS_QUALIFIED("AllConversionsQualified");
    private final String value;

    AdExtensionByAdReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdExtensionByAdReportColumn fromValue(String v) {
        for (AdExtensionByAdReportColumn c: AdExtensionByAdReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
