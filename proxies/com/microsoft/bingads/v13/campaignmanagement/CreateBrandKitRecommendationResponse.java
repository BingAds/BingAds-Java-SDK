
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
 *         <element name="BrandKit" type="{https://bingads.microsoft.com/CampaignManagement/v13}BrandKit" minOccurs="0"/>
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
    "brandKit"
})
@XmlRootElement(name = "CreateBrandKitRecommendationResponse")
public class CreateBrandKitRecommendationResponse {

    @XmlElement(name = "BrandKit", nillable = true)
    protected BrandKit brandKit;

    /**
     * Gets the value of the brandKit property.
     * 
     * @return
     *     possible object is
     *     {@link BrandKit }
     *     
     */
    public BrandKit getBrandKit() {
        return brandKit;
    }

    /**
     * Sets the value of the brandKit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandKit }
     *     
     */
    public void setBrandKit(BrandKit value) {
        this.brandKit = value;
    }

}
