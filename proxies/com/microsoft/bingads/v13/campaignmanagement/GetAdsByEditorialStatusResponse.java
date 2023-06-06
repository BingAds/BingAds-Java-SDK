
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ads" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAd" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ads"
})
@XmlRootElement(name = "GetAdsByEditorialStatusResponse")
public class GetAdsByEditorialStatusResponse {

    @XmlElement(name = "Ads", nillable = true)
    protected ArrayOfAd ads;

    /**
     * Gets the value of the ads property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAd }
     *     
     */
    public ArrayOfAd getAds() {
        return ads;
    }

    /**
     * Sets the value of the ads property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAd }
     *     
     */
    public void setAds(ArrayOfAd value) {
        this.ads = value;
    }

}
