
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrlParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrlParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsMessageParameter">
 *       &lt;sequence>
 *         &lt;element name="SuggestedText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuggestedUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UrlCategory" type="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsUrlCategory" minOccurs="0"/>
 *         &lt;element name="UrlId" type="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsUrlId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
