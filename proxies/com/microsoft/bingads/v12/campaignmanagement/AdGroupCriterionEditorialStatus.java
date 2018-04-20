
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupCriterionEditorialStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroupCriterionEditorialStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Disapproved"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="ActiveLimited"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdGroupCriterionEditorialStatus")
@XmlEnum
public enum AdGroupCriterionEditorialStatus {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Disapproved")
    DISAPPROVED("Disapproved"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("ActiveLimited")
    ACTIVE_LIMITED("ActiveLimited");
    private final String value;

    AdGroupCriterionEditorialStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdGroupCriterionEditorialStatus fromValue(String v) {
        for (AdGroupCriterionEditorialStatus c: AdGroupCriterionEditorialStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
