
package com.microsoft.bingads.v12.campaignmanagement;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OfflineConversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineConversion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConversionCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConversionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConversionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ConversionValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MicrosoftClickId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineConversion", propOrder = {
    "conversionCurrencyCode",
    "conversionName",
    "conversionTime",
    "conversionValue",
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
