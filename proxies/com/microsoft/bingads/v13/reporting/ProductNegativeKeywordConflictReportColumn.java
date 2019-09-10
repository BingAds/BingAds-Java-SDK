
package com.microsoft.bingads.v13.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductNegativeKeywordConflictReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductNegativeKeywordConflictReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="AccountStatus"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="CampaignStatus"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="AdGroupStatus"/>
 *     &lt;enumeration value="MerchantProductId"/>
 *     &lt;enumeration value="Title"/>
 *     &lt;enumeration value="AdGroupCriterionId"/>
 *     &lt;enumeration value="ProductGroup"/>
 *     &lt;enumeration value="NegativeKeywordId"/>
 *     &lt;enumeration value="NegativeKeyword"/>
 *     &lt;enumeration value="NegativeKeywordListId"/>
 *     &lt;enumeration value="ConflictLevel"/>
 *     &lt;enumeration value="NegativeKeywordMatchType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
    NEGATIVE_KEYWORD_MATCH_TYPE("NegativeKeywordMatchType");
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
