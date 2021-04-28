
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
 *         &lt;element name="BillingDocuments" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfBillingDocument" minOccurs="0"/>
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
    "billingDocuments"
})
@XmlRootElement(name = "GetBillingDocumentsResponse")
public class GetBillingDocumentsResponse {

    @XmlElement(name = "BillingDocuments", nillable = true)
    protected ArrayOfBillingDocument billingDocuments;

    /**
     * Gets the value of the billingDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBillingDocument }
     *     
     */
    public ArrayOfBillingDocument getBillingDocuments() {
        return billingDocuments;
    }

    /**
     * Sets the value of the billingDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBillingDocument }
     *     
     */
    public void setBillingDocuments(ArrayOfBillingDocument value) {
        this.billingDocuments = value;
    }

}
