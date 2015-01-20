
package com.microsoft.bingads.optimizer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpportunityAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpportunityAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accept"/>
 *     &lt;enumeration value="Reject"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OpportunityAction")
@XmlEnum
public enum OpportunityAction {

    @XmlEnumValue("Accept")
    ACCEPT("Accept"),
    @XmlEnumValue("Reject")
    REJECT("Reject");
    private final String value;

    OpportunityAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpportunityAction fromValue(String v) {
        for (OpportunityAction c: OpportunityAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
