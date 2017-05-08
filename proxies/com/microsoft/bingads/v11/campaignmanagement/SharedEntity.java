
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharedEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharedEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssociationCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedEntity", propOrder = {
    "associationCount",
    "forwardCompatibilityMap",
    "id",
    "name",
    "type"
})
@XmlSeeAlso({
    SharedList.class
})
public class SharedEntity {

    @XmlElement(name = "AssociationCount", required = true, type = Integer.class, nillable = true)
    protected Integer associationCount;
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "Id", required = true, type = Long.class, nillable = true)
    protected Long id;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "Type", required = true, nillable = true)
    protected String type;

    /**
     * Gets the value of the associationCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssociationCount() {
        return associationCount;
    }

    /**
     * Sets the value of the associationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssociationCount(Integer value) {
        this.associationCount = value;
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
        this.type = value;
    }

}
