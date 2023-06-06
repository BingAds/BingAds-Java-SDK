
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
 *         <element name="CompanyNameFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="LanguageLocale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "companyNameFilter",
    "languageLocale"
})
@XmlRootElement(name = "SearchCompaniesRequest")
public class SearchCompaniesRequest {

    @XmlElement(name = "CompanyNameFilter", nillable = true)
    protected String companyNameFilter;
    @XmlElement(name = "LanguageLocale", nillable = true)
    protected String languageLocale;

    /**
     * Gets the value of the companyNameFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNameFilter() {
        return companyNameFilter;
    }

    /**
     * Sets the value of the companyNameFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNameFilter(String value) {
        this.companyNameFilter = value;
    }

    /**
     * Gets the value of the languageLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageLocale() {
        return languageLocale;
    }

    /**
     * Sets the value of the languageLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageLocale(String value) {
        this.languageLocale = value;
    }

}
