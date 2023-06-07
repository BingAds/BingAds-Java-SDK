
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MaxKeywords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="MinConfidenceScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ExcludeBrand" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
@XmlRootElement(name = "SuggestKeywordsForUrlRequest")
public class SuggestKeywordsForUrlRequest {

    @XmlElement(name = "Url", nillable = true)
    protected String url;
    @XmlElement(name = "Language", nillable = true)
    protected String language;
    @XmlElement(name = "MaxKeywords", nillable = true)
    protected Integer maxKeywords;
    @XmlElement(name = "MinConfidenceScore", nillable = true)
    protected Double minConfidenceScore;
    @XmlElement(name = "ExcludeBrand", nillable = true)
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
