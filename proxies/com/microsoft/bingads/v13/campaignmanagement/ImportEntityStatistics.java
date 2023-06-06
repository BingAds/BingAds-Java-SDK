
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportEntityStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ImportEntityStatistics">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Additions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Changes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Deletions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Errors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Total" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportEntityStatistics", propOrder = {
    "additions",
    "changes",
    "deletions",
    "entityType",
    "errors",
    "total"
})
public class ImportEntityStatistics {

    @XmlElement(name = "Additions", nillable = true)
    protected Integer additions;
    @XmlElement(name = "Changes", nillable = true)
    protected Integer changes;
    @XmlElement(name = "Deletions", nillable = true)
    protected Integer deletions;
    @XmlElement(name = "EntityType", nillable = true)
    protected String entityType;
    @XmlElement(name = "Errors", nillable = true)
    protected Integer errors;
    @XmlElement(name = "Total", nillable = true)
    protected Integer total;

    /**
     * Gets the value of the additions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditions() {
        return additions;
    }

    /**
     * Sets the value of the additions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditions(Integer value) {
        this.additions = value;
    }

    /**
     * Gets the value of the changes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChanges() {
        return changes;
    }

    /**
     * Sets the value of the changes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChanges(Integer value) {
        this.changes = value;
    }

    /**
     * Gets the value of the deletions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeletions() {
        return deletions;
    }

    /**
     * Sets the value of the deletions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeletions(Integer value) {
        this.deletions = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrors(Integer value) {
        this.errors = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotal(Integer value) {
        this.total = value;
    }

}
