
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchQueryReportAggregation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchQueryReportAggregation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Summary"/>
 *     &lt;enumeration value="Hourly"/>
 *     &lt;enumeration value="Daily"/>
 *     &lt;enumeration value="Weekly"/>
 *     &lt;enumeration value="Monthly"/>
 *     &lt;enumeration value="Yearly"/>
 *     &lt;enumeration value="HourOfDay"/>
 *     &lt;enumeration value="DayOfWeek"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchQueryReportAggregation")
@XmlEnum
public enum SearchQueryReportAggregation {

    @XmlEnumValue("Summary")
    SUMMARY("Summary"),
    @XmlEnumValue("Hourly")
    HOURLY("Hourly"),
    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("Yearly")
    YEARLY("Yearly"),
    @XmlEnumValue("HourOfDay")
    HOUR_OF_DAY("HourOfDay"),
    @XmlEnumValue("DayOfWeek")
    DAY_OF_WEEK("DayOfWeek");
    private final String value;

    SearchQueryReportAggregation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchQueryReportAggregation fromValue(String v) {
        for (SearchQueryReportAggregation c: SearchQueryReportAggregation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
