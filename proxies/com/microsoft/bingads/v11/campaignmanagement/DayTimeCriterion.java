
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayTimeCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayTimeCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v11}Criterion">
 *       &lt;sequence>
 *         &lt;element name="Day" type="{https://bingads.microsoft.com/CampaignManagement/v11}Day" minOccurs="0"/>
 *         &lt;element name="FromHour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FromMinute" type="{https://bingads.microsoft.com/CampaignManagement/v11}Minute" minOccurs="0"/>
 *         &lt;element name="ToHour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ToMinute" type="{https://bingads.microsoft.com/CampaignManagement/v11}Minute" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayTimeCriterion", propOrder = {
    "day",
    "fromHour",
    "fromMinute",
    "toHour",
    "toMinute"
})
public class DayTimeCriterion
    extends Criterion
{

    @XmlElement(name = "Day", nillable = true)
    @XmlSchemaType(name = "string")
    protected Day day;
    @XmlElement(name = "FromHour", nillable = true)
    protected Integer fromHour;
    @XmlElement(name = "FromMinute", nillable = true)
    @XmlSchemaType(name = "string")
    protected Minute fromMinute;
    @XmlElement(name = "ToHour", nillable = true)
    protected Integer toHour;
    @XmlElement(name = "ToMinute", nillable = true)
    @XmlSchemaType(name = "string")
    protected Minute toMinute;

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link Day }
     *     
     */
    public Day getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link Day }
     *     
     */
    public void setDay(Day value) {
        this.day = value;
    }

    /**
     * Gets the value of the fromHour property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFromHour() {
        return fromHour;
    }

    /**
     * Sets the value of the fromHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromHour(Integer value) {
        this.fromHour = value;
    }

    /**
     * Gets the value of the fromMinute property.
     * 
     * @return
     *     possible object is
     *     {@link Minute }
     *     
     */
    public Minute getFromMinute() {
        return fromMinute;
    }

    /**
     * Sets the value of the fromMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Minute }
     *     
     */
    public void setFromMinute(Minute value) {
        this.fromMinute = value;
    }

    /**
     * Gets the value of the toHour property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getToHour() {
        return toHour;
    }

    /**
     * Sets the value of the toHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setToHour(Integer value) {
        this.toHour = value;
    }

    /**
     * Gets the value of the toMinute property.
     * 
     * @return
     *     possible object is
     *     {@link Minute }
     *     
     */
    public Minute getToMinute() {
        return toMinute;
    }

    /**
     * Sets the value of the toMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Minute }
     *     
     */
    public void setToMinute(Minute value) {
        this.toMinute = value;
    }

}
