
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceGroupDimensionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AudienceGroupDimensionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Age"/>
 *     <enumeration value="Gender"/>
 *     <enumeration value="Audience"/>
 *     <enumeration value="Profile"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AudienceGroupDimensionType")
@XmlEnum
public enum AudienceGroupDimensionType {

    @XmlEnumValue("Age")
    AGE("Age"),
    @XmlEnumValue("Gender")
    GENDER("Gender"),
    @XmlEnumValue("Audience")
    AUDIENCE("Audience"),
    @XmlEnumValue("Profile")
    PROFILE("Profile");
    private final String value;

    AudienceGroupDimensionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudienceGroupDimensionType fromValue(String v) {
        for (AudienceGroupDimensionType c: AudienceGroupDimensionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
