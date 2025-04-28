
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppsPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AppsPerformanceReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="AccountStatus"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CampaignStatus"/>
 *     <enumeration value="AssetGroupId"/>
 *     <enumeration value="AssetGroupName"/>
 *     <enumeration value="AssetGroupStatus"/>
 *     <enumeration value="CurrencyCode"/>
 *     <enumeration value="Language"/>
 *     <enumeration value="BidStrategyType"/>
 *     <enumeration value="Goal"/>
 *     <enumeration value="GoalType"/>
 *     <enumeration value="Impressions"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="Ctr"/>
 *     <enumeration value="AverageCpc"/>
 *     <enumeration value="Spend"/>
 *     <enumeration value="AverageCpm"/>
 *     <enumeration value="AllConversions"/>
 *     <enumeration value="AllCostPerConversion"/>
 *     <enumeration value="AllConversionRate"/>
 *     <enumeration value="Conversions"/>
 *     <enumeration value="ConversionRate"/>
 *     <enumeration value="CostPerConversion"/>
 *     <enumeration value="ViewThroughConversions"/>
 *     <enumeration value="ViewThroughConversionRate"/>
 *     <enumeration value="ViewThroughCostPerConversion"/>
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
 *     <enumeration value="Revenue"/>
 *     <enumeration value="ReturnOnAdSpend"/>
 *     <enumeration value="RevenuePerDownload"/>
 *     <enumeration value="RevenuePerAppInstall"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AppsPerformanceReportColumn")
@XmlEnum
public enum AppsPerformanceReportColumn {

    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AssetGroupId")
    ASSET_GROUP_ID("AssetGroupId"),
    @XmlEnumValue("AssetGroupName")
    ASSET_GROUP_NAME("AssetGroupName"),
    @XmlEnumValue("AssetGroupStatus")
    ASSET_GROUP_STATUS("AssetGroupStatus"),
    @XmlEnumValue("CurrencyCode")
    CURRENCY_CODE("CurrencyCode"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("BidStrategyType")
    BID_STRATEGY_TYPE("BidStrategyType"),
    @XmlEnumValue("Goal")
    GOAL("Goal"),
    @XmlEnumValue("GoalType")
    GOAL_TYPE("GoalType"),
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
    @XmlEnumValue("AverageCpm")
    AVERAGE_CPM("AverageCpm"),
    @XmlEnumValue("AllConversions")
    ALL_CONVERSIONS("AllConversions"),
    @XmlEnumValue("AllCostPerConversion")
    ALL_COST_PER_CONVERSION("AllCostPerConversion"),
    @XmlEnumValue("AllConversionRate")
    ALL_CONVERSION_RATE("AllConversionRate"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("ConversionRate")
    CONVERSION_RATE("ConversionRate"),
    @XmlEnumValue("CostPerConversion")
    COST_PER_CONVERSION("CostPerConversion"),
    @XmlEnumValue("ViewThroughConversions")
    VIEW_THROUGH_CONVERSIONS("ViewThroughConversions"),
    @XmlEnumValue("ViewThroughConversionRate")
    VIEW_THROUGH_CONVERSION_RATE("ViewThroughConversionRate"),
    @XmlEnumValue("ViewThroughCostPerConversion")
    VIEW_THROUGH_COST_PER_CONVERSION("ViewThroughCostPerConversion"),
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
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("ReturnOnAdSpend")
    RETURN_ON_AD_SPEND("ReturnOnAdSpend"),
    @XmlEnumValue("RevenuePerDownload")
    REVENUE_PER_DOWNLOAD("RevenuePerDownload"),
    @XmlEnumValue("RevenuePerAppInstall")
    REVENUE_PER_APP_INSTALL("RevenuePerAppInstall");
    private final String value;

    AppsPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AppsPerformanceReportColumn fromValue(String v) {
        for (AppsPerformanceReportColumn c: AppsPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
