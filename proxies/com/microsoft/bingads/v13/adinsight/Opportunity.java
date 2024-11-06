
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Opportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Opportunity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OpportunityKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opportunity", propOrder = {
    "type",
    "opportunityKey"
})
@XmlSeeAlso({
    BidOpportunity.class,
    BudgetOpportunity.class,
    KeywordOpportunity.class
})
public class Opportunity {
    protected String type;

    public String getType() {
        return type;
    }
    public void setType(String value) {

    }
    @XmlElement(name = "OpportunityKey", nillable = true)
    protected String opportunityKey;

    /**
     * Gets the value of the opportunityKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityKey() {
        return opportunityKey;
    }

    /**
     * Sets the value of the opportunityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityKey(String value) {
        this.opportunityKey = value;
    }

}
