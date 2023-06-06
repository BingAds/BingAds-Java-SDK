
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BidOption">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BidValue"/>
 *     <enumeration value="BidBoost"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BidOption")
@XmlEnum
public enum BidOption {

    @XmlEnumValue("BidValue")
    BID_VALUE("BidValue"),
    @XmlEnumValue("BidBoost")
    BID_BOOST("BidBoost");
    private final String value;

    BidOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidOption fromValue(String v) {
        for (BidOption c: BidOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
