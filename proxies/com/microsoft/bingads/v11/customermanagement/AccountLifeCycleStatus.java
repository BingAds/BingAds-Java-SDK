
package com.microsoft.bingads.v11.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountLifeCycleStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountLifeCycleStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Draft"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="Pause"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Suspended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountLifeCycleStatus", namespace = "https://bingads.microsoft.com/Customer/v11/Entities")
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
