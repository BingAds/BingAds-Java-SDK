
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderByField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OrderByField">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Id"/>
 *     <enumeration value="Name"/>
 *     <enumeration value="Number"/>
 *     <enumeration value="LifeCycleStatus"/>
 *     <enumeration value="CouponClassName"/>
 *     <enumeration value="CouponStartDate"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OrderByField", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
@XmlEnum
public enum OrderByField {

    @XmlEnumValue("Id")
    ID("Id"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("Number")
    NUMBER("Number"),
    @XmlEnumValue("LifeCycleStatus")
    LIFE_CYCLE_STATUS("LifeCycleStatus"),
    @XmlEnumValue("CouponClassName")
    COUPON_CLASS_NAME("CouponClassName"),
    @XmlEnumValue("CouponStartDate")
    COUPON_START_DATE("CouponStartDate");
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
