
package com.microsoft.bingads.v13.customerbilling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SendToEmails" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CouponClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sendToEmails",
    "customerId",
    "couponClassName"
})
@XmlRootElement(name = "DispatchCouponsRequest")
public class DispatchCouponsRequest {

    @XmlElement(name = "SendToEmails", nillable = true)
    protected ArrayOfstring sendToEmails;
    @XmlElement(name = "CustomerId")
    protected Long customerId;
    @XmlElement(name = "CouponClassName", nillable = true)
    protected String couponClassName;

    /**
     * Gets the value of the sendToEmails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getSendToEmails() {
        return sendToEmails;
    }

    /**
     * Sets the value of the sendToEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setSendToEmails(ArrayOfstring value) {
        this.sendToEmails = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the couponClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponClassName() {
        return couponClassName;
    }

    /**
     * Sets the value of the couponClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponClassName(String value) {
        this.couponClassName = value;
    }

}
