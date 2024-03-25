
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadiusTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RadiusTarget">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Radius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="RadiusUnit" type="{https://bingads.microsoft.com/AdInsight/v13}RadiusUnit" minOccurs="0"/>
 *         <element name="CenterLatitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="CenterLongitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadiusTarget", propOrder = {
    "radius",
    "radiusUnit",
    "centerLatitude",
    "centerLongitude"
})
public class RadiusTarget {

    @XmlElement(name = "Radius")
    protected Integer radius;
    @XmlElement(name = "RadiusUnit")
    @XmlSchemaType(name = "string")
    protected RadiusUnit radiusUnit;
    @XmlElement(name = "CenterLatitude")
    protected Double centerLatitude;
    @XmlElement(name = "CenterLongitude")
    protected Double centerLongitude;

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRadius(Integer value) {
        this.radius = value;
    }

    /**
     * Gets the value of the radiusUnit property.
     * 
     * @return
     *     possible object is
     *     {@link RadiusUnit }
     *     
     */
    public RadiusUnit getRadiusUnit() {
        return radiusUnit;
    }

    /**
     * Sets the value of the radiusUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadiusUnit }
     *     
     */
    public void setRadiusUnit(RadiusUnit value) {
        this.radiusUnit = value;
    }

    /**
     * Gets the value of the centerLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCenterLatitude() {
        return centerLatitude;
    }

    /**
     * Sets the value of the centerLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCenterLatitude(Double value) {
        this.centerLatitude = value;
    }

    /**
     * Gets the value of the centerLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCenterLongitude() {
        return centerLongitude;
    }

    /**
     * Sets the value of the centerLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCenterLongitude(Double value) {
        this.centerLongitude = value;
    }

}
