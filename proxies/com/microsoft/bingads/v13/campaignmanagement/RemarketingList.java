
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemarketingList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemarketingList">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Audience">
 *       &lt;sequence>
 *         &lt;element name="Rule" type="{https://bingads.microsoft.com/CampaignManagement/v13}RemarketingRule" minOccurs="0"/>
 *         &lt;element name="TagId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemarketingList", propOrder = {
    "rule",
    "tagId"
})
public class RemarketingList
    extends Audience
{

    @XmlElement(name = "Rule", nillable = true)
    protected RemarketingRule rule;
    @XmlElement(name = "TagId", nillable = true)
    protected Long tagId;

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link RemarketingRule }
     *     
     */
    public RemarketingRule getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarketingRule }
     *     
     */
    public void setRule(RemarketingRule value) {
        this.rule = value;
    }

    /**
     * Gets the value of the tagId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * Sets the value of the tagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTagId(Long value) {
        this.tagId = value;
    }

}
