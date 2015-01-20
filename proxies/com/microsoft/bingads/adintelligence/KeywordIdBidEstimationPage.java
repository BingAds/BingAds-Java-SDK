
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordIdBidEstimationPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordIdBidEstimationPage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalNumEntries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Entries" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}ArrayOfKeywordIdBidEstimation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordIdBidEstimationPage", propOrder = {
    "totalNumEntries",
    "entries"
})
public class KeywordIdBidEstimationPage {

    @XmlElement(name = "TotalNumEntries")
    protected Integer totalNumEntries;
    @XmlElement(name = "Entries", nillable = true)
    protected ArrayOfKeywordIdBidEstimation entries;

    /**
     * Gets the value of the totalNumEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumEntries() {
        return totalNumEntries;
    }

    /**
     * Sets the value of the totalNumEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumEntries(Integer value) {
        this.totalNumEntries = value;
    }

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordIdBidEstimation }
     *     
     */
    public ArrayOfKeywordIdBidEstimation getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordIdBidEstimation }
     *     
     */
    public void setEntries(ArrayOfKeywordIdBidEstimation value) {
        this.entries = value;
    }

}
