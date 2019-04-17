
package com.microsoft.bingads.v13.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductMatchCountReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductMatchCountReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CustomerId"/>
 *     &lt;enumeration value="CustomerName"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="ProductGroup"/>
 *     &lt;enumeration value="PartitionType"/>
 *     &lt;enumeration value="AdGroupCriterionId"/>
 *     &lt;enumeration value="MatchedProductsAtCampaign"/>
 *     &lt;enumeration value="MatchedProductsAtAdGroup"/>
 *     &lt;enumeration value="MatchedProductsAtProductGroup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
    MATCHED_PRODUCTS_AT_PRODUCT_GROUP("MatchedProductsAtProductGroup");
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
