
package com.microsoft.bingads.campaignmanagement;

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
 *         &lt;element name="TargetIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="LocationTargetVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "targetIds",
    "locationTargetVersion"
})
@XmlRootElement(name = "GetTargetsByIdsRequest")
public class GetTargetsByIdsRequest {

    @XmlElement(name = "TargetIds", nillable = true)
    protected ArrayOflong targetIds;
    @XmlElement(name = "LocationTargetVersion", nillable = true)
    protected String locationTargetVersion;

    /**
     * Gets the value of the targetIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getTargetIds() {
        return targetIds;
    }

    /**
     * Sets the value of the targetIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setTargetIds(ArrayOflong value) {
        this.targetIds = value;
    }

    /**
     * Gets the value of the locationTargetVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationTargetVersion() {
        return locationTargetVersion;
    }

    /**
     * Sets the value of the locationTargetVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationTargetVersion(String value) {
        this.locationTargetVersion = value;
    }

}
