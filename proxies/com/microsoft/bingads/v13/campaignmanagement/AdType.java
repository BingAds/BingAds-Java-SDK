
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Text"/>
 *     <enumeration value="Image"/>
 *     <enumeration value="Product"/>
 *     <enumeration value="AppInstall"/>
 *     <enumeration value="ExpandedText"/>
 *     <enumeration value="DynamicSearch"/>
 *     <enumeration value="ResponsiveAd"/>
 *     <enumeration value="ResponsiveSearch"/>
 *     <enumeration value="Hotel"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdType")
@XmlEnum
public enum AdType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Product")
    PRODUCT("Product"),
    @XmlEnumValue("AppInstall")
    APP_INSTALL("AppInstall"),
    @XmlEnumValue("ExpandedText")
    EXPANDED_TEXT("ExpandedText"),
    @XmlEnumValue("DynamicSearch")
    DYNAMIC_SEARCH("DynamicSearch"),
    @XmlEnumValue("ResponsiveAd")
    RESPONSIVE_AD("ResponsiveAd"),
    @XmlEnumValue("ResponsiveSearch")
    RESPONSIVE_SEARCH("ResponsiveSearch"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel");
    private final String value;

    AdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdType fromValue(String v) {
        for (AdType c: AdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
