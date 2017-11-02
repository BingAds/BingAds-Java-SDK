
package com.microsoft.bingads.v11.customermanagement;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ClientLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ClientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagingCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ManagingCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InviterEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InviterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InviterPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBillToClient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Status" type="{https://bingads.microsoft.com/Customer/v11/Entities}ClientLinkStatus" minOccurs="0"/>
 *         &lt;element name="SuppressNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModifiedByUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientLink", namespace = "https://bingads.microsoft.com/Customer/v11/Entities", propOrder = {
    "clientAccountId",
    "clientAccountNumber",
    "managingCustomerId",
    "managingCustomerNumber",
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
    "forwardCompatibilityMap"
})
public class ClientLink {

    @XmlElement(name = "ClientAccountId", nillable = true)
    protected Long clientAccountId;
    @XmlElement(name = "ClientAccountNumber", nillable = true)
    protected String clientAccountNumber;
    @XmlElement(name = "ManagingCustomerId", nillable = true)
    protected Long managingCustomerId;
    @XmlElement(name = "ManagingCustomerNumber", nillable = true)
    protected String managingCustomerNumber;
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
    @XmlElement(name = "IsBillToClient")
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

    /**
     * Gets the value of the clientAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientAccountId() {
        return clientAccountId;
    }

    /**
     * Sets the value of the clientAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientAccountId(Long value) {
        this.clientAccountId = value;
    }

    /**
     * Gets the value of the clientAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientAccountNumber() {
        return clientAccountNumber;
    }

    /**
     * Sets the value of the clientAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientAccountNumber(String value) {
        this.clientAccountNumber = value;
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

}
