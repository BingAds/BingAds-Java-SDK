
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformanceInsightsEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PerformanceInsightsEntityType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Account"/>
 *     <enumeration value="Campaign"/>
 *     <enumeration value="AdGroup"/>
 *     <enumeration value="Keyword"/>
 *     <enumeration value="ProductGroup"/>
 *     <enumeration value="SearchTerm"/>
 *     <enumeration value="Website"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PerformanceInsightsEntityType")
@XmlEnum
public enum PerformanceInsightsEntityType {

    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Campaign")
    CAMPAIGN("Campaign"),
    @XmlEnumValue("AdGroup")
    AD_GROUP("AdGroup"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("ProductGroup")
    PRODUCT_GROUP("ProductGroup"),
    @XmlEnumValue("SearchTerm")
    SEARCH_TERM("SearchTerm"),
    @XmlEnumValue("Website")
    WEBSITE("Website");
    private final String value;

    PerformanceInsightsEntityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerformanceInsightsEntityType fromValue(String v) {
        for (PerformanceInsightsEntityType c: PerformanceInsightsEntityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
