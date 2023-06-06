
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InheritFromParentBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InheritFromParentBiddingScheme">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}BiddingScheme">
 *       <sequence>
 *         <element name="InheritedBidStrategyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InheritFromParentBiddingScheme", propOrder = {
    "inheritedBidStrategyType"
})
public class InheritFromParentBiddingScheme
    extends BiddingScheme
{

    @XmlElement(name = "InheritedBidStrategyType", nillable = true)
    protected String inheritedBidStrategyType;

    /**
     * Gets the value of the inheritedBidStrategyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInheritedBidStrategyType() {
        return inheritedBidStrategyType;
    }

    /**
     * Sets the value of the inheritedBidStrategyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInheritedBidStrategyType(String value) {
        this.inheritedBidStrategyType = value;
    }

}
