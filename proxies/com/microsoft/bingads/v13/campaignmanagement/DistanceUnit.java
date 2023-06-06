
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistanceUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DistanceUnit">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Miles"/>
 *     <enumeration value="Kilometers"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DistanceUnit")
@XmlEnum
public enum DistanceUnit {

    @XmlEnumValue("Miles")
    MILES("Miles"),
    @XmlEnumValue("Kilometers")
    KILOMETERS("Kilometers");
    private final String value;

    DistanceUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistanceUnit fromValue(String v) {
        for (DistanceUnit c: DistanceUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
