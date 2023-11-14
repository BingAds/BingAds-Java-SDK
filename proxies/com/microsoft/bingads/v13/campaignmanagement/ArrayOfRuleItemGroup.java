
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfRuleItemGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfRuleItemGroup">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RuleItemGroup" type="{https://bingads.microsoft.com/CampaignManagement/v13}RuleItemGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRuleItemGroup", propOrder = {
    "ruleItemGroups"
})
public class ArrayOfRuleItemGroup {

    @XmlElement(name = "RuleItemGroup", nillable = true)
    protected List<RuleItemGroup> ruleItemGroups;
    public ArrayOfRuleItemGroup()
    {
      this.ruleItemGroups = new ArrayList<RuleItemGroup>();
    }
    @JsonCreator
    public ArrayOfRuleItemGroup(List<RuleItemGroup> ruleitemgroups)
    {
      this.ruleItemGroups = ruleitemgroups;
    }

    /**
     * Gets the value of the ruleItemGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ruleItemGroups property.
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
     * @return
     *     The value of the ruleItemGroups property.
     */
    public List<RuleItemGroup> getRuleItemGroups() {
        if (ruleItemGroups == null) {
            ruleItemGroups = new ArrayList<>();
        }
        return this.ruleItemGroups;
    }

}
