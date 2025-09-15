
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributionModelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AttributionModelType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LastClick"/>
 *     <enumeration value="LastTouch"/>
 *     <enumeration value="DataDriven"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AttributionModelType")
@XmlEnum
public enum AttributionModelType {

    @XmlEnumValue("LastClick")
    LAST_CLICK("LastClick"),
    @XmlEnumValue("LastTouch")
    LAST_TOUCH("LastTouch"),
    @XmlEnumValue("DataDriven")
    DATA_DRIVEN("DataDriven");
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
