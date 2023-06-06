
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoTagType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AutoTagType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Inactive"/>
 *     <enumeration value="Preserve"/>
 *     <enumeration value="Replace"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AutoTagType", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
@XmlEnum
public enum AutoTagType {

    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Preserve")
    PRESERVE("Preserve"),
    @XmlEnumValue("Replace")
    REPLACE("Replace");
    private final String value;

    AutoTagType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutoTagType fromValue(String v) {
        for (AutoTagType c: AutoTagType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
