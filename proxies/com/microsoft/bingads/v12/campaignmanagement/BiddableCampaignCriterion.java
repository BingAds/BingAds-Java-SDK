
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiddableCampaignCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiddableCampaignCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v12}CampaignCriterion">
 *       &lt;sequence>
 *         &lt;element name="CriterionBid" type="{https://bingads.microsoft.com/CampaignManagement/v12}CriterionBid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiddableCampaignCriterion", propOrder = {
    "criterionBid"
})
public class BiddableCampaignCriterion
    extends CampaignCriterion
{

    @XmlElement(name = "CriterionBid", nillable = true)
    protected CriterionBid criterionBid;

    /**
     * Gets the value of the criterionBid property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionBid }
     *     
     */
    public CriterionBid getCriterionBid() {
        return criterionBid;
    }

    /**
     * Sets the value of the criterionBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionBid }
     *     
     */
    public void setCriterionBid(CriterionBid value) {
        this.criterionBid = value;
    }

}
