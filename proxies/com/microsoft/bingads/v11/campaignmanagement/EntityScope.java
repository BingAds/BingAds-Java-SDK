
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityScope">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="Customer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityScope")
@XmlEnum
public enum EntityScope {

    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer");
    private final String value;

    EntityScope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityScope fromValue(String v) {
        for (EntityScope c: EntityScope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
