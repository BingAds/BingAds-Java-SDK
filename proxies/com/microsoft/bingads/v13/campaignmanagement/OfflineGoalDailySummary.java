
package com.microsoft.bingads.v13.campaignmanagement;

import java.math.BigDecimal;
import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OfflineGoalDailySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OfflineGoalDailySummary">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GoalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="UploadDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="SuccessCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="UnattributedCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="SuccessRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="Alerts" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfOfflineConversionAlert" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineGoalDailySummary", propOrder = {
    "goalId",
    "uploadDate",
    "successCount",
    "unattributedCount",
    "successRate",
    "alerts"
})
public class OfflineGoalDailySummary {

    @XmlElement(name = "GoalId")
    protected Long goalId;
    @XmlElement(name = "UploadDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar uploadDate;
    @XmlElement(name = "SuccessCount")
    protected Integer successCount;
    @XmlElement(name = "UnattributedCount")
    protected Integer unattributedCount;
    @XmlElement(name = "SuccessRate")
    protected BigDecimal successRate;
    @XmlElement(name = "Alerts", nillable = true)
    protected ArrayOfOfflineConversionAlert alerts;

    /**
     * Gets the value of the goalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGoalId() {
        return goalId;
    }

    /**
     * Sets the value of the goalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGoalId(Long value) {
        this.goalId = value;
    }

    /**
     * Gets the value of the uploadDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getUploadDate() {
        return uploadDate;
    }

    /**
     * Sets the value of the uploadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadDate(Calendar value) {
        this.uploadDate = value;
    }

    /**
     * Gets the value of the successCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    /**
     * Sets the value of the successCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuccessCount(Integer value) {
        this.successCount = value;
    }

    /**
     * Gets the value of the unattributedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnattributedCount() {
        return unattributedCount;
    }

    /**
     * Sets the value of the unattributedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnattributedCount(Integer value) {
        this.unattributedCount = value;
    }

    /**
     * Gets the value of the successRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuccessRate() {
        return successRate;
    }

    /**
     * Sets the value of the successRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuccessRate(BigDecimal value) {
        this.successRate = value;
    }

    /**
     * Gets the value of the alerts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfflineConversionAlert }
     *     
     */
    public ArrayOfOfflineConversionAlert getAlerts() {
        return alerts;
    }

    /**
     * Sets the value of the alerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfflineConversionAlert }
     *     
     */
    public void setAlerts(ArrayOfOfflineConversionAlert value) {
        this.alerts = value;
    }

}
