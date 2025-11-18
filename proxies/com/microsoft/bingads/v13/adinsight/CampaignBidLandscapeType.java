
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignBidLandscapeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CampaignBidLandscapeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Ecpc_CampaignWideBid"/>
 *     <enumeration value="Ecpc_BidScaling"/>
 *     <enumeration value="TargetCpa"/>
 *     <enumeration value="TargetRoas"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CampaignBidLandscapeType")
@XmlEnum
public enum CampaignBidLandscapeType {

    @XmlEnumValue("Ecpc_CampaignWideBid")
    ECPC_CAMPAIGN_WIDE_BID("Ecpc_CampaignWideBid"),
    @XmlEnumValue("Ecpc_BidScaling")
    ECPC_BID_SCALING("Ecpc_BidScaling"),
    @XmlEnumValue("TargetCpa")
    TARGET_CPA("TargetCpa"),
    @XmlEnumValue("TargetRoas")
    TARGET_ROAS("TargetRoas");
    private final String value;

    CampaignBidLandscapeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignBidLandscapeType fromValue(String v) {
        for (CampaignBidLandscapeType c: CampaignBidLandscapeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
