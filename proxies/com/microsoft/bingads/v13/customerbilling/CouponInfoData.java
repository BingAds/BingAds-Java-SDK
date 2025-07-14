
package com.microsoft.bingads.v13.customerbilling;

import java.math.BigDecimal;
import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CouponInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CouponInfoData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CouponId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ClaimDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Status" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="RedemptionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="PercentOff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="CouponValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="UpfrontSpending" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="ActiveDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="SpendToThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FeatureId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CouponType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponInfoData", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "accountId",
    "couponId",
    "claimDate",
    "status",
    "redemptionDate",
    "expirationDate",
    "percentOff",
    "couponValue",
    "upfrontSpending",
    "activeDuration",
    "spendToThreshold",
    "startDate",
    "endDate",
    "balance",
    "currencyCode",
    "featureId",
    "couponType"
})
public class CouponInfoData {

    @XmlElement(name = "AccountId")
    protected Integer accountId;
    @XmlElement(name = "CouponId", nillable = true)
    protected Integer couponId;
    @XmlElement(name = "ClaimDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar claimDate;
    @XmlElement(name = "Status", nillable = true)
    @XmlSchemaType(name = "unsignedByte")
    protected Short status;
    @XmlElement(name = "RedemptionDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar redemptionDate;
    @XmlElement(name = "ExpirationDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar expirationDate;
    @XmlElement(name = "PercentOff", nillable = true)
    protected Double percentOff;
    @XmlElement(name = "CouponValue", nillable = true)
    protected BigDecimal couponValue;
    @XmlElement(name = "UpfrontSpending", nillable = true)
    protected BigDecimal upfrontSpending;
    @XmlElement(name = "ActiveDuration", nillable = true)
    protected Integer activeDuration;
    @XmlElement(name = "SpendToThreshold", nillable = true)
    protected BigDecimal spendToThreshold;
    @XmlElement(name = "StartDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startDate;
    @XmlElement(name = "EndDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endDate;
    @XmlElement(name = "Balance", nillable = true)
    protected BigDecimal balance;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "FeatureId", nillable = true)
    protected Integer featureId;
    @XmlElement(name = "CouponType", nillable = true)
    @XmlSchemaType(name = "unsignedByte")
    protected Short couponType;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the couponId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCouponId() {
        return couponId;
    }

    /**
     * Sets the value of the couponId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCouponId(Integer value) {
        this.couponId = value;
    }

    /**
     * Gets the value of the claimDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getClaimDate() {
        return claimDate;
    }

    /**
     * Sets the value of the claimDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimDate(Calendar value) {
        this.claimDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStatus(Short value) {
        this.status = value;
    }

    /**
     * Gets the value of the redemptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getRedemptionDate() {
        return redemptionDate;
    }

    /**
     * Sets the value of the redemptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionDate(Calendar value) {
        this.redemptionDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(Calendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the percentOff property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentOff() {
        return percentOff;
    }

    /**
     * Sets the value of the percentOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentOff(Double value) {
        this.percentOff = value;
    }

    /**
     * Gets the value of the couponValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCouponValue() {
        return couponValue;
    }

    /**
     * Sets the value of the couponValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCouponValue(BigDecimal value) {
        this.couponValue = value;
    }

    /**
     * Gets the value of the upfrontSpending property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpfrontSpending() {
        return upfrontSpending;
    }

    /**
     * Sets the value of the upfrontSpending property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpfrontSpending(BigDecimal value) {
        this.upfrontSpending = value;
    }

    /**
     * Gets the value of the activeDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActiveDuration() {
        return activeDuration;
    }

    /**
     * Sets the value of the activeDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActiveDuration(Integer value) {
        this.activeDuration = value;
    }

    /**
     * Gets the value of the spendToThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpendToThreshold() {
        return spendToThreshold;
    }

    /**
     * Sets the value of the spendToThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpendToThreshold(BigDecimal value) {
        this.spendToThreshold = value;
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
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the featureId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeatureId() {
        return featureId;
    }

    /**
     * Sets the value of the featureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeatureId(Integer value) {
        this.featureId = value;
    }

    /**
     * Gets the value of the couponType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCouponType() {
        return couponType;
    }

    /**
     * Sets the value of the couponType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCouponType(Short value) {
        this.couponType = value;
    }

}
