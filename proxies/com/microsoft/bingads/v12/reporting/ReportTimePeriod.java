
package com.microsoft.bingads.v12.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportTimePeriod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportTimePeriod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Today"/>
 *     &lt;enumeration value="Yesterday"/>
 *     &lt;enumeration value="LastSevenDays"/>
 *     &lt;enumeration value="ThisWeek"/>
 *     &lt;enumeration value="LastWeek"/>
 *     &lt;enumeration value="Last14Days"/>
 *     &lt;enumeration value="Last30Days"/>
 *     &lt;enumeration value="LastFourWeeks"/>
 *     &lt;enumeration value="ThisMonth"/>
 *     &lt;enumeration value="LastMonth"/>
 *     &lt;enumeration value="LastThreeMonths"/>
 *     &lt;enumeration value="LastSixMonths"/>
 *     &lt;enumeration value="ThisYear"/>
 *     &lt;enumeration value="LastYear"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
    LAST_YEAR("LastYear");
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
