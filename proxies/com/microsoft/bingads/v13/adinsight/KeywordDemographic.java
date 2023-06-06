
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordDemographic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordDemographic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Device" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EighteenToTwentyFour" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TwentyFiveToThirtyFour" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ThirtyFiveToFourtyNine" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FiftyToSixtyFour" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SixtyFiveAndAbove" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AgeUnknown" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Female" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Male" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GenderUnknown" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordDemographic", propOrder = {
    "device",
    "eighteenToTwentyFour",
    "twentyFiveToThirtyFour",
    "thirtyFiveToFourtyNine",
    "fiftyToSixtyFour",
    "sixtyFiveAndAbove",
    "ageUnknown",
    "female",
    "male",
    "genderUnknown"
})
public class KeywordDemographic {

    @XmlElement(name = "Device", nillable = true)
    protected String device;
    @XmlElement(name = "EighteenToTwentyFour")
    protected Double eighteenToTwentyFour;
    @XmlElement(name = "TwentyFiveToThirtyFour")
    protected Double twentyFiveToThirtyFour;
    @XmlElement(name = "ThirtyFiveToFourtyNine")
    protected Double thirtyFiveToFourtyNine;
    @XmlElement(name = "FiftyToSixtyFour")
    protected Double fiftyToSixtyFour;
    @XmlElement(name = "SixtyFiveAndAbove")
    protected Double sixtyFiveAndAbove;
    @XmlElement(name = "AgeUnknown")
    protected Double ageUnknown;
    @XmlElement(name = "Female")
    protected Double female;
    @XmlElement(name = "Male")
    protected Double male;
    @XmlElement(name = "GenderUnknown")
    protected Double genderUnknown;

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

    /**
     * Gets the value of the eighteenToTwentyFour property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEighteenToTwentyFour() {
        return eighteenToTwentyFour;
    }

    /**
     * Sets the value of the eighteenToTwentyFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEighteenToTwentyFour(Double value) {
        this.eighteenToTwentyFour = value;
    }

    /**
     * Gets the value of the twentyFiveToThirtyFour property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTwentyFiveToThirtyFour() {
        return twentyFiveToThirtyFour;
    }

    /**
     * Sets the value of the twentyFiveToThirtyFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTwentyFiveToThirtyFour(Double value) {
        this.twentyFiveToThirtyFour = value;
    }

    /**
     * Gets the value of the thirtyFiveToFourtyNine property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThirtyFiveToFourtyNine() {
        return thirtyFiveToFourtyNine;
    }

    /**
     * Sets the value of the thirtyFiveToFourtyNine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThirtyFiveToFourtyNine(Double value) {
        this.thirtyFiveToFourtyNine = value;
    }

    /**
     * Gets the value of the fiftyToSixtyFour property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFiftyToSixtyFour() {
        return fiftyToSixtyFour;
    }

    /**
     * Sets the value of the fiftyToSixtyFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFiftyToSixtyFour(Double value) {
        this.fiftyToSixtyFour = value;
    }

    /**
     * Gets the value of the sixtyFiveAndAbove property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSixtyFiveAndAbove() {
        return sixtyFiveAndAbove;
    }

    /**
     * Sets the value of the sixtyFiveAndAbove property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSixtyFiveAndAbove(Double value) {
        this.sixtyFiveAndAbove = value;
    }

    /**
     * Gets the value of the ageUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAgeUnknown() {
        return ageUnknown;
    }

    /**
     * Sets the value of the ageUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAgeUnknown(Double value) {
        this.ageUnknown = value;
    }

    /**
     * Gets the value of the female property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFemale() {
        return female;
    }

    /**
     * Sets the value of the female property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFemale(Double value) {
        this.female = value;
    }

    /**
     * Gets the value of the male property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMale() {
        return male;
    }

    /**
     * Sets the value of the male property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMale(Double value) {
        this.male = value;
    }

    /**
     * Gets the value of the genderUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGenderUnknown() {
        return genderUnknown;
    }

    /**
     * Sets the value of the genderUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGenderUnknown(Double value) {
        this.genderUnknown = value;
    }

}
