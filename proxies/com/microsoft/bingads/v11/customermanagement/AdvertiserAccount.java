
package com.microsoft.bingads.v11.customermanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvertiserAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvertiserAccount">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/Customer/v11/Entities}Account">
 *       &lt;sequence>
 *         &lt;element name="LinkedAgencies" type="{https://bingads.microsoft.com/Customer/v11/Entities}ArrayOfCustomerInfo" minOccurs="0"/>
 *         &lt;element name="SalesHouseCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TaxInformation" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         &lt;element name="BackUpPaymentInstrumentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BillingThresholdAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BusinessAddress" type="{https://bingads.microsoft.com/Customer/v11/Entities}Address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvertiserAccount", namespace = "https://bingads.microsoft.com/Customer/v11/Entities", propOrder = {
    "linkedAgencies",
    "salesHouseCustomerId",
    "taxInformation",
    "backUpPaymentInstrumentId",
    "billingThresholdAmount",
    "businessAddress"
})
public class AdvertiserAccount
    extends Account
{

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

}
