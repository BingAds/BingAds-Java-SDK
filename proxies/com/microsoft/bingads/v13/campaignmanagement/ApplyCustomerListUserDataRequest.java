
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
 *         <element name="CustomerListUserData" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomerListUserData" minOccurs="0"/>
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
    "customerListUserData"
})
@XmlRootElement(name = "ApplyCustomerListUserDataRequest")
public class ApplyCustomerListUserDataRequest {

    @XmlElement(name = "CustomerListUserData", nillable = true)
    protected CustomerListUserData customerListUserData;

    /**
     * Gets the value of the customerListUserData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerListUserData }
     *     
     */
    public CustomerListUserData getCustomerListUserData() {
        return customerListUserData;
    }

    /**
     * Sets the value of the customerListUserData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerListUserData }
     *     
     */
    public void setCustomerListUserData(CustomerListUserData value) {
        this.customerListUserData = value;
    }

}
