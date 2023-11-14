
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageVisitorsRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PageVisitorsRule">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}RemarketingRule">
 *       <sequence>
 *         <element name="NormalForm" type="{https://bingads.microsoft.com/CampaignManagement/v13}NormalForm" minOccurs="0"/>
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
@XmlType(name = "PageVisitorsRule", propOrder = {
    "normalForm",
    "ruleItemGroups"
})
public class PageVisitorsRule
    extends RemarketingRule
{
    public PageVisitorsRule() {
      this.type = "PageVisitors";
    }

    @XmlElement(name = "NormalForm", nillable = true)
    @XmlSchemaType(name = "string")
    protected NormalForm normalForm;
    @XmlElement(name = "RuleItemGroups", nillable = true)
    protected ArrayOfRuleItemGroup ruleItemGroups;

    /**
     * Gets the value of the normalForm property.
     * 
     * @return
     *     possible object is
     *     {@link NormalForm }
     *     
     */
    public NormalForm getNormalForm() {
        return normalForm;
    }

    /**
     * Sets the value of the normalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link NormalForm }
     *     
     */
    public void setNormalForm(NormalForm value) {
        this.normalForm = value;
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
