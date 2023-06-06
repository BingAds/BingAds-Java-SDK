
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstimatedPositionAndTraffic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimatedPositionAndTraffic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchType" type="{https://bingads.microsoft.com/AdInsight/v13}MatchType" minOccurs="0"/>
 *         &lt;element name="MinClicksPerWeek" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MaxClicksPerWeek" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AverageCPC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MinImpressionsPerWeek" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MaxImpressionsPerWeek" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CTR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MinTotalCostPerWeek" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MaxTotalCostPerWeek" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{https://bingads.microsoft.com/AdInsight/v13}CurrencyCode" minOccurs="0"/>
 *         &lt;element name="EstimatedAdPosition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedPositionAndTraffic", propOrder = {
    "matchType",
    "minClicksPerWeek",
    "maxClicksPerWeek",
    "averageCPC",
    "minImpressionsPerWeek",
    "maxImpressionsPerWeek",
    "ctr",
    "minTotalCostPerWeek",
    "maxTotalCostPerWeek",
    "currencyCode",
    "estimatedAdPosition"
})
public class EstimatedPositionAndTraffic {

    @XmlElement(name = "MatchType")
    @XmlSchemaType(name = "string")
    protected MatchType matchType;
    @XmlElement(name = "MinClicksPerWeek")
    protected Double minClicksPerWeek;
    @XmlElement(name = "MaxClicksPerWeek")
    protected Double maxClicksPerWeek;
    @XmlElement(name = "AverageCPC")
    protected Double averageCPC;
    @XmlElement(name = "MinImpressionsPerWeek")
    protected Long minImpressionsPerWeek;
    @XmlElement(name = "MaxImpressionsPerWeek")
    protected Long maxImpressionsPerWeek;
    @XmlElement(name = "CTR")
    protected Double ctr;
    @XmlElement(name = "MinTotalCostPerWeek")
    protected Double minTotalCostPerWeek;
    @XmlElement(name = "MaxTotalCostPerWeek")
    protected Double maxTotalCostPerWeek;
    @XmlElement(name = "CurrencyCode")
    @XmlSchemaType(name = "string")
    protected CurrencyCode currencyCode;
    @XmlElement(name = "EstimatedAdPosition")
    protected Double estimatedAdPosition;

    /**
     * Gets the value of the matchType property.
     * 
     * @return
     *     possible object is
     *     {@link MatchType }
     *     
     */
    public MatchType getMatchType() {
        return matchType;
    }

    /**
     * Sets the value of the matchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchType }
     *     
     */
    public void setMatchType(MatchType value) {
        this.matchType = value;
    }

    /**
     * Gets the value of the minClicksPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinClicksPerWeek() {
        return minClicksPerWeek;
    }

    /**
     * Sets the value of the minClicksPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinClicksPerWeek(Double value) {
        this.minClicksPerWeek = value;
    }

    /**
     * Gets the value of the maxClicksPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxClicksPerWeek() {
        return maxClicksPerWeek;
    }

    /**
     * Sets the value of the maxClicksPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxClicksPerWeek(Double value) {
        this.maxClicksPerWeek = value;
    }

    /**
     * Gets the value of the averageCPC property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageCPC() {
        return averageCPC;
    }

    /**
     * Sets the value of the averageCPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageCPC(Double value) {
        this.averageCPC = value;
    }

    /**
     * Gets the value of the minImpressionsPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinImpressionsPerWeek() {
        return minImpressionsPerWeek;
    }

    /**
     * Sets the value of the minImpressionsPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinImpressionsPerWeek(Long value) {
        this.minImpressionsPerWeek = value;
    }

    /**
     * Gets the value of the maxImpressionsPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxImpressionsPerWeek() {
        return maxImpressionsPerWeek;
    }

    /**
     * Sets the value of the maxImpressionsPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxImpressionsPerWeek(Long value) {
        this.maxImpressionsPerWeek = value;
    }

    /**
     * Gets the value of the ctr property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCTR() {
        return ctr;
    }

    /**
     * Sets the value of the ctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCTR(Double value) {
        this.ctr = value;
    }

    /**
     * Gets the value of the minTotalCostPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinTotalCostPerWeek() {
        return minTotalCostPerWeek;
    }

    /**
     * Sets the value of the minTotalCostPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinTotalCostPerWeek(Double value) {
        this.minTotalCostPerWeek = value;
    }

    /**
     * Gets the value of the maxTotalCostPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxTotalCostPerWeek() {
        return maxTotalCostPerWeek;
    }

    /**
     * Sets the value of the maxTotalCostPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxTotalCostPerWeek(Double value) {
        this.maxTotalCostPerWeek = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrencyCode(CurrencyCode value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the estimatedAdPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedAdPosition() {
        return estimatedAdPosition;
    }

    /**
     * Sets the value of the estimatedAdPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedAdPosition(Double value) {
        this.estimatedAdPosition = value;
    }

}
