
package com.microsoft.bingads.v11.customermanagement;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerAddress" type="{https://bingads.microsoft.com/Customer/v11/Entities}Address" minOccurs="0"/>
 *         &lt;element name="CustomerFinancialStatus" type="{https://bingads.microsoft.com/Customer/v11/Entities}CustomerFinancialStatus" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Industry" type="{https://bingads.microsoft.com/Customer/v11/Entities}Industry" minOccurs="0"/>
 *         &lt;element name="LastModifiedByUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MarketCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         &lt;element name="MarketLanguage" type="{https://bingads.microsoft.com/Customer/v11/Entities}LanguageType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceLevel" type="{https://bingads.microsoft.com/Customer/v11/Entities}ServiceLevel" minOccurs="0"/>
 *         &lt;element name="CustomerLifeCycleStatus" type="{https://bingads.microsoft.com/Customer/v11/Entities}CustomerLifeCycleStatus" minOccurs="0"/>
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", namespace = "https://bingads.microsoft.com/Customer/v11/Entities", propOrder = {
    "customerAddress",
    "customerFinancialStatus",
    "id",
    "industry",
    "lastModifiedByUserId",
    "lastModifiedTime",
    "marketCountry",
    "forwardCompatibilityMap",
    "marketLanguage",
    "name",
    "serviceLevel",
    "customerLifeCycleStatus",
    "timeStamp",
    "number"
})
public class Customer {

    @XmlElement(name = "CustomerAddress", nillable = true)
    protected Address customerAddress;
    @XmlElement(name = "CustomerFinancialStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected CustomerFinancialStatus customerFinancialStatus;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "Industry", nillable = true)
    @XmlSchemaType(name = "string")
    protected Industry industry;
    @XmlElement(name = "LastModifiedByUserId", nillable = true)
    protected Long lastModifiedByUserId;
    @XmlElement(name = "LastModifiedTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastModifiedTime;
    @XmlElement(name = "MarketCountry", nillable = true)
    protected String marketCountry;
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "MarketLanguage", nillable = true)
    @XmlSchemaType(name = "string")
    protected LanguageType marketLanguage;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "ServiceLevel", nillable = true)
    @XmlSchemaType(name = "string")
    protected ServiceLevel serviceLevel;
    @XmlElement(name = "CustomerLifeCycleStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected CustomerLifeCycleStatus customerLifeCycleStatus;
    @XmlElement(name = "TimeStamp", nillable = true)
    protected byte[] timeStamp;
    @XmlElement(name = "Number", nillable = true)
    protected String number;

    /**
     * Gets the value of the customerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Sets the value of the customerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setCustomerAddress(Address value) {
        this.customerAddress = value;
    }

    /**
     * Gets the value of the customerFinancialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerFinancialStatus }
     *     
     */
    public CustomerFinancialStatus getCustomerFinancialStatus() {
        return customerFinancialStatus;
    }

    /**
     * Sets the value of the customerFinancialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerFinancialStatus }
     *     
     */
    public void setCustomerFinancialStatus(CustomerFinancialStatus value) {
        this.customerFinancialStatus = value;
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
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link Industry }
     *     
     */
    public Industry getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Industry }
     *     
     */
    public void setIndustry(Industry value) {
        this.industry = value;
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
     * Gets the value of the marketCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCountry() {
        return marketCountry;
    }

    /**
     * Sets the value of the marketCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCountry(String value) {
        this.marketCountry = value;
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
     * Gets the value of the marketLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getMarketLanguage() {
        return marketLanguage;
    }

    /**
     * Sets the value of the marketLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setMarketLanguage(LanguageType value) {
        this.marketLanguage = value;
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
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevel }
     *     
     */
    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevel }
     *     
     */
    public void setServiceLevel(ServiceLevel value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the customerLifeCycleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerLifeCycleStatus }
     *     
     */
    public CustomerLifeCycleStatus getCustomerLifeCycleStatus() {
        return customerLifeCycleStatus;
    }

    /**
     * Sets the value of the customerLifeCycleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerLifeCycleStatus }
     *     
     */
    public void setCustomerLifeCycleStatus(CustomerLifeCycleStatus value) {
        this.customerLifeCycleStatus = value;
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

}
