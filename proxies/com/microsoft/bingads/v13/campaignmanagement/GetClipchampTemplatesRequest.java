
package com.microsoft.bingads.v13.campaignmanagement;

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
 *         <element name="Mock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="MaxAdsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="TemplateFilter" type="{https://bingads.microsoft.com/CampaignManagement/v13}VideoTemplateFilter" minOccurs="0"/>
 *         <element name="Locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mock",
    "maxAdsCount",
    "templateFilter",
    "locale"
})
@XmlRootElement(name = "GetClipchampTemplatesRequest")
public class GetClipchampTemplatesRequest {

    @XmlElement(name = "Mock", nillable = true)
    protected Boolean mock;
    @XmlElement(name = "MaxAdsCount", nillable = true)
    protected Integer maxAdsCount;
    @XmlElement(name = "TemplateFilter", nillable = true)
    protected VideoTemplateFilter templateFilter;
    @XmlElement(name = "Locale", nillable = true)
    protected String locale;

    /**
     * Gets the value of the mock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMock() {
        return mock;
    }

    /**
     * Sets the value of the mock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMock(Boolean value) {
        this.mock = value;
    }

    /**
     * Gets the value of the maxAdsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAdsCount() {
        return maxAdsCount;
    }

    /**
     * Sets the value of the maxAdsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAdsCount(Integer value) {
        this.maxAdsCount = value;
    }

    /**
     * Gets the value of the templateFilter property.
     * 
     * @return
     *     possible object is
     *     {@link VideoTemplateFilter }
     *     
     */
    public VideoTemplateFilter getTemplateFilter() {
        return templateFilter;
    }

    /**
     * Sets the value of the templateFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoTemplateFilter }
     *     
     */
    public void setTemplateFilter(VideoTemplateFilter value) {
        this.templateFilter = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

}
