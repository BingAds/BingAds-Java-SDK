
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuditPointResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AuditPointResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Details" type="{https://bingads.microsoft.com/CampaignManagement/v13}AuditPointDetails" minOccurs="0"/>
 *         <element name="Errors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfOperationError" minOccurs="0"/>
 *         <element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Ranking" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Severity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SubEntities" type="{https://bingads.microsoft.com/CampaignManagement/v13}AuditPointSubEnities" minOccurs="0"/>
 *         <element name="Template" type="{https://bingads.microsoft.com/CampaignManagement/v13}AuditPointTemplate" minOccurs="0"/>
 *         <element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditPointResult", propOrder = {
    "details",
    "errors",
    "key",
    "ranking",
    "severity",
    "status",
    "subEntities",
    "template",
    "timestamp"
})
public class AuditPointResult {

    @XmlElement(name = "Details", nillable = true)
    protected AuditPointDetails details;
    @XmlElement(name = "Errors", nillable = true)
    protected ArrayOfOperationError errors;
    @XmlElement(name = "Key", nillable = true)
    protected String key;
    @XmlElement(name = "Ranking")
    protected Integer ranking;
    @XmlElement(name = "Severity", nillable = true)
    protected String severity;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "SubEntities", nillable = true)
    protected AuditPointSubEnities subEntities;
    @XmlElement(name = "Template", nillable = true)
    protected AuditPointTemplate template;
    @XmlElement(name = "Timestamp", nillable = true)
    protected String timestamp;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link AuditPointDetails }
     *     
     */
    public AuditPointDetails getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditPointDetails }
     *     
     */
    public void setDetails(AuditPointDetails value) {
        this.details = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOperationError }
     *     
     */
    public ArrayOfOperationError getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOperationError }
     *     
     */
    public void setErrors(ArrayOfOperationError value) {
        this.errors = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the ranking property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRanking() {
        return ranking;
    }

    /**
     * Sets the value of the ranking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRanking(Integer value) {
        this.ranking = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
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
     * Gets the value of the subEntities property.
     * 
     * @return
     *     possible object is
     *     {@link AuditPointSubEnities }
     *     
     */
    public AuditPointSubEnities getSubEntities() {
        return subEntities;
    }

    /**
     * Sets the value of the subEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditPointSubEnities }
     *     
     */
    public void setSubEntities(AuditPointSubEnities value) {
        this.subEntities = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link AuditPointTemplate }
     *     
     */
    public AuditPointTemplate getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditPointTemplate }
     *     
     */
    public void setTemplate(AuditPointTemplate value) {
        this.template = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

}
