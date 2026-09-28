
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelPlacementCriterion complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="ChannelPlacementCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="ChannelId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ChannelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ChannelPlacementId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="ChannelPlacementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SubChannelId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="SubChannelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelPlacementCriterion", propOrder = {
    "channelId",
    "channelName",
    "channelPlacementId",
    "channelPlacementName",
    "subChannelId",
    "subChannelName"
})
public class ChannelPlacementCriterion
    extends Criterion
{
    public ChannelPlacementCriterion() {
        this.type = "ChannelPlacementCriterion";
    }

    @XmlElement(name = "ChannelId")
    protected Integer channelId;
    @XmlElement(name = "ChannelName", nillable = true)
    protected String channelName;
    @XmlElement(name = "ChannelPlacementId")
    protected Long channelPlacementId;
    @XmlElement(name = "ChannelPlacementName", nillable = true)
    protected String channelPlacementName;
    @XmlElement(name = "SubChannelId", nillable = true)
    protected Integer subChannelId;
    @XmlElement(name = "SubChannelName", nillable = true)
    protected String subChannelName;

    /**
     * Gets the value of the channelId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setChannelId(Integer value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the channelName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Sets the value of the channelName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setChannelName(String value) {
        this.channelName = value;
    }

    /**
     * Gets the value of the channelPlacementId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getChannelPlacementId() {
        return channelPlacementId;
    }

    /**
     * Sets the value of the channelPlacementId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setChannelPlacementId(Long value) {
        this.channelPlacementId = value;
    }

    /**
     * Gets the value of the channelPlacementName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getChannelPlacementName() {
        return channelPlacementName;
    }

    /**
     * Sets the value of the channelPlacementName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setChannelPlacementName(String value) {
        this.channelPlacementName = value;
    }

    /**
     * Gets the value of the subChannelId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSubChannelId() {
        return subChannelId;
    }

    /**
     * Sets the value of the subChannelId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSubChannelId(Integer value) {
        this.subChannelId = value;
    }

    /**
     * Gets the value of the subChannelName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubChannelName() {
        return subChannelName;
    }

    /**
     * Sets the value of the subChannelName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubChannelName(String value) {
        this.subChannelName = value;
    }

}
