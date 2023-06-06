
package com.microsoft.bingads.v13.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportRequestStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportRequestStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Pending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportRequestStatusType")
@XmlEnum
public enum ReportRequestStatusType {

    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Pending")
    PENDING("Pending");
    private final String value;

    ReportRequestStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportRequestStatusType fromValue(String v) {
        for (ReportRequestStatusType c: ReportRequestStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
