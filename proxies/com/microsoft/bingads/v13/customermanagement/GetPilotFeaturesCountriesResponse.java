
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PilotFeatures" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfPilotFeature" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
