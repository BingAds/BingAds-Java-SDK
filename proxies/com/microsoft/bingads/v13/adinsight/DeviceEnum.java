
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DeviceEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Desktop"/>
 *     <enumeration value="Smartphone"/>
 *     <enumeration value="Tablet"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DeviceEnum")
@XmlEnum
public enum DeviceEnum {

    @XmlEnumValue("Desktop")
    DESKTOP("Desktop"),
    @XmlEnumValue("Smartphone")
    SMARTPHONE("Smartphone"),
    @XmlEnumValue("Tablet")
    TABLET("Tablet");
    private final String value;

    DeviceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceEnum fromValue(String v) {
        for (DeviceEnum c: DeviceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
