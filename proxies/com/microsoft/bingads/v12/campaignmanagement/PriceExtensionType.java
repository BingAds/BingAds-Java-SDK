
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceExtensionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceExtensionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Brands"/>
 *     &lt;enumeration value="Events"/>
 *     &lt;enumeration value="Locations"/>
 *     &lt;enumeration value="Neighborhoods"/>
 *     &lt;enumeration value="ProductCategories"/>
 *     &lt;enumeration value="ProductTiers"/>
 *     &lt;enumeration value="Services"/>
 *     &lt;enumeration value="ServiceCategories"/>
 *     &lt;enumeration value="ServiceTiers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceExtensionType")
@XmlEnum
public enum PriceExtensionType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Brands")
    BRANDS("Brands"),
    @XmlEnumValue("Events")
    EVENTS("Events"),
    @XmlEnumValue("Locations")
    LOCATIONS("Locations"),
    @XmlEnumValue("Neighborhoods")
    NEIGHBORHOODS("Neighborhoods"),
    @XmlEnumValue("ProductCategories")
    PRODUCT_CATEGORIES("ProductCategories"),
    @XmlEnumValue("ProductTiers")
    PRODUCT_TIERS("ProductTiers"),
    @XmlEnumValue("Services")
    SERVICES("Services"),
    @XmlEnumValue("ServiceCategories")
    SERVICE_CATEGORIES("ServiceCategories"),
    @XmlEnumValue("ServiceTiers")
    SERVICE_TIERS("ServiceTiers");
    private final String value;

    PriceExtensionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceExtensionType fromValue(String v) {
        for (PriceExtensionType c: PriceExtensionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
