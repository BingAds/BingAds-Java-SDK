
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelDimensionPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="HotelDimensionPerformanceReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="CustomerId"/>
 *     <enumeration value="CustomerName"/>
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="AdId"/>
 *     <enumeration value="AccountStatus"/>
 *     <enumeration value="CampaignStatus"/>
 *     <enumeration value="AdGroupStatus"/>
 *     <enumeration value="SourceHotelId"/>
 *     <enumeration value="CampaignHotelId"/>
 *     <enumeration value="AdvertiserHotelId"/>
 *     <enumeration value="HotelName"/>
 *     <enumeration value="CountryName"/>
 *     <enumeration value="State"/>
 *     <enumeration value="City"/>
 *     <enumeration value="Brand"/>
 *     <enumeration value="Category"/>
 *     <enumeration value="StarRating"/>
 *     <enumeration value="CustomLabel0"/>
 *     <enumeration value="CustomLabel1"/>
 *     <enumeration value="CustomLabel2"/>
 *     <enumeration value="CustomLabel3"/>
 *     <enumeration value="CustomLabel4"/>
 *     <enumeration value="BidStrategyType"/>
 *     <enumeration value="DeviceType"/>
 *     <enumeration value="CurrencyCode"/>
 *     <enumeration value="CustomParameters"/>
 *     <enumeration value="FinalUrlSuffix"/>
 *     <enumeration value="Impressions"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="Ctr"/>
 *     <enumeration value="Spend"/>
 *     <enumeration value="AverageCpc"/>
 *     <enumeration value="AverageCpm"/>
 *     <enumeration value="Conversions"/>
 *     <enumeration value="Revenue"/>
 *     <enumeration value="NetRevenue"/>
 *     <enumeration value="GrossReturnOnAdSpend"/>
 *     <enumeration value="NetReturnOnAdSpend"/>
 *     <enumeration value="CostPerAssist"/>
 *     <enumeration value="BookedLengthOfStay"/>
 *     <enumeration value="AvgBookedABW"/>
 *     <enumeration value="AvgBookedNights"/>
 *     <enumeration value="BookedABW"/>
 *     <enumeration value="CheckInDate"/>
 *     <enumeration value="DateType"/>
 *     <enumeration value="PartnerImpressions"/>
 *     <enumeration value="EligibleImpressions"/>
 *     <enumeration value="MissedImpressions"/>
 *     <enumeration value="ImpressionShare"/>
 *     <enumeration value="MissedImpressionsNoBid"/>
 *     <enumeration value="MissedImpressionsSpendingCapReached"/>
 *     <enumeration value="MissedImpressionsNoTax"/>
 *     <enumeration value="MissedImpressionsOther"/>
 *     <enumeration value="CheckInDateDayOfWeek"/>
 *     <enumeration value="LengthOfStay"/>
 *     <enumeration value="AdvancedBookingWindow"/>
 *     <enumeration value="SiteType"/>
 *     <enumeration value="UserCountry"/>
 *     <enumeration value="ClickShare"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HotelDimensionPerformanceReportColumn")
@XmlEnum
public enum HotelDimensionPerformanceReportColumn {

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
    @XmlEnumValue("SourceHotelId")
    SOURCE_HOTEL_ID("SourceHotelId"),
    @XmlEnumValue("CampaignHotelId")
    CAMPAIGN_HOTEL_ID("CampaignHotelId"),
    @XmlEnumValue("AdvertiserHotelId")
    ADVERTISER_HOTEL_ID("AdvertiserHotelId"),
    @XmlEnumValue("HotelName")
    HOTEL_NAME("HotelName"),
    @XmlEnumValue("CountryName")
    COUNTRY_NAME("CountryName"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("Brand")
    BRAND("Brand"),
    @XmlEnumValue("Category")
    CATEGORY("Category"),
    @XmlEnumValue("StarRating")
    STAR_RATING("StarRating"),
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
    MISSED_IMPRESSIONS_OTHER("MissedImpressionsOther"),
    @XmlEnumValue("CheckInDateDayOfWeek")
    CHECK_IN_DATE_DAY_OF_WEEK("CheckInDateDayOfWeek"),
    @XmlEnumValue("LengthOfStay")
    LENGTH_OF_STAY("LengthOfStay"),
    @XmlEnumValue("AdvancedBookingWindow")
    ADVANCED_BOOKING_WINDOW("AdvancedBookingWindow"),
    @XmlEnumValue("SiteType")
    SITE_TYPE("SiteType"),
    @XmlEnumValue("UserCountry")
    USER_COUNTRY("UserCountry"),
    @XmlEnumValue("ClickShare")
    CLICK_SHARE("ClickShare");
    private final String value;

    HotelDimensionPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HotelDimensionPerformanceReportColumn fromValue(String v) {
        for (HotelDimensionPerformanceReportColumn c: HotelDimensionPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
