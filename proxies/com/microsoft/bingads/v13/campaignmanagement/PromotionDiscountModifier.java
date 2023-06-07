
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionDiscountModifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PromotionDiscountModifier">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="UpTo"/>
 *     <enumeration value="None"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PromotionDiscountModifier")
@XmlEnum
public enum PromotionDiscountModifier {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("UpTo")
    UP_TO("UpTo"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    PromotionDiscountModifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionDiscountModifier fromValue(String v) {
        for (PromotionDiscountModifier c: PromotionDiscountModifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
