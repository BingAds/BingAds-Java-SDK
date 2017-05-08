
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionGoalTrackingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionGoalTrackingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TagUnverified"/>
 *     &lt;enumeration value="NoRecentConversions"/>
 *     &lt;enumeration value="RecordingConversions"/>
 *     &lt;enumeration value="TagInactive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionGoalTrackingStatus")
@XmlEnum
public enum ConversionGoalTrackingStatus {

    @XmlEnumValue("TagUnverified")
    TAG_UNVERIFIED("TagUnverified"),
    @XmlEnumValue("NoRecentConversions")
    NO_RECENT_CONVERSIONS("NoRecentConversions"),
    @XmlEnumValue("RecordingConversions")
    RECORDING_CONVERSIONS("RecordingConversions"),
    @XmlEnumValue("TagInactive")
    TAG_INACTIVE("TagInactive");
    private final String value;

    ConversionGoalTrackingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionGoalTrackingStatus fromValue(String v) {
        for (ConversionGoalTrackingStatus c: ConversionGoalTrackingStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
