
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GeoPoint">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LatitudeInMicroDegrees" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="LongitudeInMicroDegrees" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
