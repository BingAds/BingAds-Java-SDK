
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRecommendationTextAssetProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdRecommendationTextAssetProperty">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TextField" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationTextField" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdRecommendationTextAssetProperty", propOrder = {
    "text",
    "textField"
})
public class AdRecommendationTextAssetProperty {

    @XmlElement(name = "Text", nillable = true)
    protected String text;
    @XmlElement(name = "TextField")
    @XmlSchemaType(name = "string")
    protected AdRecommendationTextField textField;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

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

}
