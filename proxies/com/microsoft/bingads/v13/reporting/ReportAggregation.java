
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportAggregation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReportAggregation">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Summary"/>
 *     <enumeration value="Hourly"/>
 *     <enumeration value="Daily"/>
 *     <enumeration value="Weekly"/>
 *     <enumeration value="Monthly"/>
 *     <enumeration value="Yearly"/>
 *     <enumeration value="HourOfDay"/>
 *     <enumeration value="DayOfWeek"/>
 *     <enumeration value="WeeklyStartingMonday"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReportAggregation")
@XmlEnum
public enum ReportAggregation {

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
    DAY_OF_WEEK("DayOfWeek"),
    @XmlEnumValue("WeeklyStartingMonday")
    WEEKLY_STARTING_MONDAY("WeeklyStartingMonday");
    private final String value;

    ReportAggregation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportAggregation fromValue(String v) {
        for (ReportAggregation c: ReportAggregation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
