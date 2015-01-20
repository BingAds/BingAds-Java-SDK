
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgeTargetBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgeTargetBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Age" type="{https://bingads.microsoft.com/CampaignManagement/v9}AgeRange"/>
 *         &lt;element name="BidAdjustment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgeTargetBid", propOrder = {
    "age",
    "bidAdjustment"
})
public class AgeTargetBid {

    @XmlElement(name = "Age", required = true)
    @XmlSchemaType(name = "string")
    protected AgeRange age;
    @XmlElement(name = "BidAdjustment")
    protected int bidAdjustment;

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link AgeRange }
     *     
     */
    public AgeRange getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeRange }
     *     
     */
    public void setAge(AgeRange value) {
        this.age = value;
    }

    /**
     * Gets the value of the bidAdjustment property.
     * 
     */
    public int getBidAdjustment() {
        return bidAdjustment;
    }

    /**
     * Sets the value of the bidAdjustment property.
     * 
     */
    public void setBidAdjustment(int value) {
        this.bidAdjustment = value;
    }

}
