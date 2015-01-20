
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuctionInsightAvailableChildrenDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuctionInsightAvailableChildrenDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParentEntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TimeInterval" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}AuctionInsightTimeInterval" minOccurs="0"/>
 *         &lt;element name="Entries" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}ArrayOfAuctionInsightAvailableEntry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionInsightAvailableChildrenDetail", propOrder = {
    "parentEntityId",
    "timeInterval",
    "entries"
})
public class AuctionInsightAvailableChildrenDetail {

    @XmlElement(name = "ParentEntityId")
    protected Long parentEntityId;
    @XmlElement(name = "TimeInterval")
    @XmlSchemaType(name = "string")
    protected AuctionInsightTimeInterval timeInterval;
    @XmlElement(name = "Entries", nillable = true)
    protected ArrayOfAuctionInsightAvailableEntry entries;

    /**
     * Gets the value of the parentEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentEntityId() {
        return parentEntityId;
    }

    /**
     * Sets the value of the parentEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentEntityId(Long value) {
        this.parentEntityId = value;
    }

    /**
     * Gets the value of the timeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionInsightTimeInterval }
     *     
     */
    public AuctionInsightTimeInterval getTimeInterval() {
        return timeInterval;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionInsightTimeInterval }
     *     
     */
    public void setTimeInterval(AuctionInsightTimeInterval value) {
        this.timeInterval = value;
    }

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuctionInsightAvailableEntry }
     *     
     */
    public ArrayOfAuctionInsightAvailableEntry getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuctionInsightAvailableEntry }
     *     
     */
    public void setEntries(ArrayOfAuctionInsightAvailableEntry value) {
        this.entries = value;
    }

}
