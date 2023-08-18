
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductMatchCountReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProductMatchCountReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CustomerId"/>
 *     <enumeration value="CustomerName"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="AccountName"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="ProductGroup"/>
 *     <enumeration value="PartitionType"/>
 *     <enumeration value="AdGroupCriterionId"/>
 *     <enumeration value="MatchedProductsAtCampaign"/>
 *     <enumeration value="MatchedProductsAtAdGroup"/>
 *     <enumeration value="MatchedProductsAtProductGroup"/>
 *     <enumeration value="CampaignType"/>
 *     <enumeration value="AssetGroupId"/>
 *     <enumeration value="AssetGroupName"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProductMatchCountReportColumn")
@XmlEnum
public enum ProductMatchCountReportColumn {

    @XmlEnumValue("CustomerId")
    CUSTOMER_ID("CustomerId"),
    @XmlEnumValue("CustomerName")
    CUSTOMER_NAME("CustomerName"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("ProductGroup")
    PRODUCT_GROUP("ProductGroup"),
    @XmlEnumValue("PartitionType")
    PARTITION_TYPE("PartitionType"),
    @XmlEnumValue("AdGroupCriterionId")
    AD_GROUP_CRITERION_ID("AdGroupCriterionId"),
    @XmlEnumValue("MatchedProductsAtCampaign")
    MATCHED_PRODUCTS_AT_CAMPAIGN("MatchedProductsAtCampaign"),
    @XmlEnumValue("MatchedProductsAtAdGroup")
    MATCHED_PRODUCTS_AT_AD_GROUP("MatchedProductsAtAdGroup"),
    @XmlEnumValue("MatchedProductsAtProductGroup")
    MATCHED_PRODUCTS_AT_PRODUCT_GROUP("MatchedProductsAtProductGroup"),
    @XmlEnumValue("CampaignType")
    CAMPAIGN_TYPE("CampaignType"),
    @XmlEnumValue("AssetGroupId")
    ASSET_GROUP_ID("AssetGroupId"),
    @XmlEnumValue("AssetGroupName")
    ASSET_GROUP_NAME("AssetGroupName");
    private final String value;

    ProductMatchCountReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductMatchCountReportColumn fromValue(String v) {
        for (ProductMatchCountReportColumn c: ProductMatchCountReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
