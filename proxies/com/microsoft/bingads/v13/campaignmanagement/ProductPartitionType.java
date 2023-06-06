
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductPartitionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProductPartitionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Subdivision"/>
 *     <enumeration value="Unit"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProductPartitionType")
@XmlEnum
public enum ProductPartitionType {

    @XmlEnumValue("Subdivision")
    SUBDIVISION("Subdivision"),
    @XmlEnumValue("Unit")
    UNIT("Unit");
    private final String value;

    ProductPartitionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductPartitionType fromValue(String v) {
        for (ProductPartitionType c: ProductPartitionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
