
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductNegativeKeywordConflictReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProductNegativeKeywordConflictReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="AccountStatus"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="CampaignStatus"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="AdGroupStatus"/>
 *     <enumeration value="MerchantProductId"/>
 *     <enumeration value="Title"/>
 *     <enumeration value="AdGroupCriterionId"/>
 *     <enumeration value="ProductGroup"/>
 *     <enumeration value="NegativeKeywordId"/>
 *     <enumeration value="NegativeKeyword"/>
 *     <enumeration value="NegativeKeywordListId"/>
 *     <enumeration value="ConflictLevel"/>
 *     <enumeration value="NegativeKeywordMatchType"/>
 *     <enumeration value="CampaignType"/>
 *     <enumeration value="AssetGroupId"/>
 *     <enumeration value="AssetGroupName"/>
 *     <enumeration value="AssetGroupStatus"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProductNegativeKeywordConflictReportColumn")
@XmlEnum
public enum ProductNegativeKeywordConflictReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus"),
    @XmlEnumValue("MerchantProductId")
    MERCHANT_PRODUCT_ID("MerchantProductId"),
    @XmlEnumValue("Title")
    TITLE("Title"),
    @XmlEnumValue("AdGroupCriterionId")
    AD_GROUP_CRITERION_ID("AdGroupCriterionId"),
    @XmlEnumValue("ProductGroup")
    PRODUCT_GROUP("ProductGroup"),
    @XmlEnumValue("NegativeKeywordId")
    NEGATIVE_KEYWORD_ID("NegativeKeywordId"),
    @XmlEnumValue("NegativeKeyword")
    NEGATIVE_KEYWORD("NegativeKeyword"),
    @XmlEnumValue("NegativeKeywordListId")
    NEGATIVE_KEYWORD_LIST_ID("NegativeKeywordListId"),
    @XmlEnumValue("ConflictLevel")
    CONFLICT_LEVEL("ConflictLevel"),
    @XmlEnumValue("NegativeKeywordMatchType")
    NEGATIVE_KEYWORD_MATCH_TYPE("NegativeKeywordMatchType"),
    @XmlEnumValue("CampaignType")
    CAMPAIGN_TYPE("CampaignType"),
    @XmlEnumValue("AssetGroupId")
    ASSET_GROUP_ID("AssetGroupId"),
    @XmlEnumValue("AssetGroupName")
    ASSET_GROUP_NAME("AssetGroupName"),
    @XmlEnumValue("AssetGroupStatus")
    ASSET_GROUP_STATUS("AssetGroupStatus");
    private final String value;

    ProductNegativeKeywordConflictReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductNegativeKeywordConflictReportColumn fromValue(String v) {
        for (ProductNegativeKeywordConflictReportColumn c: ProductNegativeKeywordConflictReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
