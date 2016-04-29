
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficSourcesReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficSourcesReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="Source"/>
 *     &lt;enumeration value="Goal"/>
 *     &lt;enumeration value="Step1Count"/>
 *     &lt;enumeration value="Step2Count"/>
 *     &lt;enumeration value="Step3Count"/>
 *     &lt;enumeration value="Step4Count"/>
 *     &lt;enumeration value="Step5Count"/>
 *     &lt;enumeration value="Conversions"/>
 *     &lt;enumeration value="Assists"/>
 *     &lt;enumeration value="FunnelConversionRate"/>
 *     &lt;enumeration value="Revenue"/>
 *     &lt;enumeration value="RevenuePerConversion"/>
 *     &lt;enumeration value="AccountStatus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficSourcesReportColumn")
@XmlEnum
public enum TrafficSourcesReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("Source")
    SOURCE("Source"),
    @XmlEnumValue("Goal")
    GOAL("Goal"),
    @XmlEnumValue("Step1Count")
    STEP_1_COUNT("Step1Count"),
    @XmlEnumValue("Step2Count")
    STEP_2_COUNT("Step2Count"),
    @XmlEnumValue("Step3Count")
    STEP_3_COUNT("Step3Count"),
    @XmlEnumValue("Step4Count")
    STEP_4_COUNT("Step4Count"),
    @XmlEnumValue("Step5Count")
    STEP_5_COUNT("Step5Count"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("Assists")
    ASSISTS("Assists"),
    @XmlEnumValue("FunnelConversionRate")
    FUNNEL_CONVERSION_RATE("FunnelConversionRate"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("RevenuePerConversion")
    REVENUE_PER_CONVERSION("RevenuePerConversion"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus");
    private final String value;

    TrafficSourcesReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficSourcesReportColumn fromValue(String v) {
        for (TrafficSourcesReportColumn c: TrafficSourcesReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
