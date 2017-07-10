
package com.microsoft.bingads.customermanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvertiserAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvertiserAccount">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/Customer/v9/Entities}Account">
 *       &lt;sequence>
 *         &lt;element name="AgencyContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesHouseCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxType" type="{https://bingads.microsoft.com/Customer/v9/Entities}TaxType" minOccurs="0"/>
 *         &lt;element name="BackUpPaymentInstrumentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BillingThresholdAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxIdStatus" type="{https://bingads.microsoft.com/Customer/v9/Entities}TaxIdStatus" minOccurs="0"/>
 *         &lt;element name="BusinessAddress" type="{https://bingads.microsoft.com/Customer/v9/Entities}Address" minOccurs="0"/>
 *         &lt;element name="TaxInformation" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvertiserAccount", namespace = "https://bingads.microsoft.com/Customer/v9/Entities", propOrder = {
    "agencyContactName",
    "agencyCustomerId",
    "salesHouseCustomerId",
    "taxId",
    "taxType",
    "backUpPaymentInstrumentId",
    "billingThresholdAmount",
    "taxIdStatus",
    "businessAddress",
    "taxInformation"
})
public class AdvertiserAccount
    extends Account
{

    @XmlElement(name = "AgencyContactName", nillable = true)
    protected String agencyContactName;
    @XmlElement(name = "AgencyCustomerId", nillable = true)
    protected Long agencyCustomerId;
    @XmlElement(name = "SalesHouseCustomerId", nillable = true)
    protected Long salesHouseCustomerId;
    @XmlElement(name = "TaxId", nillable = true)
    protected String taxId;
    @XmlElement(name = "TaxType", nillable = true)
    @XmlSchemaType(name = "string")
    protected TaxType taxType;
    @XmlElement(name = "BackUpPaymentInstrumentId", nillable = true)
    protected Long backUpPaymentInstrumentId;
    @XmlElement(name = "BillingThresholdAmount", nillable = true)
    protected BigDecimal billingThresholdAmount;
    @XmlElement(name = "TaxIdStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected TaxIdStatus taxIdStatus;
    @XmlElement(name = "BusinessAddress", nillable = true)
    protected Address businessAddress;
    @XmlElement(name = "TaxInformation", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring taxInformation;

    /**
     * Gets the value of the agencyContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyContactName() {
        return agencyContactName;
    }

    /**
     * Sets the value of the agencyContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyContactName(String value) {
        this.agencyContactName = value;
    }

    /**
     * Gets the value of the agencyCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAgencyCustomerId() {
        return agencyCustomerId;
    }

    /**
     * Sets the value of the agencyCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAgencyCustomerId(Long value) {
        this.agencyCustomerId = value;
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
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType }
     *     
     */
    public TaxType getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType }
     *     
     */
    public void setTaxType(TaxType value) {
        this.taxType = value;
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
     * Gets the value of the taxIdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdStatus }
     *     
     */
    public TaxIdStatus getTaxIdStatus() {
        return taxIdStatus;
    }

    /**
     * Sets the value of the taxIdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdStatus }
     *     
     */
    public void setTaxIdStatus(TaxIdStatus value) {
        this.taxIdStatus = value;
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

}
