
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PercentCpcBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PercentCpcBiddingScheme">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}BiddingScheme">
 *       &lt;sequence>
 *         &lt;element name="MaxPercentCpc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
