
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuditPointSubEnities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AuditPointSubEnities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IssueCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="SubEntitiesIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="SubEntitiesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditPointSubEnities", propOrder = {
    "issueCount",
    "subEntitiesIds",
    "subEntitiesType"
})
public class AuditPointSubEnities {

    @XmlElement(name = "IssueCount")
    protected Integer issueCount;
    @XmlElement(name = "SubEntitiesIds", nillable = true)
    protected ArrayOflong subEntitiesIds;
    @XmlElement(name = "SubEntitiesType", nillable = true)
    protected String subEntitiesType;

    /**
     * Gets the value of the issueCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIssueCount() {
        return issueCount;
    }

    /**
     * Sets the value of the issueCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIssueCount(Integer value) {
        this.issueCount = value;
    }

    /**
     * Gets the value of the subEntitiesIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getSubEntitiesIds() {
        return subEntitiesIds;
    }

    /**
     * Sets the value of the subEntitiesIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setSubEntitiesIds(ArrayOflong value) {
        this.subEntitiesIds = value;
    }

    /**
     * Gets the value of the subEntitiesType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubEntitiesType() {
        return subEntitiesType;
    }

    /**
     * Sets the value of the subEntitiesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubEntitiesType(String value) {
        this.subEntitiesType = value;
    }

}
