
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
 *         &lt;element name="AdGroupNegativeSites" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfAdGroupNegativeSites" minOccurs="0"/>
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
    "adGroupNegativeSites"
})
@XmlRootElement(name = "GetNegativeSitesByAdGroupIdsResponse")
public class GetNegativeSitesByAdGroupIdsResponse {

    @XmlElement(name = "AdGroupNegativeSites", nillable = true)
    protected ArrayOfAdGroupNegativeSites adGroupNegativeSites;

    /**
     * Gets the value of the adGroupNegativeSites property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdGroupNegativeSites }
     *     
     */
    public ArrayOfAdGroupNegativeSites getAdGroupNegativeSites() {
        return adGroupNegativeSites;
    }

    /**
     * Sets the value of the adGroupNegativeSites property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdGroupNegativeSites }
     *     
     */
    public void setAdGroupNegativeSites(ArrayOfAdGroupNegativeSites value) {
        this.adGroupNegativeSites = value;
    }

}
