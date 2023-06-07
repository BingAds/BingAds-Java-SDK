
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformanceInsightsUrlCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PerformanceInsightsUrlCategory">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Recommendation"/>
 *     <enumeration value="Setting"/>
 *     <enumeration value="Report"/>
 *     <enumeration value="HelpDoc"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PerformanceInsightsUrlCategory")
@XmlEnum
public enum PerformanceInsightsUrlCategory {

    @XmlEnumValue("Recommendation")
    RECOMMENDATION("Recommendation"),
    @XmlEnumValue("Setting")
    SETTING("Setting"),
    @XmlEnumValue("Report")
    REPORT("Report"),
    @XmlEnumValue("HelpDoc")
    HELP_DOC("HelpDoc");
    private final String value;

    PerformanceInsightsUrlCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerformanceInsightsUrlCategory fromValue(String v) {
        for (PerformanceInsightsUrlCategory c: PerformanceInsightsUrlCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
