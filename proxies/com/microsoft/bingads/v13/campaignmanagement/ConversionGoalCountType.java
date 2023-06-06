
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionGoalCountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConversionGoalCountType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="All"/>
 *     <enumeration value="Unique"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConversionGoalCountType")
@XmlEnum
public enum ConversionGoalCountType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Unique")
    UNIQUE("Unique");
    private final String value;

    ConversionGoalCountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionGoalCountType fromValue(String v) {
        for (ConversionGoalCountType c: ConversionGoalCountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
