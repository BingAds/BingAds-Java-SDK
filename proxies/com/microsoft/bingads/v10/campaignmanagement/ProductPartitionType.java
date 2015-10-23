
package com.microsoft.bingads.v10.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductPartitionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductPartitionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Subdivision"/>
 *     &lt;enumeration value="Unit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
