
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsMessageParameter">
 *       &lt;sequence>
 *         &lt;element name="SuggestedText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextParameter", propOrder = {
    "suggestedText"
})
public class TextParameter
    extends PerformanceInsightsMessageParameter
{

    @XmlElement(name = "SuggestedText", nillable = true)
    protected String suggestedText;

    /**
     * Gets the value of the suggestedText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedText() {
        return suggestedText;
    }

    /**
     * Sets the value of the suggestedText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedText(String value) {
        this.suggestedText = value;
    }

}
