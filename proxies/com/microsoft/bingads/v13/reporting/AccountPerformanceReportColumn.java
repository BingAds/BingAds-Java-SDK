
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountPerformanceReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="TimePeriod"/>
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
 *     <enumeration value="LowQualityClicks"/>
 *     <enumeration value="LowQualityClicksPercent"/>
 *     <enumeration value="LowQualityImpressions"/>
 *     <enumeration value="LowQualityImpressionsPercent"/>
 *     <enumeration value="LowQualityConversions"/>
 *     <enumeration value="LowQualityConversionRate"/>
 *     <enumeration value="DeviceType"/>
 *     <enumeration value="DeviceOS"/>
 *     <enumeration value="ImpressionSharePercent"/>
 *     <enumeration value="ImpressionLostToBudgetPercent"/>
 *     <enumeration value="ImpressionLostToRankAggPercent"/>
 *     <enumeration value="PhoneImpressions"/>
 *     <enumeration value="PhoneCalls"/>
 *     <enumeration value="Ptr"/>
 *     <enumeration value="Network"/>
 *     <enumeration value="TopVsOther"/>
 *     <enumeration value="BidMatchType"/>
 *     <enumeration value="DeliveredMatchType"/>
 *     <enumeration value="Assists"/>
 *     <enumeration value="Revenue"/>
 *     <enumeration value="ReturnOnAdSpend"/>
 *     <enumeration value="CostPerAssist"/>
 *     <enumeration value="RevenuePerConversion"/>
 *     <enumeration value="RevenuePerAssist"/>
 *     <enumeration value="AccountStatus"/>
 *     <enumeration value="LowQualityGeneralClicks"/>
 *     <enumeration value="LowQualitySophisticatedClicks"/>
 *     <enumeration value="ExactMatchImpressionSharePercent"/>
 *     <enumeration value="CustomerId"/>
 *     <enumeration value="CustomerName"/>
 *     <enumeration value="ClickSharePercent"/>
 *     <enumeration value="AbsoluteTopImpressionSharePercent"/>
 *     <enumeration value="TopImpressionShareLostToRankPercent"/>
 *     <enumeration value="TopImpressionShareLostToBudgetPercent"/>
 *     <enumeration value="AbsoluteTopImpressionShareLostToRankPercent"/>
 *     <enumeration value="AbsoluteTopImpressionShareLostToBudgetPercent"/>
 *     <enumeration value="TopImpressionSharePercent"/>
 *     <enumeration value="AbsoluteTopImpressionRatePercent"/>
 *     <enumeration value="TopImpressionRatePercent"/>
 *     <enumeration value="AllConversions"/>
 *     <enumeration value="AllRevenue"/>
 *     <enumeration value="AllConversionRate"/>
 *     <enumeration value="AllCostPerConversion"/>
 *     <enumeration value="AllReturnOnAdSpend"/>
 *     <enumeration value="AllRevenuePerConversion"/>
 *     <enumeration value="ViewThroughConversions"/>
 *     <enumeration value="Goal"/>
 *     <enumeration value="GoalType"/>
 *     <enumeration value="AudienceImpressionSharePercent"/>
 *     <enumeration value="AudienceImpressionLostToRankPercent"/>
 *     <enumeration value="AudienceImpressionLostToBudgetPercent"/>
 *     <enumeration value="AverageCpm"/>
 *     <enumeration value="ConversionsQualified"/>
 *     <enumeration value="LowQualityConversionsQualified"/>
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
 *     <enumeration value="Sales"/>
 *     <enumeration value="CostPerSale"/>
 *     <enumeration value="RevenuePerSale"/>
 *     <enumeration value="Installs"/>
 *     <enumeration value="CostPerInstall"/>
 *     <enumeration value="RevenuePerInstall"/>
 *     <enumeration value="Downloads"/>
 *     <enumeration value="PostClickDownloadRate"/>
 *     <enumeration value="CostPerDownload"/>
 *     <enumeration value="AppInstalls"/>
 *     <enumeration value="PostClickInstallRate"/>
 *     <enumeration value="CPI"/>
 *     <enumeration value="Purchases"/>
 *     <enumeration value="PostInstallPurchaseRate"/>
 *     <enumeration value="CPP"/>
 *     <enumeration value="Subscriptions"/>
 *     <enumeration value="PostInstallSubscriptionRate"/>
 *     <enumeration value="CPS"/>
 *     <enumeration value="NewCustomerConversions"/>
 *     <enumeration value="NewCustomerRevenue"/>
 *     <enumeration value="NewCustomerConversionRate"/>
 *     <enumeration value="NewCustomerCPA"/>
 *     <enumeration value="NewCustomerReturnOnAdSpend"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
    AVERAGE_WATCH_TIME_PER_IMPRESSION("AverageWatchTimePerImpression"),
    @XmlEnumValue("Sales")
    SALES("Sales"),
    @XmlEnumValue("CostPerSale")
    COST_PER_SALE("CostPerSale"),
    @XmlEnumValue("RevenuePerSale")
    REVENUE_PER_SALE("RevenuePerSale"),
    @XmlEnumValue("Installs")
    INSTALLS("Installs"),
    @XmlEnumValue("CostPerInstall")
    COST_PER_INSTALL("CostPerInstall"),
    @XmlEnumValue("RevenuePerInstall")
    REVENUE_PER_INSTALL("RevenuePerInstall"),
    @XmlEnumValue("Downloads")
    DOWNLOADS("Downloads"),
    @XmlEnumValue("PostClickDownloadRate")
    POST_CLICK_DOWNLOAD_RATE("PostClickDownloadRate"),
    @XmlEnumValue("CostPerDownload")
    COST_PER_DOWNLOAD("CostPerDownload"),
    @XmlEnumValue("AppInstalls")
    APP_INSTALLS("AppInstalls"),
    @XmlEnumValue("PostClickInstallRate")
    POST_CLICK_INSTALL_RATE("PostClickInstallRate"),
    CPI("CPI"),
    @XmlEnumValue("Purchases")
    PURCHASES("Purchases"),
    @XmlEnumValue("PostInstallPurchaseRate")
    POST_INSTALL_PURCHASE_RATE("PostInstallPurchaseRate"),
    CPP("CPP"),
    @XmlEnumValue("Subscriptions")
    SUBSCRIPTIONS("Subscriptions"),
    @XmlEnumValue("PostInstallSubscriptionRate")
    POST_INSTALL_SUBSCRIPTION_RATE("PostInstallSubscriptionRate"),
    CPS("CPS"),
    @XmlEnumValue("NewCustomerConversions")
    NEW_CUSTOMER_CONVERSIONS("NewCustomerConversions"),
    @XmlEnumValue("NewCustomerRevenue")
    NEW_CUSTOMER_REVENUE("NewCustomerRevenue"),
    @XmlEnumValue("NewCustomerConversionRate")
    NEW_CUSTOMER_CONVERSION_RATE("NewCustomerConversionRate"),
    @XmlEnumValue("NewCustomerCPA")
    NEW_CUSTOMER_CPA("NewCustomerCPA"),
    @XmlEnumValue("NewCustomerReturnOnAdSpend")
    NEW_CUSTOMER_RETURN_ON_AD_SPEND("NewCustomerReturnOnAdSpend");
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
