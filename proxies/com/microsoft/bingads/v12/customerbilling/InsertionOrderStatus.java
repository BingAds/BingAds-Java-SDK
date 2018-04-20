
package com.microsoft.bingads.v12.customerbilling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertionOrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InsertionOrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PendingUserReview"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Declined"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="Canceled"/>
 *     &lt;enumeration value="NotStarted"/>
 *     &lt;enumeration value="Exhausted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InsertionOrderStatus", namespace = "https://bingads.microsoft.com/Customer/v12/Entities")
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
    EXHAUSTED("Exhausted");
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
