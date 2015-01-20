
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TacticChannelReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TacticChannelReportFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChannelIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="TacticIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="ThirdPartyAdGroupIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="ThirdPartyCampaignIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TacticChannelReportFilter", propOrder = {
    "channelIds",
    "tacticIds",
    "thirdPartyAdGroupIds",
    "thirdPartyCampaignIds"
})
public class TacticChannelReportFilter {

    @XmlElement(name = "ChannelIds", nillable = true)
    protected ArrayOflong channelIds;
    @XmlElement(name = "TacticIds", nillable = true)
    protected ArrayOflong tacticIds;
    @XmlElement(name = "ThirdPartyAdGroupIds", nillable = true)
    protected ArrayOflong thirdPartyAdGroupIds;
    @XmlElement(name = "ThirdPartyCampaignIds", nillable = true)
    protected ArrayOflong thirdPartyCampaignIds;

    /**
     * Gets the value of the channelIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getChannelIds() {
        return channelIds;
    }

    /**
     * Sets the value of the channelIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setChannelIds(ArrayOflong value) {
        this.channelIds = value;
    }

    /**
     * Gets the value of the tacticIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getTacticIds() {
        return tacticIds;
    }

    /**
     * Sets the value of the tacticIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setTacticIds(ArrayOflong value) {
        this.tacticIds = value;
    }

    /**
     * Gets the value of the thirdPartyAdGroupIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getThirdPartyAdGroupIds() {
        return thirdPartyAdGroupIds;
    }

    /**
     * Sets the value of the thirdPartyAdGroupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setThirdPartyAdGroupIds(ArrayOflong value) {
        this.thirdPartyAdGroupIds = value;
    }

    /**
     * Gets the value of the thirdPartyCampaignIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getThirdPartyCampaignIds() {
        return thirdPartyCampaignIds;
    }

    /**
     * Sets the value of the thirdPartyCampaignIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setThirdPartyCampaignIds(ArrayOflong value) {
        this.thirdPartyCampaignIds = value;
    }

}
