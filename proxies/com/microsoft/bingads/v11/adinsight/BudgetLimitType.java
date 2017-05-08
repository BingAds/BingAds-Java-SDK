
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetLimitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BudgetLimitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DailyBudgetStandard"/>
 *     &lt;enumeration value="DailyBudgetAccelerated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BudgetLimitType")
@XmlEnum
public enum BudgetLimitType {

    @XmlEnumValue("DailyBudgetStandard")
    DAILY_BUDGET_STANDARD("DailyBudgetStandard"),
    @XmlEnumValue("DailyBudgetAccelerated")
    DAILY_BUDGET_ACCELERATED("DailyBudgetAccelerated");
    private final String value;

    BudgetLimitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BudgetLimitType fromValue(String v) {
        for (BudgetLimitType c: BudgetLimitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
