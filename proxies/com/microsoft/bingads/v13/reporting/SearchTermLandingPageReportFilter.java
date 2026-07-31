
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SearchTermLandingPageReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SearchTermLandingPageReportFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdType" type="{https://bingads.microsoft.com/Reporting/v13}AdTypeReportFilter" minOccurs="0"/>
 *         <element name="DeliveredMatchType" type="{https://bingads.microsoft.com/Reporting/v13}DeliveredMatchTypeReportFilter" minOccurs="0"/>
 *         <element name="Language" type="{https://bingads.microsoft.com/Reporting/v13}LanguageReportFilter" minOccurs="0"/>
 *         <element name="SearchQueries" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchTermLandingPageReportFilter", propOrder = {
    "adType",
    "deliveredMatchType",
    "language",
    "searchQueries"
})
public class SearchTermLandingPageReportFilter {

    @XmlElement(name = "AdType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected Collection<AdTypeReportFilter> adType;
    @XmlElement(name = "DeliveredMatchType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter14 .class)
    protected Collection<DeliveredMatchTypeReportFilter> deliveredMatchType;
    @XmlElement(name = "Language", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter11 .class)
    protected Collection<LanguageReportFilter> language;
    @XmlElement(name = "SearchQueries", nillable = true)
    protected ArrayOfstring searchQueries;

    /**
     * Gets the value of the adType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdTypeReportFilter> getAdType() {
        return adType;
    }

    /**
     * Sets the value of the adType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdType(Collection<AdTypeReportFilter> value) {
        this.adType = value;
    }

    /**
     * Gets the value of the deliveredMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<DeliveredMatchTypeReportFilter> getDeliveredMatchType() {
        return deliveredMatchType;
    }

    /**
     * Sets the value of the deliveredMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveredMatchType(Collection<DeliveredMatchTypeReportFilter> value) {
        this.deliveredMatchType = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<LanguageReportFilter> getLanguage() {
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
    public void setLanguage(Collection<LanguageReportFilter> value) {
        this.language = value;
    }

    /**
     * Gets the value of the searchQueries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getSearchQueries() {
        return searchQueries;
    }

    /**
     * Sets the value of the searchQueries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setSearchQueries(ArrayOfstring value) {
        this.searchQueries = value;
    }

}
