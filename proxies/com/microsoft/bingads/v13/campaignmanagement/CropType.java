
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CropType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CropType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ManualCrop"/>
 *     <enumeration value="CenterCrop"/>
 *     <enumeration value="SmartCrop"/>
 *     <enumeration value="Unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CropType")
@XmlEnum
public enum CropType {

    @XmlEnumValue("ManualCrop")
    MANUAL_CROP("ManualCrop"),
    @XmlEnumValue("CenterCrop")
    CENTER_CROP("CenterCrop"),
    @XmlEnumValue("SmartCrop")
    SMART_CROP("SmartCrop"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CropType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CropType fromValue(String v) {
        for (CropType c: CropType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
