
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManualCpcBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ManualCpcBiddingScheme">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}BiddingScheme">
 *       <sequence>
 *         <element name="ManualCpc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualCpcBiddingScheme", propOrder = {
    "manualCpc"
})
public class ManualCpcBiddingScheme
    extends BiddingScheme
{
    public ManualCpcBiddingScheme() {
      this.type = "ManualCpc";
    }

    @XmlElement(name = "ManualCpc", nillable = true)
    protected Double manualCpc;

    /**
     * Gets the value of the manualCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getManualCpc() {
        return manualCpc;
    }

    /**
     * Sets the value of the manualCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setManualCpc(Double value) {
        this.manualCpc = value;
    }

}
