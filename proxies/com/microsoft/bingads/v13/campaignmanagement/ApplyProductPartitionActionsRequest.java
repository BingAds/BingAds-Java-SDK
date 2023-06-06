
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
 *         <element name="CriterionActions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdGroupCriterionAction" minOccurs="0"/>
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
