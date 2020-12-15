
package com.microsoft.bingads.v13.customermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountTaxCertificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountTaxCertificate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxCertificateBlobContainerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxCertificates" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringbase64Binary" minOccurs="0"/>
 *         &lt;element name="Status" type="{https://bingads.microsoft.com/Customer/v13/Entities}TaxCertificateStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountTaxCertificate", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "taxCertificateBlobContainerName",
    "taxCertificates",
    "status"
})
public class AccountTaxCertificate {

    @XmlElement(name = "TaxCertificateBlobContainerName", nillable = true)
    protected String taxCertificateBlobContainerName;
    @XmlElement(name = "TaxCertificates", nillable = true)
    protected ArrayOfKeyValuePairOfstringbase64Binary taxCertificates;
    @XmlElement(name = "Status", nillable = true)
    @XmlSchemaType(name = "string")
    protected TaxCertificateStatus status;

    /**
     * Gets the value of the taxCertificateBlobContainerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCertificateBlobContainerName() {
        return taxCertificateBlobContainerName;
    }

    /**
     * Sets the value of the taxCertificateBlobContainerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCertificateBlobContainerName(String value) {
        this.taxCertificateBlobContainerName = value;
    }

    /**
     * Gets the value of the taxCertificates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValuePairOfstringbase64Binary }
     *     
     */
    public ArrayOfKeyValuePairOfstringbase64Binary getTaxCertificates() {
        return taxCertificates;
    }

    /**
     * Sets the value of the taxCertificates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePairOfstringbase64Binary }
     *     
     */
    public void setTaxCertificates(ArrayOfKeyValuePairOfstringbase64Binary value) {
        this.taxCertificates = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCertificateStatus }
     *     
     */
    public TaxCertificateStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCertificateStatus }
     *     
     */
    public void setStatus(TaxCertificateStatus value) {
        this.status = value;
    }

}
