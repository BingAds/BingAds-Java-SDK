
package com.microsoft.bingads.v13.customerbilling;

import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InsertionOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InsertionOrder">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="BookingCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="LastModifiedByUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="LastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="NotificationThreshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="SpendCapAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Status" type="{https://bingads.microsoft.com/Customer/v13/Entities}InsertionOrderStatus" minOccurs="0"/>
 *         <element name="PurchaseOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PendingChanges" type="{https://bingads.microsoft.com/Customer/v13/Entities}InsertionOrderPendingChanges" minOccurs="0"/>
 *         <element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BudgetRemaining" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="BudgetSpent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="BudgetRemainingPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="BudgetSpentPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="SeriesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsInSeries" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SeriesFrequencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertionOrder", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "accountId",
    "bookingCountryCode",
    "comment",
    "endDate",
    "id",
    "lastModifiedByUserId",
    "lastModifiedTime",
    "notificationThreshold",
    "referenceId",
    "spendCapAmount",
    "startDate",
    "name",
    "status",
    "purchaseOrder",
    "pendingChanges",
    "accountNumber",
    "budgetRemaining",
    "budgetSpent",
    "budgetRemainingPercent",
    "budgetSpentPercent",
    "seriesName",
    "isInSeries",
    "seriesFrequencyType"
})
public class InsertionOrder {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "BookingCountryCode", nillable = true)
    protected String bookingCountryCode;
    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "EndDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endDate;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
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
    @XmlElement(name = "SpendCapAmount", nillable = true)
    protected Double spendCapAmount;
    @XmlElement(name = "StartDate", type = String.class, nillable = true)
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
    @XmlElement(name = "PendingChanges", nillable = true)
    protected InsertionOrderPendingChanges pendingChanges;
    @XmlElement(name = "AccountNumber", nillable = true)
    protected String accountNumber;
    @XmlElement(name = "BudgetRemaining", nillable = true)
    protected Double budgetRemaining;
    @XmlElement(name = "BudgetSpent", nillable = true)
    protected Double budgetSpent;
    @XmlElement(name = "BudgetRemainingPercent", nillable = true)
    protected Double budgetRemainingPercent;
    @XmlElement(name = "BudgetSpentPercent", nillable = true)
    protected Double budgetSpentPercent;
    @XmlElement(name = "SeriesName", nillable = true)
    protected String seriesName;
    @XmlElement(name = "IsInSeries", nillable = true)
    protected Boolean isInSeries;
    @XmlElement(name = "SeriesFrequencyType", nillable = true)
    protected String seriesFrequencyType;

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

    /**
     * Gets the value of the pendingChanges property.
     * 
     * @return
     *     possible object is
     *     {@link InsertionOrderPendingChanges }
     *     
     */
    public InsertionOrderPendingChanges getPendingChanges() {
        return pendingChanges;
    }

    /**
     * Sets the value of the pendingChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertionOrderPendingChanges }
     *     
     */
    public void setPendingChanges(InsertionOrderPendingChanges value) {
        this.pendingChanges = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the budgetRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBudgetRemaining() {
        return budgetRemaining;
    }

    /**
     * Sets the value of the budgetRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBudgetRemaining(Double value) {
        this.budgetRemaining = value;
    }

    /**
     * Gets the value of the budgetSpent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBudgetSpent() {
        return budgetSpent;
    }

    /**
     * Sets the value of the budgetSpent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBudgetSpent(Double value) {
        this.budgetSpent = value;
    }

    /**
     * Gets the value of the budgetRemainingPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBudgetRemainingPercent() {
        return budgetRemainingPercent;
    }

    /**
     * Sets the value of the budgetRemainingPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBudgetRemainingPercent(Double value) {
        this.budgetRemainingPercent = value;
    }

    /**
     * Gets the value of the budgetSpentPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBudgetSpentPercent() {
        return budgetSpentPercent;
    }

    /**
     * Sets the value of the budgetSpentPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBudgetSpentPercent(Double value) {
        this.budgetSpentPercent = value;
    }

    /**
     * Gets the value of the seriesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesName() {
        return seriesName;
    }

    /**
     * Sets the value of the seriesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesName(String value) {
        this.seriesName = value;
    }

    /**
     * Gets the value of the isInSeries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsInSeries() {
        return isInSeries;
    }

    /**
     * Sets the value of the isInSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInSeries(Boolean value) {
        this.isInSeries = value;
    }

    /**
     * Gets the value of the seriesFrequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesFrequencyType() {
        return seriesFrequencyType;
    }

    /**
     * Sets the value of the seriesFrequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesFrequencyType(String value) {
        this.seriesFrequencyType = value;
    }

}
