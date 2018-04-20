
package com.microsoft.bingads.v12.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordKPI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordKPI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Device" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MatchType" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V12.Entity}MatchType" minOccurs="0"/>
 *         &lt;element name="AdPosition" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V12.Entity}AdPosition" minOccurs="0"/>
 *         &lt;element name="Clicks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Impressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AverageCPC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CTR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AverageBid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordKPI", propOrder = {
    "device",
    "matchType",
    "adPosition",
    "clicks",
    "impressions",
    "averageCPC",
    "ctr",
    "totalCost",
    "averageBid"
})
public class KeywordKPI {

    @XmlElement(name = "Device", nillable = true)
    protected String device;
    @XmlElement(name = "MatchType")
    @XmlSchemaType(name = "string")
    protected MatchType matchType;
    @XmlElement(name = "AdPosition")
    @XmlSchemaType(name = "string")
    protected AdPosition adPosition;
    @XmlElement(name = "Clicks")
    protected Integer clicks;
    @XmlElement(name = "Impressions")
    protected Long impressions;
    @XmlElement(name = "AverageCPC")
    protected Double averageCPC;
    @XmlElement(name = "CTR")
    protected Double ctr;
    @XmlElement(name = "TotalCost")
    protected Double totalCost;
    @XmlElement(name = "AverageBid")
    protected Double averageBid;

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
     * Gets the value of the matchType property.
     * 
     * @return
     *     possible object is
     *     {@link MatchType }
     *     
     */
    public MatchType getMatchType() {
        return matchType;
    }

    /**
     * Sets the value of the matchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchType }
     *     
     */
    public void setMatchType(MatchType value) {
        this.matchType = value;
    }

    /**
     * Gets the value of the adPosition property.
     * 
     * @return
     *     possible object is
     *     {@link AdPosition }
     *     
     */
    public AdPosition getAdPosition() {
        return adPosition;
    }

    /**
     * Sets the value of the adPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdPosition }
     *     
     */
    public void setAdPosition(AdPosition value) {
        this.adPosition = value;
    }

    /**
     * Gets the value of the clicks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClicks() {
        return clicks;
    }

    /**
     * Sets the value of the clicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClicks(Integer value) {
        this.clicks = value;
    }

    /**
     * Gets the value of the impressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImpressions() {
        return impressions;
    }

    /**
     * Sets the value of the impressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImpressions(Long value) {
        this.impressions = value;
    }

    /**
     * Gets the value of the averageCPC property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageCPC() {
        return averageCPC;
    }

    /**
     * Sets the value of the averageCPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageCPC(Double value) {
        this.averageCPC = value;
    }

    /**
     * Gets the value of the ctr property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCTR() {
        return ctr;
    }

    /**
     * Sets the value of the ctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCTR(Double value) {
        this.ctr = value;
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCost(Double value) {
        this.totalCost = value;
    }

    /**
     * Gets the value of the averageBid property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageBid() {
        return averageBid;
    }

    /**
     * Sets the value of the averageBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageBid(Double value) {
        this.averageBid = value;
    }

}
