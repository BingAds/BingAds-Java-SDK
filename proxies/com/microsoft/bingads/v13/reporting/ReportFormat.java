
package com.microsoft.bingads.v13.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Csv"/>
 *     &lt;enumeration value="Tsv"/>
 *     &lt;enumeration value="Xml"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportFormat")
@XmlEnum
public enum ReportFormat {

    @XmlEnumValue("Csv")
    CSV("Csv"),
    @XmlEnumValue("Tsv")
    TSV("Tsv"),
    @XmlEnumValue("Xml")
    XML("Xml");
    private final String value;

    ReportFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportFormat fromValue(String v) {
        for (ReportFormat c: ReportFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
