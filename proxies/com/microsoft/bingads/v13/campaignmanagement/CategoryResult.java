
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CategoryResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuditPoints" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAuditPointResult" minOccurs="0"/>
 *         <element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Ranking" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Severity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Template" type="{https://bingads.microsoft.com/CampaignManagement/v13}CategoryTemplate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryResult", propOrder = {
    "auditPoints",
    "key",
    "ranking",
    "severity",
    "template"
})
public class CategoryResult {

    @XmlElement(name = "AuditPoints", nillable = true)
    protected ArrayOfAuditPointResult auditPoints;
    @XmlElement(name = "Key", nillable = true)
    protected String key;
    @XmlElement(name = "Ranking")
    protected Integer ranking;
    @XmlElement(name = "Severity", nillable = true)
    protected String severity;
    @XmlElement(name = "Template", nillable = true)
    protected CategoryTemplate template;

    /**
     * Gets the value of the auditPoints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuditPointResult }
     *     
     */
    public ArrayOfAuditPointResult getAuditPoints() {
        return auditPoints;
    }

    /**
     * Sets the value of the auditPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuditPointResult }
     *     
     */
    public void setAuditPoints(ArrayOfAuditPointResult value) {
        this.auditPoints = value;
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
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryTemplate }
     *     
     */
    public CategoryTemplate getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryTemplate }
     *     
     */
    public void setTemplate(CategoryTemplate value) {
        this.template = value;
    }

}
