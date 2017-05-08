
package com.microsoft.bingads.v11.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCampaignChangeHistoryReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchCampaignChangeHistoryReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DateTime"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="ChangedBy"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="AdTitle"/>
 *     &lt;enumeration value="AdDescription"/>
 *     &lt;enumeration value="DisplayUrl"/>
 *     &lt;enumeration value="Keyword"/>
 *     &lt;enumeration value="ItemChanged"/>
 *     &lt;enumeration value="AttributeChanged"/>
 *     &lt;enumeration value="HowChanged"/>
 *     &lt;enumeration value="OldValue"/>
 *     &lt;enumeration value="NewValue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchCampaignChangeHistoryReportColumn")
@XmlEnum
public enum SearchCampaignChangeHistoryReportColumn {

    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("ChangedBy")
    CHANGED_BY("ChangedBy"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AdTitle")
    AD_TITLE("AdTitle"),
    @XmlEnumValue("AdDescription")
    AD_DESCRIPTION("AdDescription"),
    @XmlEnumValue("DisplayUrl")
    DISPLAY_URL("DisplayUrl"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("ItemChanged")
    ITEM_CHANGED("ItemChanged"),
    @XmlEnumValue("AttributeChanged")
    ATTRIBUTE_CHANGED("AttributeChanged"),
    @XmlEnumValue("HowChanged")
    HOW_CHANGED("HowChanged"),
    @XmlEnumValue("OldValue")
    OLD_VALUE("OldValue"),
    @XmlEnumValue("NewValue")
    NEW_VALUE("NewValue");
    private final String value;

    SearchCampaignChangeHistoryReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchCampaignChangeHistoryReportColumn fromValue(String v) {
        for (SearchCampaignChangeHistoryReportColumn c: SearchCampaignChangeHistoryReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
