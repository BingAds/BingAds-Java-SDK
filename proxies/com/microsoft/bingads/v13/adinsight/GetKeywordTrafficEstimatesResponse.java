
package com.microsoft.bingads.v13.adinsight;

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
 *         <element name="CampaignEstimates" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfCampaignEstimate" minOccurs="0"/>
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
    "campaignEstimates"
})
@XmlRootElement(name = "GetKeywordTrafficEstimatesResponse")
public class GetKeywordTrafficEstimatesResponse {

    @XmlElement(name = "CampaignEstimates", nillable = true)
    protected ArrayOfCampaignEstimate campaignEstimates;

    /**
     * Gets the value of the campaignEstimates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaignEstimate }
     *     
     */
    public ArrayOfCampaignEstimate getCampaignEstimates() {
        return campaignEstimates;
    }

    /**
     * Sets the value of the campaignEstimates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaignEstimate }
     *     
     */
    public void setCampaignEstimates(ArrayOfCampaignEstimate value) {
        this.campaignEstimates = value;
    }

}
