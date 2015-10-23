
package com.microsoft.bingads.v10.campaignmanagement;

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
 *         &lt;element name="CriterionActions" type="{https://bingads.microsoft.com/CampaignManagement/v10}ArrayOfAdGroupCriterionAction" minOccurs="0"/>
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
    "criterionActions"
})
@XmlRootElement(name = "ApplyProductPartitionActionsRequest")
public class ApplyProductPartitionActionsRequest {

    @XmlElement(name = "CriterionActions", nillable = true)
    protected ArrayOfAdGroupCriterionAction criterionActions;

    /**
     * Gets the value of the criterionActions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdGroupCriterionAction }
     *     
     */
    public ArrayOfAdGroupCriterionAction getCriterionActions() {
        return criterionActions;
    }

    /**
     * Sets the value of the criterionActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdGroupCriterionAction }
     *     
     */
    public void setCriterionActions(ArrayOfAdGroupCriterionAction value) {
        this.criterionActions = value;
    }

}
