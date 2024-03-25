
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadiusUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RadiusUnit">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Miles"/>
 *     <enumeration value="Kilometers"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RadiusUnit")
@XmlEnum
public enum RadiusUnit {

    @XmlEnumValue("Miles")
    MILES("Miles"),
    @XmlEnumValue("Kilometers")
    KILOMETERS("Kilometers");
    private final String value;

    RadiusUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RadiusUnit fromValue(String v) {
        for (RadiusUnit c: RadiusUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
