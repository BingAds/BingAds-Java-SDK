
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductDimensionPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProductDimensionPerformanceReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="CampaignStatus"/>
 *     <enumeration value="AccountStatus"/>
 *     <enumeration value="AdGroupStatus"/>
 *     <enumeration value="Network"/>
 *     <enumeration value="AdId"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CurrencyCode"/>
 *     <enumeration value="DeviceType"/>
 *     <enumeration value="Language"/>
 *     <enumeration value="MerchantProductId"/>
 *     <enumeration value="Title"/>
 *     <enumeration value="Condition"/>
 *     <enumeration value="Brand"/>
 *     <enumeration value="Price"/>
 *     <enumeration value="CustomLabel0"/>
 *     <enumeration value="CustomLabel1"/>
 *     <enumeration value="CustomLabel2"/>
 *     <enumeration value="CustomLabel3"/>
 *     <enumeration value="CustomLabel4"/>
 *     <enumeration value="ProductType1"/>
 *     <enumeration value="ProductType2"/>
 *     <enumeration value="ProductType3"/>
 *     <enumeration value="ProductType4"/>
 *     <enumeration value="ProductType5"/>
 *     <enumeration value="ProductCategory1"/>
 *     <enumeration value="ProductCategory2"/>
 *     <enumeration value="ProductCategory3"/>
 *     <enumeration value="ProductCategory4"/>
 *     <enumeration value="ProductCategory5"/>
 *     <enumeration value="Impressions"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="Ctr"/>
 *     <enumeration value="AverageCpc"/>
 *     <enumeration value="Spend"/>
 *     <enumeration value="Conversions"/>
 *     <enumeration value="ConversionRate"/>
 *     <enumeration value="Revenue"/>
 *     <enumeration value="RevenuePerConversion"/>
 *     <enumeration value="SellerName"/>
 *     <enumeration value="OfferLanguage"/>
 *     <enumeration value="CountryOfSale"/>
 *     <enumeration value="AdStatus"/>
 *     <enumeration value="ImpressionSharePercent"/>
 *     <enumeration value="ImpressionLostToBudgetPercent"/>
 *     <enumeration value="ImpressionLostToRankPercent"/>
 *     <enumeration value="BenchmarkBid"/>
 *     <enumeration value="BenchmarkCtr"/>
 *     <enumeration value="TopVsOther"/>
 *     <enumeration value="AdDistribution"/>
 *     <enumeration value="ClickTypeId"/>
 *     <enumeration value="TotalClicksOnAdElements"/>
 *     <enumeration value="ClickType"/>
 *     <enumeration value="ReturnOnAdSpend"/>
 *     <enumeration value="BidStrategyType"/>
 *     <enumeration value="LocalStoreCode"/>
 *     <enumeration value="StoreId"/>
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
 *     <enumeration value="CostPerConversion"/>
 *     <enumeration value="ViewThroughConversions"/>
 *     <enumeration value="Goal"/>
 *     <enumeration value="GoalType"/>
 *     <enumeration value="ProductBought"/>
 *     <enumeration value="QuantityBought"/>
 *     <enumeration value="AbsoluteTopImpressionRatePercent"/>
 *     <enumeration value="AverageCpm"/>
 *     <enumeration value="ConversionsQualified"/>
 *     <enumeration value="AssistedConversionsQualified"/>
 *     <enumeration value="AllConversionsQualified"/>
 *     <enumeration value="ViewThroughConversionsQualified"/>
 *     <enumeration value="ProductBoughtTitle"/>
 *     <enumeration value="GTIN"/>
 *     <enumeration value="MPN"/>
 *     <enumeration value="ViewThroughRevenue"/>
 *     <enumeration value="GoalId"/>
 *     <enumeration value="Sales"/>
 *     <enumeration value="CostPerSale"/>
 *     <enumeration value="RevenuePerSale"/>
 *     <enumeration value="Installs"/>
 *     <enumeration value="CostPerInstall"/>
 *     <enumeration value="RevenuePerInstall"/>
 *     <enumeration value="CampaignType"/>
 *     <enumeration value="AssetGroupId"/>
 *     <enumeration value="AssetGroupName"/>
 *     <enumeration value="AssetGroupStatus"/>
 *     <enumeration value="CollectionId"/>
 *     <enumeration value="FeedLabel"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProductDimensionPerformanceReportColumn")
