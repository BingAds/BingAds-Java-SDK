
package com.microsoft.bingads.v11.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Advertiser"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApplicationType", namespace = "https://bingads.microsoft.com/Customer/v11/Entities")
@XmlEnum
public enum ApplicationType {

    @XmlEnumValue("Advertiser")
    ADVERTISER("Advertiser");
    private final String value;

    ApplicationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplicationType fromValue(String v) {
        for (ApplicationType c: ApplicationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
