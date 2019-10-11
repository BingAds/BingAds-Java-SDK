
package com.microsoft.bingads.v13.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserLocationPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserLocationPerformanceReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="State"/>
 *     &lt;enumeration value="MetroArea"/>
 *     &lt;enumeration value="CurrencyCode"/>
 *     &lt;enumeration value="AdDistribution"/>
 *     &lt;enumeration value="Impressions"/>
 *     &lt;enumeration value="Clicks"/>
 *     &lt;enumeration value="Ctr"/>
 *     &lt;enumeration value="AverageCpc"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="AveragePosition"/>
 *     &lt;enumeration value="ProximityTargetLocation"/>
 *     &lt;enumeration value="Radius"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="City"/>
 *     &lt;enumeration value="QueryIntentCountry"/>
 *     &lt;enumeration value="QueryIntentState"/>
 *     &lt;enumeration value="QueryIntentCity"/>
 *     &lt;enumeration value="QueryIntentDMA"/>
 *     &lt;enumeration value="BidMatchType"/>
 *     &lt;enumeration value="DeliveredMatchType"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="TopVsOther"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="DeviceOS"/>
 *     &lt;enumeration value="Assists"/>
 *     &lt;enumeration value="Conversions"/>
 *     &lt;enumeration value="ConversionRate"/>
 *     &lt;enumeration value="Revenue"/>
 *     &lt;enumeration value="ReturnOnAdSpend"/>
 *     &lt;enumeration value="CostPerConversion"/>
 *     &lt;enumeration value="CostPerAssist"/>
 *     &lt;enumeration value="RevenuePerConversion"/>
 *     &lt;enumeration value="RevenuePerAssist"/>
 *     &lt;enumeration value="County"/>
 *     &lt;enumeration value="PostalCode"/>
 *     &lt;enumeration value="QueryIntentCounty"/>
 *     &lt;enumeration value="QueryIntentPostalCode"/>
 *     &lt;enumeration value="LocationId"/>
 *     &lt;enumeration value="QueryIntentLocationId"/>
 *     &lt;enumeration value="AllConversions"/>
 *     &lt;enumeration value="AllRevenue"/>
 *     &lt;enumeration value="AllConversionRate"/>
 *     &lt;enumeration value="AllCostPerConversion"/>
 *     &lt;enumeration value="AllReturnOnAdSpend"/>
 *     &lt;enumeration value="AllRevenuePerConversion"/>
 *     &lt;enumeration value="ViewThroughConversions"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
    VIEW_THROUGH_CONVERSIONS("ViewThroughConversions");
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
