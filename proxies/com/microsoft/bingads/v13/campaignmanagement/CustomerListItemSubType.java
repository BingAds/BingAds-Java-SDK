
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerListItemSubType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CustomerListItemSubType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Email"/>
 *     <enumeration value="CRM"/>
 *     <enumeration value="Phone"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CustomerListItemSubType")
@XmlEnum
public enum CustomerListItemSubType {

    @XmlEnumValue("Email")
    EMAIL("Email"),
    CRM("CRM"),
    @XmlEnumValue("Phone")
    PHONE("Phone");
    private final String value;

    CustomerListItemSubType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerListItemSubType fromValue(String v) {
        for (CustomerListItemSubType c: CustomerListItemSubType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
