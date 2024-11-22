
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionValueRuleStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConversionValueRuleStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Active"/>
 *     <enumeration value="Paused"/>
 *     <enumeration value="Deleted"/>
 *     <enumeration value="Invalid"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConversionValueRuleStatus")
@XmlEnum
public enum ConversionValueRuleStatus {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Paused")
    PAUSED("Paused"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Invalid")
    INVALID("Invalid");
    private final String value;

    ConversionValueRuleStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionValueRuleStatus fromValue(String v) {
        for (ConversionValueRuleStatus c: ConversionValueRuleStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
