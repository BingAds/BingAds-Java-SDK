
package com.microsoft.bingads.campaignmanagement;

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
 *     &lt;enumeration value="Campaign"/>
 *     &lt;enumeration value="AdGroup"/>
 *     &lt;enumeration value="Target"/>
 *     &lt;enumeration value="Ad"/>
 *     &lt;enumeration value="Keyword"/>
 *     &lt;enumeration value="AdExtension"/>
 *     &lt;enumeration value="AdGroupCriterion"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityType")
@XmlEnum
public enum EntityType {

    @XmlEnumValue("Campaign")
    CAMPAIGN("Campaign"),
    @XmlEnumValue("AdGroup")
    AD_GROUP("AdGroup"),
    @XmlEnumValue("Target")
    TARGET("Target"),
    @XmlEnumValue("Ad")
    AD("Ad"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("AdExtension")
    AD_EXTENSION("AdExtension"),
    @XmlEnumValue("AdGroupCriterion")
    AD_GROUP_CRITERION("AdGroupCriterion");
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
