
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Seed"/>
 *     &lt;enumeration value="SuggestionFromKeyword"/>
 *     &lt;enumeration value="SuggestionFromUrl"/>
 *     &lt;enumeration value="SuggestionFromCategory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SourceType", namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity.Common")
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
