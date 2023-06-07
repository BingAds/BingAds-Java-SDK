
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerShare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomerShare">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CustomerAccountShares" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfCustomerAccountShare" minOccurs="0"/>
 *         <element name="OwnerCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerShare", propOrder = {
    "customerAccountShares",
    "ownerCustomerId"
})
public class CustomerShare {

    @XmlElement(name = "CustomerAccountShares", nillable = true)
    protected ArrayOfCustomerAccountShare customerAccountShares;
    @XmlElement(name = "OwnerCustomerId", nillable = true)
    protected Long ownerCustomerId;

    /**
     * Gets the value of the customerAccountShares property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomerAccountShare }
     *     
     */
    public ArrayOfCustomerAccountShare getCustomerAccountShares() {
        return customerAccountShares;
    }

    /**
     * Sets the value of the customerAccountShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomerAccountShare }
     *     
     */
    public void setCustomerAccountShares(ArrayOfCustomerAccountShare value) {
        this.customerAccountShares = value;
    }

    /**
     * Gets the value of the ownerCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnerCustomerId() {
        return ownerCustomerId;
    }

    /**
     * Sets the value of the ownerCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnerCustomerId(Long value) {
        this.ownerCustomerId = value;
    }

}
