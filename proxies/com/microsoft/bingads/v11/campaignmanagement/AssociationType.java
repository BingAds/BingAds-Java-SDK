
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssociationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Campaign"/>
 *     &lt;enumeration value="AdGroup"/>
 *     &lt;enumeration value="Account"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssociationType")
@XmlEnum
public enum AssociationType {

    @XmlEnumValue("Campaign")
    CAMPAIGN("Campaign"),
    @XmlEnumValue("AdGroup")
    AD_GROUP("AdGroup"),
    @XmlEnumValue("Account")
    ACCOUNT("Account");
    private final String value;

    AssociationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssociationType fromValue(String v) {
        for (AssociationType c: AssociationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
