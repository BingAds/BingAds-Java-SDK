
package com.microsoft.bingads.v13.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Html"/>
 *     &lt;enumeration value="Text"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmailFormat", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
@XmlEnum
public enum EmailFormat {

    @XmlEnumValue("Html")
    HTML("Html"),
    @XmlEnumValue("Text")
    TEXT("Text");
    private final String value;

    EmailFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailFormat fromValue(String v) {
        for (EmailFormat c: EmailFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
