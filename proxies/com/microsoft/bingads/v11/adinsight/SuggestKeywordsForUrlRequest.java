
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxKeywords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinConfidenceScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ExcludeBrand" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "url",
    "language",
    "maxKeywords",
    "minConfidenceScore",
    "excludeBrand"
})
@XmlRootElement(name = "SuggestKeywordsForUrlRequest", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11")
public class SuggestKeywordsForUrlRequest {

    @XmlElement(name = "Url", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected String url;
    @XmlElement(name = "Language", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected String language;
    @XmlElement(name = "MaxKeywords", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected Integer maxKeywords;
    @XmlElement(name = "MinConfidenceScore", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected Double minConfidenceScore;
    @XmlElement(name = "ExcludeBrand", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected Boolean excludeBrand;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the maxKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxKeywords() {
        return maxKeywords;
    }

    /**
     * Sets the value of the maxKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxKeywords(Integer value) {
        this.maxKeywords = value;
    }

    /**
     * Gets the value of the minConfidenceScore property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinConfidenceScore() {
        return minConfidenceScore;
    }

    /**
     * Sets the value of the minConfidenceScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinConfidenceScore(Double value) {
        this.minConfidenceScore = value;
    }

    /**
     * Gets the value of the excludeBrand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExcludeBrand() {
        return excludeBrand;
    }

    /**
     * Sets the value of the excludeBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeBrand(Boolean value) {
        this.excludeBrand = value;
    }

}
