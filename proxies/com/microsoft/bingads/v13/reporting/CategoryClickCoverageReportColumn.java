
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryClickCoverageReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CategoryClickCoverageReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AccountName"/>
 *     <enumeration value="CustomerName"/>
 *     <enumeration value="L1Vertical"/>
 *     <enumeration value="L2Vertical"/>
 *     <enumeration value="L3Vertical"/>
 *     <enumeration value="WeekStartingMonday"/>
 *     <enumeration value="MarketplaceClickCoverage"/>
 *     <enumeration value="Country"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CategoryClickCoverageReportColumn")
@XmlEnum
public enum CategoryClickCoverageReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("CustomerName")
    CUSTOMER_NAME("CustomerName"),
    @XmlEnumValue("L1Vertical")
    L_1_VERTICAL("L1Vertical"),
    @XmlEnumValue("L2Vertical")
    L_2_VERTICAL("L2Vertical"),
    @XmlEnumValue("L3Vertical")
    L_3_VERTICAL("L3Vertical"),
    @XmlEnumValue("WeekStartingMonday")
    WEEK_STARTING_MONDAY("WeekStartingMonday"),
    @XmlEnumValue("MarketplaceClickCoverage")
    MARKETPLACE_CLICK_COVERAGE("MarketplaceClickCoverage"),
    @XmlEnumValue("Country")
    COUNTRY("Country");
    private final String value;

    CategoryClickCoverageReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryClickCoverageReportColumn fromValue(String v) {
        for (CategoryClickCoverageReportColumn c: CategoryClickCoverageReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
