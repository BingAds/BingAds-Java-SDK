
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditorialReasonCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditorialReasonCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AdOrKeywordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AppealStatus" type="{https://bingads.microsoft.com/CampaignManagement/v13}AppealStatus" minOccurs="0"/>
 *         &lt;element name="Reasons" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfEditorialReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditorialReasonCollection", propOrder = {
    "adGroupId",
    "adOrKeywordId",
    "appealStatus",
    "reasons"
})
public class EditorialReasonCollection {

    @XmlElement(name = "AdGroupId")
    protected Long adGroupId;
    @XmlElement(name = "AdOrKeywordId")
    protected Long adOrKeywordId;
    @XmlElement(name = "AppealStatus")
    @XmlSchemaType(name = "string")
    protected AppealStatus appealStatus;
    @XmlElement(name = "Reasons", nillable = true)
    protected ArrayOfEditorialReason reasons;

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
     * Gets the value of the adOrKeywordId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdOrKeywordId() {
        return adOrKeywordId;
    }

    /**
     * Sets the value of the adOrKeywordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdOrKeywordId(Long value) {
        this.adOrKeywordId = value;
    }

    /**
     * Gets the value of the appealStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AppealStatus }
     *     
     */
    public AppealStatus getAppealStatus() {
        return appealStatus;
    }

    /**
     * Sets the value of the appealStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppealStatus }
     *     
     */
    public void setAppealStatus(AppealStatus value) {
        this.appealStatus = value;
    }

    /**
     * Gets the value of the reasons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEditorialReason }
     *     
     */
    public ArrayOfEditorialReason getReasons() {
        return reasons;
    }

    /**
     * Sets the value of the reasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEditorialReason }
     *     
     */
    public void setReasons(ArrayOfEditorialReason value) {
        this.reasons = value;
    }

}
