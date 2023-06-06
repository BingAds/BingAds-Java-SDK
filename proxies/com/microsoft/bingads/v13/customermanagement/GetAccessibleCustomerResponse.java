
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
 *         &lt;element name="AccessibleCustomer" type="{https://bingads.microsoft.com/Customer/v13/Entities}Customer" minOccurs="0"/>
 *         &lt;element name="ValidFields" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "accessibleCustomer",
    "validFields"
})
@XmlRootElement(name = "GetAccessibleCustomerResponse")
public class GetAccessibleCustomerResponse {

    @XmlElement(name = "AccessibleCustomer", nillable = true)
    protected Customer accessibleCustomer;
    @XmlElement(name = "ValidFields")
    protected Integer validFields;

    /**
     * Gets the value of the accessibleCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getAccessibleCustomer() {
        return accessibleCustomer;
    }

    /**
     * Sets the value of the accessibleCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setAccessibleCustomer(Customer value) {
        this.accessibleCustomer = value;
    }

    /**
     * Gets the value of the validFields property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValidFields() {
        return validFields;
    }

    /**
     * Sets the value of the validFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValidFields(Integer value) {
        this.validFields = value;
    }

}
