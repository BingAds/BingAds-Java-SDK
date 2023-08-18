
package com.microsoft.bingads.v13.customerbilling;

import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Coupon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Coupon">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CouponCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CouponType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="SpendThreshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PercentOff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ActiveDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="SendToEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SendToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="IsRedeemed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="RedemptionInfo" type="{https://bingads.microsoft.com/Customer/v13/Entities}CouponRedemption" minOccurs="0"/>
 *         <element name="ClaimInfo" type="{https://bingads.microsoft.com/Customer/v13/Entities}CouponClaimInfo" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coupon", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "couponCode",
    "className",
    "couponType",
    "amount",
    "spendThreshold",
    "currencyCode",
    "percentOff",
    "activeDuration",
    "expirationDate",
    "startDate",
    "endDate",
    "sendToEmail",
    "sendToDate",
    "isRedeemed",
    "redemptionInfo",
    "claimInfo"
})
public class Coupon {

    @XmlElement(name = "CouponCode", nillable = true)
    protected String couponCode;
    @XmlElement(name = "ClassName", nillable = true)
    protected String className;
    @XmlElement(name = "CouponType", nillable = true)
    protected String couponType;
    @XmlElement(name = "Amount")
    protected Double amount;
    @XmlElement(name = "SpendThreshold")
    protected Double spendThreshold;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "PercentOff", nillable = true)
    protected Double percentOff;
    @XmlElement(name = "ActiveDuration", nillable = true)
    protected Integer activeDuration;
    @XmlElement(name = "ExpirationDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar expirationDate;
    @XmlElement(name = "StartDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startDate;
    @XmlElement(name = "EndDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endDate;
    @XmlElement(name = "SendToEmail", nillable = true)
    protected String sendToEmail;
    @XmlElement(name = "SendToDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar sendToDate;
    @XmlElement(name = "IsRedeemed")
    protected Boolean isRedeemed;
    @XmlElement(name = "RedemptionInfo", nillable = true)
    protected CouponRedemption redemptionInfo;
    @XmlElement(name = "ClaimInfo", nillable = true)
    protected CouponClaimInfo claimInfo;

    /**
     * Gets the value of the couponCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * Sets the value of the couponCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponCode(String value) {
        this.couponCode = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the couponType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponType() {
        return couponType;
    }

    /**
     * Sets the value of the couponType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponType(String value) {
        this.couponType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the spendThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpendThreshold() {
        return spendThreshold;
    }

    /**
     * Sets the value of the spendThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpendThreshold(Double value) {
        this.spendThreshold = value;
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
     * Gets the value of the sendToEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendToEmail() {
        return sendToEmail;
    }

    /**
     * Sets the value of the sendToEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendToEmail(String value) {
        this.sendToEmail = value;
    }

    /**
     * Gets the value of the sendToDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSendToDate() {
        return sendToDate;
    }

    /**
     * Sets the value of the sendToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendToDate(Calendar value) {
        this.sendToDate = value;
    }

    /**
     * Gets the value of the isRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsRedeemed() {
        return isRedeemed;
    }

    /**
     * Sets the value of the isRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRedeemed(Boolean value) {
        this.isRedeemed = value;
    }

    /**
     * Gets the value of the redemptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CouponRedemption }
     *     
     */
    public CouponRedemption getRedemptionInfo() {
        return redemptionInfo;
    }

    /**
     * Sets the value of the redemptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponRedemption }
     *     
     */
    public void setRedemptionInfo(CouponRedemption value) {
        this.redemptionInfo = value;
    }

    /**
     * Gets the value of the claimInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CouponClaimInfo }
     *     
     */
    public CouponClaimInfo getClaimInfo() {
        return claimInfo;
    }

    /**
     * Sets the value of the claimInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponClaimInfo }
     *     
     */
    public void setClaimInfo(CouponClaimInfo value) {
        this.claimInfo = value;
    }

}
