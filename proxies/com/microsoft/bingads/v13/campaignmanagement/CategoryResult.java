
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
    "key"
})
public class CategoryResult {

    @XmlElement(name = "AuditPoints", nillable = true)
    protected ArrayOfAuditPointResult auditPoints;
    @XmlElement(name = "Key", nillable = true)
    protected String key;

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

}
