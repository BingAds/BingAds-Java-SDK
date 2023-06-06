
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupPrivacyStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdGroupPrivacyStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Active"/>
 *     <enumeration value="TargetingTooNarrow"/>
 *     <enumeration value="Pending"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdGroupPrivacyStatus")
@XmlEnum
public enum AdGroupPrivacyStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("TargetingTooNarrow")
    TARGETING_TOO_NARROW("TargetingTooNarrow"),
    @XmlEnumValue("Pending")
    PENDING("Pending");
    private final String value;

    AdGroupPrivacyStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdGroupPrivacyStatus fromValue(String v) {
        for (AdGroupPrivacyStatus c: AdGroupPrivacyStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
