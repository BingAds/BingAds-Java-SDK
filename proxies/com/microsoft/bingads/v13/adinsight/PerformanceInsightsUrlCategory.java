
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformanceInsightsUrlCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PerformanceInsightsUrlCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Recommendation"/>
 *     &lt;enumeration value="Setting"/>
 *     &lt;enumeration value="Report"/>
 *     &lt;enumeration value="HelpDoc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
