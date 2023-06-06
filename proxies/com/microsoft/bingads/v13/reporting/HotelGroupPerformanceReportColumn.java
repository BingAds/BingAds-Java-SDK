
package com.microsoft.bingads.v13.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelGroupPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HotelGroupPerformanceReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="CustomerId"/>
 *     &lt;enumeration value="CustomerName"/>
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="AdId"/>
 *     &lt;enumeration value="AccountStatus"/>
 *     &lt;enumeration value="CampaignStatus"/>
 *     &lt;enumeration value="AdGroupStatus"/>
 *     &lt;enumeration value="HotelGroup"/>
 *     &lt;enumeration value="HotelGroupNodeId"/>
 *     &lt;enumeration value="PartitionType"/>
 *     &lt;enumeration value="BidStrategyType"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="CurrencyCode"/>
 *     &lt;enumeration value="CustomParameters"/>
 *     &lt;enumeration value="FinalUrlSuffix"/>
 *     &lt;enumeration value="Impressions"/>
 *     &lt;enumeration value="Clicks"/>
 *     &lt;enumeration value="Ctr"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="AverageCpc"/>
 *     &lt;enumeration value="AverageCpm"/>
 *     &lt;enumeration value="Conversions"/>
 *     &lt;enumeration value="Revenue"/>
 *     &lt;enumeration value="NetRevenue"/>
 *     &lt;enumeration value="GrossReturnOnAdSpend"/>
 *     &lt;enumeration value="NetReturnOnAdSpend"/>
 *     &lt;enumeration value="CostPerAssist"/>
 *     &lt;enumeration value="BookedLengthOfStay"/>
 *     &lt;enumeration value="AvgBookedABW"/>
 *     &lt;enumeration value="AvgBookedNights"/>
 *     &lt;enumeration value="BookedABW"/>
 *     &lt;enumeration value="CheckInDate"/>
 *     &lt;enumeration value="DateType"/>
 *     &lt;enumeration value="PartnerImpressions"/>
 *     &lt;enumeration value="EligibleImpressions"/>
 *     &lt;enumeration value="MissedImpressions"/>
 *     &lt;enumeration value="ImpressionShare"/>
 *     &lt;enumeration value="MissedImpressionsNoBid"/>
 *     &lt;enumeration value="MissedImpressionsSpendingCapReached"/>
 *     &lt;enumeration value="MissedImpressionsNoTax"/>
 *     &lt;enumeration value="MissedImpressionsOther"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HotelGroupPerformanceReportColumn")
@XmlEnum
public enum HotelGroupPerformanceReportColumn {

    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("CustomerId")
    CUSTOMER_ID("CustomerId"),
    @XmlEnumValue("CustomerName")
    CUSTOMER_NAME("CustomerName"),
    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus"),
    @XmlEnumValue("HotelGroup")
    HOTEL_GROUP("HotelGroup"),
    @XmlEnumValue("HotelGroupNodeId")
    HOTEL_GROUP_NODE_ID("HotelGroupNodeId"),
    @XmlEnumValue("PartitionType")
    PARTITION_TYPE("PartitionType"),
    @XmlEnumValue("BidStrategyType")
    BID_STRATEGY_TYPE("BidStrategyType"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("CurrencyCode")
    CURRENCY_CODE("CurrencyCode"),
    @XmlEnumValue("CustomParameters")
    CUSTOM_PARAMETERS("CustomParameters"),
    @XmlEnumValue("FinalUrlSuffix")
    FINAL_URL_SUFFIX("FinalUrlSuffix"),
    @XmlEnumValue("Impressions")
    IMPRESSIONS("Impressions"),
    @XmlEnumValue("Clicks")
    CLICKS("Clicks"),
    @XmlEnumValue("Ctr")
    CTR("Ctr"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("AverageCpc")
    AVERAGE_CPC("AverageCpc"),
    @XmlEnumValue("AverageCpm")
    AVERAGE_CPM("AverageCpm"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("NetRevenue")
    NET_REVENUE("NetRevenue"),
    @XmlEnumValue("GrossReturnOnAdSpend")
    GROSS_RETURN_ON_AD_SPEND("GrossReturnOnAdSpend"),
    @XmlEnumValue("NetReturnOnAdSpend")
    NET_RETURN_ON_AD_SPEND("NetReturnOnAdSpend"),
    @XmlEnumValue("CostPerAssist")
    COST_PER_ASSIST("CostPerAssist"),
    @XmlEnumValue("BookedLengthOfStay")
    BOOKED_LENGTH_OF_STAY("BookedLengthOfStay"),
    @XmlEnumValue("AvgBookedABW")
    AVG_BOOKED_ABW("AvgBookedABW"),
    @XmlEnumValue("AvgBookedNights")
    AVG_BOOKED_NIGHTS("AvgBookedNights"),
    @XmlEnumValue("BookedABW")
    BOOKED_ABW("BookedABW"),
    @XmlEnumValue("CheckInDate")
    CHECK_IN_DATE("CheckInDate"),
    @XmlEnumValue("DateType")
    DATE_TYPE("DateType"),
    @XmlEnumValue("PartnerImpressions")
    PARTNER_IMPRESSIONS("PartnerImpressions"),
    @XmlEnumValue("EligibleImpressions")
    ELIGIBLE_IMPRESSIONS("EligibleImpressions"),
    @XmlEnumValue("MissedImpressions")
    MISSED_IMPRESSIONS("MissedImpressions"),
    @XmlEnumValue("ImpressionShare")
    IMPRESSION_SHARE("ImpressionShare"),
    @XmlEnumValue("MissedImpressionsNoBid")
    MISSED_IMPRESSIONS_NO_BID("MissedImpressionsNoBid"),
    @XmlEnumValue("MissedImpressionsSpendingCapReached")
    MISSED_IMPRESSIONS_SPENDING_CAP_REACHED("MissedImpressionsSpendingCapReached"),
    @XmlEnumValue("MissedImpressionsNoTax")
    MISSED_IMPRESSIONS_NO_TAX("MissedImpressionsNoTax"),
    @XmlEnumValue("MissedImpressionsOther")
    MISSED_IMPRESSIONS_OTHER("MissedImpressionsOther");
    private final String value;

    HotelGroupPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HotelGroupPerformanceReportColumn fromValue(String v) {
        for (HotelGroupPerformanceReportColumn c: HotelGroupPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
