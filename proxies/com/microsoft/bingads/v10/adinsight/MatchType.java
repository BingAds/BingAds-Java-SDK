
package com.microsoft.bingads.v10.adinsight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Exact"/>
 *     &lt;enumeration value="Phrase"/>
 *     &lt;enumeration value="Broad"/>
 *     &lt;enumeration value="Content"/>
 *     &lt;enumeration value="Aggregate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatchType")
@XmlEnum
public enum MatchType {

    @XmlEnumValue("Exact")
    EXACT("Exact"),
    @XmlEnumValue("Phrase")
    PHRASE("Phrase"),
    @XmlEnumValue("Broad")
    BROAD("Broad"),
    @XmlEnumValue("Content")
    CONTENT("Content"),
    @XmlEnumValue("Aggregate")
    AGGREGATE("Aggregate");
    private final String value;

    MatchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatchType fromValue(String v) {
        for (MatchType c: MatchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
