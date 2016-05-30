
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NegativeKeywordConflictReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NegativeKeywordConflictReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="Keyword"/>
 *     &lt;enumeration value="KeywordId"/>
 *     &lt;enumeration value="NegativeKeyword"/>
 *     &lt;enumeration value="ConflictLevel"/>
 *     &lt;enumeration value="BidMatchType"/>
 *     &lt;enumeration value="NegativeKeywordListId"/>
 *     &lt;enumeration value="NegativeKeywordList"/>
 *     &lt;enumeration value="NegativeKeywordId"/>
 *     &lt;enumeration value="NegativeKeywordMatchType"/>
 *     &lt;enumeration value="AccountStatus"/>
 *     &lt;enumeration value="CampaignStatus"/>
 *     &lt;enumeration value="AdGroupStatus"/>
 *     &lt;enumeration value="KeywordStatus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NegativeKeywordConflictReportColumn")
@XmlEnum
public enum NegativeKeywordConflictReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("KeywordId")
    KEYWORD_ID("KeywordId"),
    @XmlEnumValue("NegativeKeyword")
    NEGATIVE_KEYWORD("NegativeKeyword"),
    @XmlEnumValue("ConflictLevel")
    CONFLICT_LEVEL("ConflictLevel"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("NegativeKeywordListId")
    NEGATIVE_KEYWORD_LIST_ID("NegativeKeywordListId"),
    @XmlEnumValue("NegativeKeywordList")
    NEGATIVE_KEYWORD_LIST("NegativeKeywordList"),
    @XmlEnumValue("NegativeKeywordId")
    NEGATIVE_KEYWORD_ID("NegativeKeywordId"),
    @XmlEnumValue("NegativeKeywordMatchType")
    NEGATIVE_KEYWORD_MATCH_TYPE("NegativeKeywordMatchType"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus"),
    @XmlEnumValue("KeywordStatus")
    KEYWORD_STATUS("KeywordStatus");
    private final String value;

    NegativeKeywordConflictReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NegativeKeywordConflictReportColumn fromValue(String v) {
        for (NegativeKeywordConflictReportColumn c: NegativeKeywordConflictReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
