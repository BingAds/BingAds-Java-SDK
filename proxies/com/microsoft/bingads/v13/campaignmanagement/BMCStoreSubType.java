
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMCStoreSubType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BMCStoreSubType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CoOp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BMCStoreSubType")
@XmlEnum
public enum BMCStoreSubType {

    @XmlEnumValue("CoOp")
    CO_OP("CoOp");
    private final String value;

    BMCStoreSubType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BMCStoreSubType fromValue(String v) {
        for (BMCStoreSubType c: BMCStoreSubType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
