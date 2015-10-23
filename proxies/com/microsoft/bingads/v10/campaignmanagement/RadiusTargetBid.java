
package com.microsoft.bingads.v10.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadiusTargetBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadiusTargetBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidAdjustment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IsExcluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LatitudeDegrees" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LongitudeDegrees" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Radius" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RadiusUnit" type="{https://bingads.microsoft.com/CampaignManagement/v10}DistanceUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadiusTargetBid", propOrder = {
    "bidAdjustment",
    "id",
    "isExcluded",
    "latitudeDegrees",
    "longitudeDegrees",
    "name",
    "radius",
    "radiusUnit"
})
public class RadiusTargetBid {

    @XmlElement(name = "BidAdjustment")
    protected int bidAdjustment;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "IsExcluded")
    protected boolean isExcluded;
    @XmlElement(name = "LatitudeDegrees")
    protected double latitudeDegrees;
    @XmlElement(name = "LongitudeDegrees")
    protected double longitudeDegrees;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Radius")
    protected double radius;
    @XmlElement(name = "RadiusUnit", required = true)
    @XmlSchemaType(name = "string")
    protected DistanceUnit radiusUnit;

    /**
     * Gets the value of the bidAdjustment property.
     * 
     */
    public int getBidAdjustment() {
        return bidAdjustment;
    }

    /**
     * Sets the value of the bidAdjustment property.
     * 
     */
    public void setBidAdjustment(int value) {
        this.bidAdjustment = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the isExcluded property.
     * 
     */
    public boolean isIsExcluded() {
        return isExcluded;
    }

    /**
     * Sets the value of the isExcluded property.
     * 
     */
    public void setIsExcluded(boolean value) {
        this.isExcluded = value;
    }

    /**
     * Gets the value of the latitudeDegrees property.
     * 
     */
    public double getLatitudeDegrees() {
        return latitudeDegrees;
    }

    /**
     * Sets the value of the latitudeDegrees property.
     * 
     */
    public void setLatitudeDegrees(double value) {
        this.latitudeDegrees = value;
    }

    /**
     * Gets the value of the longitudeDegrees property.
     * 
     */
    public double getLongitudeDegrees() {
        return longitudeDegrees;
    }

    /**
     * Sets the value of the longitudeDegrees property.
     * 
     */
    public void setLongitudeDegrees(double value) {
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
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     */
    public void setRadius(double value) {
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
