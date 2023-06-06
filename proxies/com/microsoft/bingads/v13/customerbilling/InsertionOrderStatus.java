
package com.microsoft.bingads.v13.customerbilling;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertionOrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InsertionOrderStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PendingUserReview"/>
 *     <enumeration value="Active"/>
 *     <enumeration value="Declined"/>
 *     <enumeration value="Expired"/>
 *     <enumeration value="Canceled"/>
 *     <enumeration value="NotStarted"/>
 *     <enumeration value="Exhausted"/>
 *     <enumeration value="Queued"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InsertionOrderStatus", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
@XmlEnum
public enum InsertionOrderStatus {

    @XmlEnumValue("PendingUserReview")
    PENDING_USER_REVIEW("PendingUserReview"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Declined")
    DECLINED("Declined"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("NotStarted")
    NOT_STARTED("NotStarted"),
    @XmlEnumValue("Exhausted")
    EXHAUSTED("Exhausted"),
    @XmlEnumValue("Queued")
    QUEUED("Queued");
    private final String value;

    InsertionOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InsertionOrderStatus fromValue(String v) {
        for (InsertionOrderStatus c: InsertionOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
