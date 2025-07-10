
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Calendar;
import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SeasonalityAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SeasonalityAdjustment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdjustmentPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="CampaignAssociations" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfCampaignAssociation" minOccurs="0"/>
 *         <element name="CampaignTypeFilter" type="{https://bingads.microsoft.com/CampaignManagement/v13}CampaignType" minOccurs="0"/>
 *         <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DeviceTypeFilter" type="{https://bingads.microsoft.com/CampaignManagement/v13}DeviceType" minOccurs="0"/>
 *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeasonalityAdjustment", propOrder = {
    "adjustmentPercentage",
    "campaignAssociations",
    "campaignTypeFilter",
    "description",
    "deviceTypeFilter",
    "endDate",
    "id",
    "name",
    "startDate"
})
public class SeasonalityAdjustment {

    @XmlElement(name = "AdjustmentPercentage", nillable = true)
    protected Double adjustmentPercentage;
    @XmlElement(name = "CampaignAssociations", nillable = true)
    protected ArrayOfCampaignAssociation campaignAssociations;
    @XmlElement(name = "CampaignTypeFilter", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected Collection<CampaignType> campaignTypeFilter;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "DeviceTypeFilter", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter29 .class)
    protected Collection<DeviceType> deviceTypeFilter;
    @XmlElement(name = "EndDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endDate;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "StartDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startDate;

    /**
     * Gets the value of the adjustmentPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustmentPercentage() {
        return adjustmentPercentage;
    }

    /**
     * Sets the value of the adjustmentPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustmentPercentage(Double value) {
        this.adjustmentPercentage = value;
    }

    /**
     * Gets the value of the campaignAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaignAssociation }
     *     
     */
    public ArrayOfCampaignAssociation getCampaignAssociations() {
        return campaignAssociations;
    }

    /**
     * Sets the value of the campaignAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaignAssociation }
     *     
     */
    public void setCampaignAssociations(ArrayOfCampaignAssociation value) {
        this.campaignAssociations = value;
    }

    /**
     * Gets the value of the campaignTypeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<CampaignType> getCampaignTypeFilter() {
        return campaignTypeFilter;
    }

    /**
     * Sets the value of the campaignTypeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignTypeFilter(Collection<CampaignType> value) {
        this.campaignTypeFilter = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the deviceTypeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<DeviceType> getDeviceTypeFilter() {
        return deviceTypeFilter;
    }

    /**
     * Sets the value of the deviceTypeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceTypeFilter(Collection<DeviceType> value) {
        this.deviceTypeFilter = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Calendar value) {
        this.endDate = value;
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(Calendar value) {
        this.startDate = value;
    }

}
