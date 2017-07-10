
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Format" type="{https://bingads.microsoft.com/Reporting/v9}ReportFormat" minOccurs="0"/>
 *         &lt;element name="Language" type="{https://bingads.microsoft.com/Reporting/v9}ReportLanguage" minOccurs="0"/>
 *         &lt;element name="ReportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnOnlyCompleteData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportRequest", propOrder = {
    "format",
    "language",
    "reportName",
    "returnOnlyCompleteData"
})
@XmlSeeAlso({
    GoalsAndFunnelsReportRequest.class,
    RichAdComponentPerformanceReportRequest.class,
    ProductPartitionUnitPerformanceReportRequest.class,
    AdExtensionDetailReportRequest.class,
    SitePerformanceReportRequest.class,
    ProductOfferPerformanceReportRequest.class,
    AdDynamicTextPerformanceReportRequest.class,
    KeywordPerformanceReportRequest.class,
    AdExtensionByKeywordReportRequest.class,
    AdExtensionDimensionReportRequest.class,
    DestinationUrlPerformanceReportRequest.class,
    ShareOfVoiceReportRequest.class,
    TacticChannelReportRequest.class,
    CampaignPerformanceReportRequest.class,
    AgeGenderDemographicReportRequest.class,
    ProductPartitionPerformanceReportRequest.class,
    ProductTargetPerformanceReportRequest.class,
    BrandZonePerformanceReportRequest.class,
    BudgetSummaryReportRequest.class,
    AudiencePerformanceReportRequest.class,
    SearchCampaignChangeHistoryReportRequest.class,
    ConversionPerformanceReportRequest.class,
    NegativeKeywordConflictReportRequest.class,
    GeoLocationPerformanceReportRequest.class,
    TrafficSourcesReportRequest.class,
    AccountPerformanceReportRequest.class,
    GeographicalLocationReportRequest.class,
    AdExtensionByAdReportRequest.class,
    ProductSearchQueryPerformanceReportRequest.class,
    PublisherUsagePerformanceReportRequest.class,
    CallDetailReportRequest.class,
    ProductDimensionPerformanceReportRequest.class,
    SearchQueryPerformanceReportRequest.class,
    AdPerformanceReportRequest.class,
    AdGroupPerformanceReportRequest.class
})
public class ReportRequest {

    @XmlElement(name = "Format", nillable = true)
    @XmlSchemaType(name = "string")
    protected ReportFormat format;
    @XmlElement(name = "Language", nillable = true)
    @XmlSchemaType(name = "string")
    protected ReportLanguage language;
    @XmlElement(name = "ReportName", nillable = true)
    protected String reportName;
    @XmlElement(name = "ReturnOnlyCompleteData", nillable = true)
    protected Boolean returnOnlyCompleteData;

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link ReportFormat }
     *     
     */
    public ReportFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportFormat }
     *     
     */
    public void setFormat(ReportFormat value) {
        this.format = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link ReportLanguage }
     *     
     */
    public ReportLanguage getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportLanguage }
     *     
     */
    public void setLanguage(ReportLanguage value) {
        this.language = value;
    }

    /**
     * Gets the value of the reportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Gets the value of the returnOnlyCompleteData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getReturnOnlyCompleteData() {
        return returnOnlyCompleteData;
    }

    /**
     * Sets the value of the returnOnlyCompleteData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnOnlyCompleteData(Boolean value) {
        this.returnOnlyCompleteData = value;
    }

}
