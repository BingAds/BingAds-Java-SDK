
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OfflineConversionAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OfflineConversionAdjustment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdjustmentCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AdjustmentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="AdjustmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AdjustmentValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ConversionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ConversionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="HashedEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HashedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MicrosoftClickId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineConversionAdjustment", propOrder = {
    "adjustmentCurrencyCode",
    "adjustmentTime",
    "adjustmentType",
    "adjustmentValue",
    "conversionName",
    "conversionTime",
    "hashedEmailAddress",
    "hashedPhoneNumber",
    "microsoftClickId"
})
public class OfflineConversionAdjustment {

    @XmlElement(name = "AdjustmentCurrencyCode", nillable = true)
    protected String adjustmentCurrencyCode;
    @XmlElement(name = "AdjustmentTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar adjustmentTime;
    @XmlElement(name = "AdjustmentType", nillable = true)
    protected String adjustmentType;
    @XmlElement(name = "AdjustmentValue", nillable = true)
    protected Double adjustmentValue;
    @XmlElement(name = "ConversionName", nillable = true)
    protected String conversionName;
    @XmlElement(name = "ConversionTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar conversionTime;
    @XmlElement(name = "HashedEmailAddress", nillable = true)
    protected String hashedEmailAddress;
    @XmlElement(name = "HashedPhoneNumber", nillable = true)
    protected String hashedPhoneNumber;
    @XmlElement(name = "MicrosoftClickId", nillable = true)
    protected String microsoftClickId;

    /**
     * Gets the value of the adjustmentCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentCurrencyCode() {
        return adjustmentCurrencyCode;
    }

    /**
     * Sets the value of the adjustmentCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentCurrencyCode(String value) {
        this.adjustmentCurrencyCode = value;
    }

    /**
     * Gets the value of the adjustmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getAdjustmentTime() {
        return adjustmentTime;
    }

    /**
     * Sets the value of the adjustmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentTime(Calendar value) {
        this.adjustmentTime = value;
    }

    /**
     * Gets the value of the adjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Sets the value of the adjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentType(String value) {
        this.adjustmentType = value;
    }

    /**
     * Gets the value of the adjustmentValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustmentValue() {
        return adjustmentValue;
    }

    /**
     * Sets the value of the adjustmentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustmentValue(Double value) {
        this.adjustmentValue = value;
    }

    /**
     * Gets the value of the conversionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionName() {
        return conversionName;
    }

    /**
     * Sets the value of the conversionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionName(String value) {
        this.conversionName = value;
    }

    /**
     * Gets the value of the conversionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getConversionTime() {
        return conversionTime;
    }

    /**
     * Sets the value of the conversionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionTime(Calendar value) {
        this.conversionTime = value;
    }

    /**
     * Gets the value of the hashedEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashedEmailAddress() {
        return hashedEmailAddress;
    }

    /**
     * Sets the value of the hashedEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashedEmailAddress(String value) {
        this.hashedEmailAddress = value;
    }

    /**
     * Gets the value of the hashedPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashedPhoneNumber() {
        return hashedPhoneNumber;
    }

    /**
     * Sets the value of the hashedPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashedPhoneNumber(String value) {
        this.hashedPhoneNumber = value;
    }

    /**
     * Gets the value of the microsoftClickId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicrosoftClickId() {
        return microsoftClickId;
    }

    /**
     * Sets the value of the microsoftClickId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicrosoftClickId(String value) {
        this.microsoftClickId = value;
    }

}
