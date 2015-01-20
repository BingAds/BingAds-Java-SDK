
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetSummaryReportTimePeriod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BudgetSummaryReportTimePeriod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Today"/>
 *     &lt;enumeration value="Yesterday"/>
 *     &lt;enumeration value="LastSevenDays"/>
 *     &lt;enumeration value="ThisMonth"/>
 *     &lt;enumeration value="LastMonth"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BudgetSummaryReportTimePeriod")
@XmlEnum
public enum BudgetSummaryReportTimePeriod {

    @XmlEnumValue("Today")
    TODAY("Today"),
    @XmlEnumValue("Yesterday")
    YESTERDAY("Yesterday"),
    @XmlEnumValue("LastSevenDays")
    LAST_SEVEN_DAYS("LastSevenDays"),
    @XmlEnumValue("ThisMonth")
    THIS_MONTH("ThisMonth"),
    @XmlEnumValue("LastMonth")
    LAST_MONTH("LastMonth");
    private final String value;

    BudgetSummaryReportTimePeriod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BudgetSummaryReportTimePeriod fromValue(String v) {
        for (BudgetSummaryReportTimePeriod c: BudgetSummaryReportTimePeriod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
