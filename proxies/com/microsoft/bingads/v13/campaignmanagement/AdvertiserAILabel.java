
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvertiserAILabel.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdvertiserAILabel">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NotSupportedForGivenRevision"/>
 *     <enumeration value="AIWithVisibleWatermark"/>
 *     <enumeration value="AIContent"/>
 *     <enumeration value="NoAIContent"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "AdvertiserAILabel")
@XmlEnum
public enum AdvertiserAILabel {

    @XmlEnumValue("NotSupportedForGivenRevision")
    NOT_SUPPORTED_FOR_GIVEN_REVISION("NotSupportedForGivenRevision"),
    @XmlEnumValue("AIWithVisibleWatermark")
    AI_WITH_VISIBLE_WATERMARK("AIWithVisibleWatermark"),
    @XmlEnumValue("AIContent")
    AI_CONTENT("AIContent"),
    @XmlEnumValue("NoAIContent")
    NO_AI_CONTENT("NoAIContent");
    private final String value;

    AdvertiserAILabel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdvertiserAILabel fromValue(String v) {
        for (AdvertiserAILabel c: AdvertiserAILabel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
