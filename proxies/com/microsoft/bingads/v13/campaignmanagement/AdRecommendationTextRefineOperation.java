
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRecommendationTextRefineOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdRecommendationTextRefineOperation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TextField" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationTextField" minOccurs="0"/>
 *         <element name="TextFieldIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="TextTone" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationTextTone" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdRecommendationTextRefineOperation", propOrder = {
    "textField",
    "textFieldIndex",
    "textTone"
})
public class AdRecommendationTextRefineOperation {

    @XmlElement(name = "TextField")
    @XmlSchemaType(name = "string")
    protected AdRecommendationTextField textField;
    @XmlElement(name = "TextFieldIndex")
    protected Integer textFieldIndex;
    @XmlElement(name = "TextTone", nillable = true)
    @XmlSchemaType(name = "string")
    protected AdRecommendationTextTone textTone;

    /**
     * Gets the value of the textField property.
     * 
     * @return
     *     possible object is
     *     {@link AdRecommendationTextField }
     *     
     */
    public AdRecommendationTextField getTextField() {
        return textField;
    }

    /**
     * Sets the value of the textField property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRecommendationTextField }
     *     
     */
    public void setTextField(AdRecommendationTextField value) {
        this.textField = value;
    }

    /**
     * Gets the value of the textFieldIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTextFieldIndex() {
        return textFieldIndex;
    }

    /**
     * Sets the value of the textFieldIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTextFieldIndex(Integer value) {
        this.textFieldIndex = value;
    }

    /**
     * Gets the value of the textTone property.
     * 
     * @return
     *     possible object is
     *     {@link AdRecommendationTextTone }
     *     
     */
    public AdRecommendationTextTone getTextTone() {
        return textTone;
    }

    /**
     * Sets the value of the textTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRecommendationTextTone }
     *     
     */
    public void setTextTone(AdRecommendationTextTone value) {
        this.textTone = value;
    }

}
