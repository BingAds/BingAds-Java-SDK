
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OfflineConversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OfflineConversion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ConversionCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ConversionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ConversionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="ConversionValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ExternalAttributionCredit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ExternalAttributionModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "OfflineConversion", propOrder = {
    "conversionCurrencyCode",
    "conversionName",
    "conversionTime",
    "conversionValue",
    "externalAttributionCredit",
    "externalAttributionModel",
    "hashedEmailAddress",
    "hashedPhoneNumber",
    "microsoftClickId"
})
public class OfflineConversion {

    @XmlElement(name = "ConversionCurrencyCode", nillable = true)
    protected String conversionCurrencyCode;
    @XmlElement(name = "ConversionName", nillable = true)
    protected String conversionName;
    @XmlElement(name = "ConversionTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar conversionTime;
    @XmlElement(name = "ConversionValue", nillable = true)
    protected Double conversionValue;
    @XmlElement(name = "ExternalAttributionCredit", nillable = true)
    protected Double externalAttributionCredit;
    @XmlElement(name = "ExternalAttributionModel", nillable = true)
    protected String externalAttributionModel;
    @XmlElement(name = "HashedEmailAddress", nillable = true)
    protected String hashedEmailAddress;
    @XmlElement(name = "HashedPhoneNumber", nillable = true)
    protected String hashedPhoneNumber;
    @XmlElement(name = "MicrosoftClickId", nillable = true)
    protected String microsoftClickId;

    /**
     * Gets the value of the conversionCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionCurrencyCode() {
        return conversionCurrencyCode;
    }

    /**
     * Sets the value of the conversionCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionCurrencyCode(String value) {
        this.conversionCurrencyCode = value;
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
     * Gets the value of the conversionValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConversionValue() {
        return conversionValue;
    }

    /**
     * Sets the value of the conversionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConversionValue(Double value) {
        this.conversionValue = value;
    }

    /**
     * Gets the value of the externalAttributionCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExternalAttributionCredit() {
        return externalAttributionCredit;
    }

    /**
     * Sets the value of the externalAttributionCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExternalAttributionCredit(Double value) {
        this.externalAttributionCredit = value;
    }

    /**
     * Gets the value of the externalAttributionModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAttributionModel() {
        return externalAttributionModel;
    }

    /**
     * Sets the value of the externalAttributionModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAttributionModel(String value) {
        this.externalAttributionModel = value;
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
