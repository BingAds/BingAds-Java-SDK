
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductPartitionPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProductPartitionPerformanceReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="ProductGroup"/>
 *     <enumeration value="AdGroupCriterionId"/>
 *     <enumeration value="PartitionType"/>
 *     <enumeration value="AdId"/>
 *     <enumeration value="CurrentMaxCpc"/>
 *     <enumeration value="CurrencyCode"/>
 *     <enumeration value="DeliveredMatchType"/>
 *     <enumeration value="BidMatchType"/>
 *     <enumeration value="Impressions"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="Ctr"/>
 *     <enumeration value="AverageCpc"/>
 *     <enumeration value="Spend"/>
 *     <enumeration value="Conversions"/>
 *     <enumeration value="ConversionRate"/>
 *     <enumeration value="CostPerConversion"/>
 *     <enumeration value="DeviceType"/>
 *     <enumeration value="Language"/>
 *     <enumeration value="CampaignStatus"/>
 *     <enumeration value="AccountStatus"/>
 *     <enumeration value="AdGroupStatus"/>
 *     <enumeration value="DestinationUrl"/>
 *     <enumeration value="Network"/>
 *     <enumeration value="TopVsOther"/>
 *     <enumeration value="Assists"/>
 *     <enumeration value="Revenue"/>
 *     <enumeration value="CostPerAssist"/>
 *     <enumeration value="RevenuePerConversion"/>
 *     <enumeration value="RevenuePerAssist"/>
 *     <enumeration value="OfferLanguage"/>
 *     <enumeration value="CountryOfSale"/>
 *     <enumeration value="AdStatus"/>
 *     <enumeration value="TrackingTemplate"/>
 *     <enumeration value="CustomParameters"/>
 *     <enumeration value="ImpressionSharePercent"/>
 *     <enumeration value="ImpressionLostToBudgetPercent"/>
 *     <enumeration value="ImpressionLostToRankPercent"/>
 *     <enumeration value="BenchmarkBid"/>
 *     <enumeration value="BenchmarkCtr"/>
 *     <enumeration value="AdDistribution"/>
 *     <enumeration value="ClickTypeId"/>
 *     <enumeration value="TotalClicksOnAdElements"/>
 *     <enumeration value="ClickType"/>
 *     <enumeration value="ReturnOnAdSpend"/>
 *     <enumeration value="BidStrategyType"/>
 *     <enumeration value="LocalStoreCode"/>
 *     <enumeration value="AssistedImpressions"/>
 *     <enumeration value="AssistedClicks"/>
 *     <enumeration value="ClickSharePercent"/>
 *     <enumeration value="AbsoluteTopImpressionSharePercent"/>
 *     <enumeration value="AssistedConversions"/>
 *     <enumeration value="AllConversions"/>
 *     <enumeration value="AllRevenue"/>
 *     <enumeration value="AllConversionRate"/>
 *     <enumeration value="AllCostPerConversion"/>
 *     <enumeration value="AllReturnOnAdSpend"/>
 *     <enumeration value="AllRevenuePerConversion"/>
 *     <enumeration value="ViewThroughConversions"/>
 *     <enumeration value="Goal"/>
 *     <enumeration value="GoalType"/>
 *     <enumeration value="AbsoluteTopImpressionRatePercent"/>
 *     <enumeration value="AverageCpm"/>
 *     <enumeration value="ConversionsQualified"/>
 *     <enumeration value="AssistedConversionsQualified"/>
 *     <enumeration value="AllConversionsQualified"/>
 *     <enumeration value="ViewThroughConversionsQualified"/>
 *     <enumeration value="ViewThroughRevenue"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProductPartitionPerformanceReportColumn")
