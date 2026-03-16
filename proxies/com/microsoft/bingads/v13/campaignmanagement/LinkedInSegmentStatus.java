
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedInSegmentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LinkedInSegmentStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Building"/>
 *     <enumeration value="Ready"/>
 *     <enumeration value="ReachTooSmall"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LinkedInSegmentStatus")
@XmlEnum
public enum LinkedInSegmentStatus {

    @XmlEnumValue("Building")
    BUILDING("Building"),
    @XmlEnumValue("Ready")
    READY("Ready"),
    @XmlEnumValue("ReachTooSmall")
    REACH_TOO_SMALL("ReachTooSmall");
    private final String value;

    LinkedInSegmentStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinkedInSegmentStatus fromValue(String v) {
        for (LinkedInSegmentStatus c: LinkedInSegmentStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
