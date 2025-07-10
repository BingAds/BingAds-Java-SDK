
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelQueryInsightReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TravelQueryInsightReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SearchQuery"/>
 *     <enumeration value="Country"/>
 *     <enumeration value="Region"/>
 *     <enumeration value="MetroArea"/>
 *     <enumeration value="City"/>
 *     <enumeration value="PostalCode"/>
 *     <enumeration value="L1Vertical"/>
 *     <enumeration value="L2Vertical"/>
 *     <enumeration value="L3Vertical"/>
 *     <enumeration value="POSCountry"/>
 *     <enumeration value="POSRegion"/>
 *     <enumeration value="POSCity"/>
 *     <enumeration value="BrandImpressions"/>
 *     <enumeration value="BrandClicks"/>
 *     <enumeration value="BrandSpend"/>
 *     <enumeration value="MSAImpressions"/>
 *     <enumeration value="MSAClicks"/>
 *     <enumeration value="MSASpend"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TravelQueryInsightReportColumn")
@XmlEnum
public enum TravelQueryInsightReportColumn {

    @XmlEnumValue("SearchQuery")
    SEARCH_QUERY("SearchQuery"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("Region")
    REGION("Region"),
    @XmlEnumValue("MetroArea")
    METRO_AREA("MetroArea"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("PostalCode")
    POSTAL_CODE("PostalCode"),
    @XmlEnumValue("L1Vertical")
    L_1_VERTICAL("L1Vertical"),
    @XmlEnumValue("L2Vertical")
    L_2_VERTICAL("L2Vertical"),
    @XmlEnumValue("L3Vertical")
    L_3_VERTICAL("L3Vertical"),
    @XmlEnumValue("POSCountry")
    POS_COUNTRY("POSCountry"),
    @XmlEnumValue("POSRegion")
    POS_REGION("POSRegion"),
    @XmlEnumValue("POSCity")
    POS_CITY("POSCity"),
    @XmlEnumValue("BrandImpressions")
    BRAND_IMPRESSIONS("BrandImpressions"),
    @XmlEnumValue("BrandClicks")
    BRAND_CLICKS("BrandClicks"),
    @XmlEnumValue("BrandSpend")
    BRAND_SPEND("BrandSpend"),
    @XmlEnumValue("MSAImpressions")
    MSA_IMPRESSIONS("MSAImpressions"),
    @XmlEnumValue("MSAClicks")
    MSA_CLICKS("MSAClicks"),
    @XmlEnumValue("MSASpend")
    MSA_SPEND("MSASpend");
    private final String value;

    TravelQueryInsightReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelQueryInsightReportColumn fromValue(String v) {
        for (TravelQueryInsightReportColumn c: TravelQueryInsightReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
