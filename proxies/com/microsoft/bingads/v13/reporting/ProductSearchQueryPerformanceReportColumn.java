
package com.microsoft.bingads.v13.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSearchQueryPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductSearchQueryPerformanceReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AdId"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="DestinationUrl"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="DeviceOS"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="SearchQuery"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="MerchantProductId"/>
 *     &lt;enumeration value="Title"/>
 *     &lt;enumeration value="ClickTypeId"/>
 *     &lt;enumeration value="TotalClicksOnAdElements"/>
 *     &lt;enumeration value="ClickType"/>
 *     &lt;enumeration value="AdGroupCriterionId"/>
 *     &lt;enumeration value="ProductGroup"/>
 *     &lt;enumeration value="PartitionType"/>
 *     &lt;enumeration value="Impressions"/>
 *     &lt;enumeration value="Clicks"/>
 *     &lt;enumeration value="Ctr"/>
 *     &lt;enumeration value="AverageCpc"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="Conversions"/>
 *     &lt;enumeration value="ConversionRate"/>
 *     &lt;enumeration value="Assists"/>
 *     &lt;enumeration value="CostPerAssist"/>
 *     &lt;enumeration value="Revenue"/>
 *     &lt;enumeration value="CostPerConversion"/>
 *     &lt;enumeration value="RevenuePerConversion"/>
 *     &lt;enumeration value="RevenuePerAssist"/>
 *     &lt;enumeration value="CustomerId"/>
 *     &lt;enumeration value="CustomerName"/>
 *     &lt;enumeration value="AssistedImpressions"/>
 *     &lt;enumeration value="AssistedClicks"/>
 *     &lt;enumeration value="AssistedConversions"/>
 *     &lt;enumeration value="AllConversions"/>
 *     &lt;enumeration value="AllRevenue"/>
 *     &lt;enumeration value="AllConversionRate"/>
 *     &lt;enumeration value="AllCostPerConversion"/>
 *     &lt;enumeration value="AllRevenuePerConversion"/>
 *     &lt;enumeration value="Goal"/>
 *     &lt;enumeration value="GoalType"/>
 *     &lt;enumeration value="AbsoluteTopImpressionRatePercent"/>
 *     &lt;enumeration value="AverageCpm"/>
 *     &lt;enumeration value="ConversionsQualified"/>
 *     &lt;enumeration value="AssistedConversionsQualified"/>
 *     &lt;enumeration value="AllConversionsQualified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductSearchQueryPerformanceReportColumn")
@XmlEnum
public enum ProductSearchQueryPerformanceReportColumn {

    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("DestinationUrl")
    DESTINATION_URL("DestinationUrl"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("DeviceOS")
    DEVICE_OS("DeviceOS"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("SearchQuery")
    SEARCH_QUERY("SearchQuery"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("MerchantProductId")
    MERCHANT_PRODUCT_ID("MerchantProductId"),
    @XmlEnumValue("Title")
    TITLE("Title"),
    @XmlEnumValue("ClickTypeId")
    CLICK_TYPE_ID("ClickTypeId"),
    @XmlEnumValue("TotalClicksOnAdElements")
    TOTAL_CLICKS_ON_AD_ELEMENTS("TotalClicksOnAdElements"),
    @XmlEnumValue("ClickType")
    CLICK_TYPE("ClickType"),
    @XmlEnumValue("AdGroupCriterionId")
    AD_GROUP_CRITERION_ID("AdGroupCriterionId"),
    @XmlEnumValue("ProductGroup")
    PRODUCT_GROUP("ProductGroup"),
    @XmlEnumValue("PartitionType")
    PARTITION_TYPE("PartitionType"),
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
    @XmlEnumValue("Assists")
    ASSISTS("Assists"),
    @XmlEnumValue("CostPerAssist")
    COST_PER_ASSIST("CostPerAssist"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("CostPerConversion")
    COST_PER_CONVERSION("CostPerConversion"),
    @XmlEnumValue("RevenuePerConversion")
    REVENUE_PER_CONVERSION("RevenuePerConversion"),
    @XmlEnumValue("RevenuePerAssist")
    REVENUE_PER_ASSIST("RevenuePerAssist"),
    @XmlEnumValue("CustomerId")
    CUSTOMER_ID("CustomerId"),
    @XmlEnumValue("CustomerName")
    CUSTOMER_NAME("CustomerName"),
    @XmlEnumValue("AssistedImpressions")
    ASSISTED_IMPRESSIONS("AssistedImpressions"),
    @XmlEnumValue("AssistedClicks")
    ASSISTED_CLICKS("AssistedClicks"),
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
    @XmlEnumValue("AllRevenuePerConversion")
    ALL_REVENUE_PER_CONVERSION("AllRevenuePerConversion"),
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
    ALL_CONVERSIONS_QUALIFIED("AllConversionsQualified");
    private final String value;

    ProductSearchQueryPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductSearchQueryPerformanceReportColumn fromValue(String v) {
        for (ProductSearchQueryPerformanceReportColumn c: ProductSearchQueryPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
