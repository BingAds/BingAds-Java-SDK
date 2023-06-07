
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NormalForm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NormalForm">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Conjunctive"/>
 *     <enumeration value="Disjunctive"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NormalForm")
@XmlEnum
public enum NormalForm {

    @XmlEnumValue("Conjunctive")
    CONJUNCTIVE("Conjunctive"),
    @XmlEnumValue("Disjunctive")
    DISJUNCTIVE("Disjunctive");
    private final String value;

    NormalForm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NormalForm fromValue(String v) {
        for (NormalForm c: NormalForm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
