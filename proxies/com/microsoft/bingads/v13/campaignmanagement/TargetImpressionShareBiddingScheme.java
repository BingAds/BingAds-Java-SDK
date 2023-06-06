
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetImpressionShareBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetImpressionShareBiddingScheme">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}BiddingScheme">
 *       &lt;sequence>
 *         &lt;element name="MaxCpc" type="{https://bingads.microsoft.com/CampaignManagement/v13}Bid" minOccurs="0"/>
 *         &lt;element name="TargetAdPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetImpressionShare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetImpressionShareBiddingScheme", propOrder = {
    "maxCpc",
    "targetAdPosition",
    "targetImpressionShare"
})
public class TargetImpressionShareBiddingScheme
    extends BiddingScheme
{

    @XmlElement(name = "MaxCpc", nillable = true)
    protected Bid maxCpc;
    @XmlElement(name = "TargetAdPosition", nillable = true)
    protected String targetAdPosition;
    @XmlElement(name = "TargetImpressionShare", nillable = true)
    protected Double targetImpressionShare;

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
     * Gets the value of the targetAdPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetAdPosition() {
        return targetAdPosition;
    }

    /**
     * Sets the value of the targetAdPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetAdPosition(String value) {
        this.targetAdPosition = value;
    }

    /**
     * Gets the value of the targetImpressionShare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTargetImpressionShare() {
        return targetImpressionShare;
    }

    /**
     * Sets the value of the targetImpressionShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTargetImpressionShare(Double value) {
        this.targetImpressionShare = value;
    }

}
