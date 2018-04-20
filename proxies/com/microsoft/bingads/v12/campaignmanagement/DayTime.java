
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Day" type="{https://bingads.microsoft.com/CampaignManagement/v12}Day"/>
 *         &lt;element name="EndHour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EndMinute" type="{https://bingads.microsoft.com/CampaignManagement/v12}Minute"/>
 *         &lt;element name="StartHour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StartMinute" type="{https://bingads.microsoft.com/CampaignManagement/v12}Minute"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayTime", propOrder = {
    "day",
    "endHour",
    "endMinute",
    "startHour",
    "startMinute"
})
public class DayTime {

    @XmlElement(name = "Day", required = true)
    @XmlSchemaType(name = "string")
    protected Day day;
    @XmlElement(name = "EndHour")
    protected int endHour;
    @XmlElement(name = "EndMinute", required = true)
    @XmlSchemaType(name = "string")
    protected Minute endMinute;
    @XmlElement(name = "StartHour")
    protected int startHour;
    @XmlElement(name = "StartMinute", required = true)
    @XmlSchemaType(name = "string")
    protected Minute startMinute;

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
     * Gets the value of the endHour property.
     * 
     */
    public int getEndHour() {
        return endHour;
    }

    /**
     * Sets the value of the endHour property.
     * 
     */
    public void setEndHour(int value) {
        this.endHour = value;
    }

    /**
     * Gets the value of the endMinute property.
     * 
     * @return
     *     possible object is
     *     {@link Minute }
     *     
     */
    public Minute getEndMinute() {
        return endMinute;
    }

    /**
     * Sets the value of the endMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Minute }
     *     
     */
    public void setEndMinute(Minute value) {
        this.endMinute = value;
    }

    /**
     * Gets the value of the startHour property.
     * 
     */
    public int getStartHour() {
        return startHour;
    }

    /**
     * Sets the value of the startHour property.
     * 
     */
    public void setStartHour(int value) {
        this.startHour = value;
    }

    /**
     * Gets the value of the startMinute property.
     * 
     * @return
     *     possible object is
     *     {@link Minute }
     *     
     */
    public Minute getStartMinute() {
        return startMinute;
    }

    /**
     * Sets the value of the startMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Minute }
     *     
     */
    public void setStartMinute(Minute value) {
        this.startMinute = value;
    }

}
