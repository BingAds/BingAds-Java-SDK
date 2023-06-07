
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordIdeaAttribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="KeywordIdeaAttribute">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="Keyword"/>
 *     <enumeration value="Source"/>
 *     <enumeration value="MonthlySearchCounts"/>
 *     <enumeration value="SuggestedBid"/>
 *     <enumeration value="Competition"/>
 *     <enumeration value="Relevance"/>
 *     <enumeration value="AdImpressionShare"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "KeywordIdeaAttribute")
@XmlEnum
public enum KeywordIdeaAttribute {

    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("Source")
    SOURCE("Source"),
    @XmlEnumValue("MonthlySearchCounts")
    MONTHLY_SEARCH_COUNTS("MonthlySearchCounts"),
    @XmlEnumValue("SuggestedBid")
    SUGGESTED_BID("SuggestedBid"),
    @XmlEnumValue("Competition")
    COMPETITION("Competition"),
    @XmlEnumValue("Relevance")
    RELEVANCE("Relevance"),
    @XmlEnumValue("AdImpressionShare")
    AD_IMPRESSION_SHARE("AdImpressionShare");
    private final String value;

    KeywordIdeaAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeywordIdeaAttribute fromValue(String v) {
        for (KeywordIdeaAttribute c: KeywordIdeaAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
