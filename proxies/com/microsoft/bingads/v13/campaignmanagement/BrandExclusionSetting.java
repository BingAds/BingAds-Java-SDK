
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrandExclusionSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BrandExclusionSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="ProductAdsOptOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandExclusionSetting", propOrder = {
    "productAdsOptOut"
})
public class BrandExclusionSetting
    extends Setting
{
    public BrandExclusionSetting() {
      this.type = "BrandExclusionSetting";
    }

    @XmlElement(name = "ProductAdsOptOut", nillable = true)
    protected Boolean productAdsOptOut;

    /**
     * Gets the value of the productAdsOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getProductAdsOptOut() {
        return productAdsOptOut;
    }

    /**
     * Sets the value of the productAdsOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductAdsOptOut(Boolean value) {
        this.productAdsOptOut = value;
    }

}
