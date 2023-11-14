
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Notification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Notification">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Severity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AdditionalInfo" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfKeyValueEntityOfstringstring" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "typeId",
    "id",
    "severity",
    "title",
    "message",
    "additionalInfo"
})
public class Notification {

    @XmlElement(name = "TypeId")
    protected Integer typeId;
    @XmlElement(name = "Id")
    protected Long id;
    @XmlElement(name = "Severity")
    @XmlSchemaType(name = "unsignedByte")
    protected Short severity;
    @XmlElement(name = "Title", nillable = true)
    protected String title;
    @XmlElement(name = "Message", nillable = true)
    protected String message;
    @XmlElement(name = "AdditionalInfo", nillable = true)
    protected ArrayOfKeyValueEntityOfstringstring additionalInfo;

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeId(Integer value) {
        this.typeId = value;
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
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSeverity(Short value) {
        this.severity = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueEntityOfstringstring }
     *     
     */
    public ArrayOfKeyValueEntityOfstringstring getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueEntityOfstringstring }
     *     
     */
    public void setAdditionalInfo(ArrayOfKeyValueEntityOfstringstring value) {
        this.additionalInfo = value;
    }

}
