
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CombinedList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CombinedList">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Audience">
 *       &lt;sequence>
 *         &lt;element name="CombinationRules" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfCombinationRule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CombinedList", propOrder = {
    "combinationRules"
})
public class CombinedList
    extends Audience
{

    @XmlElement(name = "CombinationRules", nillable = true)
    protected ArrayOfCombinationRule combinationRules;

    /**
     * Gets the value of the combinationRules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCombinationRule }
     *     
     */
    public ArrayOfCombinationRule getCombinationRules() {
        return combinationRules;
    }

    /**
     * Sets the value of the combinationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCombinationRule }
     *     
     */
    public void setCombinationRules(ArrayOfCombinationRule value) {
        this.combinationRules = value;
    }

}
