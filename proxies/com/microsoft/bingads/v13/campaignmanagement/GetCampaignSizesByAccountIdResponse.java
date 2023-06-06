
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
 *         <element name="CampaignSizes" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfCampaignSize" minOccurs="0"/>
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
