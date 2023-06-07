
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuctionSegment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AuctionSegment">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Day"/>
 *     <enumeration value="Week"/>
 *     <enumeration value="Month"/>
 *     <enumeration value="Quarter"/>
 *     <enumeration value="DayOfWeek"/>
 *     <enumeration value="Device"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AuctionSegment")
@XmlEnum
public enum AuctionSegment {

    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Quarter")
    QUARTER("Quarter"),
    @XmlEnumValue("DayOfWeek")
    DAY_OF_WEEK("DayOfWeek"),
    @XmlEnumValue("Device")
    DEVICE("Device");
    private final String value;

    AuctionSegment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuctionSegment fromValue(String v) {
        for (AuctionSegment c: AuctionSegment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
