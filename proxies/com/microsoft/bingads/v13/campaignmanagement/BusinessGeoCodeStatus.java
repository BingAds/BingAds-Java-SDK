
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessGeoCodeStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BusinessGeoCodeStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Pending"/>
 *     <enumeration value="Complete"/>
 *     <enumeration value="Invalid"/>
 *     <enumeration value="Failed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BusinessGeoCodeStatus")
@XmlEnum
public enum BusinessGeoCodeStatus {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    BusinessGeoCodeStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessGeoCodeStatus fromValue(String v) {
        for (BusinessGeoCodeStatus c: BusinessGeoCodeStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
