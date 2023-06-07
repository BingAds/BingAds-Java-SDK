
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Network.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Network">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OwnedAndOperatedAndSyndicatedSearch"/>
 *     <enumeration value="OwnedAndOperatedOnly"/>
 *     <enumeration value="SyndicatedSearchOnly"/>
 *     <enumeration value="InHousePromotion"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Network")
@XmlEnum
public enum Network {

    @XmlEnumValue("OwnedAndOperatedAndSyndicatedSearch")
    OWNED_AND_OPERATED_AND_SYNDICATED_SEARCH("OwnedAndOperatedAndSyndicatedSearch"),
    @XmlEnumValue("OwnedAndOperatedOnly")
    OWNED_AND_OPERATED_ONLY("OwnedAndOperatedOnly"),
    @XmlEnumValue("SyndicatedSearchOnly")
    SYNDICATED_SEARCH_ONLY("SyndicatedSearchOnly"),
    @XmlEnumValue("InHousePromotion")
    IN_HOUSE_PROMOTION("InHousePromotion");
    private final String value;

    Network(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Network fromValue(String v) {
        for (Network c: Network.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
