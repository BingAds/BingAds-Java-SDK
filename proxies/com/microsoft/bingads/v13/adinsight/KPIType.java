
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KPIType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KPIType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Impression"/>
 *     &lt;enumeration value="Click"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="Conversion"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KPIType")
@XmlEnum
public enum KPIType {

    @XmlEnumValue("Impression")
    IMPRESSION("Impression"),
    @XmlEnumValue("Click")
    CLICK("Click"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("Conversion")
    CONVERSION("Conversion");
    private final String value;

    KPIType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KPIType fromValue(String v) {
        for (KPIType c: KPIType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
