
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SearchCampaignChangeHistoryReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCampaignChangeHistoryReportFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdDistribution" type="{https://bingads.microsoft.com/Reporting/v9}AdDistributionReportFilter" minOccurs="0"/>
 *         &lt;element name="HowChanged" type="{https://bingads.microsoft.com/Reporting/v9}ChangeTypeReportFilter" minOccurs="0"/>
 *         &lt;element name="ItemChanged" type="{https://bingads.microsoft.com/Reporting/v9}ChangeEntityReportFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCampaignChangeHistoryReportFilter", propOrder = {
    "adDistribution",
    "howChanged",
    "itemChanged"
})
public class SearchCampaignChangeHistoryReportFilter {

    @XmlElement(name = "AdDistribution", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter16 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<AdDistributionReportFilter> adDistribution;
    @XmlElement(name = "HowChanged", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<ChangeTypeReportFilter> howChanged;
    @XmlElement(name = "ItemChanged", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<ChangeEntityReportFilter> itemChanged;

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
     * Gets the value of the howChanged property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<ChangeTypeReportFilter> getHowChanged() {
        return howChanged;
    }

    /**
     * Sets the value of the howChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHowChanged(Collection<ChangeTypeReportFilter> value) {
        this.howChanged = value;
    }

    /**
     * Gets the value of the itemChanged property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<ChangeEntityReportFilter> getItemChanged() {
        return itemChanged;
    }

    /**
     * Sets the value of the itemChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemChanged(Collection<ChangeEntityReportFilter> value) {
        this.itemChanged = value;
    }

}
