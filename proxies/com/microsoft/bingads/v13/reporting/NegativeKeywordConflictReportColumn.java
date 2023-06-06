
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NegativeKeywordConflictReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NegativeKeywordConflictReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="Keyword"/>
 *     <enumeration value="KeywordId"/>
 *     <enumeration value="NegativeKeyword"/>
 *     <enumeration value="ConflictLevel"/>
 *     <enumeration value="BidMatchType"/>
 *     <enumeration value="NegativeKeywordListId"/>
 *     <enumeration value="NegativeKeywordList"/>
 *     <enumeration value="NegativeKeywordId"/>
 *     <enumeration value="NegativeKeywordMatchType"/>
 *     <enumeration value="AccountStatus"/>
 *     <enumeration value="CampaignStatus"/>
 *     <enumeration value="AdGroupStatus"/>
 *     <enumeration value="KeywordStatus"/>
 *     <enumeration value="ConflictType"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
    KEYWORD_STATUS("KeywordStatus"),
    @XmlEnumValue("ConflictType")
    CONFLICT_TYPE("ConflictType");
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
