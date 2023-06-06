
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionDiscountModifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionDiscountModifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="UpTo"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
