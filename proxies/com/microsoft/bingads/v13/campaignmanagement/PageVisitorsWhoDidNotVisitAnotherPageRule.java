
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageVisitorsWhoDidNotVisitAnotherPageRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PageVisitorsWhoDidNotVisitAnotherPageRule">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}RemarketingRule">
 *       <sequence>
 *         <element name="ExcludeRuleItemGroups" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfRuleItemGroup" minOccurs="0"/>
 *         <element name="IncludeRuleItemGroups" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfRuleItemGroup" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageVisitorsWhoDidNotVisitAnotherPageRule", propOrder = {
    "excludeRuleItemGroups",
    "includeRuleItemGroups"
})
public class PageVisitorsWhoDidNotVisitAnotherPageRule
    extends RemarketingRule
{

    @XmlElement(name = "ExcludeRuleItemGroups", nillable = true)
    protected ArrayOfRuleItemGroup excludeRuleItemGroups;
    @XmlElement(name = "IncludeRuleItemGroups", nillable = true)
    protected ArrayOfRuleItemGroup includeRuleItemGroups;

    /**
     * Gets the value of the excludeRuleItemGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRuleItemGroup }
     *     
     */
    public ArrayOfRuleItemGroup getExcludeRuleItemGroups() {
        return excludeRuleItemGroups;
    }

    /**
     * Sets the value of the excludeRuleItemGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRuleItemGroup }
     *     
     */
    public void setExcludeRuleItemGroups(ArrayOfRuleItemGroup value) {
        this.excludeRuleItemGroups = value;
    }

    /**
     * Gets the value of the includeRuleItemGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRuleItemGroup }
     *     
     */
    public ArrayOfRuleItemGroup getIncludeRuleItemGroups() {
        return includeRuleItemGroups;
    }

    /**
     * Sets the value of the includeRuleItemGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRuleItemGroup }
     *     
     */
    public void setIncludeRuleItemGroups(ArrayOfRuleItemGroup value) {
        this.includeRuleItemGroups = value;
    }

}
