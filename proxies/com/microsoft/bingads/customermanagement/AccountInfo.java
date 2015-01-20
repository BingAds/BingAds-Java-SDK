
package com.microsoft.bingads.customermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountLifeCycleStatus" type="{https://bingads.microsoft.com/Customer/v9/Entities}AccountLifeCycleStatus" minOccurs="0"/>
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
@XmlType(name = "AccountInfo", namespace = "https://bingads.microsoft.com/Customer/v9/Entities", propOrder = {
    "id",
    "name",
    "number",
    "accountLifeCycleStatus",
    "pauseReason"
})
public class AccountInfo {

    @XmlElement(name = "Id")
    protected Long id;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Number", nillable = true)
    protected String number;
    @XmlElement(name = "AccountLifeCycleStatus")
    @XmlSchemaType(name = "string")
    protected AccountLifeCycleStatus accountLifeCycleStatus;
    @XmlElement(name = "PauseReason", nillable = true)
    @XmlSchemaType(name = "unsignedByte")
    protected Short pauseReason;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
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
