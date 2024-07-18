
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImpressionBasedEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ImpressionBasedEntityType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="Campaign"/>
 *     <enumeration value="AdGroup"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ImpressionBasedEntityType")
@XmlEnum
public enum ImpressionBasedEntityType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Campaign")
    CAMPAIGN("Campaign"),
    @XmlEnumValue("AdGroup")
    AD_GROUP("AdGroup");
    private final String value;

    ImpressionBasedEntityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImpressionBasedEntityType fromValue(String v) {
        for (ImpressionBasedEntityType c: ImpressionBasedEntityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
