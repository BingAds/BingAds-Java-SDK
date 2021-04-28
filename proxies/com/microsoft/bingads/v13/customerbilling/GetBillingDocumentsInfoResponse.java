
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
 *         &lt;element name="BillingDocumentsInfo" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfBillingDocumentInfo" minOccurs="0"/>
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
    "billingDocumentsInfo"
})
@XmlRootElement(name = "GetBillingDocumentsInfoResponse")
public class GetBillingDocumentsInfoResponse {

    @XmlElement(name = "BillingDocumentsInfo", nillable = true)
    protected ArrayOfBillingDocumentInfo billingDocumentsInfo;

    /**
     * Gets the value of the billingDocumentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBillingDocumentInfo }
     *     
     */
    public ArrayOfBillingDocumentInfo getBillingDocumentsInfo() {
        return billingDocumentsInfo;
    }

    /**
     * Sets the value of the billingDocumentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBillingDocumentInfo }
     *     
     */
    public void setBillingDocumentsInfo(ArrayOfBillingDocumentInfo value) {
        this.billingDocumentsInfo = value;
    }

}
