
package com.microsoft.bingads.v10.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupBidLandscape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupBidLandscape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AdGroupBidLandscapeType" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity}AdGroupBidLandscapeType" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity}DayMonthAndYear" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity}DayMonthAndYear" minOccurs="0"/>
 *         &lt;element name="BidLandscapePoints" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity}ArrayOfBidLandscapePoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupBidLandscape", propOrder = {
    "adGroupId",
    "adGroupBidLandscapeType",
    "startDate",
    "endDate",
    "bidLandscapePoints"
})
public class AdGroupBidLandscape {

    @XmlElement(name = "AdGroupId")
    protected Long adGroupId;
    @XmlElement(name = "AdGroupBidLandscapeType")
    @XmlSchemaType(name = "string")
    protected AdGroupBidLandscapeType adGroupBidLandscapeType;
    @XmlElement(name = "StartDate", nillable = true)
    protected DayMonthAndYear startDate;
    @XmlElement(name = "EndDate", nillable = true)
    protected DayMonthAndYear endDate;
    @XmlElement(name = "BidLandscapePoints", nillable = true)
    protected ArrayOfBidLandscapePoint bidLandscapePoints;

    /**
     * Gets the value of the adGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the value of the adGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdGroupId(Long value) {
        this.adGroupId = value;
    }

    /**
     * Gets the value of the adGroupBidLandscapeType property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupBidLandscapeType }
     *     
     */
    public AdGroupBidLandscapeType getAdGroupBidLandscapeType() {
        return adGroupBidLandscapeType;
    }

    /**
     * Sets the value of the adGroupBidLandscapeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupBidLandscapeType }
     *     
     */
    public void setAdGroupBidLandscapeType(AdGroupBidLandscapeType value) {
        this.adGroupBidLandscapeType = value;
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
