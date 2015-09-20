
package com.microsoft.bingads.v10.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiddingModel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BiddingModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Keyword"/>
 *     &lt;enumeration value="SitePlacement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BiddingModel")
@XmlEnum
public enum BiddingModel {

    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("SitePlacement")
    SITE_PLACEMENT("SitePlacement");
    private final String value;

    BiddingModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BiddingModel fromValue(String v) {
        for (BiddingModel c: BiddingModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
