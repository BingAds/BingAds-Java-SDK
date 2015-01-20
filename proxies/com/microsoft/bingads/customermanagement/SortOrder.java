
package com.microsoft.bingads.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortOrder.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortOrder">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ascending"/>
 *     &lt;enumeration value="Descending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortOrder", namespace = "https://bingads.microsoft.com/Customer/v9/Entities")
@XmlEnum
public enum SortOrder {

    @XmlEnumValue("Ascending")
    ASCENDING("Ascending"),
    @XmlEnumValue("Descending")
    DESCENDING("Descending");
    private final String value;

    SortOrder(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortOrder fromValue(String v) {
        for (SortOrder c: SortOrder.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
