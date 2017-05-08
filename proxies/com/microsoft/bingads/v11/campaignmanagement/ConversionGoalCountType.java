
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionGoalCountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionGoalCountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Unique"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
