
package com.microsoft.bingads.v13.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdDynamicTextPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdDynamicTextPerformanceReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="Keyword"/>
 *     &lt;enumeration value="AdId"/>
 *     &lt;enumeration value="AdTitle"/>
 *     &lt;enumeration value="AdType"/>
 *     &lt;enumeration value="DestinationUrl"/>
 *     &lt;enumeration value="Param1"/>
 *     &lt;enumeration value="Param2"/>
 *     &lt;enumeration value="Param3"/>
 *     &lt;enumeration value="CurrencyCode"/>
 *     &lt;enumeration value="AdDistribution"/>
 *     &lt;enumeration value="Impressions"/>
 *     &lt;enumeration value="Clicks"/>
 *     &lt;enumeration value="Ctr"/>
 *     &lt;enumeration value="AverageCpc"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="AveragePosition"/>
 *     &lt;enumeration value="Conversions"/>
 *     &lt;enumeration value="ConversionRate"/>
 *     &lt;enumeration value="CostPerConversion"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="AccountStatus"/>
 *     &lt;enumeration value="AdGroupStatus"/>
 *     &lt;enumeration value="AdStatus"/>
 *     &lt;enumeration value="KeywordStatus"/>
 *     &lt;enumeration value="TitlePart1"/>
 *     &lt;enumeration value="TitlePart2"/>
 *     &lt;enumeration value="TitlePart3"/>
 *     &lt;enumeration value="Path1"/>
 *     &lt;enumeration value="Path2"/>
 *     &lt;enumeration value="FinalUrl"/>
 *     &lt;enumeration value="FinalMobileUrl"/>
 *     &lt;enumeration value="FinalAppUrl"/>
 *     &lt;enumeration value="AdDescription"/>
 *     &lt;enumeration value="AdDescription2"/>
 *     &lt;enumeration value="AdLabels"/>
 *     &lt;enumeration value="AllConversions"/>
 *     &lt;enumeration value="AllConversionRate"/>
 *     &lt;enumeration value="AllCostPerConversion"/>
 *     &lt;enumeration value="ViewThroughConversions"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdDynamicTextPerformanceReportColumn")
@XmlEnum
public enum AdDynamicTextPerformanceReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("AdTitle")
    AD_TITLE("AdTitle"),
    @XmlEnumValue("AdType")
    AD_TYPE("AdType"),
    @XmlEnumValue("DestinationUrl")
    DESTINATION_URL("DestinationUrl"),
    @XmlEnumValue("Param1")
    PARAM_1("Param1"),
    @XmlEnumValue("Param2")
    PARAM_2("Param2"),
    @XmlEnumValue("Param3")
    PARAM_3("Param3"),
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
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus"),
    @XmlEnumValue("AdStatus")
    AD_STATUS("AdStatus"),
    @XmlEnumValue("KeywordStatus")
    KEYWORD_STATUS("KeywordStatus"),
    @XmlEnumValue("TitlePart1")
    TITLE_PART_1("TitlePart1"),
    @XmlEnumValue("TitlePart2")
    TITLE_PART_2("TitlePart2"),
    @XmlEnumValue("TitlePart3")
    TITLE_PART_3("TitlePart3"),
    @XmlEnumValue("Path1")
    PATH_1("Path1"),
    @XmlEnumValue("Path2")
    PATH_2("Path2"),
    @XmlEnumValue("FinalUrl")
    FINAL_URL("FinalUrl"),
    @XmlEnumValue("FinalMobileUrl")
    FINAL_MOBILE_URL("FinalMobileUrl"),
    @XmlEnumValue("FinalAppUrl")
    FINAL_APP_URL("FinalAppUrl"),
    @XmlEnumValue("AdDescription")
    AD_DESCRIPTION("AdDescription"),
    @XmlEnumValue("AdDescription2")
    AD_DESCRIPTION_2("AdDescription2"),
    @XmlEnumValue("AdLabels")
    AD_LABELS("AdLabels"),
    @XmlEnumValue("AllConversions")
    ALL_CONVERSIONS("AllConversions"),
    @XmlEnumValue("AllConversionRate")
    ALL_CONVERSION_RATE("AllConversionRate"),
    @XmlEnumValue("AllCostPerConversion")
    ALL_COST_PER_CONVERSION("AllCostPerConversion"),
    @XmlEnumValue("ViewThroughConversions")
    VIEW_THROUGH_CONVERSIONS("ViewThroughConversions");
    private final String value;

    AdDynamicTextPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdDynamicTextPerformanceReportColumn fromValue(String v) {
        for (AdDynamicTextPerformanceReportColumn c: AdDynamicTextPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
