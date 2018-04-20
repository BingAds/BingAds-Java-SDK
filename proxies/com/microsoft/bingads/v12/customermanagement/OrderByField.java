
package com.microsoft.bingads.v12.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderByField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderByField">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Id"/>
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="Number"/>
 *     &lt;enumeration value="LifeCycleStatus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderByField", namespace = "https://bingads.microsoft.com/Customer/v12/Entities")
@XmlEnum
public enum OrderByField {

    @XmlEnumValue("Id")
    ID("Id"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("Number")
    NUMBER("Number"),
    @XmlEnumValue("LifeCycleStatus")
    LIFE_CYCLE_STATUS("LifeCycleStatus");
    private final String value;

    OrderByField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderByField fromValue(String v) {
        for (OrderByField c: OrderByField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
