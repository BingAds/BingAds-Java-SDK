
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomSegmentEditorialStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CustomSegmentEditorialStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Rejected"/>
 *     <enumeration value="Pending"/>
 *     <enumeration value="PartialApproved"/>
 *     <enumeration value="Approved"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CustomSegmentEditorialStatus")
@XmlEnum
public enum CustomSegmentEditorialStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("PartialApproved")
    PARTIAL_APPROVED("PartialApproved"),
    @XmlEnumValue("Approved")
    APPROVED("Approved");
    private final String value;

    CustomSegmentEditorialStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomSegmentEditorialStatus fromValue(String v) {
        for (CustomSegmentEditorialStatus c: CustomSegmentEditorialStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
