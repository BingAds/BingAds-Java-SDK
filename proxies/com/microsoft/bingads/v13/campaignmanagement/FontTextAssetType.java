
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FontTextAssetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FontTextAssetType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ShortHeadline"/>
 *     <enumeration value="LongHeadline"/>
 *     <enumeration value="Description"/>
 *     <enumeration value="CallToAction"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FontTextAssetType")
@XmlEnum
public enum FontTextAssetType {

    @XmlEnumValue("ShortHeadline")
    SHORT_HEADLINE("ShortHeadline"),
    @XmlEnumValue("LongHeadline")
    LONG_HEADLINE("LongHeadline"),
    @XmlEnumValue("Description")
    DESCRIPTION("Description"),
    @XmlEnumValue("CallToAction")
    CALL_TO_ACTION("CallToAction");
    private final String value;

    FontTextAssetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontTextAssetType fromValue(String v) {
        for (FontTextAssetType c: FontTextAssetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
