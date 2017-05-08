
package com.microsoft.bingads.v11.campaignmanagement;

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
 *         &lt;element name="CampaignSizes" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfCampaignSize" minOccurs="0"/>
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
    "campaignSizes"
})
@XmlRootElement(name = "GetCampaignSizesByAccountIdResponse")
public class GetCampaignSizesByAccountIdResponse {

    @XmlElement(name = "CampaignSizes", nillable = true)
    protected ArrayOfCampaignSize campaignSizes;

    /**
     * Gets the value of the campaignSizes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaignSize }
     *     
     */
    public ArrayOfCampaignSize getCampaignSizes() {
        return campaignSizes;
    }

    /**
     * Sets the value of the campaignSizes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaignSize }
     *     
     */
    public void setCampaignSizes(ArrayOfCampaignSize value) {
        this.campaignSizes = value;
    }

}
