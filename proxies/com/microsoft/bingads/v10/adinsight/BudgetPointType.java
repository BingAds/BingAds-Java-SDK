
package com.microsoft.bingads.v10.adinsight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetPointType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BudgetPointType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="Suggested"/>
 *     &lt;enumeration value="Maximum"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
