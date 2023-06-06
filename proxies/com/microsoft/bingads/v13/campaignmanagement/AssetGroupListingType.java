
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetGroupListingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetGroupListingType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Subdivision"/>
 *     <enumeration value="Unit"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetGroupListingType")
@XmlEnum
public enum AssetGroupListingType {

    @XmlEnumValue("Subdivision")
    SUBDIVISION("Subdivision"),
    @XmlEnumValue("Unit")
    UNIT("Unit");
    private final String value;

    AssetGroupListingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssetGroupListingType fromValue(String v) {
        for (AssetGroupListingType c: AssetGroupListingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
