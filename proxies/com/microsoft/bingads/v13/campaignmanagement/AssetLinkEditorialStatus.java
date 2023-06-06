
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetLinkEditorialStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetLinkEditorialStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Active"/>
 *     <enumeration value="Disapproved"/>
 *     <enumeration value="Inactive"/>
 *     <enumeration value="ActiveLimited"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetLinkEditorialStatus")
@XmlEnum
public enum AssetLinkEditorialStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Disapproved")
    DISAPPROVED("Disapproved"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("ActiveLimited")
    ACTIVE_LIMITED("ActiveLimited");
    private final String value;

    AssetLinkEditorialStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssetLinkEditorialStatus fromValue(String v) {
        for (AssetLinkEditorialStatus c: AssetLinkEditorialStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
