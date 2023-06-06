
package com.microsoft.bingads.v13.customerbilling;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertionOrderPendingChangesStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InsertionOrderPendingChangesStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PendingUserReview"/>
 *     <enumeration value="ApproveChanges"/>
 *     <enumeration value="DeclineChanges"/>
 *     <enumeration value="CancelChanges"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InsertionOrderPendingChangesStatus", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
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
