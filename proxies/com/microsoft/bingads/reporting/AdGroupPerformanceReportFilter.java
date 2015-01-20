
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AdGroupPerformanceReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupPerformanceReportFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdDistribution" type="{https://bingads.microsoft.com/Reporting/v9}AdDistributionReportFilter" minOccurs="0"/>
 *         &lt;element name="DeviceOS" type="{https://bingads.microsoft.com/Reporting/v9}DeviceOSReportFilter" minOccurs="0"/>
 *         &lt;element name="DeviceType" type="{https://bingads.microsoft.com/Reporting/v9}DeviceTypeReportFilter" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Status" type="{https://bingads.microsoft.com/Reporting/v9}AdGroupStatusReportFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupPerformanceReportFilter", propOrder = {
    "adDistribution",
    "deviceOS",
    "deviceType",
    "languageCode",
    "status"
})
public class AdGroupPerformanceReportFilter {

    @XmlElement(name = "AdDistribution", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter15 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected List<AdDistributionReportFilter> adDistribution;
    @XmlElement(name = "DeviceOS", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected List<DeviceOSReportFilter> deviceOS;
    @XmlElement(name = "DeviceType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected List<DeviceTypeReportFilter> deviceType;
    @XmlElement(name = "LanguageCode", nillable = true)
    protected ArrayOfstring languageCode;
    @XmlElement(name = "Status", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter14 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected List<AdGroupStatusReportFilter> status;

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
     * Gets the value of the deviceOS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public List<DeviceOSReportFilter> getDeviceOS() {
        return deviceOS;
    }

    /**
     * Sets the value of the deviceOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceOS(List<DeviceOSReportFilter> value) {
        this.deviceOS = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public List<AdGroupStatusReportFilter> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(List<AdGroupStatusReportFilter> value) {
        this.status = value;
    }

}
