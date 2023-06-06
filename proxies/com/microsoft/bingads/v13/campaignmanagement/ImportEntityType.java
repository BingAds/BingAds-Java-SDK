
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportEntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Campaign"/>
 *     &lt;enumeration value="AdGroup"/>
 *     &lt;enumeration value="Ad"/>
 *     &lt;enumeration value="Keyword"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
