
package com.microsoft.bingads.v11.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportLanguage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportLanguage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="English"/>
 *     &lt;enumeration value="French"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportLanguage")
@XmlEnum
public enum ReportLanguage {

    @XmlEnumValue("English")
    ENGLISH("English"),
    @XmlEnumValue("French")
    FRENCH("French");
    private final String value;

    ReportLanguage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportLanguage fromValue(String v) {
        for (ReportLanguage c: ReportLanguage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
