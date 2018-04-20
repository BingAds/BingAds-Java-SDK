
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgeRange.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgeRange">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="EighteenToTwentyFour"/>
 *     &lt;enumeration value="TwentyFiveToThirtyFour"/>
 *     &lt;enumeration value="ThirtyFiveToFourtyNine"/>
 *     &lt;enumeration value="FiftyToSixtyFour"/>
 *     &lt;enumeration value="SixtyFiveAndAbove"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgeRange")
@XmlEnum
public enum AgeRange {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("EighteenToTwentyFour")
    EIGHTEEN_TO_TWENTY_FOUR("EighteenToTwentyFour"),
    @XmlEnumValue("TwentyFiveToThirtyFour")
    TWENTY_FIVE_TO_THIRTY_FOUR("TwentyFiveToThirtyFour"),
    @XmlEnumValue("ThirtyFiveToFourtyNine")
    THIRTY_FIVE_TO_FOURTY_NINE("ThirtyFiveToFourtyNine"),
    @XmlEnumValue("FiftyToSixtyFour")
    FIFTY_TO_SIXTY_FOUR("FiftyToSixtyFour"),
    @XmlEnumValue("SixtyFiveAndAbove")
    SIXTY_FIVE_AND_ABOVE("SixtyFiveAndAbove");
    private final String value;

    AgeRange(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgeRange fromValue(String v) {
        for (AgeRange c: AgeRange.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
