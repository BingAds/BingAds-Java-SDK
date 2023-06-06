
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetPointType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BudgetPointType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Current"/>
 *     <enumeration value="Suggested"/>
 *     <enumeration value="Maximum"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BudgetPointType")
@XmlEnum
public enum BudgetPointType {

    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Suggested")
    SUGGESTED("Suggested"),
    @XmlEnumValue("Maximum")
    MAXIMUM("Maximum"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BudgetPointType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BudgetPointType fromValue(String v) {
        for (BudgetPointType c: BudgetPointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
