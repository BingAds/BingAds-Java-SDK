
package com.microsoft.bingads.adintelligence;

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
 *         &lt;element name="Age18_24" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Age25_34" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Age35_49" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Age50_64" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Age65Plus" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "age1824",
    "age2534",
    "age3549",
    "age5064",
    "age65Plus",
    "ageUnknown",
    "female",
    "male",
    "genderUnknown"
})
public class KeywordDemographic {

    @XmlElement(name = "Age18_24")
    protected Double age1824;
    @XmlElement(name = "Age25_34")
    protected Double age2534;
    @XmlElement(name = "Age35_49")
    protected Double age3549;
    @XmlElement(name = "Age50_64")
    protected Double age5064;
    @XmlElement(name = "Age65Plus")
    protected Double age65Plus;
    @XmlElement(name = "AgeUnknown")
    protected Double ageUnknown;
    @XmlElement(name = "Female")
    protected Double female;
    @XmlElement(name = "Male")
    protected Double male;
    @XmlElement(name = "GenderUnknown")
    protected Double genderUnknown;

    /**
     * Gets the value of the age1824 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAge1824() {
        return age1824;
    }

    /**
     * Sets the value of the age1824 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAge1824(Double value) {
        this.age1824 = value;
    }

    /**
     * Gets the value of the age2534 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAge2534() {
        return age2534;
    }

    /**
     * Sets the value of the age2534 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAge2534(Double value) {
        this.age2534 = value;
    }

    /**
     * Gets the value of the age3549 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAge3549() {
        return age3549;
    }

    /**
     * Sets the value of the age3549 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAge3549(Double value) {
        this.age3549 = value;
    }

    /**
     * Gets the value of the age5064 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAge5064() {
        return age5064;
    }

    /**
     * Sets the value of the age5064 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAge5064(Double value) {
        this.age5064 = value;
    }

    /**
     * Gets the value of the age65Plus property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAge65Plus() {
        return age65Plus;
    }

    /**
     * Sets the value of the age65Plus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAge65Plus(Double value) {
        this.age65Plus = value;
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
