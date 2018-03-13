
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupPrivacyStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroupPrivacyStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="TargetingTooNarrow"/>
 *     &lt;enumeration value="Pending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
