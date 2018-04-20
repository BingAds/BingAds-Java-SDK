
package com.microsoft.bingads.v12.adinsight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OwnedAndOperatedAndSyndicatedSearch"/>
 *     &lt;enumeration value="OwnedAndOperatedOnly"/>
 *     &lt;enumeration value="SyndicatedSearchOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetworkType", namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V12.Entity.Common")
@XmlEnum
public enum NetworkType {

    @XmlEnumValue("OwnedAndOperatedAndSyndicatedSearch")
    OWNED_AND_OPERATED_AND_SYNDICATED_SEARCH("OwnedAndOperatedAndSyndicatedSearch"),
    @XmlEnumValue("OwnedAndOperatedOnly")
    OWNED_AND_OPERATED_ONLY("OwnedAndOperatedOnly"),
    @XmlEnumValue("SyndicatedSearchOnly")
    SYNDICATED_SEARCH_ONLY("SyndicatedSearchOnly");
    private final String value;

    NetworkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkType fromValue(String v) {
        for (NetworkType c: NetworkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
