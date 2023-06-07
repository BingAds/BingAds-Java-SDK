
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NetworkType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OwnedAndOperatedAndSyndicatedSearch"/>
 *     <enumeration value="OwnedAndOperatedOnly"/>
 *     <enumeration value="SyndicatedSearchOnly"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NetworkType")
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
