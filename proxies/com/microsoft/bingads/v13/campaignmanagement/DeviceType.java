
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DeviceType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="Computers"/>
 *     <enumeration value="Smartphones"/>
 *     <enumeration value="Tablets"/>
 *     <enumeration value="All"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DeviceType")
@XmlEnum
public enum DeviceType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Computers")
    COMPUTERS("Computers"),
    @XmlEnumValue("Smartphones")
    SMARTPHONES("Smartphones"),
    @XmlEnumValue("Tablets")
    TABLETS("Tablets"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    DeviceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceType fromValue(String v) {
        for (DeviceType c: DeviceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
