
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NormalForm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NormalForm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Conjunctive"/>
 *     &lt;enumeration value="Disjunctive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
