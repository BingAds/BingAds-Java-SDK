
package com.microsoft.bingads.v12.adinsight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="Campaign"/>
 *     &lt;enumeration value="AdGroup"/>
 *     &lt;enumeration value="Keyword"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityType")
@XmlEnum
public enum EntityType {

    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Campaign")
    CAMPAIGN("Campaign"),
    @XmlEnumValue("AdGroup")
    AD_GROUP("AdGroup"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword");
    private final String value;

    EntityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityType fromValue(String v) {
        for (EntityType c: EntityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
