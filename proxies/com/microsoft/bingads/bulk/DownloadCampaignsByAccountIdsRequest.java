
package com.microsoft.bingads.bulk;

import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="DataScope" type="{https://bingads.microsoft.com/CampaignManagement/v9}DataScope" minOccurs="0"/>
 *         &lt;element name="DownloadFileType" type="{https://bingads.microsoft.com/CampaignManagement/v9}DownloadFileType" minOccurs="0"/>
 *         &lt;element name="Entities" type="{https://bingads.microsoft.com/CampaignManagement/v9}BulkDownloadEntity" minOccurs="0"/>
 *         &lt;element name="FormatVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastSyncTimeInUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LocationTargetVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceStatsDateRange" type="{https://bingads.microsoft.com/CampaignManagement/v9}PerformanceStatsDateRange" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountIds",
    "dataScope",
    "downloadFileType",
    "entities",
    "formatVersion",
    "lastSyncTimeInUTC",
    "locationTargetVersion",
    "performanceStatsDateRange"
})
@XmlRootElement(name = "DownloadCampaignsByAccountIdsRequest")
public class DownloadCampaignsByAccountIdsRequest {

    @XmlElement(name = "AccountIds", nillable = true)
    protected ArrayOflong accountIds;
    @XmlElement(name = "DataScope", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected List<DataScope> dataScope;
    @XmlElement(name = "DownloadFileType", nillable = true)
    @XmlSchemaType(name = "string")
    protected DownloadFileType downloadFileType;
    @XmlElement(name = "Entities", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected List<BulkDownloadEntity> entities;
    @XmlElement(name = "FormatVersion", nillable = true)
    protected String formatVersion;
    @XmlElement(name = "LastSyncTimeInUTC", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastSyncTimeInUTC;
    @XmlElement(name = "LocationTargetVersion", nillable = true)
    protected String locationTargetVersion;
    @XmlElement(name = "PerformanceStatsDateRange", nillable = true)
    protected PerformanceStatsDateRange performanceStatsDateRange;

    /**
     * Gets the value of the accountIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getAccountIds() {
        return accountIds;
    }

    /**
     * Sets the value of the accountIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setAccountIds(ArrayOflong value) {
        this.accountIds = value;
    }

    /**
     * Gets the value of the dataScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public List<DataScope> getDataScope() {
        return dataScope;
    }

    /**
     * Sets the value of the dataScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataScope(List<DataScope> value) {
        this.dataScope = value;
    }

    /**
     * Gets the value of the downloadFileType property.
     * 
     * @return
     *     possible object is
     *     {@link DownloadFileType }
     *     
     */
    public DownloadFileType getDownloadFileType() {
        return downloadFileType;
    }

    /**
     * Sets the value of the downloadFileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DownloadFileType }
     *     
     */
    public void setDownloadFileType(DownloadFileType value) {
        this.downloadFileType = value;
    }

    /**
     * Gets the value of the entities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public List<BulkDownloadEntity> getEntities() {
        return entities;
    }

    /**
     * Sets the value of the entities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntities(List<BulkDownloadEntity> value) {
        this.entities = value;
    }

    /**
     * Gets the value of the formatVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatVersion() {
        return formatVersion;
    }

    /**
     * Sets the value of the formatVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatVersion(String value) {
        this.formatVersion = value;
    }

    /**
     * Gets the value of the lastSyncTimeInUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastSyncTimeInUTC() {
        return lastSyncTimeInUTC;
    }

    /**
     * Sets the value of the lastSyncTimeInUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSyncTimeInUTC(Calendar value) {
        this.lastSyncTimeInUTC = value;
    }

    /**
     * Gets the value of the locationTargetVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationTargetVersion() {
        return locationTargetVersion;
    }

    /**
     * Sets the value of the locationTargetVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationTargetVersion(String value) {
        this.locationTargetVersion = value;
    }

    /**
     * Gets the value of the performanceStatsDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceStatsDateRange }
     *     
     */
    public PerformanceStatsDateRange getPerformanceStatsDateRange() {
        return performanceStatsDateRange;
    }

    /**
     * Sets the value of the performanceStatsDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceStatsDateRange }
     *     
     */
    public void setPerformanceStatsDateRange(PerformanceStatsDateRange value) {
        this.performanceStatsDateRange = value;
    }

}
