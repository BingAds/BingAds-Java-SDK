
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordIdeaAttribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeywordIdeaAttribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="Keyword"/>
 *     &lt;enumeration value="Source"/>
 *     &lt;enumeration value="MonthlySearchCounts"/>
 *     &lt;enumeration value="SuggestedBid"/>
 *     &lt;enumeration value="Competition"/>
 *     &lt;enumeration value="Relevance"/>
 *     &lt;enumeration value="AdImpressionShare"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KeywordIdeaAttribute", namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity.Common")
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
