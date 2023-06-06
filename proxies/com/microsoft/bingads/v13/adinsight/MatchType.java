
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MatchType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Exact"/>
 *     <enumeration value="Phrase"/>
 *     <enumeration value="Broad"/>
 *     <enumeration value="Aggregate"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
