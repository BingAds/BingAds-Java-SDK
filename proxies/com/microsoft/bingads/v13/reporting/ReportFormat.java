
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReportFormat">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Csv"/>
 *     <enumeration value="Tsv"/>
 *     <enumeration value="Xml"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
