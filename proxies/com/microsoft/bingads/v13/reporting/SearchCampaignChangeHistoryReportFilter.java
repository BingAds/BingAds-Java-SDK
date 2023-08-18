
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SearchCampaignChangeHistoryReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SearchCampaignChangeHistoryReportFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdDistribution" type="{https://bingads.microsoft.com/Reporting/v13}AdDistributionReportFilter" minOccurs="0"/>
 *         <element name="HowChanged" type="{https://bingads.microsoft.com/Reporting/v13}ChangeTypeReportFilter" minOccurs="0"/>
 *         <element name="ItemChanged" type="{https://bingads.microsoft.com/Reporting/v13}ChangeEntityReportFilter" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Collection<AdDistributionReportFilter> adDistribution;
    @XmlElement(name = "HowChanged", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter16 .class)
    protected Collection<ChangeTypeReportFilter> howChanged;
    @XmlElement(name = "ItemChanged", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter17 .class)
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