@XmlEnum
public enum ProductDimensionPerformanceReportColumn {

    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CurrencyCode")
    CURRENCY_CODE("CurrencyCode"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("MerchantProductId")
    MERCHANT_PRODUCT_ID("MerchantProductId"),
    @XmlEnumValue("Title")
    TITLE("Title"),
    @XmlEnumValue("Condition")
    CONDITION("Condition"),
    @XmlEnumValue("Brand")
    BRAND("Brand"),
    @XmlEnumValue("Price")
    PRICE("Price"),
    @XmlEnumValue("CustomLabel0")
    CUSTOM_LABEL_0("CustomLabel0"),
    @XmlEnumValue("CustomLabel1")
    CUSTOM_LABEL_1("CustomLabel1"),
    @XmlEnumValue("CustomLabel2")
    CUSTOM_LABEL_2("CustomLabel2"),
    @XmlEnumValue("CustomLabel3")
    CUSTOM_LABEL_3("CustomLabel3"),
    @XmlEnumValue("CustomLabel4")
    CUSTOM_LABEL_4("CustomLabel4"),
    @XmlEnumValue("ProductType1")
    PRODUCT_TYPE_1("ProductType1"),
    @XmlEnumValue("ProductType2")
    PRODUCT_TYPE_2("ProductType2"),
    @XmlEnumValue("ProductType3")
    PRODUCT_TYPE_3("ProductType3"),
    @XmlEnumValue("ProductType4")
    PRODUCT_TYPE_4("ProductType4"),
    @XmlEnumValue("ProductType5")
    PRODUCT_TYPE_5("ProductType5"),
    @XmlEnumValue("ProductCategory1")
    PRODUCT_CATEGORY_1("ProductCategory1"),
    @XmlEnumValue("ProductCategory2")
    PRODUCT_CATEGORY_2("ProductCategory2"),
    @XmlEnumValue("ProductCategory3")
    PRODUCT_CATEGORY_3("ProductCategory3"),
    @XmlEnumValue("ProductCategory4")
    PRODUCT_CATEGORY_4("ProductCategory4"),
    @XmlEnumValue("ProductCategory5")
    PRODUCT_CATEGORY_5("ProductCategory5"),
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
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("RevenuePerConversion")
    REVENUE_PER_CONVERSION("RevenuePerConversion"),
    @XmlEnumValue("SellerName")
    SELLER_NAME("SellerName"),
    @XmlEnumValue("OfferLanguage")
    OFFER_LANGUAGE("OfferLanguage"),
    @XmlEnumValue("CountryOfSale")
    COUNTRY_OF_SALE("CountryOfSale"),
    @XmlEnumValue("AdStatus")
    AD_STATUS("AdStatus"),
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
    @XmlEnumValue("TopVsOther")
    TOP_VS_OTHER("TopVsOther"),
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
    @XmlEnumValue("StoreId")
    STORE_ID("StoreId"),
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
    @XmlEnumValue("CostPerConversion")
    COST_PER_CONVERSION("CostPerConversion"),
    @XmlEnumValue("ViewThroughConversions")
    VIEW_THROUGH_CONVERSIONS("ViewThroughConversions"),
    @XmlEnumValue("Goal")
    GOAL("Goal"),
    @XmlEnumValue("GoalType")
    GOAL_TYPE("GoalType"),
    @XmlEnumValue("ProductBought")
    PRODUCT_BOUGHT("ProductBought"),
    @XmlEnumValue("QuantityBought")
    QUANTITY_BOUGHT("QuantityBought"),
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
    @XmlEnumValue("ProductBoughtTitle")
    PRODUCT_BOUGHT_TITLE("ProductBoughtTitle"),
    GTIN("GTIN"),
    MPN("MPN"),
    @XmlEnumValue("ViewThroughRevenue")
    VIEW_THROUGH_REVENUE("ViewThroughRevenue"),
    @XmlEnumValue("GoalId")
    GOAL_ID("GoalId"),
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
    @XmlEnumValue("CampaignType")
    CAMPAIGN_TYPE("CampaignType"),
    @XmlEnumValue("AssetGroupId")
    ASSET_GROUP_ID("AssetGroupId"),
    @XmlEnumValue("AssetGroupName")
    ASSET_GROUP_NAME("AssetGroupName"),
    @XmlEnumValue("AssetGroupStatus")
    ASSET_GROUP_STATUS("AssetGroupStatus"),
    @XmlEnumValue("CollectionId")
    COLLECTION_ID("CollectionId"),
    @XmlEnumValue("FeedLabel")
    FEED_LABEL("FeedLabel");
    private final String value;

    ProductDimensionPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductDimensionPerformanceReportColumn fromValue(String v) {
        for (ProductDimensionPerformanceReportColumn c: ProductDimensionPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
