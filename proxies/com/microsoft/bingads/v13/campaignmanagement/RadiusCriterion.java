
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadiusCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RadiusCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="LatitudeDegrees" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="LongitudeDegrees" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Radius" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="RadiusUnit" type="{https://bingads.microsoft.com/CampaignManagement/v13}DistanceUnit" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadiusCriterion", propOrder = {
    "latitudeDegrees",
    "longitudeDegrees",
    "name",
    "radius",
    "radiusUnit"
})
public class RadiusCriterion
    extends Criterion
{

    @XmlElement(name = "LatitudeDegrees", nillable = true)
    protected Double latitudeDegrees;
    @XmlElement(name = "LongitudeDegrees", nillable = true)
    protected Double longitudeDegrees;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Radius", nillable = true)
    protected Long radius;
    @XmlElement(name = "RadiusUnit", nillable = true)
    @XmlSchemaType(name = "string")
    protected DistanceUnit radiusUnit;

    /**
     * Gets the value of the latitudeDegrees property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitudeDegrees() {
        return latitudeDegrees;
    }

    /**
     * Sets the value of the latitudeDegrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitudeDegrees(Double value) {
        this.latitudeDegrees = value;
    }

    /**
     * Gets the value of the longitudeDegrees property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitudeDegrees() {
        return longitudeDegrees;
    }

    /**
     * Sets the value of the longitudeDegrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitudeDegrees(Double value) {
        this.longitudeDegrees = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRadius(Long value) {
        this.radius = value;
    }

    /**
     * Gets the value of the radiusUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceUnit }
     *     
     */
    public DistanceUnit getRadiusUnit() {
        return radiusUnit;
    }

    /**
     * Sets the value of the radiusUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceUnit }
     *     
     */
    public void setRadiusUnit(DistanceUnit value) {
        this.radiusUnit = value;
    }

}
