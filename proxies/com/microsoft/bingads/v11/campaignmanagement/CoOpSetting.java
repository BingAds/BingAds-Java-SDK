
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoOpSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoOpSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v11}Setting">
 *       &lt;sequence>
 *         &lt;element name="BidBoostValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BidMaxValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BidOption" type="{https://bingads.microsoft.com/CampaignManagement/v11}BidOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoOpSetting", propOrder = {
    "bidBoostValue",
    "bidMaxValue",
    "bidOption"
})
public class CoOpSetting
    extends Setting
{

    @XmlElement(name = "BidBoostValue", nillable = true)
    protected Double bidBoostValue;
    @XmlElement(name = "BidMaxValue", nillable = true)
    protected Double bidMaxValue;
    @XmlElement(name = "BidOption", nillable = true)
    @XmlSchemaType(name = "string")
    protected BidOption bidOption;

    /**
     * Gets the value of the bidBoostValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBidBoostValue() {
        return bidBoostValue;
    }

    /**
     * Sets the value of the bidBoostValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBidBoostValue(Double value) {
        this.bidBoostValue = value;
    }

    /**
     * Gets the value of the bidMaxValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBidMaxValue() {
        return bidMaxValue;
    }

    /**
     * Sets the value of the bidMaxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBidMaxValue(Double value) {
        this.bidMaxValue = value;
    }

    /**
     * Gets the value of the bidOption property.
     * 
     * @return
     *     possible object is
     *     {@link BidOption }
     *     
     */
    public BidOption getBidOption() {
        return bidOption;
    }

    /**
     * Sets the value of the bidOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidOption }
     *     
     */
    public void setBidOption(BidOption value) {
        this.bidOption = value;
    }

}
