
package com.microsoft.bingads.v13.bulk;

import java.util.Calendar;
import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="CompressionType" type="{https://bingads.microsoft.com/CampaignManagement/v13}CompressionType" minOccurs="0"/>
 *         <element name="DataScope" type="{https://bingads.microsoft.com/CampaignManagement/v13}DataScope" minOccurs="0"/>
 *         <element name="DownloadEntities" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfDownloadEntity" minOccurs="0"/>
 *         <element name="DownloadFileType" type="{https://bingads.microsoft.com/CampaignManagement/v13}DownloadFileType" minOccurs="0"/>
 *         <element name="FormatVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="LastSyncTimeInUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountIds",
    "compressionType",
    "dataScope",
    "downloadEntities",
    "downloadFileType",
    "formatVersion",
    "lastSyncTimeInUTC"
})
@XmlRootElement(name = "DownloadCampaignsByAccountIdsRequest")
public class DownloadCampaignsByAccountIdsRequest {

    @XmlElement(name = "AccountIds", nillable = true)
    protected ArrayOflong accountIds;
    @XmlElement(name = "CompressionType", nillable = true)
    @XmlSchemaType(name = "string")
    protected CompressionType compressionType;
    @XmlElement(name = "DataScope", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Collection<DataScope> dataScope;
    @XmlElement(name = "DownloadEntities", nillable = true)
    protected ArrayOfDownloadEntity downloadEntities;
    @XmlElement(name = "DownloadFileType", nillable = true)
    @XmlSchemaType(name = "string")
    protected DownloadFileType downloadFileType;
    @XmlElement(name = "FormatVersion", nillable = true)
    protected String formatVersion;
    @XmlElement(name = "LastSyncTimeInUTC", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastSyncTimeInUTC;

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
     * Gets the value of the compressionType property.
     * 
     * @return
     *     possible object is
     *     {@link CompressionType }
     *     
     */
    public CompressionType getCompressionType() {
        return compressionType;
    }

    /**
     * Sets the value of the compressionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionType }
     *     
     */
    public void setCompressionType(CompressionType value) {
        this.compressionType = value;
    }

    /**
     * Gets the value of the dataScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<DataScope> getDataScope() {
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
    public void setDataScope(Collection<DataScope> value) {
        this.dataScope = value;
    }

    /**
     * Gets the value of the downloadEntities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDownloadEntity }
     *     
     */
    public ArrayOfDownloadEntity getDownloadEntities() {
        return downloadEntities;
    }

    /**
     * Sets the value of the downloadEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDownloadEntity }
     *     
     */
    public void setDownloadEntities(ArrayOfDownloadEntity value) {
        this.downloadEntities = value;
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

}
