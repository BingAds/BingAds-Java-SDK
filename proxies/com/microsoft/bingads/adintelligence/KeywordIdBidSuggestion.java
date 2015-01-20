
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordIdBidSuggestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordIdBidSuggestion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MainLine1" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}KeywordIdEstimatedBid" minOccurs="0"/>
 *         &lt;element name="MainLine" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}KeywordIdEstimatedBid" minOccurs="0"/>
 *         &lt;element name="FirstPage" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}KeywordIdEstimatedBid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordIdBidSuggestion", propOrder = {
    "mainLine1",
    "mainLine",
    "firstPage"
})
public class KeywordIdBidSuggestion {

    @XmlElement(name = "MainLine1", nillable = true)
    protected KeywordIdEstimatedBid mainLine1;
    @XmlElement(name = "MainLine", nillable = true)
    protected KeywordIdEstimatedBid mainLine;
    @XmlElement(name = "FirstPage", nillable = true)
    protected KeywordIdEstimatedBid firstPage;

    /**
     * Gets the value of the mainLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordIdEstimatedBid }
     *     
     */
    public KeywordIdEstimatedBid getMainLine1() {
        return mainLine1;
    }

    /**
     * Sets the value of the mainLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordIdEstimatedBid }
     *     
     */
    public void setMainLine1(KeywordIdEstimatedBid value) {
        this.mainLine1 = value;
    }

    /**
     * Gets the value of the mainLine property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordIdEstimatedBid }
     *     
     */
    public KeywordIdEstimatedBid getMainLine() {
        return mainLine;
    }

    /**
     * Sets the value of the mainLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordIdEstimatedBid }
     *     
     */
    public void setMainLine(KeywordIdEstimatedBid value) {
        this.mainLine = value;
    }

    /**
     * Gets the value of the firstPage property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordIdEstimatedBid }
     *     
     */
    public KeywordIdEstimatedBid getFirstPage() {
        return firstPage;
    }

    /**
     * Sets the value of the firstPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordIdEstimatedBid }
     *     
     */
    public void setFirstPage(KeywordIdEstimatedBid value) {
        this.firstPage = value;
    }

}
