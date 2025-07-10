
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedItemPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FeedItemPerformanceReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="AdId"/>
 *     <enumeration value="FeedId"/>
 *     <enumeration value="FeedItemId"/>
 *     <enumeration value="Impressions"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="Spend"/>
 *     <enumeration value="Ctr"/>
 *     <enumeration value="AverageCpc"/>
 *     <enumeration value="AveragePosition"/>
 *     <enumeration value="Conversions"/>
 *     <enumeration value="Assists"/>
 *     <enumeration value="Revenue"/>
 *     <enumeration value="ExtendedCost"/>
 *     <enumeration value="ConversionsQualified"/>
 *     <enumeration value="ConversionRate"/>
 *     <enumeration value="CostPerConversion"/>
 *     <enumeration value="ReturnOnAdSpend"/>
 *     <enumeration value="CostPerAssist"/>
 *     <enumeration value="RevenuePerConversion"/>
 *     <enumeration value="RevenuePerAssist"/>
 *     <enumeration value="AllConversions"/>
 *     <enumeration value="AllConversionsQualified"/>
 *     <enumeration value="AllRevenue"/>
 *     <enumeration value="AllCostPerConversion"/>
 *     <enumeration value="AllConversionRate"/>
 *     <enumeration value="AllRevenuePerConversion"/>
 *     <enumeration value="AllReturnOnAdSpend"/>
 *     <enumeration value="ViewThroughConversions"/>
 *     <enumeration value="ViewThroughConversionsQualified"/>
 *     <enumeration value="ViewThroughRevenue"/>
 *     <enumeration value="ViewThroughConversionRate"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FeedItemPerformanceReportColumn")
@XmlEnum
public enum FeedItemPerformanceReportColumn {

    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("FeedId")
    FEED_ID("FeedId"),
    @XmlEnumValue("FeedItemId")
    FEED_ITEM_ID("FeedItemId"),
    @XmlEnumValue("Impressions")
    IMPRESSIONS("Impressions"),
    @XmlEnumValue("Clicks")
    CLICKS("Clicks"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("Ctr")
    CTR("Ctr"),
    @XmlEnumValue("AverageCpc")
    AVERAGE_CPC("AverageCpc"),
    @XmlEnumValue("AveragePosition")
    AVERAGE_POSITION("AveragePosition"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("Assists")
    ASSISTS("Assists"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("ExtendedCost")
    EXTENDED_COST("ExtendedCost"),
    @XmlEnumValue("ConversionsQualified")
    CONVERSIONS_QUALIFIED("ConversionsQualified"),
    @XmlEnumValue("ConversionRate")
    CONVERSION_RATE("ConversionRate"),
    @XmlEnumValue("CostPerConversion")
    COST_PER_CONVERSION("CostPerConversion"),
    @XmlEnumValue("ReturnOnAdSpend")
    RETURN_ON_AD_SPEND("ReturnOnAdSpend"),
    @XmlEnumValue("CostPerAssist")
    COST_PER_ASSIST("CostPerAssist"),
    @XmlEnumValue("RevenuePerConversion")
    REVENUE_PER_CONVERSION("RevenuePerConversion"),
    @XmlEnumValue("RevenuePerAssist")
    REVENUE_PER_ASSIST("RevenuePerAssist"),
    @XmlEnumValue("AllConversions")
    ALL_CONVERSIONS("AllConversions"),
    @XmlEnumValue("AllConversionsQualified")
    ALL_CONVERSIONS_QUALIFIED("AllConversionsQualified"),
    @XmlEnumValue("AllRevenue")
    ALL_REVENUE("AllRevenue"),
    @XmlEnumValue("AllCostPerConversion")
    ALL_COST_PER_CONVERSION("AllCostPerConversion"),
    @XmlEnumValue("AllConversionRate")
    ALL_CONVERSION_RATE("AllConversionRate"),
    @XmlEnumValue("AllRevenuePerConversion")
    ALL_REVENUE_PER_CONVERSION("AllRevenuePerConversion"),
    @XmlEnumValue("AllReturnOnAdSpend")
    ALL_RETURN_ON_AD_SPEND("AllReturnOnAdSpend"),
    @XmlEnumValue("ViewThroughConversions")
    VIEW_THROUGH_CONVERSIONS("ViewThroughConversions"),
    @XmlEnumValue("ViewThroughConversionsQualified")
    VIEW_THROUGH_CONVERSIONS_QUALIFIED("ViewThroughConversionsQualified"),
    @XmlEnumValue("ViewThroughRevenue")
    VIEW_THROUGH_REVENUE("ViewThroughRevenue"),
    @XmlEnumValue("ViewThroughConversionRate")
    VIEW_THROUGH_CONVERSION_RATE("ViewThroughConversionRate");
    private final String value;

    FeedItemPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedItemPerformanceReportColumn fromValue(String v) {
        for (FeedItemPerformanceReportColumn c: FeedItemPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
