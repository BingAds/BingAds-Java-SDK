
package com.microsoft.bingads.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AdGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdDistribution" type="{https://bingads.microsoft.com/CampaignManagement/v9}AdDistribution" minOccurs="0"/>
 *         &lt;element name="AdRotation" type="{https://bingads.microsoft.com/CampaignManagement/v9}AdRotation" minOccurs="0"/>
 *         &lt;element name="BiddingModel" type="{https://bingads.microsoft.com/CampaignManagement/v9}BiddingModel" minOccurs="0"/>
 *         &lt;element name="BroadMatchBid" type="{https://bingads.microsoft.com/CampaignManagement/v9}Bid" minOccurs="0"/>
 *         &lt;element name="ContentMatchBid" type="{https://bingads.microsoft.com/CampaignManagement/v9}Bid" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{https://bingads.microsoft.com/CampaignManagement/v9}Date" minOccurs="0"/>
 *         &lt;element name="ExactMatchBid" type="{https://bingads.microsoft.com/CampaignManagement/v9}Bid" minOccurs="0"/>
 *         &lt;element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NativeBidAdjustment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Network" type="{https://bingads.microsoft.com/CampaignManagement/v9}Network" minOccurs="0"/>
 *         &lt;element name="PhraseMatchBid" type="{https://bingads.microsoft.com/CampaignManagement/v9}Bid" minOccurs="0"/>
 *         &lt;element name="PricingModel" type="{https://bingads.microsoft.com/CampaignManagement/v9}PricingModel" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{https://bingads.microsoft.com/CampaignManagement/v9}Date" minOccurs="0"/>
 *         &lt;element name="Status" type="{https://bingads.microsoft.com/CampaignManagement/v9}AdGroupStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroup", propOrder = {
    "adDistribution",
    "adRotation",
    "biddingModel",
    "broadMatchBid",
    "contentMatchBid",
    "endDate",
    "exactMatchBid",
    "forwardCompatibilityMap",
    "id",
    "language",
    "name",
    "nativeBidAdjustment",
    "network",
    "phraseMatchBid",
    "pricingModel",
    "startDate",
    "status"
})
public class AdGroup {

    @XmlElement(name = "AdDistribution", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<AdDistribution> adDistribution;
    @XmlElement(name = "AdRotation", nillable = true)
    protected AdRotation adRotation;
    @XmlElement(name = "BiddingModel", nillable = true)
    @XmlSchemaType(name = "string")
    protected BiddingModel biddingModel;
    @XmlElement(name = "BroadMatchBid", nillable = true)
    protected Bid broadMatchBid;
    @XmlElement(name = "ContentMatchBid", nillable = true)
    protected Bid contentMatchBid;
    @XmlElement(name = "EndDate", nillable = true)
    protected Date endDate;
    @XmlElement(name = "ExactMatchBid", nillable = true)
    protected Bid exactMatchBid;
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "Language", nillable = true)
    protected String language;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "NativeBidAdjustment", nillable = true)
    protected Integer nativeBidAdjustment;
    @XmlElement(name = "Network", nillable = true)
    @XmlSchemaType(name = "string")
    protected Network network;
    @XmlElement(name = "PhraseMatchBid", nillable = true)
    protected Bid phraseMatchBid;
    @XmlElement(name = "PricingModel", nillable = true)
    @XmlSchemaType(name = "string")
    protected PricingModel pricingModel;
    @XmlElement(name = "StartDate", nillable = true)
    protected Date startDate;
    @XmlElement(name = "Status", nillable = true)
    @XmlSchemaType(name = "string")
    protected AdGroupStatus status;

    /**
     * Gets the value of the adDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdDistribution> getAdDistribution() {
        return adDistribution;
    }

    /**
     * Sets the value of the adDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdDistribution(Collection<AdDistribution> value) {
        this.adDistribution = value;
    }

    /**
     * Gets the value of the adRotation property.
     * 
     * @return
     *     possible object is
     *     {@link AdRotation }
     *     
     */
    public AdRotation getAdRotation() {
        return adRotation;
    }

    /**
     * Sets the value of the adRotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRotation }
     *     
     */
    public void setAdRotation(AdRotation value) {
        this.adRotation = value;
    }

    /**
     * Gets the value of the biddingModel property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingModel }
     *     
     */
    public BiddingModel getBiddingModel() {
        return biddingModel;
    }

    /**
     * Sets the value of the biddingModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingModel }
     *     
     */
    public void setBiddingModel(BiddingModel value) {
        this.biddingModel = value;
    }

    /**
     * Gets the value of the broadMatchBid property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getBroadMatchBid() {
        return broadMatchBid;
    }

    /**
     * Sets the value of the broadMatchBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setBroadMatchBid(Bid value) {
        this.broadMatchBid = value;
    }

    /**
     * Gets the value of the contentMatchBid property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getContentMatchBid() {
        return contentMatchBid;
    }

    /**
     * Sets the value of the contentMatchBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setContentMatchBid(Bid value) {
        this.contentMatchBid = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the exactMatchBid property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getExactMatchBid() {
        return exactMatchBid;
    }

    /**
     * Sets the value of the exactMatchBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setExactMatchBid(Bid value) {
        this.exactMatchBid = value;
    }

    /**
     * Gets the value of the forwardCompatibilityMap property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public ArrayOfKeyValuePairOfstringstring getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }

    /**
     * Sets the value of the forwardCompatibilityMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public void setForwardCompatibilityMap(ArrayOfKeyValuePairOfstringstring value) {
        this.forwardCompatibilityMap = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nativeBidAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNativeBidAdjustment() {
        return nativeBidAdjustment;
    }

    /**
     * Sets the value of the nativeBidAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNativeBidAdjustment(Integer value) {
        this.nativeBidAdjustment = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link Network }
     *     
     */
    public Network getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link Network }
     *     
     */
    public void setNetwork(Network value) {
        this.network = value;
    }

    /**
     * Gets the value of the phraseMatchBid property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getPhraseMatchBid() {
        return phraseMatchBid;
    }

    /**
     * Sets the value of the phraseMatchBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setPhraseMatchBid(Bid value) {
        this.phraseMatchBid = value;
    }

    /**
     * Gets the value of the pricingModel property.
     * 
     * @return
     *     possible object is
     *     {@link PricingModel }
     *     
     */
    public PricingModel getPricingModel() {
        return pricingModel;
    }

    /**
     * Sets the value of the pricingModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingModel }
     *     
     */
    public void setPricingModel(PricingModel value) {
        this.pricingModel = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupStatus }
     *     
     */
    public AdGroupStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupStatus }
     *     
     */
    public void setStatus(AdGroupStatus value) {
        this.status = value;
    }

}
