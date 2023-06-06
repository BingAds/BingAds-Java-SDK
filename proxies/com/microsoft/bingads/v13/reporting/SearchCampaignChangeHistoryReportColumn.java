
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCampaignChangeHistoryReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SearchCampaignChangeHistoryReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DateTime"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="ChangedBy"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="AdTitle"/>
 *     <enumeration value="AdDescription"/>
 *     <enumeration value="DisplayUrl"/>
 *     <enumeration value="Keyword"/>
 *     <enumeration value="ItemChanged"/>
 *     <enumeration value="AttributeChanged"/>
 *     <enumeration value="HowChanged"/>
 *     <enumeration value="OldValue"/>
 *     <enumeration value="NewValue"/>
 *     <enumeration value="EntityName"/>
 *     <enumeration value="EntityId"/>
 *     <enumeration value="Tool"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
    NEW_VALUE("NewValue"),
    @XmlEnumValue("EntityName")
    ENTITY_NAME("EntityName"),
    @XmlEnumValue("EntityId")
    ENTITY_ID("EntityId"),
    @XmlEnumValue("Tool")
    TOOL("Tool");
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
