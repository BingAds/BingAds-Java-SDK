
package com.microsoft.bingads.v10.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageVisitorsRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageVisitorsRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10}RemarketingRule">
 *       &lt;sequence>
 *         &lt;element name="RuleItemGroups" type="{http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10}ArrayOfRuleItemGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageVisitorsRule", namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", propOrder = {
    "ruleItemGroups"
})
public class PageVisitorsRule
    extends RemarketingRule
{

    @XmlElement(name = "RuleItemGroups", nillable = true)
    protected ArrayOfRuleItemGroup ruleItemGroups;

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
