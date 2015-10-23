
package com.microsoft.bingads.v10.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacementDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImpressionsRangePerDay" type="{https://bingads.microsoft.com/CampaignManagement/v10}ImpressionsPerDayRange" minOccurs="0"/>
 *         &lt;element name="PathName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlacementId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SupportedMediaTypes" type="{https://bingads.microsoft.com/CampaignManagement/v10}ArrayOfMediaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementDetail", propOrder = {
    "impressionsRangePerDay",
    "pathName",
    "placementId",
    "supportedMediaTypes"
})
public class PlacementDetail {

    @XmlElement(name = "ImpressionsRangePerDay", nillable = true)
    protected ImpressionsPerDayRange impressionsRangePerDay;
    @XmlElement(name = "PathName", nillable = true)
    protected String pathName;
    @XmlElement(name = "PlacementId")
    protected Long placementId;
    @XmlElement(name = "SupportedMediaTypes", nillable = true)
    protected ArrayOfMediaType supportedMediaTypes;

    /**
     * Gets the value of the impressionsRangePerDay property.
     * 
     * @return
     *     possible object is
     *     {@link ImpressionsPerDayRange }
     *     
     */
    public ImpressionsPerDayRange getImpressionsRangePerDay() {
        return impressionsRangePerDay;
    }

    /**
     * Sets the value of the impressionsRangePerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpressionsPerDayRange }
     *     
     */
    public void setImpressionsRangePerDay(ImpressionsPerDayRange value) {
        this.impressionsRangePerDay = value;
    }

    /**
     * Gets the value of the pathName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathName() {
        return pathName;
    }

    /**
     * Sets the value of the pathName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathName(String value) {
        this.pathName = value;
    }

    /**
     * Gets the value of the placementId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlacementId() {
        return placementId;
    }

    /**
     * Sets the value of the placementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlacementId(Long value) {
        this.placementId = value;
    }

    /**
     * Gets the value of the supportedMediaTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMediaType }
     *     
     */
    public ArrayOfMediaType getSupportedMediaTypes() {
        return supportedMediaTypes;
    }

    /**
     * Sets the value of the supportedMediaTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMediaType }
     *     
     */
    public void setSupportedMediaTypes(ArrayOfMediaType value) {
        this.supportedMediaTypes = value;
    }

}
