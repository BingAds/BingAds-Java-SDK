
package com.microsoft.bingads.v13.campaignmanagement;

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
 *         <element name="CustomerListAudience" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomerList" minOccurs="0"/>
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
    "customerListAudience"
})
@XmlRootElement(name = "ApplyCustomerListItemsRequest")
public class ApplyCustomerListItemsRequest {

    @XmlElement(name = "CustomerListAudience", nillable = true)
    protected CustomerList customerListAudience;

    /**
     * Gets the value of the customerListAudience property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerList }
     *     
     */
    public CustomerList getCustomerListAudience() {
        return customerListAudience;
    }

    /**
     * Sets the value of the customerListAudience property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerList }
     *     
     */
    public void setCustomerListAudience(CustomerList value) {
        this.customerListAudience = value;
    }

}
