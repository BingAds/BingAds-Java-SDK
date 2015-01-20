
package com.microsoft.bingads.customerbilling;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InsertionOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertionOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BalanceAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BookingCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InsertionOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastModifiedByUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NotificationThreshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SpendCapAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{https://bingads.microsoft.com/Customer/v9/Entities}InsertionOrderStatus" minOccurs="0"/>
 *         &lt;element name="PurchaseOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertionOrder", namespace = "https://bingads.microsoft.com/Customer/v9/Entities", propOrder = {
    "accountId",
    "balanceAmount",
    "bookingCountryCode",
    "comment",
    "endDate",
    "insertionOrderId",
    "lastModifiedByUserId",
    "lastModifiedTime",
    "notificationThreshold",
    "referenceId",
    "spendCapAmount",
    "startDate",
    "name",
    "status",
    "purchaseOrder"
})
public class InsertionOrder {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "BalanceAmount", nillable = true)
    protected Double balanceAmount;
    @XmlElement(name = "BookingCountryCode", nillable = true)
    protected String bookingCountryCode;
    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "EndDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endDate;
    @XmlElement(name = "InsertionOrderId", nillable = true)
    protected Long insertionOrderId;
    @XmlElement(name = "LastModifiedByUserId", nillable = true)
    protected Long lastModifiedByUserId;
    @XmlElement(name = "LastModifiedTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastModifiedTime;
    @XmlElement(name = "NotificationThreshold", nillable = true)
    protected Double notificationThreshold;
    @XmlElement(name = "ReferenceId", nillable = true)
    protected Long referenceId;
    @XmlElement(name = "SpendCapAmount")
    protected Double spendCapAmount;
    @XmlElement(name = "StartDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startDate;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Status", nillable = true)
    @XmlSchemaType(name = "string")
    protected InsertionOrderStatus status;
    @XmlElement(name = "PurchaseOrder", nillable = true)
    protected String purchaseOrder;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the balanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * Sets the value of the balanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceAmount(Double value) {
        this.balanceAmount = value;
    }

    /**
     * Gets the value of the bookingCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCountryCode() {
        return bookingCountryCode;
    }

    /**
     * Sets the value of the bookingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCountryCode(String value) {
        this.bookingCountryCode = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Calendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the insertionOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsertionOrderId() {
        return insertionOrderId;
    }

    /**
     * Sets the value of the insertionOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsertionOrderId(Long value) {
        this.insertionOrderId = value;
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
     * Gets the value of the lastModifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the lastModifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedTime(Calendar value) {
        this.lastModifiedTime = value;
    }

    /**
     * Gets the value of the notificationThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNotificationThreshold() {
        return notificationThreshold;
    }

    /**
     * Sets the value of the notificationThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNotificationThreshold(Double value) {
        this.notificationThreshold = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReferenceId(Long value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the spendCapAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpendCapAmount() {
        return spendCapAmount;
    }

    /**
     * Sets the value of the spendCapAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpendCapAmount(Double value) {
        this.spendCapAmount = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link InsertionOrderStatus }
     *     
     */
    public InsertionOrderStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertionOrderStatus }
     *     
     */
    public void setStatus(InsertionOrderStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the purchaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * Sets the value of the purchaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrder(String value) {
        this.purchaseOrder = value;
    }

}
