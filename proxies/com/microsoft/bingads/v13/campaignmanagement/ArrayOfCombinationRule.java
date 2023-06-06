
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCombinationRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCombinationRule">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CombinationRule" type="{https://bingads.microsoft.com/CampaignManagement/v13}CombinationRule" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCombinationRule", propOrder = {
    "combinationRules"
})
public class ArrayOfCombinationRule {

    @XmlElement(name = "CombinationRule", nillable = true)
    protected List<CombinationRule> combinationRules;

    /**
     * Gets the value of the combinationRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the combinationRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombinationRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CombinationRule }
     * 
     * 
     * @return
     *     The value of the combinationRules property.
     */
    public List<CombinationRule> getCombinationRules() {
        if (combinationRules == null) {
            combinationRules = new ArrayList<>();
        }
        return this.combinationRules;
    }

}
