
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Network.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Network">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OwnedAndOperatedAndSyndicatedSearch"/>
 *     &lt;enumeration value="OwnedAndOperatedOnly"/>
 *     &lt;enumeration value="SyndicatedSearchOnly"/>
 *     &lt;enumeration value="InHousePromotion"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
