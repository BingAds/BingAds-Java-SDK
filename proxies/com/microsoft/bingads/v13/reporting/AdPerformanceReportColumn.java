
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdPerformanceReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="AdId"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="AdTitle"/>
 *     <enumeration value="AdDescription"/>
 *     <enumeration value="AdDescription2"/>
 *     <enumeration value="AdType"/>
 *     <enumeration value="CurrencyCode"/>
 *     <enumeration value="AdDistribution"/>
 *     <enumeration value="Impressions"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="Ctr"/>
 *     <enumeration value="AverageCpc"/>
 *     <enumeration value="Spend"/>
 *     <enumeration value="AveragePosition"/>
 *     <enumeration value="Conversions"/>
 *     <enumeration value="ConversionRate"/>
 *     <enumeration value="CostPerConversion"/>
 *     <enumeration value="DestinationUrl"/>
 *     <enumeration value="DeviceType"/>
 *     <enumeration value="Language"/>
 *     <enumeration value="DisplayUrl"/>
 *     <enumeration value="AdStatus"/>
 *     <enumeration value="Network"/>
 *     <enumeration value="TopVsOther"/>
 *     <enumeration value="BidMatchType"/>
 *     <enumeration value="DeliveredMatchType"/>
 *     <enumeration value="DeviceOS"/>
 *     <enumeration value="Assists"/>
 *     <enumeration value="Revenue"/>
 *     <enumeration value="ReturnOnAdSpend"/>
 *     <enumeration value="CostPerAssist"/>
 *     <enumeration value="RevenuePerConversion"/>
 *     <enumeration value="RevenuePerAssist"/>
 *     <enumeration value="TrackingTemplate"/>
 *     <enumeration value="CustomParameters"/>
 *     <enumeration value="FinalUrl"/>
 *     <enumeration value="FinalMobileUrl"/>
 *     <enumeration value="FinalAppUrl"/>
 *     <enumeration value="AccountStatus"/>
 *     <enumeration value="CampaignStatus"/>
 *     <enumeration value="AdGroupStatus"/>
 *     <enumeration value="TitlePart1"/>
 *     <enumeration value="TitlePart2"/>
 *     <enumeration value="TitlePart3"/>
 *     <enumeration value="Headline"/>
 *     <enumeration value="LongHeadline"/>
 *     <enumeration value="BusinessName"/>
 *     <enumeration value="Path1"/>
 *     <enumeration value="Path2"/>
 *     <enumeration value="AdLabels"/>
 *     <enumeration value="CustomerId"/>
 *     <enumeration value="CustomerName"/>
 *     <enumeration value="CampaignType"/>
 *     <enumeration value="BaseCampaignId"/>
 *     <enumeration value="AllConversions"/>
 *     <enumeration value="AllRevenue"/>
 *     <enumeration value="AllConversionRate"/>
 *     <enumeration value="AllCostPerConversion"/>
 *     <enumeration value="AllReturnOnAdSpend"/>
 *     <enumeration value="AllRevenuePerConversion"/>
 *     <enumeration value="FinalUrlSuffix"/>
 *     <enumeration value="ViewThroughConversions"/>
 *     <enumeration value="Goal"/>
 *     <enumeration value="GoalType"/>
 *     <enumeration value="AbsoluteTopImpressionRatePercent"/>
 *     <enumeration value="TopImpressionRatePercent"/>
 *     <enumeration value="AverageCpm"/>
 *     <enumeration value="ConversionsQualified"/>
 *     <enumeration value="AllConversionsQualified"/>
 *     <enumeration value="ViewThroughConversionsQualified"/>
 *     <enumeration value="ViewThroughRevenue"/>
 *     <enumeration value="VideoViews"/>
 *     <enumeration value="ViewThroughRate"/>
 *     <enumeration value="AverageCPV"/>
 *     <enumeration value="VideoViewsAt25Percent"/>
 *     <enumeration value="VideoViewsAt50Percent"/>
 *     <enumeration value="VideoViewsAt75Percent"/>
 *     <enumeration value="CompletedVideoViews"/>
 *     <enumeration value="VideoCompletionRate"/>
 *     <enumeration value="TotalWatchTimeInMS"/>
 *     <enumeration value="AverageWatchTimePerVideoView"/>
 *     <enumeration value="AverageWatchTimePerImpression"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdPerformanceReportColumn")
