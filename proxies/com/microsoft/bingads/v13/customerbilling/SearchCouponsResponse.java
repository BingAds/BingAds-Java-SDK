
package com.microsoft.bingads.v13.customerbilling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coupons" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfCoupon" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "coupons"
})
@XmlRootElement(name = "SearchCouponsResponse")
public class SearchCouponsResponse {

    @XmlElement(name = "Coupons", nillable = true)
    protected ArrayOfCoupon coupons;

    /**
     * Gets the value of the coupons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCoupon }
     *     
     */
    public ArrayOfCoupon getCoupons() {
        return coupons;
    }

    /**
     * Sets the value of the coupons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCoupon }
     *     
     */
    public void setCoupons(ArrayOfCoupon value) {
        this.coupons = value;
    }

}
