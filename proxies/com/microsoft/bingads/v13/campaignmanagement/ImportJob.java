
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ImportJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ImportJob">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CreatedByUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CreatedByUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CreatedDateTimeInUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Frequency" type="{https://bingads.microsoft.com/CampaignManagement/v13}Frequency" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="ImportOption" type="{https://bingads.microsoft.com/CampaignManagement/v13}ImportOption" minOccurs="0"/>
 *         <element name="LastRunTimeInUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NotificationEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NotificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportJob", propOrder = {
    "createdByUserId",
    "createdByUserName",
    "createdDateTimeInUTC",
    "frequency",
    "id",
    "importOption",
    "lastRunTimeInUTC",
    "name",
    "notificationEmail",
    "notificationType",
    "status",
    "type"
})
@XmlSeeAlso({
    GoogleImportJob.class,
    FileImportJob.class
})
public class ImportJob {

    @XmlElement(name = "CreatedByUserId", nillable = true)
    protected Long createdByUserId;
    @XmlElement(name = "CreatedByUserName", nillable = true)
    protected String createdByUserName;
    @XmlElement(name = "CreatedDateTimeInUTC", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar createdDateTimeInUTC;
    @XmlElement(name = "Frequency", nillable = true)
    protected Frequency frequency;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "ImportOption", nillable = true)
    protected ImportOption importOption;
    @XmlElement(name = "LastRunTimeInUTC", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastRunTimeInUTC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "NotificationEmail", nillable = true)
    protected String notificationEmail;
    @XmlElement(name = "NotificationType", nillable = true)
    protected String notificationType;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "Type", nillable = true)
    protected String type;

    /**
     * Gets the value of the createdByUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreatedByUserId() {
        return createdByUserId;
    }

    /**
     * Sets the value of the createdByUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreatedByUserId(Long value) {
        this.createdByUserId = value;
    }

    /**
     * Gets the value of the createdByUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByUserName() {
        return createdByUserName;
    }

    /**
     * Sets the value of the createdByUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByUserName(String value) {
        this.createdByUserName = value;
    }

    /**
     * Gets the value of the createdDateTimeInUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreatedDateTimeInUTC() {
        return createdDateTimeInUTC;
    }

    /**
     * Sets the value of the createdDateTimeInUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDateTimeInUTC(Calendar value) {
        this.createdDateTimeInUTC = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setFrequency(Frequency value) {
        this.frequency = value;
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
     * Gets the value of the importOption property.
     * 
     * @return
     *     possible object is
     *     {@link ImportOption }
     *     
     */
    public ImportOption getImportOption() {
        return importOption;
    }

    /**
     * Sets the value of the importOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportOption }
     *     
     */
    public void setImportOption(ImportOption value) {
        this.importOption = value;
    }

    /**
     * Gets the value of the lastRunTimeInUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastRunTimeInUTC() {
        return lastRunTimeInUTC;
    }

    /**
     * Sets the value of the lastRunTimeInUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRunTimeInUTC(Calendar value) {
        this.lastRunTimeInUTC = value;
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
     * Gets the value of the notificationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEmail() {
        return notificationEmail;
    }

    /**
     * Sets the value of the notificationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEmail(String value) {
        this.notificationEmail = value;
    }

    /**
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationType(String value) {
        this.notificationType = value;
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

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
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
    public void setType(String value) {

    }

}
