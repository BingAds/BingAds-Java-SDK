
package com.microsoft.bingads.optimizer;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BudgetLandscapePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetLandscapePoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BudgetLandscapePointDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Clicks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EstimatedClicks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EstimatedImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Impressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetLandscapePoint", propOrder = {
    "budgetLandscapePointDate",
    "clicks",
    "estimatedClicks",
    "estimatedImpressions",
    "impressions"
})
public class BudgetLandscapePoint {

    @XmlElement(name = "BudgetLandscapePointDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar budgetLandscapePointDate;
    @XmlElement(name = "Clicks")
    protected Double clicks;
    @XmlElement(name = "EstimatedClicks")
    protected Double estimatedClicks;
    @XmlElement(name = "EstimatedImpressions")
    protected Long estimatedImpressions;
    @XmlElement(name = "Impressions")
    protected Long impressions;

    /**
     * Gets the value of the budgetLandscapePointDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getBudgetLandscapePointDate() {
        return budgetLandscapePointDate;
    }

    /**
     * Sets the value of the budgetLandscapePointDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetLandscapePointDate(Calendar value) {
        this.budgetLandscapePointDate = value;
    }

    /**
     * Gets the value of the clicks property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClicks() {
        return clicks;
    }

    /**
     * Sets the value of the clicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClicks(Double value) {
        this.clicks = value;
    }

    /**
     * Gets the value of the estimatedClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedClicks() {
        return estimatedClicks;
    }

    /**
     * Sets the value of the estimatedClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedClicks(Double value) {
        this.estimatedClicks = value;
    }

    /**
     * Gets the value of the estimatedImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedImpressions() {
        return estimatedImpressions;
    }

    /**
     * Sets the value of the estimatedImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedImpressions(Long value) {
        this.estimatedImpressions = value;
    }

    /**
     * Gets the value of the impressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImpressions() {
        return impressions;
    }

    /**
     * Sets the value of the impressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImpressions(Long value) {
        this.impressions = value;
    }

}
