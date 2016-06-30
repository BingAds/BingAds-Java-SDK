
package com.microsoft.bingads.v10.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemarketingTargetingSetting.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemarketingTargetingSetting">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BidOnly"/>
 *     &lt;enumeration value="TargetAndBid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RemarketingTargetingSetting")
@XmlEnum
public enum RemarketingTargetingSetting {

    @XmlEnumValue("BidOnly")
    BID_ONLY("BidOnly"),
    @XmlEnumValue("TargetAndBid")
    TARGET_AND_BID("TargetAndBid");
    private final String value;

    RemarketingTargetingSetting(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemarketingTargetingSetting fromValue(String v) {
        for (RemarketingTargetingSetting c: RemarketingTargetingSetting.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
