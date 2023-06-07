
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostPerSaleBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CostPerSaleBiddingScheme">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}BiddingScheme">
 *       <sequence>
 *         <element name="TargetCostPerSale" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostPerSaleBiddingScheme", propOrder = {
    "targetCostPerSale"
})
public class CostPerSaleBiddingScheme
    extends BiddingScheme
{

    @XmlElement(name = "TargetCostPerSale", nillable = true)
    protected Double targetCostPerSale;

    /**
     * Gets the value of the targetCostPerSale property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTargetCostPerSale() {
        return targetCostPerSale;
    }

    /**
     * Sets the value of the targetCostPerSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTargetCostPerSale(Double value) {
        this.targetCostPerSale = value;
    }

}
