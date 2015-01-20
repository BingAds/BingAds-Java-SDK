
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
 *         &lt;element name="AdGroupIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
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
    "adGroupIds",
    "locationTargetVersion"
})
@XmlRootElement(name = "GetTargetsByAdGroupIdsRequest")
public class GetTargetsByAdGroupIdsRequest {

    @XmlElement(name = "AdGroupIds", nillable = true)
    protected ArrayOflong adGroupIds;
    @XmlElement(name = "LocationTargetVersion", nillable = true)
    protected String locationTargetVersion;

    /**
     * Gets the value of the adGroupIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getAdGroupIds() {
        return adGroupIds;
    }

    /**
     * Sets the value of the adGroupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setAdGroupIds(ArrayOflong value) {
        this.adGroupIds = value;
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
