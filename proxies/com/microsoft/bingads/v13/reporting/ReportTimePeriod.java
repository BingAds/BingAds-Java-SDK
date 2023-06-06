
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportTimePeriod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReportTimePeriod">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Today"/>
 *     <enumeration value="Yesterday"/>
 *     <enumeration value="LastSevenDays"/>
 *     <enumeration value="ThisWeek"/>
 *     <enumeration value="LastWeek"/>
 *     <enumeration value="Last14Days"/>
 *     <enumeration value="Last30Days"/>
 *     <enumeration value="LastFourWeeks"/>
 *     <enumeration value="ThisMonth"/>
 *     <enumeration value="LastMonth"/>
 *     <enumeration value="LastThreeMonths"/>
 *     <enumeration value="LastSixMonths"/>
 *     <enumeration value="ThisYear"/>
 *     <enumeration value="LastYear"/>
 *     <enumeration value="ThisWeekStartingMonday"/>
 *     <enumeration value="LastWeekStartingMonday"/>
 *     <enumeration value="LastFourWeeksStartingMonday"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReportTimePeriod")
@XmlEnum
public enum ReportTimePeriod {

    @XmlEnumValue("Today")
    TODAY("Today"),
    @XmlEnumValue("Yesterday")
    YESTERDAY("Yesterday"),
    @XmlEnumValue("LastSevenDays")
    LAST_SEVEN_DAYS("LastSevenDays"),
    @XmlEnumValue("ThisWeek")
    THIS_WEEK("ThisWeek"),
    @XmlEnumValue("LastWeek")
    LAST_WEEK("LastWeek"),
    @XmlEnumValue("Last14Days")
    LAST_14_DAYS("Last14Days"),
    @XmlEnumValue("Last30Days")
    LAST_30_DAYS("Last30Days"),
    @XmlEnumValue("LastFourWeeks")
    LAST_FOUR_WEEKS("LastFourWeeks"),
    @XmlEnumValue("ThisMonth")
    THIS_MONTH("ThisMonth"),
    @XmlEnumValue("LastMonth")
    LAST_MONTH("LastMonth"),
    @XmlEnumValue("LastThreeMonths")
    LAST_THREE_MONTHS("LastThreeMonths"),
    @XmlEnumValue("LastSixMonths")
    LAST_SIX_MONTHS("LastSixMonths"),
    @XmlEnumValue("ThisYear")
    THIS_YEAR("ThisYear"),
    @XmlEnumValue("LastYear")
    LAST_YEAR("LastYear"),
    @XmlEnumValue("ThisWeekStartingMonday")
    THIS_WEEK_STARTING_MONDAY("ThisWeekStartingMonday"),
    @XmlEnumValue("LastWeekStartingMonday")
    LAST_WEEK_STARTING_MONDAY("LastWeekStartingMonday"),
    @XmlEnumValue("LastFourWeeksStartingMonday")
    LAST_FOUR_WEEKS_STARTING_MONDAY("LastFourWeeksStartingMonday");
    private final String value;

    ReportTimePeriod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportTimePeriod fromValue(String v) {
        for (ReportTimePeriod c: ReportTimePeriod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
