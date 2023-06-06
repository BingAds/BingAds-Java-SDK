
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributionModelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributionModelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LastClick"/>
 *     &lt;enumeration value="LastTouch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttributionModelType")
@XmlEnum
public enum AttributionModelType {

    @XmlEnumValue("LastClick")
    LAST_CLICK("LastClick"),
    @XmlEnumValue("LastTouch")
    LAST_TOUCH("LastTouch");
    private final String value;

    AttributionModelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttributionModelType fromValue(String v) {
        for (AttributionModelType c: AttributionModelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
