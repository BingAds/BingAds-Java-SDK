
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
 *         <element name="BillingGroups" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfBillingGroup" minOccurs="0"/>
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
    "billingGroups"
})
@XmlRootElement(name = "GetBillingGroupsResponse")
public class GetBillingGroupsResponse {

    @XmlElement(name = "BillingGroups", nillable = true)
    protected ArrayOfBillingGroup billingGroups;

    /**
     * Gets the value of the billingGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBillingGroup }
     *     
     */
    public ArrayOfBillingGroup getBillingGroups() {
        return billingGroups;
    }

    /**
     * Sets the value of the billingGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBillingGroup }
     *     
     */
    public void setBillingGroups(ArrayOfBillingGroup value) {
        this.billingGroups = value;
    }

}
