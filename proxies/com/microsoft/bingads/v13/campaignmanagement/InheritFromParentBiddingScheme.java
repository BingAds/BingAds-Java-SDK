
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InheritFromParentBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InheritFromParentBiddingScheme">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}BiddingScheme">
 *       &lt;sequence>
 *         &lt;element name="InheritedBidStrategyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
