
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageVisitorsWhoVisitedAnotherPageRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageVisitorsWhoVisitedAnotherPageRule">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v12}RemarketingRule">
 *       &lt;sequence>
 *         &lt;element name="AnotherRuleItemGroups" type="{https://bingads.microsoft.com/CampaignManagement/v12}ArrayOfRuleItemGroup" minOccurs="0"/>
 *         &lt;element name="RuleItemGroups" type="{https://bingads.microsoft.com/CampaignManagement/v12}ArrayOfRuleItemGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
