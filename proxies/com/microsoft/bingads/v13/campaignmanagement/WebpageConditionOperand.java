
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebpageConditionOperand.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="WebpageConditionOperand">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Url"/>
 *     <enumeration value="Category"/>
 *     <enumeration value="PageTitle"/>
 *     <enumeration value="PageContent"/>
 *     <enumeration value="CustomLabel"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "WebpageConditionOperand")
@XmlEnum
public enum WebpageConditionOperand {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Url")
    URL("Url"),
    @XmlEnumValue("Category")
    CATEGORY("Category"),
    @XmlEnumValue("PageTitle")
    PAGE_TITLE("PageTitle"),
    @XmlEnumValue("PageContent")
    PAGE_CONTENT("PageContent"),
    @XmlEnumValue("CustomLabel")
    CUSTOM_LABEL("CustomLabel");
    private final String value;

    WebpageConditionOperand(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebpageConditionOperand fromValue(String v) {
        for (WebpageConditionOperand c: WebpageConditionOperand.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
