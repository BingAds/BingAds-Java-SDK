
package com.microsoft.bingads.v13.campaignmanagement;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionValueRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ConversionValueRule">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AudienceCondition" type="{https://bingads.microsoft.com/CampaignManagement/v13}AudienceCondition" minOccurs="0"/>
 *         <element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DeviceCondition" type="{https://bingads.microsoft.com/CampaignManagement/v13}DeviceCondition" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="LocationCondition" type="{https://bingads.microsoft.com/CampaignManagement/v13}LocationCondition" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Operation" type="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionValueRuleOperator" minOccurs="0"/>
 *         <element name="Status" type="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionValueRuleStatus" minOccurs="0"/>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionValueRule", propOrder = {
    "audienceCondition",
    "currencyCode",
    "deviceCondition",
    "id",
    "locationCondition",
    "name",
    "operation",
    "status",
    "value"
})
public class ConversionValueRule {

    @XmlElement(name = "AudienceCondition", nillable = true)
    protected AudienceCondition audienceCondition;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "DeviceCondition", nillable = true)
    protected DeviceCondition deviceCondition;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "LocationCondition", nillable = true)
    protected LocationCondition locationCondition;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Operation", nillable = true)
    @XmlSchemaType(name = "string")
    protected ConversionValueRuleOperator operation;
    @XmlElement(name = "Status", nillable = true)
    @XmlSchemaType(name = "string")
    protected ConversionValueRuleStatus status;
    @XmlElement(name = "Value", nillable = true)
    protected BigDecimal value;

    /**
     * Gets the value of the audienceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link AudienceCondition }
     *     
     */
    public AudienceCondition getAudienceCondition() {
        return audienceCondition;
    }

    /**
     * Sets the value of the audienceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceCondition }
     *     
     */
    public void setAudienceCondition(AudienceCondition value) {
        this.audienceCondition = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the deviceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCondition }
     *     
     */
    public DeviceCondition getDeviceCondition() {
        return deviceCondition;
    }

    /**
     * Sets the value of the deviceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCondition }
     *     
     */
    public void setDeviceCondition(DeviceCondition value) {
        this.deviceCondition = value;
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
     * Gets the value of the locationCondition property.
     * 
     * @return
     *     possible object is
     *     {@link LocationCondition }
     *     
     */
    public LocationCondition getLocationCondition() {
        return locationCondition;
    }

    /**
     * Sets the value of the locationCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCondition }
     *     
     */
    public void setLocationCondition(LocationCondition value) {
        this.locationCondition = value;
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
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionValueRuleOperator }
     *     
     */
    public ConversionValueRuleOperator getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionValueRuleOperator }
     *     
     */
    public void setOperation(ConversionValueRuleOperator value) {
        this.operation = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionValueRuleStatus }
     *     
     */
    public ConversionValueRuleStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionValueRuleStatus }
     *     
     */
    public void setStatus(ConversionValueRuleStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
