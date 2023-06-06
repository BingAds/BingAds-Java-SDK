
package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCoupon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCoupon">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Coupon" type="{https://bingads.microsoft.com/Customer/v13/Entities}Coupon" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCoupon", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "coupons"
})
public class ArrayOfCoupon {

    @XmlElement(name = "Coupon", nillable = true)
    protected List<Coupon> coupons;

    /**
     * Gets the value of the coupons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the coupons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoupons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coupon }
     * 
     * 
     * @return
     *     The value of the coupons property.
     */
    public List<Coupon> getCoupons() {
        if (coupons == null) {
            coupons = new ArrayList<>();
        }
        return this.coupons;
    }

}
