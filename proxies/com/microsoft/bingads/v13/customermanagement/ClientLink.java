
package com.microsoft.bingads.v13.customermanagement;

import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ClientLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClientLink">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ClientEntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="ClientEntityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ClientEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ManagingCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="ManagingCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ManagingCustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="InviterEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="InviterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="InviterPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsBillToClient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Status" type="{https://bingads.microsoft.com/Customer/v13/Entities}ClientLinkStatus" minOccurs="0"/>
 *         <element name="SuppressNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="LastModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="LastModifiedByUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         <element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         <element name="CustomerLinkPermission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientLink", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "type",
    "clientEntityId",
    "clientEntityNumber",
    "clientEntityName",
    "managingCustomerId",
    "managingCustomerNumber",
    "managingCustomerName",
    "note",
    "name",
    "inviterEmail",
    "inviterName",
    "inviterPhone",
    "isBillToClient",
    "startDate",
    "status",
    "suppressNotification",
    "lastModifiedDateTime",
    "lastModifiedByUserId",
    "timestamp",
    "forwardCompatibilityMap",
    "customerLinkPermission"
})
public class ClientLink {

    @XmlElement(name = "Type", nillable = true)
    protected String type;
    @XmlElement(name = "ClientEntityId", nillable = true)
    protected Long clientEntityId;
    @XmlElement(name = "ClientEntityNumber", nillable = true)
    protected String clientEntityNumber;
    @XmlElement(name = "ClientEntityName", nillable = true)
    protected String clientEntityName;
    @XmlElement(name = "ManagingCustomerId", nillable = true)
    protected Long managingCustomerId;
    @XmlElement(name = "ManagingCustomerNumber", nillable = true)
    protected String managingCustomerNumber;
    @XmlElement(name = "ManagingCustomerName", nillable = true)
    protected String managingCustomerName;
    @XmlElement(name = "Note", nillable = true)
    protected String note;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "InviterEmail", nillable = true)
    protected String inviterEmail;
    @XmlElement(name = "InviterName", nillable = true)
    protected String inviterName;
    @XmlElement(name = "InviterPhone", nillable = true)
    protected String inviterPhone;
    @XmlElement(name = "IsBillToClient", nillable = true)
    protected Boolean isBillToClient;
    @XmlElement(name = "StartDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startDate;
    @XmlElement(name = "Status", nillable = true)
    @XmlSchemaType(name = "string")
    protected ClientLinkStatus status;
    @XmlElement(name = "SuppressNotification")
    protected Boolean suppressNotification;
    @XmlElement(name = "LastModifiedDateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastModifiedDateTime;
    @XmlElement(name = "LastModifiedByUserId")
    protected Long lastModifiedByUserId;
    @XmlElement(name = "Timestamp", nillable = true)
    protected byte[] timestamp;
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "CustomerLinkPermission", nillable = true)
    protected String customerLinkPermission;

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

    /**
     * Gets the value of the clientEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientEntityId() {
        return clientEntityId;
    }

    /**
     * Sets the value of the clientEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientEntityId(Long value) {
        this.clientEntityId = value;
    }

    /**
     * Gets the value of the clientEntityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientEntityNumber() {
        return clientEntityNumber;
    }

    /**
     * Sets the value of the clientEntityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientEntityNumber(String value) {
        this.clientEntityNumber = value;
    }

    /**
     * Gets the value of the clientEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientEntityName() {
        return clientEntityName;
    }

    /**
     * Sets the value of the clientEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientEntityName(String value) {
        this.clientEntityName = value;
    }

    /**
     * Gets the value of the managingCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManagingCustomerId() {
        return managingCustomerId;
    }

    /**
     * Sets the value of the managingCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManagingCustomerId(Long value) {
        this.managingCustomerId = value;
    }

    /**
     * Gets the value of the managingCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagingCustomerNumber() {
        return managingCustomerNumber;
    }

    /**
     * Sets the value of the managingCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagingCustomerNumber(String value) {
        this.managingCustomerNumber = value;
    }

    /**
     * Gets the value of the managingCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagingCustomerName() {
        return managingCustomerName;
    }

    /**
     * Sets the value of the managingCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagingCustomerName(String value) {
        this.managingCustomerName = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
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
     * Gets the value of the inviterEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviterEmail() {
        return inviterEmail;
    }

    /**
     * Sets the value of the inviterEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviterEmail(String value) {
        this.inviterEmail = value;
    }

    /**
     * Gets the value of the inviterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviterName() {
        return inviterName;
    }

    /**
     * Sets the value of the inviterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviterName(String value) {
        this.inviterName = value;
    }

    /**
     * Gets the value of the inviterPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviterPhone() {
        return inviterPhone;
    }

    /**
     * Sets the value of the inviterPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviterPhone(String value) {
        this.inviterPhone = value;
    }

    /**
     * Gets the value of the isBillToClient property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsBillToClient() {
        return isBillToClient;
    }

    /**
     * Sets the value of the isBillToClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBillToClient(Boolean value) {
        this.isBillToClient = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(Calendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ClientLinkStatus }
     *     
     */
    public ClientLinkStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientLinkStatus }
     *     
     */
    public void setStatus(ClientLinkStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the suppressNotification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSuppressNotification() {
        return suppressNotification;
    }

    /**
     * Sets the value of the suppressNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressNotification(Boolean value) {
        this.suppressNotification = value;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedDateTime(Calendar value) {
        this.lastModifiedDateTime = value;
    }

    /**
     * Gets the value of the lastModifiedByUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastModifiedByUserId() {
        return lastModifiedByUserId;
    }

    /**
     * Sets the value of the lastModifiedByUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastModifiedByUserId(Long value) {
        this.lastModifiedByUserId = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTimestamp(byte[] value) {
        this.timestamp = value;
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
     * Gets the value of the customerLinkPermission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLinkPermission() {
        return customerLinkPermission;
    }

    /**
     * Sets the value of the customerLinkPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLinkPermission(String value) {
        this.customerLinkPermission = value;
    }

}
