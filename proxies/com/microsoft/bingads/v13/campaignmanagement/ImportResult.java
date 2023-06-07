
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ImportResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ImportResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntityStatistics" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfImportEntityStatistics" minOccurs="0"/>
 *         <element name="ErrorLogUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ImportJob" type="{https://bingads.microsoft.com/CampaignManagement/v13}ImportJob" minOccurs="0"/>
 *         <element name="StartTimeInUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportResult", propOrder = {
    "entityStatistics",
    "errorLogUrl",
    "forwardCompatibilityMap",
    "id",
    "importJob",
    "startTimeInUTC",
    "status"
})
public class ImportResult {

    @XmlElement(name = "EntityStatistics", nillable = true)
    protected ArrayOfImportEntityStatistics entityStatistics;
    @XmlElement(name = "ErrorLogUrl", nillable = true)
    protected String errorLogUrl;
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "Id", nillable = true)
    protected String id;
    @XmlElement(name = "ImportJob", nillable = true)
    protected ImportJob importJob;
    @XmlElement(name = "StartTimeInUTC", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startTimeInUTC;
    @XmlElement(name = "Status", nillable = true)
    protected String status;

    /**
     * Gets the value of the entityStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImportEntityStatistics }
     *     
     */
    public ArrayOfImportEntityStatistics getEntityStatistics() {
        return entityStatistics;
    }

    /**
     * Sets the value of the entityStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImportEntityStatistics }
     *     
     */
    public void setEntityStatistics(ArrayOfImportEntityStatistics value) {
        this.entityStatistics = value;
    }

    /**
     * Gets the value of the errorLogUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorLogUrl() {
        return errorLogUrl;
    }

    /**
     * Sets the value of the errorLogUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorLogUrl(String value) {
        this.errorLogUrl = value;
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
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the importJob property.
     * 
     * @return
     *     possible object is
     *     {@link ImportJob }
     *     
     */
    public ImportJob getImportJob() {
        return importJob;
    }

    /**
     * Sets the value of the importJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportJob }
     *     
     */
    public void setImportJob(ImportJob value) {
        this.importJob = value;
    }

    /**
     * Gets the value of the startTimeInUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartTimeInUTC() {
        return startTimeInUTC;
    }

    /**
     * Sets the value of the startTimeInUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeInUTC(Calendar value) {
        this.startTimeInUTC = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
