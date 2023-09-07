
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
 *         <element name="EligibleAccountIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
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
    "eligibleAccountIds"
})
@XmlRootElement(name = "CheckFeatureAdoptionCouponEligibilityResponse")
public class CheckFeatureAdoptionCouponEligibilityResponse {

    @XmlElement(name = "EligibleAccountIds", nillable = true)
    protected ArrayOflong eligibleAccountIds;

    /**
     * Gets the value of the eligibleAccountIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getEligibleAccountIds() {
        return eligibleAccountIds;
    }

    /**
     * Sets the value of the eligibleAccountIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setEligibleAccountIds(ArrayOflong value) {
        this.eligibleAccountIds = value;
    }

}
