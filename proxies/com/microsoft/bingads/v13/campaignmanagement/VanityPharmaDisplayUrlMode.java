
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VanityPharmaDisplayUrlMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="VanityPharmaDisplayUrlMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ManufacturerWebsiteUrl"/>
 *     <enumeration value="WebsiteDescription"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VanityPharmaDisplayUrlMode")
@XmlEnum
public enum VanityPharmaDisplayUrlMode {

    @XmlEnumValue("ManufacturerWebsiteUrl")
    MANUFACTURER_WEBSITE_URL("ManufacturerWebsiteUrl"),
    @XmlEnumValue("WebsiteDescription")
    WEBSITE_DESCRIPTION("WebsiteDescription");
    private final String value;

    VanityPharmaDisplayUrlMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VanityPharmaDisplayUrlMode fromValue(String v) {
        for (VanityPharmaDisplayUrlMode c: VanityPharmaDisplayUrlMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
