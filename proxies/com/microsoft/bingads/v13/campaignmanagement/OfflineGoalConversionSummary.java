
package com.microsoft.bingads.v13.campaignmanagement;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineGoalConversionSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OfflineGoalConversionSummary">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GoalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="ConversionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OverallSuccessCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="OverallUnattributedCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="OverallSuccessRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="OverallAlerts" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfOfflineConversionAlert" minOccurs="0"/>
 *         <element name="DailySummaries" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfOfflineGoalDailySummary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineGoalConversionSummary", propOrder = {
    "goalId",
    "conversionName",
    "overallSuccessCount",
    "overallUnattributedCount",
    "overallSuccessRate",
    "overallAlerts",
    "dailySummaries"
})
public class OfflineGoalConversionSummary {

    @XmlElement(name = "GoalId")
    protected Long goalId;
    @XmlElement(name = "ConversionName", nillable = true)
    protected String conversionName;
    @XmlElement(name = "OverallSuccessCount")
    protected Long overallSuccessCount;
    @XmlElement(name = "OverallUnattributedCount")
    protected Long overallUnattributedCount;
    @XmlElement(name = "OverallSuccessRate")
    protected BigDecimal overallSuccessRate;
    @XmlElement(name = "OverallAlerts", nillable = true)
    protected ArrayOfOfflineConversionAlert overallAlerts;
    @XmlElement(name = "DailySummaries", nillable = true)
    protected ArrayOfOfflineGoalDailySummary dailySummaries;

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
     * Gets the value of the conversionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionName() {
        return conversionName;
    }

    /**
     * Sets the value of the conversionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionName(String value) {
        this.conversionName = value;
    }

    /**
     * Gets the value of the overallSuccessCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverallSuccessCount() {
        return overallSuccessCount;
    }

    /**
     * Sets the value of the overallSuccessCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverallSuccessCount(Long value) {
        this.overallSuccessCount = value;
    }

    /**
     * Gets the value of the overallUnattributedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverallUnattributedCount() {
        return overallUnattributedCount;
    }

    /**
     * Sets the value of the overallUnattributedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverallUnattributedCount(Long value) {
        this.overallUnattributedCount = value;
    }

    /**
     * Gets the value of the overallSuccessRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverallSuccessRate() {
        return overallSuccessRate;
    }

    /**
     * Sets the value of the overallSuccessRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverallSuccessRate(BigDecimal value) {
        this.overallSuccessRate = value;
    }

    /**
     * Gets the value of the overallAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfflineConversionAlert }
     *     
     */
    public ArrayOfOfflineConversionAlert getOverallAlerts() {
        return overallAlerts;
    }

    /**
     * Sets the value of the overallAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfflineConversionAlert }
     *     
     */
    public void setOverallAlerts(ArrayOfOfflineConversionAlert value) {
        this.overallAlerts = value;
    }

    /**
     * Gets the value of the dailySummaries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfflineGoalDailySummary }
     *     
     */
    public ArrayOfOfflineGoalDailySummary getDailySummaries() {
        return dailySummaries;
    }

    /**
     * Sets the value of the dailySummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfflineGoalDailySummary }
     *     
     */
    public void setDailySummaries(ArrayOfOfflineGoalDailySummary value) {
        this.dailySummaries = value;
    }

}
