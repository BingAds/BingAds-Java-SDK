
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountLifeCycleStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountLifeCycleStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Draft"/>
 *     <enumeration value="Active"/>
 *     <enumeration value="Inactive"/>
 *     <enumeration value="Pause"/>
 *     <enumeration value="Pending"/>
 *     <enumeration value="Suspended"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountLifeCycleStatus", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
@XmlEnum
public enum AccountLifeCycleStatus {

    @XmlEnumValue("Draft")
    DRAFT("Draft"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Pause")
    PAUSE("Pause"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended");
    private final String value;

    AccountLifeCycleStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountLifeCycleStatus fromValue(String v) {
        for (AccountLifeCycleStatus c: AccountLifeCycleStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
