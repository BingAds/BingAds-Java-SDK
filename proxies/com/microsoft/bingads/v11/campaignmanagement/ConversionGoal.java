
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ConversionGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionGoal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConversionWindowInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CountType" type="{https://bingads.microsoft.com/CampaignManagement/v11}ConversionGoalCountType" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Revenue" type="{https://bingads.microsoft.com/CampaignManagement/v11}ConversionGoalRevenue" minOccurs="0"/>
 *         &lt;element name="Scope" type="{https://bingads.microsoft.com/CampaignManagement/v11}EntityScope" minOccurs="0"/>
 *         &lt;element name="Status" type="{https://bingads.microsoft.com/CampaignManagement/v11}ConversionGoalStatus" minOccurs="0"/>
 *         &lt;element name="TagId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TrackingStatus" type="{https://bingads.microsoft.com/CampaignManagement/v11}ConversionGoalTrackingStatus" minOccurs="0"/>
 *         &lt;element name="Type" type="{https://bingads.microsoft.com/CampaignManagement/v11}ConversionGoalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionGoal", propOrder = {
    "conversionWindowInMinutes",
    "countType",
    "id",
    "name",
    "revenue",
    "scope",
    "status",
    "tagId",
    "trackingStatus",
    "type"
})
@XmlSeeAlso({
    UrlGoal.class,
    DurationGoal.class,
    AppInstallGoal.class,
    EventGoal.class,
    PagesViewedPerVisitGoal.class,
    OfflineConversionGoal.class
})
public class ConversionGoal {

    @XmlElement(name = "ConversionWindowInMinutes", nillable = true)
    protected Integer conversionWindowInMinutes;
    @XmlElement(name = "CountType", nillable = true)
    @XmlSchemaType(name = "string")
    protected ConversionGoalCountType countType;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
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
    @XmlJavaTypeAdapter(Adapter8 .class)
    protected Collection<ConversionGoalType> type;

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
        this.type = value;
    }

}
