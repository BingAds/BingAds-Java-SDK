
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetCpaBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetCpaBiddingScheme">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v11}BiddingScheme">
 *       &lt;sequence>
 *         &lt;element name="MaxCpc" type="{https://bingads.microsoft.com/CampaignManagement/v11}Bid" minOccurs="0"/>
 *         &lt;element name="TargetCpa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetCpaBiddingScheme", propOrder = {
    "maxCpc",
    "targetCpa"
})
public class TargetCpaBiddingScheme
    extends BiddingScheme
{

    @XmlElement(name = "MaxCpc", nillable = true)
    protected Bid maxCpc;
    @XmlElement(name = "TargetCpa", required = true, type = Double.class, nillable = true)
    protected Double targetCpa;

    /**
     * Gets the value of the maxCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getMaxCpc() {
        return maxCpc;
    }

    /**
     * Sets the value of the maxCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setMaxCpc(Bid value) {
        this.maxCpc = value;
    }

    /**
     * Gets the value of the targetCpa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTargetCpa() {
        return targetCpa;
    }

    /**
     * Sets the value of the targetCpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTargetCpa(Double value) {
        this.targetCpa = value;
    }

}
