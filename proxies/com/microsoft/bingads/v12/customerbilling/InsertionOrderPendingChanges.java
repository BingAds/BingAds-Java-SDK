
package com.microsoft.bingads.v12.customerbilling;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InsertionOrderPendingChanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertionOrderPendingChanges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RequestedByUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NotificationThreshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SpendCapAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChangeStatus" type="{https://bingads.microsoft.com/Customer/v12/Entities}InsertionOrderPendingChangesStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertionOrderPendingChanges", namespace = "https://bingads.microsoft.com/Customer/v12/Entities", propOrder = {
    "comment",
    "endDate",
    "requestedByUserId",
    "modifiedDateTime",
    "notificationThreshold",
    "referenceId",
    "spendCapAmount",
    "startDate",
    "name",
    "purchaseOrder",
    "changeStatus"
})
public class InsertionOrderPendingChanges {

    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "EndDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endDate;
    @XmlElement(name = "RequestedByUserId", nillable = true)
    protected Integer requestedByUserId;
    @XmlElement(name = "ModifiedDateTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar modifiedDateTime;
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
    @XmlElement(name = "PurchaseOrder", nillable = true)
    protected String purchaseOrder;
    @XmlElement(name = "ChangeStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected InsertionOrderPendingChangesStatus changeStatus;

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
     * Gets the value of the requestedByUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestedByUserId() {
        return requestedByUserId;
    }

    /**
     * Sets the value of the requestedByUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestedByUserId(Integer value) {
        this.requestedByUserId = value;
    }

    /**
     * Gets the value of the modifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getModifiedDateTime() {
        return modifiedDateTime;
    }

    /**
     * Sets the value of the modifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedDateTime(Calendar value) {
        this.modifiedDateTime = value;
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
     * Gets the value of the changeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InsertionOrderPendingChangesStatus }
     *     
     */
    public InsertionOrderPendingChangesStatus getChangeStatus() {
        return changeStatus;
    }

    /**
     * Sets the value of the changeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertionOrderPendingChangesStatus }
     *     
     */
    public void setChangeStatus(InsertionOrderPendingChangesStatus value) {
        this.changeStatus = value;
    }

}
