
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EntityScope">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Account"/>
 *     <enumeration value="Customer"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
