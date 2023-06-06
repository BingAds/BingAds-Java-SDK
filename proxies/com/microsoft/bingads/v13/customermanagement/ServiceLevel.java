
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ServiceLevel">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SelfServe"/>
 *     <enumeration value="SelfServeTrusted"/>
 *     <enumeration value="Premium"/>
 *     <enumeration value="Internal"/>
 *     <enumeration value="Select"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ServiceLevel", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
@XmlEnum
public enum ServiceLevel {

    @XmlEnumValue("SelfServe")
    SELF_SERVE("SelfServe"),
    @XmlEnumValue("SelfServeTrusted")
    SELF_SERVE_TRUSTED("SelfServeTrusted"),
    @XmlEnumValue("Premium")
    PREMIUM("Premium"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("Select")
    SELECT("Select");
    private final String value;

    ServiceLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceLevel fromValue(String v) {
        for (ServiceLevel c: ServiceLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
