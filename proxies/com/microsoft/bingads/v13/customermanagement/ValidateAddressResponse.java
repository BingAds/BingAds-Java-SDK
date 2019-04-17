
package com.microsoft.bingads.v13.customermanagement;

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
 *         &lt;element name="OriginalAddress" type="{https://bingads.microsoft.com/Customer/v13/Entities}Address" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuggestedAddresses" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfAddress" minOccurs="0"/>
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
    "originalAddress",
    "status",
    "suggestedAddresses"
})
@XmlRootElement(name = "ValidateAddressResponse")
public class ValidateAddressResponse {

    @XmlElement(name = "OriginalAddress", nillable = true)
    protected Address originalAddress;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "SuggestedAddresses", nillable = true)
    protected ArrayOfAddress suggestedAddresses;

    /**
     * Gets the value of the originalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getOriginalAddress() {
        return originalAddress;
    }

    /**
     * Sets the value of the originalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setOriginalAddress(Address value) {
        this.originalAddress = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the suggestedAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddress }
     *     
     */
    public ArrayOfAddress getSuggestedAddresses() {
        return suggestedAddresses;
    }

    /**
     * Sets the value of the suggestedAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddress }
     *     
     */
    public void setSuggestedAddresses(ArrayOfAddress value) {
        this.suggestedAddresses = value;
    }

}