@XmlEnum
public enum AdPerformanceReportColumn {

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
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AdTitle")
    AD_TITLE("AdTitle"),
    @XmlEnumValue("AdDescription")
    AD_DESCRIPTION("AdDescription"),
    @XmlEnumValue("AdDescription2")
    AD_DESCRIPTION_2("AdDescription2"),
    @XmlEnumValue("AdType")
    AD_TYPE("AdType"),
    @XmlEnumValue("CurrencyCode")
    CURRENCY_CODE("CurrencyCode"),
    @XmlEnumValue("AdDistribution")
    AD_DISTRIBUTION("AdDistribution"),
    @XmlEnumValue("Impressions")
    IMPRESSIONS("Impressions"),
    @XmlEnumValue("Clicks")
    CLICKS("Clicks"),
    @XmlEnumValue("Ctr")
    CTR("Ctr"),
    @XmlEnumValue("AverageCpc")
    AVERAGE_CPC("AverageCpc"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("AveragePosition")
    AVERAGE_POSITION("AveragePosition"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("ConversionRate")
    CONVERSION_RATE("ConversionRate"),
    @XmlEnumValue("CostPerConversion")
    COST_PER_CONVERSION("CostPerConversion"),
    @XmlEnumValue("DestinationUrl")
    DESTINATION_URL("DestinationUrl"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("DisplayUrl")
    DISPLAY_URL("DisplayUrl"),
    @XmlEnumValue("AdStatus")
    AD_STATUS("AdStatus"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("TopVsOther")
    TOP_VS_OTHER("TopVsOther"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("DeliveredMatchType")
    DELIVERED_MATCH_TYPE("DeliveredMatchType"),
    @XmlEnumValue("DeviceOS")
    DEVICE_OS("DeviceOS"),
    @XmlEnumValue("Assists")
    ASSISTS("Assists"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("ReturnOnAdSpend")
    RETURN_ON_AD_SPEND("ReturnOnAdSpend"),
    @XmlEnumValue("CostPerAssist")
    COST_PER_ASSIST("CostPerAssist"),
    @XmlEnumValue("RevenuePerConversion")
    REVENUE_PER_CONVERSION("RevenuePerConversion"),
    @XmlEnumValue("RevenuePerAssist")
    REVENUE_PER_ASSIST("RevenuePerAssist"),
    @XmlEnumValue("TrackingTemplate")
    TRACKING_TEMPLATE("TrackingTemplate"),
    @XmlEnumValue("CustomParameters")
    CUSTOM_PARAMETERS("CustomParameters"),
    @XmlEnumValue("FinalUrl")
    FINAL_URL("FinalUrl"),
    @XmlEnumValue("FinalMobileUrl")
    FINAL_MOBILE_URL("FinalMobileUrl"),
    @XmlEnumValue("FinalAppUrl")
    FINAL_APP_URL("FinalAppUrl"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus"),
    @XmlEnumValue("TitlePart1")
    TITLE_PART_1("TitlePart1"),
    @XmlEnumValue("TitlePart2")
    TITLE_PART_2("TitlePart2"),
    @XmlEnumValue("TitlePart3")
    TITLE_PART_3("TitlePart3"),
    @XmlEnumValue("Headline")
    HEADLINE("Headline"),
    @XmlEnumValue("LongHeadline")
    LONG_HEADLINE("LongHeadline"),
    @XmlEnumValue("BusinessName")
    BUSINESS_NAME("BusinessName"),
    @XmlEnumValue("Path1")
    PATH_1("Path1"),
    @XmlEnumValue("Path2")
    PATH_2("Path2"),
    @XmlEnumValue("AdLabels")
    AD_LABELS("AdLabels"),
    @XmlEnumValue("CustomerId")
    CUSTOMER_ID("CustomerId"),
    @XmlEnumValue("CustomerName")
    CUSTOMER_NAME("CustomerName"),
    @XmlEnumValue("CampaignType")
    CAMPAIGN_TYPE("CampaignType"),
    @XmlEnumValue("BaseCampaignId")
    BASE_CAMPAIGN_ID("BaseCampaignId"),
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
    @XmlEnumValue("FinalUrlSuffix")
    FINAL_URL_SUFFIX("FinalUrlSuffix"),
    @XmlEnumValue("ViewThroughConversions")
    VIEW_THROUGH_CONVERSIONS("ViewThroughConversions"),
    @XmlEnumValue("Goal")
    GOAL("Goal"),
    @XmlEnumValue("GoalType")
    GOAL_TYPE("GoalType"),
    @XmlEnumValue("AbsoluteTopImpressionRatePercent")
    ABSOLUTE_TOP_IMPRESSION_RATE_PERCENT("AbsoluteTopImpressionRatePercent"),
    @XmlEnumValue("TopImpressionRatePercent")
    TOP_IMPRESSION_RATE_PERCENT("TopImpressionRatePercent"),
    @XmlEnumValue("AverageCpm")
    AVERAGE_CPM("AverageCpm"),
    @XmlEnumValue("ConversionsQualified")
    CONVERSIONS_QUALIFIED("ConversionsQualified"),
    @XmlEnumValue("AllConversionsQualified")
    ALL_CONVERSIONS_QUALIFIED("AllConversionsQualified"),
    @XmlEnumValue("ViewThroughConversionsQualified")
    VIEW_THROUGH_CONVERSIONS_QUALIFIED("ViewThroughConversionsQualified"),
    @XmlEnumValue("ViewThroughRevenue")
    VIEW_THROUGH_REVENUE("ViewThroughRevenue"),
    @XmlEnumValue("VideoViews")
    VIDEO_VIEWS("VideoViews"),
    @XmlEnumValue("ViewThroughRate")
    VIEW_THROUGH_RATE("ViewThroughRate"),
    @XmlEnumValue("AverageCPV")
    AVERAGE_CPV("AverageCPV"),
    @XmlEnumValue("VideoViewsAt25Percent")
    VIDEO_VIEWS_AT_25_PERCENT("VideoViewsAt25Percent"),
    @XmlEnumValue("VideoViewsAt50Percent")
    VIDEO_VIEWS_AT_50_PERCENT("VideoViewsAt50Percent"),
    @XmlEnumValue("VideoViewsAt75Percent")
    VIDEO_VIEWS_AT_75_PERCENT("VideoViewsAt75Percent"),
    @XmlEnumValue("CompletedVideoViews")
    COMPLETED_VIDEO_VIEWS("CompletedVideoViews"),
    @XmlEnumValue("VideoCompletionRate")
    VIDEO_COMPLETION_RATE("VideoCompletionRate"),
    @XmlEnumValue("TotalWatchTimeInMS")
    TOTAL_WATCH_TIME_IN_MS("TotalWatchTimeInMS"),
    @XmlEnumValue("AverageWatchTimePerVideoView")
    AVERAGE_WATCH_TIME_PER_VIDEO_VIEW("AverageWatchTimePerVideoView"),
    @XmlEnumValue("AverageWatchTimePerImpression")
    AVERAGE_WATCH_TIME_PER_IMPRESSION("AverageWatchTimePerImpression");
    private final String value;

    AdPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdPerformanceReportColumn fromValue(String v) {
        for (AdPerformanceReportColumn c: AdPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
