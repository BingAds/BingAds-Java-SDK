
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequencyCapTimeGranularity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FrequencyCapTimeGranularity">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HOUR"/>
 *     <enumeration value="DAY"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="MONTH"/>
 *     <enumeration value="LIFETIME"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FrequencyCapTimeGranularity")
@XmlEnum
public enum FrequencyCapTimeGranularity {

    HOUR,
    DAY,
    WEEK,
    MONTH,
    LIFETIME;

    public String value() {
        return name();
    }

    public static FrequencyCapTimeGranularity fromValue(String v) {
        return valueOf(v);
    }

}
