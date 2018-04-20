
package com.microsoft.bingads.v12.customerbilling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertionOrderPendingChangesStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InsertionOrderPendingChangesStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PendingUserReview"/>
 *     &lt;enumeration value="ApproveChanges"/>
 *     &lt;enumeration value="DeclineChanges"/>
 *     &lt;enumeration value="CancelChanges"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InsertionOrderPendingChangesStatus", namespace = "https://bingads.microsoft.com/Customer/v12/Entities")
@XmlEnum
public enum InsertionOrderPendingChangesStatus {

    @XmlEnumValue("PendingUserReview")
    PENDING_USER_REVIEW("PendingUserReview"),
    @XmlEnumValue("ApproveChanges")
    APPROVE_CHANGES("ApproveChanges"),
    @XmlEnumValue("DeclineChanges")
    DECLINE_CHANGES("DeclineChanges"),
    @XmlEnumValue("CancelChanges")
    CANCEL_CHANGES("CancelChanges");
    private final String value;

    InsertionOrderPendingChangesStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InsertionOrderPendingChangesStatus fromValue(String v) {
        for (InsertionOrderPendingChangesStatus c: InsertionOrderPendingChangesStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
