
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrandVoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BrandVoice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Personality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Tones" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandVoice", propOrder = {
    "personality",
    "tones"
})
public class BrandVoice {

    @XmlElement(name = "Personality", nillable = true)
    protected String personality;
    @XmlElement(name = "Tones", nillable = true)
    protected ArrayOfstring tones;

    /**
     * Gets the value of the personality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonality() {
        return personality;
    }

    /**
     * Sets the value of the personality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonality(String value) {
        this.personality = value;
    }

    /**
     * Gets the value of the tones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getTones() {
        return tones;
    }

    /**
     * Sets the value of the tones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setTones(ArrayOfstring value) {
        this.tones = value;
    }

}
