
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AgeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="ZeroToTwelve"/>
 *     <enumeration value="ThirteenToSevenTeen"/>
 *     <enumeration value="EighteenToTwentyFour"/>
 *     <enumeration value="TwentyFiveToThirtyFour"/>
 *     <enumeration value="ThirtyFiveToFourtyNine"/>
 *     <enumeration value="FiftyToSixtyFour"/>
 *     <enumeration value="SixtyFiveAndAbove"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AgeEnum")
@XmlEnum
public enum AgeEnum {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("ZeroToTwelve")
    ZERO_TO_TWELVE("ZeroToTwelve"),
    @XmlEnumValue("ThirteenToSevenTeen")
    THIRTEEN_TO_SEVEN_TEEN("ThirteenToSevenTeen"),
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

    AgeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgeEnum fromValue(String v) {
        for (AgeEnum c: AgeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
