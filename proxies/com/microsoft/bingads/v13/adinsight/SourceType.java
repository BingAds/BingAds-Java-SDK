
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SourceType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Seed"/>
 *     <enumeration value="SuggestionFromKeyword"/>
 *     <enumeration value="SuggestionFromUrl"/>
 *     <enumeration value="SuggestionFromCategory"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SourceType")
@XmlEnum
public enum SourceType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Seed")
    SEED("Seed"),
    @XmlEnumValue("SuggestionFromKeyword")
    SUGGESTION_FROM_KEYWORD("SuggestionFromKeyword"),
    @XmlEnumValue("SuggestionFromUrl")
    SUGGESTION_FROM_URL("SuggestionFromUrl"),
    @XmlEnumValue("SuggestionFromCategory")
    SUGGESTION_FROM_CATEGORY("SuggestionFromCategory");
    private final String value;

    SourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SourceType fromValue(String v) {
        for (SourceType c: SourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
