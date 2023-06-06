
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionGoalRevenueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConversionGoalRevenueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FixedValue"/>
 *     <enumeration value="VariableValue"/>
 *     <enumeration value="NoValue"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
