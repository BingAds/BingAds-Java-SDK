
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerListActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CustomerListActionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="Add"/>
 *     <enumeration value="Remove"/>
 *     <enumeration value="Replace"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CustomerListActionType")
@XmlEnum
public enum CustomerListActionType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Remove")
    REMOVE("Remove"),
    @XmlEnumValue("Replace")
    REPLACE("Replace");
    private final String value;

    CustomerListActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerListActionType fromValue(String v) {
        for (CustomerListActionType c: CustomerListActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
