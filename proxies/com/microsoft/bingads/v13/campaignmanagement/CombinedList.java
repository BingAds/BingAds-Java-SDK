
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CombinedList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CombinedList">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Audience">
 *       <sequence>
 *         <element name="CombinationRules" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfCombinationRule" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
