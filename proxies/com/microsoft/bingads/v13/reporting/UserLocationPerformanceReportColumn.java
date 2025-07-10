
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserLocationPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UserLocationPerformanceReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="Country"/>
 *     <enumeration value="State"/>
 *     <enumeration value="MetroArea"/>
 *     <enumeration value="CurrencyCode"/>
 *     <enumeration value="AdDistribution"/>
 *     <enumeration value="Impressions"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="Ctr"/>
 *     <enumeration value="AverageCpc"/>
 *     <enumeration value="Spend"/>
 *     <enumeration value="AveragePosition"/>
 *     <enumeration value="ProximityTargetLocation"/>
 *     <enumeration value="Radius"/>
 *     <enumeration value="Language"/>
 *     <enumeration value="City"/>
 *     <enumeration value="QueryIntentCountry"/>
 *     <enumeration value="QueryIntentState"/>
 *     <enumeration value="QueryIntentCity"/>
 *     <enumeration value="QueryIntentDMA"/>
 *     <enumeration value="BidMatchType"/>
 *     <enumeration value="DeliveredMatchType"/>
 *     <enumeration value="Network"/>
 *     <enumeration value="TopVsOther"/>
 *     <enumeration value="DeviceType"/>
 *     <enumeration value="DeviceOS"/>
 *     <enumeration value="Assists"/>
 *     <enumeration value="Conversions"/>
 *     <enumeration value="ConversionRate"/>
 *     <enumeration value="Revenue"/>
 *     <enumeration value="ReturnOnAdSpend"/>
 *     <enumeration value="CostPerConversion"/>
 *     <enumeration value="CostPerAssist"/>
 *     <enumeration value="RevenuePerConversion"/>
 *     <enumeration value="RevenuePerAssist"/>
 *     <enumeration value="County"/>
 *     <enumeration value="PostalCode"/>
 *     <enumeration value="QueryIntentCounty"/>
 *     <enumeration value="QueryIntentPostalCode"/>
 *     <enumeration value="LocationId"/>
 *     <enumeration value="QueryIntentLocationId"/>
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
 *     <enumeration value="TopImpressionRatePercent"/>
 *     <enumeration value="AverageCpm"/>
 *     <enumeration value="ConversionsQualified"/>
 *     <enumeration value="AllConversionsQualified"/>
 *     <enumeration value="ViewThroughConversionsQualified"/>
 *     <enumeration value="Neighborhood"/>
 *     <enumeration value="QueryIntentNeighborhood"/>
 *     <enumeration value="ViewThroughRevenue"/>
 *     <enumeration value="CampaignType"/>
 *     <enumeration value="AssetGroupId"/>
 *     <enumeration value="AssetGroupName"/>
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
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UserLocationPerformanceReportColumn")
@XmlEnum
public enum UserLocationPerformanceReportColumn {

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
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("MetroArea")
    METRO_AREA("MetroArea"),
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
    @XmlEnumValue("ProximityTargetLocation")
    PROXIMITY_TARGET_LOCATION("ProximityTargetLocation"),
    @XmlEnumValue("Radius")
    RADIUS("Radius"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("QueryIntentCountry")
    QUERY_INTENT_COUNTRY("QueryIntentCountry"),
    @XmlEnumValue("QueryIntentState")
    QUERY_INTENT_STATE("QueryIntentState"),
    @XmlEnumValue("QueryIntentCity")
    QUERY_INTENT_CITY("QueryIntentCity"),
    @XmlEnumValue("QueryIntentDMA")
    QUERY_INTENT_DMA("QueryIntentDMA"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("DeliveredMatchType")
    DELIVERED_MATCH_TYPE("DeliveredMatchType"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("TopVsOther")
    TOP_VS_OTHER("TopVsOther"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("DeviceOS")
    DEVICE_OS("DeviceOS"),
    @XmlEnumValue("Assists")
    ASSISTS("Assists"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("ConversionRate")
    CONVERSION_RATE("ConversionRate"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("ReturnOnAdSpend")
    RETURN_ON_AD_SPEND("ReturnOnAdSpend"),
    @XmlEnumValue("CostPerConversion")
    COST_PER_CONVERSION("CostPerConversion"),
    @XmlEnumValue("CostPerAssist")
    COST_PER_ASSIST("CostPerAssist"),
    @XmlEnumValue("RevenuePerConversion")
    REVENUE_PER_CONVERSION("RevenuePerConversion"),
    @XmlEnumValue("RevenuePerAssist")
    REVENUE_PER_ASSIST("RevenuePerAssist"),
    @XmlEnumValue("County")
    COUNTY("County"),
    @XmlEnumValue("PostalCode")
    POSTAL_CODE("PostalCode"),
    @XmlEnumValue("QueryIntentCounty")
    QUERY_INTENT_COUNTY("QueryIntentCounty"),
    @XmlEnumValue("QueryIntentPostalCode")
    QUERY_INTENT_POSTAL_CODE("QueryIntentPostalCode"),
    @XmlEnumValue("LocationId")
    LOCATION_ID("LocationId"),
    @XmlEnumValue("QueryIntentLocationId")
    QUERY_INTENT_LOCATION_ID("QueryIntentLocationId"),
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
    @XmlEnumValue("Neighborhood")
    NEIGHBORHOOD("Neighborhood"),
    @XmlEnumValue("QueryIntentNeighborhood")
    QUERY_INTENT_NEIGHBORHOOD("QueryIntentNeighborhood"),
    @XmlEnumValue("ViewThroughRevenue")
    VIEW_THROUGH_REVENUE("ViewThroughRevenue"),
    @XmlEnumValue("CampaignType")
    CAMPAIGN_TYPE("CampaignType"),
    @XmlEnumValue("AssetGroupId")
    ASSET_GROUP_ID("AssetGroupId"),
    @XmlEnumValue("AssetGroupName")
    ASSET_GROUP_NAME("AssetGroupName"),
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
    CPS("CPS");
    private final String value;

    UserLocationPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserLocationPerformanceReportColumn fromValue(String v) {
        for (UserLocationPerformanceReportColumn c: UserLocationPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
