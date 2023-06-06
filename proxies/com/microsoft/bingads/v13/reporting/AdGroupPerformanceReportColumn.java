
package com.microsoft.bingads.v13.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroupPerformanceReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="CurrencyCode"/>
 *     &lt;enumeration value="AdDistribution"/>
 *     &lt;enumeration value="Impressions"/>
 *     &lt;enumeration value="Clicks"/>
 *     &lt;enumeration value="Ctr"/>
 *     &lt;enumeration value="AverageCpc"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="AveragePosition"/>
 *     &lt;enumeration value="Conversions"/>
 *     &lt;enumeration value="ConversionRate"/>
 *     &lt;enumeration value="CostPerConversion"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="DeviceOS"/>
 *     &lt;enumeration value="ImpressionSharePercent"/>
 *     &lt;enumeration value="ImpressionLostToBudgetPercent"/>
 *     &lt;enumeration value="ImpressionLostToRankAggPercent"/>
 *     &lt;enumeration value="QualityScore"/>
 *     &lt;enumeration value="ExpectedCtr"/>
 *     &lt;enumeration value="AdRelevance"/>
 *     &lt;enumeration value="LandingPageExperience"/>
 *     &lt;enumeration value="HistoricalQualityScore"/>
 *     &lt;enumeration value="HistoricalExpectedCtr"/>
 *     &lt;enumeration value="HistoricalAdRelevance"/>
 *     &lt;enumeration value="HistoricalLandingPageExperience"/>
 *     &lt;enumeration value="PhoneImpressions"/>
 *     &lt;enumeration value="PhoneCalls"/>
 *     &lt;enumeration value="Ptr"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="TopVsOther"/>
 *     &lt;enumeration value="BidMatchType"/>
 *     &lt;enumeration value="DeliveredMatchType"/>
 *     &lt;enumeration value="Assists"/>
 *     &lt;enumeration value="Revenue"/>
 *     &lt;enumeration value="ReturnOnAdSpend"/>
 *     &lt;enumeration value="CostPerAssist"/>
 *     &lt;enumeration value="RevenuePerConversion"/>
 *     &lt;enumeration value="RevenuePerAssist"/>
 *     &lt;enumeration value="TrackingTemplate"/>
 *     &lt;enumeration value="CustomParameters"/>
 *     &lt;enumeration value="AccountStatus"/>
 *     &lt;enumeration value="CampaignStatus"/>
 *     &lt;enumeration value="AdGroupLabels"/>
 *     &lt;enumeration value="ExactMatchImpressionSharePercent"/>
 *     &lt;enumeration value="CustomerId"/>
 *     &lt;enumeration value="CustomerName"/>
 *     &lt;enumeration value="ClickSharePercent"/>
 *     &lt;enumeration value="AbsoluteTopImpressionSharePercent"/>
 *     &lt;enumeration value="FinalUrlSuffix"/>
 *     &lt;enumeration value="CampaignType"/>
 *     &lt;enumeration value="TopImpressionShareLostToRankPercent"/>
 *     &lt;enumeration value="TopImpressionShareLostToBudgetPercent"/>
 *     &lt;enumeration value="AbsoluteTopImpressionShareLostToRankPercent"/>
 *     &lt;enumeration value="AbsoluteTopImpressionShareLostToBudgetPercent"/>
 *     &lt;enumeration value="TopImpressionSharePercent"/>
 *     &lt;enumeration value="AbsoluteTopImpressionRatePercent"/>
 *     &lt;enumeration value="TopImpressionRatePercent"/>
 *     &lt;enumeration value="BaseCampaignId"/>
 *     &lt;enumeration value="AllConversions"/>
 *     &lt;enumeration value="AllRevenue"/>
 *     &lt;enumeration value="AllConversionRate"/>
 *     &lt;enumeration value="AllCostPerConversion"/>
 *     &lt;enumeration value="AllReturnOnAdSpend"/>
 *     &lt;enumeration value="AllRevenuePerConversion"/>
 *     &lt;enumeration value="ViewThroughConversions"/>
 *     &lt;enumeration value="Goal"/>
 *     &lt;enumeration value="GoalType"/>
 *     &lt;enumeration value="AudienceImpressionSharePercent"/>
 *     &lt;enumeration value="AudienceImpressionLostToRankPercent"/>
 *     &lt;enumeration value="AudienceImpressionLostToBudgetPercent"/>
 *     &lt;enumeration value="RelativeCtr"/>
 *     &lt;enumeration value="AdGroupType"/>
 *     &lt;enumeration value="AverageCpm"/>
 *     &lt;enumeration value="ConversionsQualified"/>
 *     &lt;enumeration value="AllConversionsQualified"/>
 *     &lt;enumeration value="ViewThroughConversionsQualified"/>
 *     &lt;enumeration value="ViewThroughRevenue"/>
 *     &lt;enumeration value="VideoViews"/>
 *     &lt;enumeration value="ViewThroughRate"/>
 *     &lt;enumeration value="AverageCPV"/>
 *     &lt;enumeration value="VideoViewsAt25Percent"/>
 *     &lt;enumeration value="VideoViewsAt50Percent"/>
 *     &lt;enumeration value="VideoViewsAt75Percent"/>
 *     &lt;enumeration value="CompletedVideoViews"/>
 *     &lt;enumeration value="VideoCompletionRate"/>
 *     &lt;enumeration value="TotalWatchTimeInMS"/>
 *     &lt;enumeration value="AverageWatchTimePerVideoView"/>
 *     &lt;enumeration value="AverageWatchTimePerImpression"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdGroupPerformanceReportColumn")
