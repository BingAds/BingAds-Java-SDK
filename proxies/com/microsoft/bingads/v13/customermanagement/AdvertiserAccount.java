
package com.microsoft.bingads.v13.customermanagement;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AdvertiserAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvertiserAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillToCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{https://bingads.microsoft.com/Customer/v13/Entities}CurrencyCode" minOccurs="0"/>
 *         &lt;element name="AccountFinancialStatus" type="{https://bingads.microsoft.com/Customer/v13/Entities}AccountFinancialStatus" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Language" type="{https://bingads.microsoft.com/Customer/v13/Entities}LanguageType" minOccurs="0"/>
 *         &lt;element name="LastModifiedByUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PaymentMethodId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PaymentMethodType" type="{https://bingads.microsoft.com/Customer/v13/Entities}PaymentMethodType" minOccurs="0"/>
 *         &lt;element name="PrimaryUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AccountLifeCycleStatus" type="{https://bingads.microsoft.com/Customer/v13/Entities}AccountLifeCycleStatus" minOccurs="0"/>
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{https://bingads.microsoft.com/Customer/v13/Entities}TimeZoneType" minOccurs="0"/>
 *         &lt;element name="PauseReason" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         &lt;element name="LinkedAgencies" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfCustomerInfo" minOccurs="0"/>
 *         &lt;element name="SalesHouseCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TaxInformation" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         &lt;element name="BackUpPaymentInstrumentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BillingThresholdAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BusinessAddress" type="{https://bingads.microsoft.com/Customer/v13/Entities}Address" minOccurs="0"/>
 *         &lt;element name="AutoTagType" type="{https://bingads.microsoft.com/Customer/v13/Entities}AutoTagType" minOccurs="0"/>
 *         &lt;element name="SoldToPaymentInstrumentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TaxCertificate" type="{https://bingads.microsoft.com/Customer/v13/Entities}AccountTaxCertificate" minOccurs="0"/>
 *         &lt;element name="AccountMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvertiserAccount", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "billToCustomerId",
    "currencyCode",
    "accountFinancialStatus",
    "id",
    "language",
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
    "pauseReason",
    "forwardCompatibilityMap",
    "linkedAgencies",
    "salesHouseCustomerId",
    "taxInformation",
    "backUpPaymentInstrumentId",
    "billingThresholdAmount",
    "businessAddress",
    "autoTagType",
    "soldToPaymentInstrumentId",
    "taxCertificate",
    "accountMode"
})
public class AdvertiserAccount {

    @XmlElement(name = "BillToCustomerId", nillable = true)
    protected Long billToCustomerId;
    @XmlElement(name = "CurrencyCode", nillable = true)
    @XmlSchemaType(name = "string")
    protected CurrencyCode currencyCode;
    @XmlElement(name = "AccountFinancialStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected AccountFinancialStatus accountFinancialStatus;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "Language", nillable = true)
    @XmlSchemaType(name = "string")
    protected LanguageType language;
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
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "LinkedAgencies", nillable = true)
    protected ArrayOfCustomerInfo linkedAgencies;
    @XmlElement(name = "SalesHouseCustomerId", nillable = true)
    protected Long salesHouseCustomerId;
    @XmlElement(name = "TaxInformation", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring taxInformation;
    @XmlElement(name = "BackUpPaymentInstrumentId", nillable = true)
    protected Long backUpPaymentInstrumentId;
    @XmlElement(name = "BillingThresholdAmount", nillable = true)
    protected BigDecimal billingThresholdAmount;
    @XmlElement(name = "BusinessAddress", nillable = true)
    protected Address businessAddress;
    @XmlElement(name = "AutoTagType", nillable = true)
    @XmlSchemaType(name = "string")
    protected AutoTagType autoTagType;
    @XmlElement(name = "SoldToPaymentInstrumentId", nillable = true)
    protected Long soldToPaymentInstrumentId;
    @XmlElement(name = "TaxCertificate", nillable = true)
    protected AccountTaxCertificate taxCertificate;
    @XmlElement(name = "AccountMode", nillable = true)
    protected String accountMode;

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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrencyCode(CurrencyCode value) {
        this.currencyCode = value;
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
     * Gets the value of the linkedAgencies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomerInfo }
     *     
     */
    public ArrayOfCustomerInfo getLinkedAgencies() {
        return linkedAgencies;
    }

    /**
     * Sets the value of the linkedAgencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomerInfo }
     *     
     */
    public void setLinkedAgencies(ArrayOfCustomerInfo value) {
        this.linkedAgencies = value;
    }

    /**
     * Gets the value of the salesHouseCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesHouseCustomerId() {
        return salesHouseCustomerId;
    }

    /**
     * Sets the value of the salesHouseCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesHouseCustomerId(Long value) {
        this.salesHouseCustomerId = value;
    }

    /**
     * Gets the value of the taxInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public ArrayOfKeyValuePairOfstringstring getTaxInformation() {
        return taxInformation;
    }

    /**
     * Sets the value of the taxInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public void setTaxInformation(ArrayOfKeyValuePairOfstringstring value) {
        this.taxInformation = value;
    }

    /**
     * Gets the value of the backUpPaymentInstrumentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBackUpPaymentInstrumentId() {
        return backUpPaymentInstrumentId;
    }

    /**
     * Sets the value of the backUpPaymentInstrumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBackUpPaymentInstrumentId(Long value) {
        this.backUpPaymentInstrumentId = value;
    }

    /**
     * Gets the value of the billingThresholdAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillingThresholdAmount() {
        return billingThresholdAmount;
    }

    /**
     * Sets the value of the billingThresholdAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillingThresholdAmount(BigDecimal value) {
        this.billingThresholdAmount = value;
    }

    /**
     * Gets the value of the businessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the value of the businessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setBusinessAddress(Address value) {
        this.businessAddress = value;
    }

    /**
     * Gets the value of the autoTagType property.
     * 
     * @return
     *     possible object is
     *     {@link AutoTagType }
     *     
     */
    public AutoTagType getAutoTagType() {
        return autoTagType;
    }

    /**
     * Sets the value of the autoTagType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoTagType }
     *     
     */
    public void setAutoTagType(AutoTagType value) {
        this.autoTagType = value;
    }

    /**
     * Gets the value of the soldToPaymentInstrumentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSoldToPaymentInstrumentId() {
        return soldToPaymentInstrumentId;
    }

    /**
     * Sets the value of the soldToPaymentInstrumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSoldToPaymentInstrumentId(Long value) {
        this.soldToPaymentInstrumentId = value;
    }

    /**
     * Gets the value of the taxCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTaxCertificate }
     *     
     */
    public AccountTaxCertificate getTaxCertificate() {
        return taxCertificate;
    }

    /**
     * Sets the value of the taxCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTaxCertificate }
     *     
     */
    public void setTaxCertificate(AccountTaxCertificate value) {
        this.taxCertificate = value;
    }

    /**
     * Gets the value of the accountMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountMode() {
        return accountMode;
    }

    /**
     * Sets the value of the accountMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountMode(String value) {
        this.accountMode = value;
    }

}
