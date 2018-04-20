
package com.microsoft.bingads.v12.customermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountInfoWithCustomerData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountInfoWithCustomerData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountLifeCycleStatus" type="{https://bingads.microsoft.com/Customer/v12/Entities}AccountLifeCycleStatus" minOccurs="0"/>
 *         &lt;element name="PauseReason" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInfoWithCustomerData", namespace = "https://bingads.microsoft.com/Customer/v12/Entities", propOrder = {
    "customerId",
    "customerName",
    "accountId",
    "accountName",
    "accountNumber",
    "accountLifeCycleStatus",
    "pauseReason"
})
public class AccountInfoWithCustomerData {

    @XmlElement(name = "CustomerId", nillable = true)
    protected Long customerId;
    @XmlElement(name = "CustomerName", nillable = true)
    protected String customerName;
    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "AccountName", nillable = true)
    protected String accountName;
    @XmlElement(name = "AccountNumber", nillable = true)
    protected String accountNumber;
    @XmlElement(name = "AccountLifeCycleStatus")
    @XmlSchemaType(name = "string")
    protected AccountLifeCycleStatus accountLifeCycleStatus;
    @XmlElement(name = "PauseReason", nillable = true)
    @XmlSchemaType(name = "unsignedByte")
    protected Short pauseReason;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountLifeCycleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountLifeCycleStatus }
     *     
     */
    public AccountLifeCycleStatus getAccountLifeCycleStatus() {
        return accountLifeCycleStatus;
    }

    /**
     * Sets the value of the accountLifeCycleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLifeCycleStatus }
     *     
     */
    public void setAccountLifeCycleStatus(AccountLifeCycleStatus value) {
        this.accountLifeCycleStatus = value;
    }

    /**
     * Gets the value of the pauseReason property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPauseReason() {
        return pauseReason;
    }

    /**
     * Sets the value of the pauseReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPauseReason(Short value) {
        this.pauseReason = value;
    }

}
