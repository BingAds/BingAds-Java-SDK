
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
 *         <element name="FeatureId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="AccountIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
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
    "featureId",
    "accountIds"
})
@XmlRootElement(name = "CheckFeatureAdoptionCouponEligibilityRequest")
public class CheckFeatureAdoptionCouponEligibilityRequest {

    @XmlElement(name = "FeatureId")
    protected Integer featureId;
    @XmlElement(name = "AccountIds", nillable = true)
    protected ArrayOflong accountIds;

    /**
     * Gets the value of the featureId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeatureId() {
        return featureId;
    }

    /**
     * Sets the value of the featureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeatureId(Integer value) {
        this.featureId = value;
    }

    /**
     * Gets the value of the accountIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getAccountIds() {
        return accountIds;
    }

    /**
     * Sets the value of the accountIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setAccountIds(ArrayOflong value) {
        this.accountIds = value;
    }

}
