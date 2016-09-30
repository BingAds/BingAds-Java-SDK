
package com.microsoft.bingads.v10.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebpageConditionOperand.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebpageConditionOperand">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Url"/>
 *     &lt;enumeration value="Category"/>
 *     &lt;enumeration value="PageTitle"/>
 *     &lt;enumeration value="PageContent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
    PAGE_CONTENT("PageContent");
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
