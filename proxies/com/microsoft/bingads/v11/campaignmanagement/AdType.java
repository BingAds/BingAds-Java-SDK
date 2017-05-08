
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Image"/>
 *     &lt;enumeration value="Product"/>
 *     &lt;enumeration value="AppInstall"/>
 *     &lt;enumeration value="ExpandedText"/>
 *     &lt;enumeration value="DynamicSearch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
    DYNAMIC_SEARCH("DynamicSearch");
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
