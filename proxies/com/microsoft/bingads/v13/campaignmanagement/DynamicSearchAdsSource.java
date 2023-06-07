
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicSearchAdsSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DynamicSearchAdsSource">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="All"/>
 *     <enumeration value="SystemIndex"/>
 *     <enumeration value="AdvertiserSuppliedUrls"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DynamicSearchAdsSource")
@XmlEnum
public enum DynamicSearchAdsSource {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("SystemIndex")
    SYSTEM_INDEX("SystemIndex"),
    @XmlEnumValue("AdvertiserSuppliedUrls")
    ADVERTISER_SUPPLIED_URLS("AdvertiserSuppliedUrls");
    private final String value;

    DynamicSearchAdsSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DynamicSearchAdsSource fromValue(String v) {
        for (DynamicSearchAdsSource c: DynamicSearchAdsSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
