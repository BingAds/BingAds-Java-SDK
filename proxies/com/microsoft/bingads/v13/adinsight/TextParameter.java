
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TextParameter">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsMessageParameter">
 *       <sequence>
 *         <element name="SuggestedText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
