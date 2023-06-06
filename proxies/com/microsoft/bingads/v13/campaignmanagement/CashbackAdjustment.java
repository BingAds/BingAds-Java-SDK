
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashbackAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashbackAdjustment">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}CriterionCashback">
 *       &lt;sequence>
 *         &lt;element name="CashbackPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashbackAdjustment", propOrder = {
    "cashbackPercent"
})
public class CashbackAdjustment
    extends CriterionCashback
{

    @XmlElement(name = "CashbackPercent", nillable = true)
    protected Double cashbackPercent;

    /**
     * Gets the value of the cashbackPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCashbackPercent() {
        return cashbackPercent;
    }

    /**
     * Sets the value of the cashbackPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCashbackPercent(Double value) {
        this.cashbackPercent = value;
    }

}
