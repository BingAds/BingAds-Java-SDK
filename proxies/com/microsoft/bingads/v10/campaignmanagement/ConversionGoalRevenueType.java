
package com.microsoft.bingads.v10.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionGoalRevenueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionGoalRevenueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FixedValue"/>
 *     &lt;enumeration value="VariableValue"/>
 *     &lt;enumeration value="NoValue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionGoalRevenueType")
@XmlEnum
public enum ConversionGoalRevenueType {

    @XmlEnumValue("FixedValue")
    FIXED_VALUE("FixedValue"),
    @XmlEnumValue("VariableValue")
    VARIABLE_VALUE("VariableValue"),
    @XmlEnumValue("NoValue")
    NO_VALUE("NoValue");
    private final String value;

    ConversionGoalRevenueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionGoalRevenueType fromValue(String v) {
        for (ConversionGoalRevenueType c: ConversionGoalRevenueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
