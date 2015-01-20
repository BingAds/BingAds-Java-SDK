
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HourRange.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HourRange">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ThreeAMToSevenAM"/>
 *     &lt;enumeration value="SevenAMToElevenAM"/>
 *     &lt;enumeration value="ElevenAMToTwoPM"/>
 *     &lt;enumeration value="TwoPMToSixPM"/>
 *     &lt;enumeration value="SixPMToElevenPM"/>
 *     &lt;enumeration value="ElevenPMToThreeAM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HourRange")
@XmlEnum
public enum HourRange {

    @XmlEnumValue("ThreeAMToSevenAM")
    THREE_AM_TO_SEVEN_AM("ThreeAMToSevenAM"),
    @XmlEnumValue("SevenAMToElevenAM")
    SEVEN_AM_TO_ELEVEN_AM("SevenAMToElevenAM"),
    @XmlEnumValue("ElevenAMToTwoPM")
    ELEVEN_AM_TO_TWO_PM("ElevenAMToTwoPM"),
    @XmlEnumValue("TwoPMToSixPM")
    TWO_PM_TO_SIX_PM("TwoPMToSixPM"),
    @XmlEnumValue("SixPMToElevenPM")
    SIX_PM_TO_ELEVEN_PM("SixPMToElevenPM"),
    @XmlEnumValue("ElevenPMToThreeAM")
    ELEVEN_PM_TO_THREE_AM("ElevenPMToThreeAM");
    private final String value;

    HourRange(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HourRange fromValue(String v) {
        for (HourRange c: HourRange.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
