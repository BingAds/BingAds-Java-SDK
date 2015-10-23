
package com.microsoft.bingads.v10.campaignmanagement;

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
 *     &lt;enumeration value="EighteenToTwentyFive"/>
 *     &lt;enumeration value="TwentyFiveToThirtyFive"/>
 *     &lt;enumeration value="ThirtyFiveToFifty"/>
 *     &lt;enumeration value="FiftyToSixtyFive"/>
 *     &lt;enumeration value="SixtyFiveAndAbove"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgeRange")
@XmlEnum
public enum AgeRange {

    @XmlEnumValue("EighteenToTwentyFive")
    EIGHTEEN_TO_TWENTY_FIVE("EighteenToTwentyFive"),
    @XmlEnumValue("TwentyFiveToThirtyFive")
    TWENTY_FIVE_TO_THIRTY_FIVE("TwentyFiveToThirtyFive"),
    @XmlEnumValue("ThirtyFiveToFifty")
    THIRTY_FIVE_TO_FIFTY("ThirtyFiveToFifty"),
    @XmlEnumValue("FiftyToSixtyFive")
    FIFTY_TO_SIXTY_FIVE("FiftyToSixtyFive"),
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
