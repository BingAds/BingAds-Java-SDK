
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupCriterionAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdGroupCriterionAction">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Action" type="{https://bingads.microsoft.com/CampaignManagement/v13}ItemAction"/>
 *         <element name="AdGroupCriterion" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdGroupCriterion" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupCriterionAction", propOrder = {
    "action",
    "adGroupCriterion"
})
public class AdGroupCriterionAction {

    @XmlElement(name = "Action", required = true)
    @XmlSchemaType(name = "string")
    protected ItemAction action;
    @XmlElement(name = "AdGroupCriterion", nillable = true)
    protected AdGroupCriterion adGroupCriterion;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ItemAction }
     *     
     */
    public ItemAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAction }
     *     
     */
    public void setAction(ItemAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the adGroupCriterion property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupCriterion }
     *     
     */
    public AdGroupCriterion getAdGroupCriterion() {
        return adGroupCriterion;
    }

    /**
     * Sets the value of the adGroupCriterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupCriterion }
     *     
     */
    public void setAdGroupCriterion(AdGroupCriterion value) {
        this.adGroupCriterion = value;
    }

}
