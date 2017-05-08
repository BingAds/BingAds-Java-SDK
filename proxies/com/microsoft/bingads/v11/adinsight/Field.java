
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Field">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOW"/>
 *     &lt;enumeration value="BidLandscape"/>
 *     &lt;enumeration value="BidSuggestion"/>
 *     &lt;enumeration value="EntityAuctionInsight"/>
 *     &lt;enumeration value="AggregatedAuctionInsight"/>
 *     &lt;enumeration value="AuctionInsightAvailableChildren"/>
 *     &lt;enumeration value="TopMover"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="KeywordId"/>
 *     &lt;enumeration value="TimeInterval"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Field")
@XmlEnum
public enum Field {

    UNKNOW("UNKNOW"),
    @XmlEnumValue("BidLandscape")
    BID_LANDSCAPE("BidLandscape"),
    @XmlEnumValue("BidSuggestion")
    BID_SUGGESTION("BidSuggestion"),
    @XmlEnumValue("EntityAuctionInsight")
    ENTITY_AUCTION_INSIGHT("EntityAuctionInsight"),
    @XmlEnumValue("AggregatedAuctionInsight")
    AGGREGATED_AUCTION_INSIGHT("AggregatedAuctionInsight"),
    @XmlEnumValue("AuctionInsightAvailableChildren")
    AUCTION_INSIGHT_AVAILABLE_CHILDREN("AuctionInsightAvailableChildren"),
    @XmlEnumValue("TopMover")
    TOP_MOVER("TopMover"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("KeywordId")
    KEYWORD_ID("KeywordId"),
    @XmlEnumValue("TimeInterval")
    TIME_INTERVAL("TimeInterval");
    private final String value;

    Field(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Field fromValue(String v) {
        for (Field c: Field.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
