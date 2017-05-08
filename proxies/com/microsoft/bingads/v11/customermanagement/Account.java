
package com.microsoft.bingads.v11.customermanagement;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountType" type="{https://bingads.microsoft.com/Customer/v11/Entities}AccountType" minOccurs="0"/>
 *         &lt;element name="BillToCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyType" type="{https://bingads.microsoft.com/Customer/v11/Entities}CurrencyType" minOccurs="0"/>
 *         &lt;element name="AccountFinancialStatus" type="{https://bingads.microsoft.com/Customer/v11/Entities}AccountFinancialStatus" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Language" type="{https://bingads.microsoft.com/Customer/v11/Entities}LanguageType" minOccurs="0"/>
 *         &lt;element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         &lt;element name="LastModifiedByUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PaymentMethodId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PaymentMethodType" type="{https://bingads.microsoft.com/Customer/v11/Entities}PaymentMethodType" minOccurs="0"/>
 *         &lt;element name="PrimaryUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AccountLifeCycleStatus" type="{https://bingads.microsoft.com/Customer/v11/Entities}AccountLifeCycleStatus" minOccurs="0"/>
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{https://bingads.microsoft.com/Customer/v11/Entities}TimeZoneType" minOccurs="0"/>
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
@XmlType(name = "Account", namespace = "https://bingads.microsoft.com/Customer/v11/Entities", propOrder = {
    "accountType",
    "billToCustomerId",
    "countryCode",
    "currencyType",
    "accountFinancialStatus",
    "id",
    "language",
    "forwardCompatibilityMap",
    "lastModifiedByUserId",
    "lastModifiedTime",
    "name",
    "number",
    "parentCustomerId",
    "paymentMethodId",
    "paymentMethodType",
    "primaryUserId",
    "accountLifeCycleStatus",
    "timeStamp",
    "timeZone",
    "pauseReason"
})
@XmlSeeAlso({
    AdvertiserAccount.class
})
public class Account {

    @XmlElement(name = "AccountType")
    @XmlSchemaType(name = "string")
    protected AccountType accountType;
    @XmlElement(name = "BillToCustomerId", nillable = true)
    protected Long billToCustomerId;
    @XmlElement(name = "CountryCode", nillable = true)
    protected String countryCode;
    @XmlElement(name = "CurrencyType", nillable = true)
    @XmlSchemaType(name = "string")
    protected CurrencyType currencyType;
    @XmlElement(name = "AccountFinancialStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected AccountFinancialStatus accountFinancialStatus;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "Language", nillable = true)
    @XmlSchemaType(name = "string")
    protected LanguageType language;
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "LastModifiedByUserId", nillable = true)
    protected Long lastModifiedByUserId;
    @XmlElement(name = "LastModifiedTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastModifiedTime;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Number", nillable = true)
    protected String number;
    @XmlElement(name = "ParentCustomerId")
    protected Long parentCustomerId;
    @XmlElement(name = "PaymentMethodId", nillable = true)
    protected Long paymentMethodId;
    @XmlElement(name = "PaymentMethodType", nillable = true)
    @XmlSchemaType(name = "string")
    protected PaymentMethodType paymentMethodType;
    @XmlElement(name = "PrimaryUserId", nillable = true)
    protected Long primaryUserId;
    @XmlElement(name = "AccountLifeCycleStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected AccountLifeCycleStatus accountLifeCycleStatus;
    @XmlElement(name = "TimeStamp", nillable = true)
    protected byte[] timeStamp;
    @XmlElement(name = "TimeZone", nillable = true)
    @XmlSchemaType(name = "string")
    protected TimeZoneType timeZone;
    @XmlElement(name = "PauseReason", nillable = true)
    @XmlSchemaType(name = "unsignedByte")
    protected Short pauseReason;

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountType(AccountType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the billToCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillToCustomerId() {
        return billToCustomerId;
    }

    /**
     * Sets the value of the billToCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillToCustomerId(Long value) {
        this.billToCustomerId = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the currencyType property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrencyType(CurrencyType value) {
        this.currencyType = value;
    }

    /**
     * Gets the value of the accountFinancialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountFinancialStatus }
     *     
     */
    public AccountFinancialStatus getAccountFinancialStatus() {
        return accountFinancialStatus;
    }

    /**
     * Sets the value of the accountFinancialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountFinancialStatus }
     *     
     */
    public void setAccountFinancialStatus(AccountFinancialStatus value) {
        this.accountFinancialStatus = value;
    }

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
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setLanguage(LanguageType value) {
        this.language = value;
    }

    /**
     * Gets the value of the forwardCompatibilityMap property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public ArrayOfKeyValuePairOfstringstring getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }

    /**
     * Sets the value of the forwardCompatibilityMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public void setForwardCompatibilityMap(ArrayOfKeyValuePairOfstringstring value) {
        this.forwardCompatibilityMap = value;
    }

    /**
     * Gets the value of the lastModifiedByUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastModifiedByUserId() {
        return lastModifiedByUserId;
    }

    /**
     * Sets the value of the lastModifiedByUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastModifiedByUserId(Long value) {
        this.lastModifiedByUserId = value;
    }

    /**
     * Gets the value of the lastModifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the lastModifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedTime(Calendar value) {
        this.lastModifiedTime = value;
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
     * Gets the value of the paymentMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentMethodId() {
        return paymentMethodId;
    }

    /**
     * Sets the value of the paymentMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentMethodId(Long value) {
        this.paymentMethodId = value;
    }

    /**
     * Gets the value of the paymentMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodType }
     *     
     */
    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    /**
     * Sets the value of the paymentMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodType }
     *     
     */
    public void setPaymentMethodType(PaymentMethodType value) {
        this.paymentMethodType = value;
    }

    /**
     * Gets the value of the primaryUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrimaryUserId() {
        return primaryUserId;
    }

    /**
     * Sets the value of the primaryUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrimaryUserId(Long value) {
        this.primaryUserId = value;
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
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTimeStamp(byte[] value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZoneType }
     *     
     */
    public TimeZoneType getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneType }
     *     
     */
    public void setTimeZone(TimeZoneType value) {
        this.timeZone = value;
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
