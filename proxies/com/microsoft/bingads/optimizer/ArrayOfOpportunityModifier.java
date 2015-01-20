
package com.microsoft.bingads.optimizer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOpportunityModifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOpportunityModifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OpportunityModifier" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}OpportunityModifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOpportunityModifier", propOrder = {
    "opportunityModifiers"
})
public class ArrayOfOpportunityModifier {

    @XmlElement(name = "OpportunityModifier", nillable = true)
    protected List<OpportunityModifier> opportunityModifiers;

    /**
     * Gets the value of the opportunityModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityModifier }
     * 
     * 
     */
    public List<OpportunityModifier> getOpportunityModifiers() {
        if (opportunityModifiers == null) {
            opportunityModifiers = new ArrayList<OpportunityModifier>();
        }
        return this.opportunityModifiers;
    }

}
