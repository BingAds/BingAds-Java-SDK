
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceExtensionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceExtensionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Brands"/>
 *     <enumeration value="Events"/>
 *     <enumeration value="Locations"/>
 *     <enumeration value="Neighborhoods"/>
 *     <enumeration value="ProductCategories"/>
 *     <enumeration value="ProductTiers"/>
 *     <enumeration value="Services"/>
 *     <enumeration value="ServiceCategories"/>
 *     <enumeration value="ServiceTiers"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
