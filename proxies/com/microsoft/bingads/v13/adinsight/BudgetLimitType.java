
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetLimitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BudgetLimitType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DailyBudgetStandard"/>
 *     <enumeration value="DailyBudgetAccelerated"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
