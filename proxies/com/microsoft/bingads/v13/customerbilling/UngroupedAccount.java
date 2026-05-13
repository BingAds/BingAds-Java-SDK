
package com.microsoft.bingads.v13.customerbilling;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UngroupedAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UngroupedAccount">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PotentialBillingGroups" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfKeyValueEntityOflongstring" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UngroupedAccount", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "accountId",
    "accountNumber",
    "accountName",
    "potentialBillingGroups"
})
public class UngroupedAccount {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "AccountNumber", nillable = true)
    protected String accountNumber;
    @XmlElement(name = "AccountName", nillable = true)
    protected String accountName;
    @XmlElement(name = "PotentialBillingGroups", nillable = true)
    protected ArrayOfKeyValueEntityOflongstring potentialBillingGroups;

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
     * Gets the value of the potentialBillingGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueEntityOflongstring }
     *     
     */
    public ArrayOfKeyValueEntityOflongstring getPotentialBillingGroups() {
        return potentialBillingGroups;
    }

    /**
     * Sets the value of the potentialBillingGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueEntityOflongstring }
     *     
     */
    public void setPotentialBillingGroups(ArrayOfKeyValueEntityOflongstring value) {
        this.potentialBillingGroups = value;
    }

}