@XmlEnum
public enum AdGroupPerformanceReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
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
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("DeviceOS")
    DEVICE_OS("DeviceOS"),
    @XmlEnumValue("ImpressionSharePercent")
    IMPRESSION_SHARE_PERCENT("ImpressionSharePercent"),
    @XmlEnumValue("ImpressionLostToBudgetPercent")
    IMPRESSION_LOST_TO_BUDGET_PERCENT("ImpressionLostToBudgetPercent"),
    @XmlEnumValue("ImpressionLostToRankAggPercent")
    IMPRESSION_LOST_TO_RANK_AGG_PERCENT("ImpressionLostToRankAggPercent"),
    @XmlEnumValue("QualityScore")
    QUALITY_SCORE("QualityScore"),
    @XmlEnumValue("ExpectedCtr")
    EXPECTED_CTR("ExpectedCtr"),
    @XmlEnumValue("AdRelevance")
    AD_RELEVANCE("AdRelevance"),
    @XmlEnumValue("LandingPageExperience")
    LANDING_PAGE_EXPERIENCE("LandingPageExperience"),
    @XmlEnumValue("HistoricalQualityScore")
    HISTORICAL_QUALITY_SCORE("HistoricalQualityScore"),
    @XmlEnumValue("HistoricalExpectedCtr")
    HISTORICAL_EXPECTED_CTR("HistoricalExpectedCtr"),
    @XmlEnumValue("HistoricalAdRelevance")
    HISTORICAL_AD_RELEVANCE("HistoricalAdRelevance"),
    @XmlEnumValue("HistoricalLandingPageExperience")
    HISTORICAL_LANDING_PAGE_EXPERIENCE("HistoricalLandingPageExperience"),
    @XmlEnumValue("PhoneImpressions")
    PHONE_IMPRESSIONS("PhoneImpressions"),
    @XmlEnumValue("PhoneCalls")
    PHONE_CALLS("PhoneCalls"),
    @XmlEnumValue("Ptr")
    PTR("Ptr"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("TopVsOther")
    TOP_VS_OTHER("TopVsOther"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("DeliveredMatchType")
    DELIVERED_MATCH_TYPE("DeliveredMatchType"),
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
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AdGroupLabels")
    AD_GROUP_LABELS("AdGroupLabels"),
    @XmlEnumValue("ExactMatchImpressionSharePercent")
    EXACT_MATCH_IMPRESSION_SHARE_PERCENT("ExactMatchImpressionSharePercent"),
    @XmlEnumValue("CustomerId")
    CUSTOMER_ID("CustomerId"),
    @XmlEnumValue("CustomerName")
    CUSTOMER_NAME("CustomerName"),
    @XmlEnumValue("ClickSharePercent")
    CLICK_SHARE_PERCENT("ClickSharePercent"),
    @XmlEnumValue("AbsoluteTopImpressionSharePercent")
    ABSOLUTE_TOP_IMPRESSION_SHARE_PERCENT("AbsoluteTopImpressionSharePercent"),
    @XmlEnumValue("FinalUrlSuffix")
    FINAL_URL_SUFFIX("FinalUrlSuffix"),
    @XmlEnumValue("CampaignType")
    CAMPAIGN_TYPE("CampaignType"),
    @XmlEnumValue("TopImpressionShareLostToRankPercent")
    TOP_IMPRESSION_SHARE_LOST_TO_RANK_PERCENT("TopImpressionShareLostToRankPercent"),
    @XmlEnumValue("TopImpressionShareLostToBudgetPercent")
    TOP_IMPRESSION_SHARE_LOST_TO_BUDGET_PERCENT("TopImpressionShareLostToBudgetPercent"),
    @XmlEnumValue("AbsoluteTopImpressionShareLostToRankPercent")
    ABSOLUTE_TOP_IMPRESSION_SHARE_LOST_TO_RANK_PERCENT("AbsoluteTopImpressionShareLostToRankPercent"),
    @XmlEnumValue("AbsoluteTopImpressionShareLostToBudgetPercent")
    ABSOLUTE_TOP_IMPRESSION_SHARE_LOST_TO_BUDGET_PERCENT("AbsoluteTopImpressionShareLostToBudgetPercent"),
    @XmlEnumValue("TopImpressionSharePercent")
    TOP_IMPRESSION_SHARE_PERCENT("TopImpressionSharePercent"),
    @XmlEnumValue("AbsoluteTopImpressionRatePercent")
    ABSOLUTE_TOP_IMPRESSION_RATE_PERCENT("AbsoluteTopImpressionRatePercent"),
    @XmlEnumValue("TopImpressionRatePercent")
    TOP_IMPRESSION_RATE_PERCENT("TopImpressionRatePercent"),
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
    @XmlEnumValue("ViewThroughConversions")
    VIEW_THROUGH_CONVERSIONS("ViewThroughConversions"),
    @XmlEnumValue("Goal")
    GOAL("Goal"),
    @XmlEnumValue("GoalType")
    GOAL_TYPE("GoalType"),
    @XmlEnumValue("AudienceImpressionSharePercent")
    AUDIENCE_IMPRESSION_SHARE_PERCENT("AudienceImpressionSharePercent"),
    @XmlEnumValue("AudienceImpressionLostToRankPercent")
    AUDIENCE_IMPRESSION_LOST_TO_RANK_PERCENT("AudienceImpressionLostToRankPercent"),
    @XmlEnumValue("AudienceImpressionLostToBudgetPercent")
    AUDIENCE_IMPRESSION_LOST_TO_BUDGET_PERCENT("AudienceImpressionLostToBudgetPercent"),
    @XmlEnumValue("RelativeCtr")
    RELATIVE_CTR("RelativeCtr"),
    @XmlEnumValue("AdGroupType")
    AD_GROUP_TYPE("AdGroupType"),
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

    AdGroupPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdGroupPerformanceReportColumn fromValue(String v) {
        for (AdGroupPerformanceReportColumn c: AdGroupPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
