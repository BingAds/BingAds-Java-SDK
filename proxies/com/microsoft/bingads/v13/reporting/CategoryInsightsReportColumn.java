
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryInsightsReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CategoryInsightsReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="L1Vertical"/>
 *     <enumeration value="L2Vertical"/>
 *     <enumeration value="L3Vertical"/>
 *     <enumeration value="WeekStartingMonday"/>
 *     <enumeration value="WoWSearches"/>
 *     <enumeration value="MoMSearches"/>
 *     <enumeration value="YoYLast1WeekSearches"/>
 *     <enumeration value="YoYLast4WeeksSearches"/>
 *     <enumeration value="SearchesIndexed"/>
 *     <enumeration value="SearchesPeakWeek"/>
 *     <enumeration value="WoWClicks"/>
 *     <enumeration value="MoMClicks"/>
 *     <enumeration value="YoYLast1WeekClicks"/>
 *     <enumeration value="ClicksIndexed"/>
 *     <enumeration value="ClicksPeakWeek"/>
 *     <enumeration value="YoYLast4WeeksClicks"/>
 *     <enumeration value="Country"/>
 *     <enumeration value="MarketplaceClickCoverage"/>
 *     <enumeration value="ProportionOfSpend"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CategoryInsightsReportColumn")
@XmlEnum
public enum CategoryInsightsReportColumn {

    @XmlEnumValue("L1Vertical")
    L_1_VERTICAL("L1Vertical"),
    @XmlEnumValue("L2Vertical")
    L_2_VERTICAL("L2Vertical"),
    @XmlEnumValue("L3Vertical")
    L_3_VERTICAL("L3Vertical"),
    @XmlEnumValue("WeekStartingMonday")
    WEEK_STARTING_MONDAY("WeekStartingMonday"),
    @XmlEnumValue("WoWSearches")
    WO_W_SEARCHES("WoWSearches"),
    @XmlEnumValue("MoMSearches")
    MO_M_SEARCHES("MoMSearches"),
    @XmlEnumValue("YoYLast1WeekSearches")
    YO_Y_LAST_1_WEEK_SEARCHES("YoYLast1WeekSearches"),
    @XmlEnumValue("YoYLast4WeeksSearches")
    YO_Y_LAST_4_WEEKS_SEARCHES("YoYLast4WeeksSearches"),
    @XmlEnumValue("SearchesIndexed")
    SEARCHES_INDEXED("SearchesIndexed"),
    @XmlEnumValue("SearchesPeakWeek")
    SEARCHES_PEAK_WEEK("SearchesPeakWeek"),
    @XmlEnumValue("WoWClicks")
    WO_W_CLICKS("WoWClicks"),
    @XmlEnumValue("MoMClicks")
    MO_M_CLICKS("MoMClicks"),
    @XmlEnumValue("YoYLast1WeekClicks")
    YO_Y_LAST_1_WEEK_CLICKS("YoYLast1WeekClicks"),
    @XmlEnumValue("ClicksIndexed")
    CLICKS_INDEXED("ClicksIndexed"),
    @XmlEnumValue("ClicksPeakWeek")
    CLICKS_PEAK_WEEK("ClicksPeakWeek"),
    @XmlEnumValue("YoYLast4WeeksClicks")
    YO_Y_LAST_4_WEEKS_CLICKS("YoYLast4WeeksClicks"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("MarketplaceClickCoverage")
    MARKETPLACE_CLICK_COVERAGE("MarketplaceClickCoverage"),
    @XmlEnumValue("ProportionOfSpend")
    PROPORTION_OF_SPEND("ProportionOfSpend");
    private final String value;

    CategoryInsightsReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryInsightsReportColumn fromValue(String v) {
        for (CategoryInsightsReportColumn c: CategoryInsightsReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
