
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UetTagTrackingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UetTagTrackingStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unverified"/>
 *     <enumeration value="Active"/>
 *     <enumeration value="Inactive"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UetTagTrackingStatus")
@XmlEnum
public enum UetTagTrackingStatus {

    @XmlEnumValue("Unverified")
    UNVERIFIED("Unverified"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive");
    private final String value;

    UetTagTrackingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UetTagTrackingStatus fromValue(String v) {
        for (UetTagTrackingStatus c: UetTagTrackingStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
