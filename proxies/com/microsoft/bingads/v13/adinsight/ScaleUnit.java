
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScaleUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ScaleUnit">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Billion"/>
 *     <enumeration value="Million"/>
 *     <enumeration value="Thousand"/>
 *     <enumeration value="None"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ScaleUnit")
@XmlEnum
public enum ScaleUnit {

    @XmlEnumValue("Billion")
    BILLION("Billion"),
    @XmlEnumValue("Million")
    MILLION("Million"),
    @XmlEnumValue("Thousand")
    THOUSAND("Thousand"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    ScaleUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScaleUnit fromValue(String v) {
        for (ScaleUnit c: ScaleUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
