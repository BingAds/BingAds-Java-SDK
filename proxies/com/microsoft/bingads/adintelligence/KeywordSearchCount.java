
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordSearchCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordSearchCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Device" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HistoricalSearchCounts" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}ArrayOfHistoricalSearchCountPeriodic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordSearchCount", propOrder = {
    "keyword",
    "device",
    "historicalSearchCounts"
})
public class KeywordSearchCount {

    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "Device", nillable = true)
    protected String device;
    @XmlElement(name = "HistoricalSearchCounts", nillable = true)
    protected ArrayOfHistoricalSearchCountPeriodic historicalSearchCounts;

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

    /**
     * Gets the value of the historicalSearchCounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricalSearchCountPeriodic }
     *     
     */
    public ArrayOfHistoricalSearchCountPeriodic getHistoricalSearchCounts() {
        return historicalSearchCounts;
    }

    /**
     * Sets the value of the historicalSearchCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricalSearchCountPeriodic }
     *     
     */
    public void setHistoricalSearchCounts(ArrayOfHistoricalSearchCountPeriodic value) {
        this.historicalSearchCounts = value;
    }

}
