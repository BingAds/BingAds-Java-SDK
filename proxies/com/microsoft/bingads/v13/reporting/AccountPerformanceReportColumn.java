
package com.microsoft.bingads.v13.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountPerformanceReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="TimePeriod"/>
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
 *     &lt;enumeration value="LowQualityClicks"/>
 *     &lt;enumeration value="LowQualityClicksPercent"/>
 *     &lt;enumeration value="LowQualityImpressions"/>
 *     &lt;enumeration value="LowQualityImpressionsPercent"/>
 *     &lt;enumeration value="LowQualityConversions"/>
 *     &lt;enumeration value="LowQualityConversionRate"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="DeviceOS"/>
 *     &lt;enumeration value="ImpressionSharePercent"/>
 *     &lt;enumeration value="ImpressionLostToBudgetPercent"/>
 *     &lt;enumeration value="ImpressionLostToRankAggPercent"/>
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
 *     &lt;enumeration value="AccountStatus"/>
 *     &lt;enumeration value="LowQualityGeneralClicks"/>
 *     &lt;enumeration value="LowQualitySophisticatedClicks"/>
 *     &lt;enumeration value="ExactMatchImpressionSharePercent"/>
 *     &lt;enumeration value="CustomerId"/>
 *     &lt;enumeration value="CustomerName"/>
 *     &lt;enumeration value="ClickSharePercent"/>
 *     &lt;enumeration value="AbsoluteTopImpressionSharePercent"/>
 *     &lt;enumeration value="TopImpressionShareLostToRankPercent"/>
 *     &lt;enumeration value="TopImpressionShareLostToBudgetPercent"/>
 *     &lt;enumeration value="AbsoluteTopImpressionShareLostToRankPercent"/>
 *     &lt;enumeration value="AbsoluteTopImpressionShareLostToBudgetPercent"/>
 *     &lt;enumeration value="TopImpressionSharePercent"/>
 *     &lt;enumeration value="AbsoluteTopImpressionRatePercent"/>
 *     &lt;enumeration value="TopImpressionRatePercent"/>
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
 *     &lt;enumeration value="AverageCpm"/>
 *     &lt;enumeration value="ConversionsQualified"/>
 *     &lt;enumeration value="LowQualityConversionsQualified"/>
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
@XmlType(name = "AccountPerformanceReportColumn")
@XmlEnum
public enum AccountPerformanceReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
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
    @XmlEnumValue("LowQualityClicks")
    LOW_QUALITY_CLICKS("LowQualityClicks"),
    @XmlEnumValue("LowQualityClicksPercent")
    LOW_QUALITY_CLICKS_PERCENT("LowQualityClicksPercent"),
    @XmlEnumValue("LowQualityImpressions")
    LOW_QUALITY_IMPRESSIONS("LowQualityImpressions"),
    @XmlEnumValue("LowQualityImpressionsPercent")
    LOW_QUALITY_IMPRESSIONS_PERCENT("LowQualityImpressionsPercent"),
    @XmlEnumValue("LowQualityConversions")
    LOW_QUALITY_CONVERSIONS("LowQualityConversions"),
    @XmlEnumValue("LowQualityConversionRate")
    LOW_QUALITY_CONVERSION_RATE("LowQualityConversionRate"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("DeviceOS")
    DEVICE_OS("DeviceOS"),
    @XmlEnumValue("ImpressionSharePercent")
    IMPRESSION_SHARE_PERCENT("ImpressionSharePercent"),
    @XmlEnumValue("ImpressionLostToBudgetPercent")
    IMPRESSION_LOST_TO_BUDGET_PERCENT("ImpressionLostToBudgetPercent"),
    @XmlEnumValue("ImpressionLostToRankAggPercent")
    IMPRESSION_LOST_TO_RANK_AGG_PERCENT("ImpressionLostToRankAggPercent"),
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
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("LowQualityGeneralClicks")
    LOW_QUALITY_GENERAL_CLICKS("LowQualityGeneralClicks"),
    @XmlEnumValue("LowQualitySophisticatedClicks")
    LOW_QUALITY_SOPHISTICATED_CLICKS("LowQualitySophisticatedClicks"),
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
    @XmlEnumValue("AverageCpm")
    AVERAGE_CPM("AverageCpm"),
    @XmlEnumValue("ConversionsQualified")
    CONVERSIONS_QUALIFIED("ConversionsQualified"),
    @XmlEnumValue("LowQualityConversionsQualified")
    LOW_QUALITY_CONVERSIONS_QUALIFIED("LowQualityConversionsQualified"),
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

    AccountPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountPerformanceReportColumn fromValue(String v) {
        for (AccountPerformanceReportColumn c: AccountPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
