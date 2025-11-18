
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignBidLandscape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CampaignBidLandscape">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CampaignBidLandscapeType" type="{https://bingads.microsoft.com/AdInsight/v13}CampaignBidLandscapeType" minOccurs="0"/>
 *         <element name="StartDate" type="{https://bingads.microsoft.com/AdInsight/v13}DayMonthAndYear" minOccurs="0"/>
 *         <element name="EndDate" type="{https://bingads.microsoft.com/AdInsight/v13}DayMonthAndYear" minOccurs="0"/>
 *         <element name="CampaignBidLandscapePoints" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfCampaignBidLandscapePoint" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignBidLandscape", propOrder = {
    "campaignId",
    "campaignBidLandscapeType",
    "startDate",
    "endDate",
    "campaignBidLandscapePoints"
})
public class CampaignBidLandscape {

    @XmlElement(name = "CampaignId")
    protected Long campaignId;
    @XmlElement(name = "CampaignBidLandscapeType")
    @XmlSchemaType(name = "string")
    protected CampaignBidLandscapeType campaignBidLandscapeType;
    @XmlElement(name = "StartDate", nillable = true)
    protected DayMonthAndYear startDate;
    @XmlElement(name = "EndDate", nillable = true)
    protected DayMonthAndYear endDate;
    @XmlElement(name = "CampaignBidLandscapePoints", nillable = true)
    protected ArrayOfCampaignBidLandscapePoint campaignBidLandscapePoints;

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignId(Long value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the campaignBidLandscapeType property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignBidLandscapeType }
     *     
     */
    public CampaignBidLandscapeType getCampaignBidLandscapeType() {
        return campaignBidLandscapeType;
    }

    /**
     * Sets the value of the campaignBidLandscapeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignBidLandscapeType }
     *     
     */
    public void setCampaignBidLandscapeType(CampaignBidLandscapeType value) {
        this.campaignBidLandscapeType = value;
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
     * Gets the value of the campaignBidLandscapePoints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaignBidLandscapePoint }
     *     
     */
    public ArrayOfCampaignBidLandscapePoint getCampaignBidLandscapePoints() {
        return campaignBidLandscapePoints;
    }

    /**
     * Sets the value of the campaignBidLandscapePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaignBidLandscapePoint }
     *     
     */
    public void setCampaignBidLandscapePoints(ArrayOfCampaignBidLandscapePoint value) {
        this.campaignBidLandscapePoints = value;
    }

}
