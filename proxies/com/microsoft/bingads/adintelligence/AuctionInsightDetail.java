
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuctionInsightDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuctionInsightDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeInterval" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}AuctionInsightTimeInterval" minOccurs="0"/>
 *         &lt;element name="AuctionInsightKPIs" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}ArrayOfAuctionInsightKPI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionInsightDetail", propOrder = {
    "timeInterval",
    "auctionInsightKPIs"
})
public class AuctionInsightDetail {

    @XmlElement(name = "TimeInterval")
    @XmlSchemaType(name = "string")
    protected AuctionInsightTimeInterval timeInterval;
    @XmlElement(name = "AuctionInsightKPIs", nillable = true)
    protected ArrayOfAuctionInsightKPI auctionInsightKPIs;

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
     * Gets the value of the auctionInsightKPIs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuctionInsightKPI }
     *     
     */
    public ArrayOfAuctionInsightKPI getAuctionInsightKPIs() {
        return auctionInsightKPIs;
    }

    /**
     * Sets the value of the auctionInsightKPIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuctionInsightKPI }
     *     
     */
    public void setAuctionInsightKPIs(ArrayOfAuctionInsightKPI value) {
        this.auctionInsightKPIs = value;
    }

}
