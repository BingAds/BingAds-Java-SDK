
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebpageConditionOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="WebpageConditionOperator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Equals"/>
 *     <enumeration value="Contains"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "WebpageConditionOperator")
@XmlEnum
public enum WebpageConditionOperator {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("Contains")
    CONTAINS("Contains");
    private final String value;

    WebpageConditionOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebpageConditionOperator fromValue(String v) {
        for (WebpageConditionOperator c: WebpageConditionOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
