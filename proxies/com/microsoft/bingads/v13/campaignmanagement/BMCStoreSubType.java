
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMCStoreSubType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BMCStoreSubType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CoOp"/>
 *     <enumeration value="GlobalStore"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BMCStoreSubType")
@XmlEnum
public enum BMCStoreSubType {

    @XmlEnumValue("CoOp")
    CO_OP("CoOp"),
    @XmlEnumValue("GlobalStore")
    GLOBAL_STORE("GlobalStore");
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
