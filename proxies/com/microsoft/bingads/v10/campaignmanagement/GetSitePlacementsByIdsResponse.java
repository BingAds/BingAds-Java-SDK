
package com.microsoft.bingads.v10.campaignmanagement;

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
 *         &lt;element name="SitePlacements" type="{https://bingads.microsoft.com/CampaignManagement/v10}ArrayOfSitePlacement" minOccurs="0"/>
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
    "sitePlacements"
})
@XmlRootElement(name = "GetSitePlacementsByIdsResponse")
public class GetSitePlacementsByIdsResponse {

    @XmlElement(name = "SitePlacements", nillable = true)
    protected ArrayOfSitePlacement sitePlacements;

    /**
     * Gets the value of the sitePlacements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSitePlacement }
     *     
     */
    public ArrayOfSitePlacement getSitePlacements() {
        return sitePlacements;
    }

    /**
     * Sets the value of the sitePlacements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSitePlacement }
     *     
     */
    public void setSitePlacements(ArrayOfSitePlacement value) {
        this.sitePlacements = value;
    }

}
