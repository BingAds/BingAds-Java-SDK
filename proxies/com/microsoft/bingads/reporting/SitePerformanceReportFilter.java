
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SitePerformanceReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SitePerformanceReportFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdDistribution" type="{https://bingads.microsoft.com/Reporting/v9}AdDistributionReportFilter" minOccurs="0"/>
 *         &lt;element name="AdType" type="{https://bingads.microsoft.com/Reporting/v9}AdTypeReportFilter" minOccurs="0"/>
 *         &lt;element name="DeliveredMatchType" type="{https://bingads.microsoft.com/Reporting/v9}DeliveredMatchTypeReportFilter" minOccurs="0"/>
 *         &lt;element name="DeviceType" type="{https://bingads.microsoft.com/Reporting/v9}DeviceTypeReportFilter" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="SiteIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SitePerformanceReportFilter", propOrder = {
    "adDistribution",
    "adType",
    "deliveredMatchType",
    "deviceType",
    "languageCode",
    "siteIds"
})
public class SitePerformanceReportFilter {

    @XmlElement(name = "AdDistribution", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter15 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected List<AdDistributionReportFilter> adDistribution;
    @XmlElement(name = "AdType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected List<AdTypeReportFilter> adType;
    @XmlElement(name = "DeliveredMatchType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected List<DeliveredMatchTypeReportFilter> deliveredMatchType;
    @XmlElement(name = "DeviceType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected List<DeviceTypeReportFilter> deviceType;
    @XmlElement(name = "LanguageCode", nillable = true)
    protected ArrayOfstring languageCode;
    @XmlElement(name = "SiteIds", nillable = true)
    protected ArrayOflong siteIds;

    /**
     * Gets the value of the adDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public List<AdDistributionReportFilter> getAdDistribution() {
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
    public void setAdDistribution(List<AdDistributionReportFilter> value) {
        this.adDistribution = value;
    }

    /**
     * Gets the value of the adType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public List<AdTypeReportFilter> getAdType() {
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
    public void setAdType(List<AdTypeReportFilter> value) {
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
    public List<DeliveredMatchTypeReportFilter> getDeliveredMatchType() {
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
    public void setDeliveredMatchType(List<DeliveredMatchTypeReportFilter> value) {
        this.deliveredMatchType = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public List<DeviceTypeReportFilter> getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(List<DeviceTypeReportFilter> value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setLanguageCode(ArrayOfstring value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the siteIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getSiteIds() {
        return siteIds;
    }

    /**
     * Sets the value of the siteIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setSiteIds(ArrayOflong value) {
        this.siteIds = value;
    }

}
