
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
 *         <element name="AccountCouponPairs" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOflongstring" minOccurs="0"/>
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
    protected ArrayOfKeyValuePairOflongstring accountCouponPairs;

    /**
     * Gets the value of the accountCouponPairs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValuePairOflongstring }
     *     
     */
    public ArrayOfKeyValuePairOflongstring getAccountCouponPairs() {
        return accountCouponPairs;
    }

    /**
     * Sets the value of the accountCouponPairs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePairOflongstring }
     *     
     */
    public void setAccountCouponPairs(ArrayOfKeyValuePairOflongstring value) {
        this.accountCouponPairs = value;
    }

}
