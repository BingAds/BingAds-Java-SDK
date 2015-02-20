
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
 *         &lt;element name="CampaignCriterions" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfCampaignCriterion" minOccurs="0"/>
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
    "campaignCriterions"
})
@XmlRootElement(name = "GetCampaignCriterionsByCampaignIdResponse")
public class GetCampaignCriterionsByCampaignIdResponse {

    @XmlElement(name = "CampaignCriterions", nillable = true)
    protected ArrayOfCampaignCriterion campaignCriterions;

    /**
     * Gets the value of the campaignCriterions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaignCriterion }
     *     
     */
    public ArrayOfCampaignCriterion getCampaignCriterions() {
        return campaignCriterions;
    }

    /**
     * Sets the value of the campaignCriterions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaignCriterion }
     *     
     */
    public void setCampaignCriterions(ArrayOfCampaignCriterion value) {
        this.campaignCriterions = value;
    }

}
