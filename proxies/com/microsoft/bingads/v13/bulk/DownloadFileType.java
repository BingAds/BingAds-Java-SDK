
package com.microsoft.bingads.v13.bulk;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DownloadFileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DownloadFileType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Csv"/>
 *     <enumeration value="Tsv"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DownloadFileType")
@XmlEnum
public enum DownloadFileType {

    @XmlEnumValue("Csv")
    CSV("Csv"),
    @XmlEnumValue("Tsv")
    TSV("Tsv");
    private final String value;

    DownloadFileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DownloadFileType fromValue(String v) {
        for (DownloadFileType c: DownloadFileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
