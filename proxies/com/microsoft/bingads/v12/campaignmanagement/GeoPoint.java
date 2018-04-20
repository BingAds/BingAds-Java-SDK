
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LatitudeInMicroDegrees" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LongitudeInMicroDegrees" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoPoint", propOrder = {
    "latitudeInMicroDegrees",
    "longitudeInMicroDegrees"
})
public class GeoPoint {

    @XmlElement(name = "LatitudeInMicroDegrees")
    protected int latitudeInMicroDegrees;
    @XmlElement(name = "LongitudeInMicroDegrees")
    protected int longitudeInMicroDegrees;

    /**
     * Gets the value of the latitudeInMicroDegrees property.
     * 
     */
    public int getLatitudeInMicroDegrees() {
        return latitudeInMicroDegrees;
    }

    /**
     * Sets the value of the latitudeInMicroDegrees property.
     * 
     */
    public void setLatitudeInMicroDegrees(int value) {
        this.latitudeInMicroDegrees = value;
    }

    /**
     * Gets the value of the longitudeInMicroDegrees property.
     * 
     */
    public int getLongitudeInMicroDegrees() {
        return longitudeInMicroDegrees;
    }

    /**
     * Sets the value of the longitudeInMicroDegrees property.
     * 
     */
    public void setLongitudeInMicroDegrees(int value) {
        this.longitudeInMicroDegrees = value;
    }

}
