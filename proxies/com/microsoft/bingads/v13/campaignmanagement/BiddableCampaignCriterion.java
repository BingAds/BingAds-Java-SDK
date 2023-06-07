
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiddableCampaignCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BiddableCampaignCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}CampaignCriterion">
 *       <sequence>
 *         <element name="CriterionBid" type="{https://bingads.microsoft.com/CampaignManagement/v13}CriterionBid" minOccurs="0"/>
 *         <element name="CriterionCashback" type="{https://bingads.microsoft.com/CampaignManagement/v13}CriterionCashback" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiddableCampaignCriterion", propOrder = {
    "criterionBid",
    "criterionCashback"
})
public class BiddableCampaignCriterion
    extends CampaignCriterion
{

    @XmlElement(name = "CriterionBid", nillable = true)
    protected CriterionBid criterionBid;
    @XmlElement(name = "CriterionCashback", nillable = true)
    protected CriterionCashback criterionCashback;

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

    /**
     * Gets the value of the criterionCashback property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionCashback }
     *     
     */
    public CriterionCashback getCriterionCashback() {
        return criterionCashback;
    }

    /**
     * Sets the value of the criterionCashback property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionCashback }
     *     
     */
    public void setCriterionCashback(CriterionCashback value) {
        this.criterionCashback = value;
    }

}
