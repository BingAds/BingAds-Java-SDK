
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EffectiveEditorialStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EffectiveEditorialStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Approved"/>
 *     <enumeration value="Rejected"/>
 *     <enumeration value="Pending"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EffectiveEditorialStatus")
@XmlEnum
public enum EffectiveEditorialStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Pending")
    PENDING("Pending");
    private final String value;

    EffectiveEditorialStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EffectiveEditorialStatus fromValue(String v) {
        for (EffectiveEditorialStatus c: EffectiveEditorialStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
