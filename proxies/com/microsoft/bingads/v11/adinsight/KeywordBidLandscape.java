
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordBidLandscape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordBidLandscape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeywordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}DayMonthAndYear" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}DayMonthAndYear" minOccurs="0"/>
 *         &lt;element name="BidLandscapePoints" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}ArrayOfBidLandscapePoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordBidLandscape", propOrder = {
    "keywordId",
    "startDate",
    "endDate",
    "bidLandscapePoints"
})
public class KeywordBidLandscape {

    @XmlElement(name = "KeywordId")
    protected Long keywordId;
    @XmlElement(name = "StartDate", nillable = true)
    protected DayMonthAndYear startDate;
    @XmlElement(name = "EndDate", nillable = true)
    protected DayMonthAndYear endDate;
    @XmlElement(name = "BidLandscapePoints", nillable = true)
    protected ArrayOfBidLandscapePoint bidLandscapePoints;

    /**
     * Gets the value of the keywordId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeywordId() {
        return keywordId;
    }

    /**
     * Sets the value of the keywordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeywordId(Long value) {
        this.keywordId = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DayMonthAndYear }
     *     
     */
    public DayMonthAndYear getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayMonthAndYear }
     *     
     */
    public void setStartDate(DayMonthAndYear value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link DayMonthAndYear }
     *     
     */
    public DayMonthAndYear getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayMonthAndYear }
     *     
     */
    public void setEndDate(DayMonthAndYear value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the bidLandscapePoints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBidLandscapePoint }
     *     
     */
    public ArrayOfBidLandscapePoint getBidLandscapePoints() {
        return bidLandscapePoints;
    }

    /**
     * Sets the value of the bidLandscapePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBidLandscapePoint }
     *     
     */
    public void setBidLandscapePoints(ArrayOfBidLandscapePoint value) {
        this.bidLandscapePoints = value;
    }

}
