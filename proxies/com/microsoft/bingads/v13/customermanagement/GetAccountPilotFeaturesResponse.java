
package com.microsoft.bingads.v13.customermanagement;

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
 *         &lt;element name="FeaturePilotFlags" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
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
    "featurePilotFlags"
})
@XmlRootElement(name = "GetAccountPilotFeaturesResponse")
public class GetAccountPilotFeaturesResponse {

    @XmlElement(name = "FeaturePilotFlags", nillable = true)
    protected ArrayOfint featurePilotFlags;

    /**
     * Gets the value of the featurePilotFlags property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getFeaturePilotFlags() {
        return featurePilotFlags;
    }

    /**
     * Sets the value of the featurePilotFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setFeaturePilotFlags(ArrayOfint value) {
        this.featurePilotFlags = value;
    }

}
