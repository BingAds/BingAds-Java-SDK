
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BroadMatchKeywordOpportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BroadMatchKeywordOpportunity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}KeywordOpportunity">
 *       &lt;sequence>
 *         &lt;element name="AverageCPC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AverageCTR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ClickShare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ImpressionShare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ReferenceKeywordBid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ReferenceKeywordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReferenceKeywordMatchType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SearchQueryKPIs" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}ArrayOfBroadMatchSearchQueryKPI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BroadMatchKeywordOpportunity", propOrder = {
    "averageCPC",
    "averageCTR",
    "clickShare",
    "impressionShare",
    "referenceKeywordBid",
    "referenceKeywordId",
    "referenceKeywordMatchType",
    "searchQueryKPIs"
})
public class BroadMatchKeywordOpportunity
    extends KeywordOpportunity
{

    @XmlElement(name = "AverageCPC")
    protected Double averageCPC;
    @XmlElement(name = "AverageCTR")
    protected Double averageCTR;
    @XmlElement(name = "ClickShare")
    protected Double clickShare;
    @XmlElement(name = "ImpressionShare")
    protected Double impressionShare;
    @XmlElement(name = "ReferenceKeywordBid")
    protected Double referenceKeywordBid;
    @XmlElement(name = "ReferenceKeywordId")
    protected Long referenceKeywordId;
    @XmlElement(name = "ReferenceKeywordMatchType")
    protected Integer referenceKeywordMatchType;
    @XmlElement(name = "SearchQueryKPIs", nillable = true)
    protected ArrayOfBroadMatchSearchQueryKPI searchQueryKPIs;

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
     * Gets the value of the averageCTR property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageCTR() {
        return averageCTR;
    }

    /**
     * Sets the value of the averageCTR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageCTR(Double value) {
        this.averageCTR = value;
    }

    /**
     * Gets the value of the clickShare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClickShare() {
        return clickShare;
    }

    /**
     * Sets the value of the clickShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClickShare(Double value) {
        this.clickShare = value;
    }

    /**
     * Gets the value of the impressionShare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImpressionShare() {
        return impressionShare;
    }

    /**
     * Sets the value of the impressionShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImpressionShare(Double value) {
        this.impressionShare = value;
    }

    /**
     * Gets the value of the referenceKeywordBid property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReferenceKeywordBid() {
        return referenceKeywordBid;
    }

    /**
     * Sets the value of the referenceKeywordBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReferenceKeywordBid(Double value) {
        this.referenceKeywordBid = value;
    }

    /**
     * Gets the value of the referenceKeywordId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReferenceKeywordId() {
        return referenceKeywordId;
    }

    /**
     * Sets the value of the referenceKeywordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReferenceKeywordId(Long value) {
        this.referenceKeywordId = value;
    }

    /**
     * Gets the value of the referenceKeywordMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferenceKeywordMatchType() {
        return referenceKeywordMatchType;
    }

    /**
     * Sets the value of the referenceKeywordMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferenceKeywordMatchType(Integer value) {
        this.referenceKeywordMatchType = value;
    }

    /**
     * Gets the value of the searchQueryKPIs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBroadMatchSearchQueryKPI }
     *     
     */
    public ArrayOfBroadMatchSearchQueryKPI getSearchQueryKPIs() {
        return searchQueryKPIs;
    }

    /**
     * Sets the value of the searchQueryKPIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBroadMatchSearchQueryKPI }
     *     
     */
    public void setSearchQueryKPIs(ArrayOfBroadMatchSearchQueryKPI value) {
        this.searchQueryKPIs = value;
    }

}
