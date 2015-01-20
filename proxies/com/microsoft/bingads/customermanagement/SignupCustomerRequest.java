
package com.microsoft.bingads.customermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Customer" type="{https://bingads.microsoft.com/Customer/v9/Entities}Customer" minOccurs="0"/>
 *         &lt;element name="Account" type="{https://bingads.microsoft.com/Customer/v9/Entities}Account" minOccurs="0"/>
 *         &lt;element name="ParentCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ApplicationScope" type="{https://bingads.microsoft.com/Customer/v9/Entities}ApplicationType" minOccurs="0"/>
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
    "customer",
    "account",
    "parentCustomerId",
    "applicationScope"
})
@XmlRootElement(name = "SignupCustomerRequest")
public class SignupCustomerRequest {

    @XmlElement(name = "Customer", nillable = true)
    protected Customer customer;
    @XmlElement(name = "Account", nillable = true)
    protected Account account;
    @XmlElement(name = "ParentCustomerId", nillable = true)
    protected Long parentCustomerId;
    @XmlElement(name = "ApplicationScope")
    @XmlSchemaType(name = "string")
    protected ApplicationType applicationScope;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the parentCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentCustomerId() {
        return parentCustomerId;
    }

    /**
     * Sets the value of the parentCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentCustomerId(Long value) {
        this.parentCustomerId = value;
    }

    /**
     * Gets the value of the applicationScope property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType }
     *     
     */
    public ApplicationType getApplicationScope() {
        return applicationScope;
    }

    /**
     * Sets the value of the applicationScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType }
     *     
     */
    public void setApplicationScope(ApplicationType value) {
        this.applicationScope = value;
    }

}
