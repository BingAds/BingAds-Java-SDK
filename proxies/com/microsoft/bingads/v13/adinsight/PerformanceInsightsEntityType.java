
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformanceInsightsEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PerformanceInsightsEntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="Campaign"/>
 *     &lt;enumeration value="AdGroup"/>
 *     &lt;enumeration value="Keyword"/>
 *     &lt;enumeration value="ProductGroup"/>
 *     &lt;enumeration value="SearchTerm"/>
 *     &lt;enumeration value="Website"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
