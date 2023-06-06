
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrlParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UrlParameter">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsMessageParameter">
 *       <sequence>
 *         <element name="SuggestedText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SuggestedUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UrlCategory" type="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsUrlCategory" minOccurs="0"/>
 *         <element name="UrlId" type="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsUrlId" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrlParameter", propOrder = {
    "suggestedText",
    "suggestedUrl",
    "urlCategory",
    "urlId"
})
public class UrlParameter
    extends PerformanceInsightsMessageParameter
{

    @XmlElement(name = "SuggestedText", nillable = true)
    protected String suggestedText;
    @XmlElement(name = "SuggestedUrl", nillable = true)
    protected String suggestedUrl;
    @XmlElement(name = "UrlCategory")
    @XmlSchemaType(name = "string")
    protected PerformanceInsightsUrlCategory urlCategory;
    @XmlElement(name = "UrlId")
    @XmlSchemaType(name = "string")
    protected PerformanceInsightsUrlId urlId;

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

    /**
     * Gets the value of the suggestedUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedUrl() {
        return suggestedUrl;
    }

    /**
     * Sets the value of the suggestedUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedUrl(String value) {
        this.suggestedUrl = value;
    }

    /**
     * Gets the value of the urlCategory property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceInsightsUrlCategory }
     *     
     */
    public PerformanceInsightsUrlCategory getUrlCategory() {
        return urlCategory;
    }

    /**
     * Sets the value of the urlCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceInsightsUrlCategory }
     *     
     */
    public void setUrlCategory(PerformanceInsightsUrlCategory value) {
        this.urlCategory = value;
    }

    /**
     * Gets the value of the urlId property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceInsightsUrlId }
     *     
     */
    public PerformanceInsightsUrlId getUrlId() {
        return urlId;
    }

    /**
     * Sets the value of the urlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceInsightsUrlId }
     *     
     */
    public void setUrlId(PerformanceInsightsUrlId value) {
        this.urlId = value;
    }

}
