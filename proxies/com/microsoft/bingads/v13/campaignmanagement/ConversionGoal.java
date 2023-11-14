
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ConversionGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ConversionGoal">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AttributionModelType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AttributionModelType" minOccurs="0"/>
 *         <element name="ConversionWindowInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CountType" type="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoalCountType" minOccurs="0"/>
 *         <element name="ExcludeFromBidding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="GoalCategory" type="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoalCategory" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="IsEnhancedConversionsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Revenue" type="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoalRevenue" minOccurs="0"/>
 *         <element name="Scope" type="{https://bingads.microsoft.com/CampaignManagement/v13}EntityScope" minOccurs="0"/>
 *         <element name="Status" type="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoalStatus" minOccurs="0"/>
 *         <element name="TagId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="TrackingStatus" type="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoalTrackingStatus" minOccurs="0"/>
 *         <element name="Type" type="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoalType" minOccurs="0"/>
 *         <element name="ViewThroughConversionWindowInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionGoal", propOrder = {
    "attributionModelType",
    "conversionWindowInMinutes",
    "countType",
    "excludeFromBidding",
    "goalCategory",
    "id",
    "isEnhancedConversionsEnabled",
    "name",
    "revenue",
    "scope",
    "status",
    "tagId",
    "trackingStatus",
    "type",
    "viewThroughConversionWindowInMinutes"
})
@XmlSeeAlso({
    UrlGoal.class,
    DurationGoal.class,
    PagesViewedPerVisitGoal.class,
    EventGoal.class,
    AppInstallGoal.class,
    OfflineConversionGoal.class,
    InStoreTransactionGoal.class
})
public class ConversionGoal {

    @XmlElement(name = "AttributionModelType", nillable = true)
    @XmlSchemaType(name = "string")
    protected AttributionModelType attributionModelType;
    @XmlElement(name = "ConversionWindowInMinutes", nillable = true)
    protected Integer conversionWindowInMinutes;
    @XmlElement(name = "CountType", nillable = true)
    @XmlSchemaType(name = "string")
    protected ConversionGoalCountType countType;
    @XmlElement(name = "ExcludeFromBidding", nillable = true)
    protected Boolean excludeFromBidding;
    @XmlElement(name = "GoalCategory", nillable = true)
    @XmlSchemaType(name = "string")
    protected ConversionGoalCategory goalCategory;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "IsEnhancedConversionsEnabled", nillable = true)
    protected Boolean isEnhancedConversionsEnabled;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Revenue", nillable = true)
    protected ConversionGoalRevenue revenue;
    @XmlElement(name = "Scope", nillable = true)
    @XmlSchemaType(name = "string")
    protected EntityScope scope;
    @XmlElement(name = "Status", nillable = true)
    @XmlSchemaType(name = "string")
    protected ConversionGoalStatus status;
    @XmlElement(name = "TagId", nillable = true)
    protected Long tagId;
    @XmlElement(name = "TrackingStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected ConversionGoalTrackingStatus trackingStatus;
    @XmlElement(name = "Type", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter18 .class)
    protected Collection<ConversionGoalType> type;
    @XmlElement(name = "ViewThroughConversionWindowInMinutes", nillable = true)
    protected Integer viewThroughConversionWindowInMinutes;

    /**
     * Gets the value of the attributionModelType property.
     * 
     * @return
     *     possible object is
     *     {@link AttributionModelType }
     *     
     */
    public AttributionModelType getAttributionModelType() {
        return attributionModelType;
    }

    /**
     * Sets the value of the attributionModelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributionModelType }
     *     
     */
    public void setAttributionModelType(AttributionModelType value) {
        this.attributionModelType = value;
    }

    /**
     * Gets the value of the conversionWindowInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConversionWindowInMinutes() {
        return conversionWindowInMinutes;
    }

    /**
     * Sets the value of the conversionWindowInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConversionWindowInMinutes(Integer value) {
        this.conversionWindowInMinutes = value;
    }

    /**
     * Gets the value of the countType property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionGoalCountType }
     *     
     */
    public ConversionGoalCountType getCountType() {
        return countType;
    }

    /**
     * Sets the value of the countType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionGoalCountType }
     *     
     */
    public void setCountType(ConversionGoalCountType value) {
        this.countType = value;
    }

    /**
     * Gets the value of the excludeFromBidding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExcludeFromBidding() {
        return excludeFromBidding;
    }

    /**
     * Sets the value of the excludeFromBidding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeFromBidding(Boolean value) {
        this.excludeFromBidding = value;
    }

    /**
     * Gets the value of the goalCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionGoalCategory }
     *     
     */
    public ConversionGoalCategory getGoalCategory() {
        return goalCategory;
    }

    /**
     * Sets the value of the goalCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionGoalCategory }
     *     
     */
    public void setGoalCategory(ConversionGoalCategory value) {
        this.goalCategory = value;
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
     * Gets the value of the isEnhancedConversionsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsEnhancedConversionsEnabled() {
        return isEnhancedConversionsEnabled;
    }

    /**
     * Sets the value of the isEnhancedConversionsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnhancedConversionsEnabled(Boolean value) {
        this.isEnhancedConversionsEnabled = value;
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
     * Gets the value of the revenue property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionGoalRevenue }
     *     
     */
    public ConversionGoalRevenue getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionGoalRevenue }
     *     
     */
    public void setRevenue(ConversionGoalRevenue value) {
        this.revenue = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link EntityScope }
     *     
     */
    public EntityScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityScope }
     *     
     */
    public void setScope(EntityScope value) {
        this.scope = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionGoalStatus }
     *     
     */
    public ConversionGoalStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionGoalStatus }
     *     
     */
    public void setStatus(ConversionGoalStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the tagId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * Sets the value of the tagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTagId(Long value) {
        this.tagId = value;
    }

    /**
     * Gets the value of the trackingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionGoalTrackingStatus }
     *     
     */
    public ConversionGoalTrackingStatus getTrackingStatus() {
        return trackingStatus;
    }

    /**
     * Sets the value of the trackingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionGoalTrackingStatus }
     *     
     */
    public void setTrackingStatus(ConversionGoalTrackingStatus value) {
        this.trackingStatus = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<ConversionGoalType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(Collection<ConversionGoalType> value) {

    }

    /**
     * Gets the value of the viewThroughConversionWindowInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getViewThroughConversionWindowInMinutes() {
        return viewThroughConversionWindowInMinutes;
    }

    /**
     * Sets the value of the viewThroughConversionWindowInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setViewThroughConversionWindowInMinutes(Integer value) {
        this.viewThroughConversionWindowInMinutes = value;
    }

}
