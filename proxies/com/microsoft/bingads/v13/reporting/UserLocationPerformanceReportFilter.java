
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for UserLocationPerformanceReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserLocationPerformanceReportFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdDistribution" type="{https://bingads.microsoft.com/Reporting/v13}AdDistributionReportFilter" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Language" type="{https://bingads.microsoft.com/Reporting/v13}LanguageReportFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserLocationPerformanceReportFilter", propOrder = {
    "adDistribution",
    "countryCode",
    "language"
})
public class UserLocationPerformanceReportFilter {

    @XmlElement(name = "AdDistribution", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter16 .class)
    protected Collection<AdDistributionReportFilter> adDistribution;
    @XmlElement(name = "CountryCode", nillable = true)
    protected ArrayOfstring countryCode;
    @XmlElement(name = "Language", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected Collection<LanguageReportFilter> language;

    /**
     * Gets the value of the adDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdDistributionReportFilter> getAdDistribution() {
        return adDistribution;
    }

    /**
     * Sets the value of the adDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdDistribution(Collection<AdDistributionReportFilter> value) {
        this.adDistribution = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setCountryCode(ArrayOfstring value) {
        this.countryCode = value;
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

}
