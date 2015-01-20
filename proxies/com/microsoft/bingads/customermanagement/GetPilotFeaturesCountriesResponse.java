
package com.microsoft.bingads.customermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PilotFeatures" type="{https://bingads.microsoft.com/Customer/v9/Entities}ArrayOfPilotFeature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pilotFeatures"
})
@XmlRootElement(name = "GetPilotFeaturesCountriesResponse")
public class GetPilotFeaturesCountriesResponse {

    @XmlElement(name = "PilotFeatures", nillable = true)
    protected ArrayOfPilotFeature pilotFeatures;

    /**
     * Gets the value of the pilotFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPilotFeature }
     *     
     */
    public ArrayOfPilotFeature getPilotFeatures() {
        return pilotFeatures;
    }

    /**
     * Sets the value of the pilotFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPilotFeature }
     *     
     */
    public void setPilotFeatures(ArrayOfPilotFeature value) {
        this.pilotFeatures = value;
    }

}
