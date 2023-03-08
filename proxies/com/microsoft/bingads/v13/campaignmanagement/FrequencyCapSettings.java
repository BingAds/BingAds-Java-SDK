
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequencyCapSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequencyCapSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CapValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FrequencyCapUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeGranularity" type="{https://bingads.microsoft.com/CampaignManagement/v13}FrequencyCapTimeGranularity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequencyCapSettings", propOrder = {
    "capValue",
    "frequencyCapUnit",
    "timeGranularity"
})
public class FrequencyCapSettings {

    @XmlElement(name = "CapValue")
    protected Integer capValue;
    @XmlElement(name = "FrequencyCapUnit", nillable = true)
    protected String frequencyCapUnit;
    @XmlElement(name = "TimeGranularity")
    @XmlSchemaType(name = "string")
    protected FrequencyCapTimeGranularity timeGranularity;

    /**
     * Gets the value of the capValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapValue() {
        return capValue;
    }

    /**
     * Sets the value of the capValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapValue(Integer value) {
        this.capValue = value;
    }

    /**
     * Gets the value of the frequencyCapUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyCapUnit() {
        return frequencyCapUnit;
    }

    /**
     * Sets the value of the frequencyCapUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyCapUnit(String value) {
        this.frequencyCapUnit = value;
    }

    /**
     * Gets the value of the timeGranularity property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyCapTimeGranularity }
     *     
     */
    public FrequencyCapTimeGranularity getTimeGranularity() {
        return timeGranularity;
    }

    /**
     * Sets the value of the timeGranularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyCapTimeGranularity }
     *     
     */
    public void setTimeGranularity(FrequencyCapTimeGranularity value) {
        this.timeGranularity = value;
    }

}
