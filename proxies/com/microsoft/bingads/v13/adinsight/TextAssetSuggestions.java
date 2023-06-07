
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextAssetSuggestions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TextAssetSuggestions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinalUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TextAssets" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextAssetSuggestions", propOrder = {
    "finalUrl",
    "textAssets"
})
public class TextAssetSuggestions {

    @XmlElement(name = "FinalUrl", nillable = true)
    protected String finalUrl;
    @XmlElement(name = "TextAssets", nillable = true)
    protected ArrayOfstring textAssets;

    /**
     * Gets the value of the finalUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalUrl() {
        return finalUrl;
    }

    /**
     * Sets the value of the finalUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalUrl(String value) {
        this.finalUrl = value;
    }

    /**
     * Gets the value of the textAssets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getTextAssets() {
        return textAssets;
    }

    /**
     * Sets the value of the textAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setTextAssets(ArrayOfstring value) {
        this.textAssets = value;
    }

}
