
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignPrivacyStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CampaignPrivacyStatus">
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
@XmlType(name = "CampaignPrivacyStatus")
@XmlEnum
public enum CampaignPrivacyStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("TargetingTooNarrow")
    TARGETING_TOO_NARROW("TargetingTooNarrow"),
    @XmlEnumValue("Pending")
    PENDING("Pending");
    private final String value;

    CampaignPrivacyStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignPrivacyStatus fromValue(String v) {
        for (CampaignPrivacyStatus c: CampaignPrivacyStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
