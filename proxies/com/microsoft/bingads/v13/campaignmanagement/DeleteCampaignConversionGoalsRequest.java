
package com.microsoft.bingads.v13.campaignmanagement;

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
 *         &lt;element name="CampaignConversionGoal" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfCampaignConversionGoal" minOccurs="0"/>
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
    "campaignConversionGoal"
})
@XmlRootElement(name = "DeleteCampaignConversionGoalsRequest")
public class DeleteCampaignConversionGoalsRequest {

    @XmlElement(name = "CampaignConversionGoal", nillable = true)
    protected ArrayOfCampaignConversionGoal campaignConversionGoal;

    /**
     * Gets the value of the campaignConversionGoal property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaignConversionGoal }
     *     
     */
    public ArrayOfCampaignConversionGoal getCampaignConversionGoal() {
        return campaignConversionGoal;
    }

    /**
     * Sets the value of the campaignConversionGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaignConversionGoal }
     *     
     */
    public void setCampaignConversionGoal(ArrayOfCampaignConversionGoal value) {
        this.campaignConversionGoal = value;
    }

}
