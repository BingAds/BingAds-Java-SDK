
package com.microsoft.bingads.v12.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SelfServe"/>
 *     &lt;enumeration value="SelfServeTrusted"/>
 *     &lt;enumeration value="Premium"/>
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="Select"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceLevel", namespace = "https://bingads.microsoft.com/Customer/v12/Entities")
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
