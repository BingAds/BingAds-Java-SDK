
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionGoalTrackingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConversionGoalTrackingStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TagUnverified"/>
 *     <enumeration value="NoRecentConversions"/>
 *     <enumeration value="RecordingConversions"/>
 *     <enumeration value="TagInactive"/>
 *     <enumeration value="InactiveDueToTagUnavailable"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
    TAG_INACTIVE("TagInactive"),
    @XmlEnumValue("InactiveDueToTagUnavailable")
    INACTIVE_DUE_TO_TAG_UNAVAILABLE("InactiveDueToTagUnavailable");
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
