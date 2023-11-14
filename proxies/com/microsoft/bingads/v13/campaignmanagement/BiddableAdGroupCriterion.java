
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiddableAdGroupCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BiddableAdGroupCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}AdGroupCriterion">
 *       <sequence>
 *         <element name="CriterionBid" type="{https://bingads.microsoft.com/CampaignManagement/v13}CriterionBid" minOccurs="0"/>
 *         <element name="DestinationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EditorialStatus" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdGroupCriterionEditorialStatus" minOccurs="0"/>
 *         <element name="FinalAppUrls" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAppUrl" minOccurs="0"/>
 *         <element name="FinalMobileUrls" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="FinalUrlSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FinalUrls" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="TrackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UrlCustomParameters" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomParameters" minOccurs="0"/>
 *         <element name="CriterionCashback" type="{https://bingads.microsoft.com/CampaignManagement/v13}CriterionCashback" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiddableAdGroupCriterion", propOrder = {
    "criterionBid",
    "destinationUrl",
    "editorialStatus",
    "finalAppUrls",
    "finalMobileUrls",
    "finalUrlSuffix",
    "finalUrls",
    "trackingUrlTemplate",
    "urlCustomParameters",
    "criterionCashback"
})
public class BiddableAdGroupCriterion
    extends AdGroupCriterion
{
    public BiddableAdGroupCriterion() {
      this.type = "BiddableAdGroupCriterion";
    }

    @XmlElement(name = "CriterionBid", nillable = true)
    protected CriterionBid criterionBid;
    @XmlElement(name = "DestinationUrl", nillable = true)
    protected String destinationUrl;
    @XmlElement(name = "EditorialStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected AdGroupCriterionEditorialStatus editorialStatus;
    @XmlElement(name = "FinalAppUrls", nillable = true)
    protected ArrayOfAppUrl finalAppUrls;
    @XmlElement(name = "FinalMobileUrls", nillable = true)
    protected ArrayOfstring finalMobileUrls;
    @XmlElement(name = "FinalUrlSuffix", nillable = true)
    protected String finalUrlSuffix;
    @XmlElement(name = "FinalUrls", nillable = true)
    protected ArrayOfstring finalUrls;
    @XmlElement(name = "TrackingUrlTemplate", nillable = true)
    protected String trackingUrlTemplate;
    @XmlElement(name = "UrlCustomParameters", nillable = true)
    protected CustomParameters urlCustomParameters;
    @XmlElement(name = "CriterionCashback", nillable = true)
    protected CriterionCashback criterionCashback;

    /**
     * Gets the value of the criterionBid property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionBid }
     *     
     */
    public CriterionBid getCriterionBid() {
        return criterionBid;
    }

    /**
     * Sets the value of the criterionBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionBid }
     *     
     */
    public void setCriterionBid(CriterionBid value) {
        this.criterionBid = value;
    }

    /**
     * Gets the value of the destinationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    /**
     * Sets the value of the destinationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUrl(String value) {
        this.destinationUrl = value;
    }

    /**
     * Gets the value of the editorialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupCriterionEditorialStatus }
     *     
     */
    public AdGroupCriterionEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }

    /**
     * Sets the value of the editorialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupCriterionEditorialStatus }
     *     
     */
    public void setEditorialStatus(AdGroupCriterionEditorialStatus value) {
        this.editorialStatus = value;
    }

    /**
     * Gets the value of the finalAppUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAppUrl }
     *     
     */
    public ArrayOfAppUrl getFinalAppUrls() {
        return finalAppUrls;
    }

    /**
     * Sets the value of the finalAppUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAppUrl }
     *     
     */
    public void setFinalAppUrls(ArrayOfAppUrl value) {
        this.finalAppUrls = value;
    }

    /**
     * Gets the value of the finalMobileUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getFinalMobileUrls() {
        return finalMobileUrls;
    }

    /**
     * Sets the value of the finalMobileUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setFinalMobileUrls(ArrayOfstring value) {
        this.finalMobileUrls = value;
    }

    /**
     * Gets the value of the finalUrlSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalUrlSuffix() {
        return finalUrlSuffix;
    }

    /**
     * Sets the value of the finalUrlSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalUrlSuffix(String value) {
        this.finalUrlSuffix = value;
    }

    /**
     * Gets the value of the finalUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getFinalUrls() {
        return finalUrls;
    }

    /**
     * Sets the value of the finalUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setFinalUrls(ArrayOfstring value) {
        this.finalUrls = value;
    }

    /**
     * Gets the value of the trackingUrlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }

    /**
     * Sets the value of the trackingUrlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingUrlTemplate(String value) {
        this.trackingUrlTemplate = value;
    }

    /**
     * Gets the value of the urlCustomParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CustomParameters }
     *     
     */
    public CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }

    /**
     * Sets the value of the urlCustomParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomParameters }
     *     
     */
    public void setUrlCustomParameters(CustomParameters value) {
        this.urlCustomParameters = value;
    }

    /**
     * Gets the value of the criterionCashback property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionCashback }
     *     
     */
    public CriterionCashback getCriterionCashback() {
        return criterionCashback;
    }

    /**
     * Sets the value of the criterionCashback property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionCashback }
     *     
     */
    public void setCriterionCashback(CriterionCashback value) {
        this.criterionCashback = value;
    }

}
