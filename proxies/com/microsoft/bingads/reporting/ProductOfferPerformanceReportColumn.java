
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductOfferPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductOfferPerformanceReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="AdId"/>
 *     &lt;enumeration value="AdStatus"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CurrencyCode"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="MerchantProductId"/>
 *     &lt;enumeration value="SellerName"/>
 *     &lt;enumeration value="Impressions"/>
 *     &lt;enumeration value="Clicks"/>
 *     &lt;enumeration value="Ctr"/>
 *     &lt;enumeration value="AverageCpc"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="AverageCpm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductOfferPerformanceReportColumn")
@XmlEnum
public enum ProductOfferPerformanceReportColumn {

    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("AdStatus")
    AD_STATUS("AdStatus"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CurrencyCode")
    CURRENCY_CODE("CurrencyCode"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("MerchantProductId")
    MERCHANT_PRODUCT_ID("MerchantProductId"),
    @XmlEnumValue("SellerName")
    SELLER_NAME("SellerName"),
    @XmlEnumValue("Impressions")
    IMPRESSIONS("Impressions"),
    @XmlEnumValue("Clicks")
    CLICKS("Clicks"),
    @XmlEnumValue("Ctr")
    CTR("Ctr"),
    @XmlEnumValue("AverageCpc")
    AVERAGE_CPC("AverageCpc"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("AverageCpm")
    AVERAGE_CPM("AverageCpm");
    private final String value;

    ProductOfferPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductOfferPerformanceReportColumn fromValue(String v) {
        for (ProductOfferPerformanceReportColumn c: ProductOfferPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
