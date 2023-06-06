
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ImportEntityType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Campaign"/>
 *     <enumeration value="AdGroup"/>
 *     <enumeration value="Ad"/>
 *     <enumeration value="Keyword"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ImportEntityType")
@XmlEnum
public enum ImportEntityType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Campaign")
    CAMPAIGN("Campaign"),
    @XmlEnumValue("AdGroup")
    AD_GROUP("AdGroup"),
    @XmlEnumValue("Ad")
    AD("Ad"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword");
    private final String value;

    ImportEntityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportEntityType fromValue(String v) {
        for (ImportEntityType c: ImportEntityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
