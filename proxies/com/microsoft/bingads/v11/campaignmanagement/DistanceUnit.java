
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistanceUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistanceUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Miles"/>
 *     &lt;enumeration value="Kilometers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
