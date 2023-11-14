
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageVisitorsWhoVisitedAnotherPageRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PageVisitorsWhoVisitedAnotherPageRule">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}RemarketingRule">
 *       <sequence>
 *         <element name="AnotherRuleItemGroups" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfRuleItemGroup" minOccurs="0"/>
 *         <element name="RuleItemGroups" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfRuleItemGroup" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageVisitorsWhoVisitedAnotherPageRule", propOrder = {
    "anotherRuleItemGroups",
    "ruleItemGroups"
})
public class PageVisitorsWhoVisitedAnotherPageRule
    extends RemarketingRule
{
    public PageVisitorsWhoVisitedAnotherPageRule() {
      this.type = "PageVisitorsWhoVisitedAnotherPage";
    }

    @XmlElement(name = "AnotherRuleItemGroups", nillable = true)
    protected ArrayOfRuleItemGroup anotherRuleItemGroups;
    @XmlElement(name = "RuleItemGroups", nillable = true)
    protected ArrayOfRuleItemGroup ruleItemGroups;

    /**
     * Gets the value of the anotherRuleItemGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRuleItemGroup }
     *     
     */
    public ArrayOfRuleItemGroup getAnotherRuleItemGroups() {
        return anotherRuleItemGroups;
    }

    /**
     * Sets the value of the anotherRuleItemGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRuleItemGroup }
     *     
     */
    public void setAnotherRuleItemGroups(ArrayOfRuleItemGroup value) {
        this.anotherRuleItemGroups = value;
    }

    /**
     * Gets the value of the ruleItemGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRuleItemGroup }
     *     
     */
    public ArrayOfRuleItemGroup getRuleItemGroups() {
        return ruleItemGroups;
    }

    /**
     * Sets the value of the ruleItemGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRuleItemGroup }
     *     
     */
    public void setRuleItemGroups(ArrayOfRuleItemGroup value) {
        this.ruleItemGroups = value;
    }

}
