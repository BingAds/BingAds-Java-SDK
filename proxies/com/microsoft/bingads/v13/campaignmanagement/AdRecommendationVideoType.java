
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRecommendationVideoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdRecommendationVideoType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OLV"/>
 *     <enumeration value="CTV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdRecommendationVideoType")
@XmlEnum
public enum AdRecommendationVideoType {

    OLV,
    CTV;

    public String value() {
        return name();
    }

    public static AdRecommendationVideoType fromValue(String v) {
        return valueOf(v);
    }

}
