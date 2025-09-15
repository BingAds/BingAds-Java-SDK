
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuditPointDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AuditPointDetails">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="JsonColumns" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAuditPointJsonColumn" minOccurs="0"/>
 *         <element name="JsonString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditPointDetails", propOrder = {
    "jsonColumns",
    "jsonString"
})
public class AuditPointDetails {

    @XmlElement(name = "JsonColumns", nillable = true)
    protected ArrayOfAuditPointJsonColumn jsonColumns;
    @XmlElement(name = "JsonString", nillable = true)
    protected String jsonString;

    /**
     * Gets the value of the jsonColumns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuditPointJsonColumn }
     *     
     */
    public ArrayOfAuditPointJsonColumn getJsonColumns() {
        return jsonColumns;
    }

    /**
     * Sets the value of the jsonColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuditPointJsonColumn }
     *     
     */
    public void setJsonColumns(ArrayOfAuditPointJsonColumn value) {
        this.jsonColumns = value;
    }

    /**
     * Gets the value of the jsonString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsonString() {
        return jsonString;
    }

    /**
     * Sets the value of the jsonString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsonString(String value) {
        this.jsonString = value;
    }

}
