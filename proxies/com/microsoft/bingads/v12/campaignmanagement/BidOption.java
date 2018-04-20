
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BidValue"/>
 *     &lt;enumeration value="BidBoost"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
