
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HealthCheckSubEntityData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HealthCheckSubEntityData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SubEntityHealthIssueCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="SubEntityIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="SubEntityLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthCheckSubEntityData", propOrder = {
    "subEntityHealthIssueCount",
    "subEntityIds",
    "subEntityLevel"
})
public class HealthCheckSubEntityData {

    @XmlElement(name = "SubEntityHealthIssueCount")
    protected Integer subEntityHealthIssueCount;
    @XmlElement(name = "SubEntityIds", nillable = true)
    protected ArrayOflong subEntityIds;
    @XmlElement(name = "SubEntityLevel", nillable = true)
    protected String subEntityLevel;

    /**
     * Gets the value of the subEntityHealthIssueCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubEntityHealthIssueCount() {
        return subEntityHealthIssueCount;
    }

    /**
     * Sets the value of the subEntityHealthIssueCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubEntityHealthIssueCount(Integer value) {
        this.subEntityHealthIssueCount = value;
    }

    /**
     * Gets the value of the subEntityIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getSubEntityIds() {
        return subEntityIds;
    }

    /**
     * Sets the value of the subEntityIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setSubEntityIds(ArrayOflong value) {
        this.subEntityIds = value;
    }

    /**
     * Gets the value of the subEntityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubEntityLevel() {
        return subEntityLevel;
    }

    /**
     * Sets the value of the subEntityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubEntityLevel(String value) {
        this.subEntityLevel = value;
    }

}
