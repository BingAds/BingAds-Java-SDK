
package com.microsoft.bingads.v13.customerbilling;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountCouponPairs" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfKeyValueEntityOflongstring" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountCouponPairs"
})
@XmlRootElement(name = "ClaimFeatureAdoptionCouponsRequest")
public class ClaimFeatureAdoptionCouponsRequest {

    @XmlElement(name = "AccountCouponPairs", nillable = true)
    protected ArrayOfKeyValueEntityOflongstring accountCouponPairs;

    /**
     * Gets the value of the accountCouponPairs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueEntityOflongstring }
     *     
     */
    public ArrayOfKeyValueEntityOflongstring getAccountCouponPairs() {
        return accountCouponPairs;
    }

    /**
     * Sets the value of the accountCouponPairs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueEntityOflongstring }
     *     
     */
    public void setAccountCouponPairs(ArrayOfKeyValueEntityOflongstring value) {
        this.accountCouponPairs = value;
    }

}
