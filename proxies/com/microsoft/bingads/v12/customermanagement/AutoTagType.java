
package com.microsoft.bingads.v12.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoTagType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutoTagType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="Preserve"/>
 *     &lt;enumeration value="Replace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AutoTagType", namespace = "https://bingads.microsoft.com/Customer/v12/Entities")
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
