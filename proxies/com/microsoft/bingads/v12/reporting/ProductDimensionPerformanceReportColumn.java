
package com.microsoft.bingads.v12.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductDimensionPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductDimensionPerformanceReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="CampaignStatus"/>
 *     &lt;enumeration value="AccountStatus"/>
 *     &lt;enumeration value="AdGroupStatus"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="AdId"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CurrencyCode"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="MerchantProductId"/>
 *     &lt;enumeration value="Title"/>
 *     &lt;enumeration value="Condition"/>
 *     &lt;enumeration value="Brand"/>
 *     &lt;enumeration value="Price"/>
 *     &lt;enumeration value="CustomLabel0"/>
 *     &lt;enumeration value="CustomLabel1"/>
 *     &lt;enumeration value="CustomLabel2"/>
 *     &lt;enumeration value="CustomLabel3"/>
 *     &lt;enumeration value="CustomLabel4"/>
 *     &lt;enumeration value="ProductType1"/>
 *     &lt;enumeration value="ProductType2"/>
 *     &lt;enumeration value="ProductType3"/>
 *     &lt;enumeration value="ProductType4"/>
 *     &lt;enumeration value="ProductType5"/>
 *     &lt;enumeration value="ProductCategory1"/>
 *     &lt;enumeration value="ProductCategory2"/>
 *     &lt;enumeration value="ProductCategory3"/>
 *     &lt;enumeration value="ProductCategory4"/>
 *     &lt;enumeration value="ProductCategory5"/>
 *     &lt;enumeration value="Impressions"/>
 *     &lt;enumeration value="Clicks"/>
 *     &lt;enumeration value="Ctr"/>
 *     &lt;enumeration value="AverageCpc"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="Conversions"/>
 *     &lt;enumeration value="ConversionRate"/>
 *     &lt;enumeration value="Revenue"/>
 *     &lt;enumeration value="RevenuePerConversion"/>
 *     &lt;enumeration value="SellerName"/>
 *     &lt;enumeration value="OfferLanguage"/>
 *     &lt;enumeration value="CountryOfSale"/>
 *     &lt;enumeration value="AdStatus"/>
 *     &lt;enumeration value="ImpressionSharePercent"/>
 *     &lt;enumeration value="ImpressionLostToBudgetPercent"/>
 *     &lt;enumeration value="ImpressionLostToRankPercent"/>
 *     &lt;enumeration value="BenchmarkBid"/>
 *     &lt;enumeration value="BenchmarkCtr"/>
 *     &lt;enumeration value="TopVsOther"/>
 *     &lt;enumeration value="AdDistribution"/>
 *     &lt;enumeration value="ClickTypeId"/>
 *     &lt;enumeration value="TotalClicksOnAdElements"/>
 *     &lt;enumeration value="ClickType"/>
 *     &lt;enumeration value="ReturnOnAdSpend"/>
 *     &lt;enumeration value="BidStrategyType"/>
 *     &lt;enumeration value="LocalStoreCode"/>
 *     &lt;enumeration value="StoreId"/>
 *     &lt;enumeration value="AssistedImpressions"/>
 *     &lt;enumeration value="AssistedClicks"/>
 *     &lt;enumeration value="ClickSharePercent"/>
 *     &lt;enumeration value="AbsoluteTopImpressionSharePercent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
    ABSOLUTE_TOP_IMPRESSION_SHARE_PERCENT("AbsoluteTopImpressionSharePercent");
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