@XmlEnum
public enum ProductPartitionPerformanceReportColumn {

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
    @XmlEnumValue("ProductGroup")
    PRODUCT_GROUP("ProductGroup"),
    @XmlEnumValue("AdGroupCriterionId")
    AD_GROUP_CRITERION_ID("AdGroupCriterionId"),
    @XmlEnumValue("PartitionType")
    PARTITION_TYPE("PartitionType"),
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("CurrentMaxCpc")
    CURRENT_MAX_CPC("CurrentMaxCpc"),
    @XmlEnumValue("CurrencyCode")
    CURRENCY_CODE("CurrencyCode"),
    @XmlEnumValue("DeliveredMatchType")
    DELIVERED_MATCH_TYPE("DeliveredMatchType"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
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
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus"),
    @XmlEnumValue("DestinationUrl")
    DESTINATION_URL("DestinationUrl"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("TopVsOther")
    TOP_VS_OTHER("TopVsOther"),
    @XmlEnumValue("Assists")
    ASSISTS("Assists"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("CostPerAssist")
    COST_PER_ASSIST("CostPerAssist"),
    @XmlEnumValue("RevenuePerConversion")
    REVENUE_PER_CONVERSION("RevenuePerConversion"),
    @XmlEnumValue("RevenuePerAssist")
    REVENUE_PER_ASSIST("RevenuePerAssist"),
    @XmlEnumValue("OfferLanguage")
    OFFER_LANGUAGE("OfferLanguage"),
    @XmlEnumValue("CountryOfSale")
    COUNTRY_OF_SALE("CountryOfSale"),
    @XmlEnumValue("AdStatus")
    AD_STATUS("AdStatus"),
    @XmlEnumValue("TrackingTemplate")
    TRACKING_TEMPLATE("TrackingTemplate"),
    @XmlEnumValue("CustomParameters")
    CUSTOM_PARAMETERS("CustomParameters"),
    @XmlEnumValue("ImpressionSharePercent")
    IMPRESSION_SHARE_PERCENT("ImpressionSharePercent"),
    @XmlEnumValue("ImpressionLostToBudgetPercent")
    IMPRESSION_LOST_TO_BUDGET_PERCENT("ImpressionLostToBudgetPercent"),
    @XmlEnumValue("ImpressionLostToRankPercent")
    IMPRESSION_LOST_TO_RANK_PERCENT("ImpressionLostToRankPercent"),
    @XmlEnumValue("BenchmarkBid")
    BENCHMARK_BID("BenchmarkBid"),
    @XmlEnumValue("BenchmarkCtr")
    BENCHMARK_CTR("BenchmarkCtr"),
    @XmlEnumValue("AdDistribution")
    AD_DISTRIBUTION("AdDistribution"),
    @XmlEnumValue("ClickTypeId")
    CLICK_TYPE_ID("ClickTypeId"),
    @XmlEnumValue("TotalClicksOnAdElements")
    TOTAL_CLICKS_ON_AD_ELEMENTS("TotalClicksOnAdElements"),
    @XmlEnumValue("ClickType")
    CLICK_TYPE("ClickType"),
    @XmlEnumValue("ReturnOnAdSpend")
    RETURN_ON_AD_SPEND("ReturnOnAdSpend"),
    @XmlEnumValue("BidStrategyType")
    BID_STRATEGY_TYPE("BidStrategyType"),
    @XmlEnumValue("LocalStoreCode")
    LOCAL_STORE_CODE("LocalStoreCode"),
    @XmlEnumValue("AssistedImpressions")
    ASSISTED_IMPRESSIONS("AssistedImpressions"),
    @XmlEnumValue("AssistedClicks")
    ASSISTED_CLICKS("AssistedClicks"),
    @XmlEnumValue("ClickSharePercent")
    CLICK_SHARE_PERCENT("ClickSharePercent"),
    @XmlEnumValue("AbsoluteTopImpressionSharePercent")
    ABSOLUTE_TOP_IMPRESSION_SHARE_PERCENT("AbsoluteTopImpressionSharePercent"),
    @XmlEnumValue("AssistedConversions")
    ASSISTED_CONVERSIONS("AssistedConversions"),
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
    @XmlEnumValue("AbsoluteTopImpressionRatePercent")
    ABSOLUTE_TOP_IMPRESSION_RATE_PERCENT("AbsoluteTopImpressionRatePercent"),
    @XmlEnumValue("AverageCpm")
    AVERAGE_CPM("AverageCpm"),
    @XmlEnumValue("ConversionsQualified")
    CONVERSIONS_QUALIFIED("ConversionsQualified"),
    @XmlEnumValue("AssistedConversionsQualified")
    ASSISTED_CONVERSIONS_QUALIFIED("AssistedConversionsQualified"),
    @XmlEnumValue("AllConversionsQualified")
    ALL_CONVERSIONS_QUALIFIED("AllConversionsQualified"),
    @XmlEnumValue("ViewThroughConversionsQualified")
    VIEW_THROUGH_CONVERSIONS_QUALIFIED("ViewThroughConversionsQualified"),
    @XmlEnumValue("ViewThroughRevenue")
    VIEW_THROUGH_REVENUE("ViewThroughRevenue");
    private final String value;

    ProductPartitionPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductPartitionPerformanceReportColumn fromValue(String v) {
        for (ProductPartitionPerformanceReportColumn c: ProductPartitionPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
