
package com.microsoft.bingads.v10.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingModel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cpc"/>
 *     &lt;enumeration value="Cpm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PricingModel")
@XmlEnum
public enum PricingModel {

    @XmlEnumValue("Cpc")
    CPC("Cpc"),
    @XmlEnumValue("Cpm")
    CPM("Cpm");
    private final String value;

    PricingModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PricingModel fromValue(String v) {
        for (PricingModel c: PricingModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
