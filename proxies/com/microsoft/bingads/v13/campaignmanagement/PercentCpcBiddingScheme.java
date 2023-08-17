
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PercentCpcBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PercentCpcBiddingScheme">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}BiddingScheme">
 *       <sequence>
 *         <element name="MaxPercentCpc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentCpcBiddingScheme", propOrder = {
    "maxPercentCpc"
})
public class PercentCpcBiddingScheme
    extends BiddingScheme
{
    public PercentCpcBiddingScheme() {
      this.type = "PercentCpcBiddingScheme";
    }

    @XmlElement(name = "MaxPercentCpc", nillable = true)
    protected Double maxPercentCpc;

    /**
     * Gets the value of the maxPercentCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxPercentCpc() {
        return maxPercentCpc;
    }

    /**
     * Sets the value of the maxPercentCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxPercentCpc(Double value) {
        this.maxPercentCpc = value;
    }

}
