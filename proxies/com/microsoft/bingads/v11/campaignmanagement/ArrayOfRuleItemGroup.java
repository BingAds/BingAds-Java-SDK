
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRuleItemGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRuleItemGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RuleItemGroup" type="{http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11}RuleItemGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRuleItemGroup", namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", propOrder = {
    "ruleItemGroups"
})
public class ArrayOfRuleItemGroup {

    @XmlElement(name = "RuleItemGroup", nillable = true)
    protected List<RuleItemGroup> ruleItemGroups;

    /**
     * Gets the value of the ruleItemGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleItemGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleItemGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleItemGroup }
     * 
     * 
     */
    public List<RuleItemGroup> getRuleItemGroups() {
        if (ruleItemGroups == null) {
            ruleItemGroups = new ArrayList<RuleItemGroup>();
        }
        return this.ruleItemGroups;
    }

}
