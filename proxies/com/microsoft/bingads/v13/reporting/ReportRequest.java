
package com.microsoft.bingads.v13.reporting;

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
 *         &lt;element name="ExcludeColumnHeaders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExcludeReportFooter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExcludeReportHeader" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Format" type="{https://bingads.microsoft.com/Reporting/v13}ReportFormat" minOccurs="0"/>
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
    "excludeColumnHeaders",
    "excludeReportFooter",
    "excludeReportHeader",
    "format",
    "reportName",
    "returnOnlyCompleteData"
})
@XmlSeeAlso({
    SearchCampaignChangeHistoryReportRequest.class,
    UserLocationPerformanceReportRequest.class,
    DSACategoryPerformanceReportRequest.class,
    ConversionPerformanceReportRequest.class,
    NegativeKeywordConflictReportRequest.class,
    AgeGenderAudienceReportRequest.class,
    GoalsAndFunnelsReportRequest.class,
    ProductPartitionUnitPerformanceReportRequest.class,
    DSAAutoTargetPerformanceReportRequest.class,
    AdExtensionDetailReportRequest.class,
    ProductMatchCountReportRequest.class,
    AccountPerformanceReportRequest.class,
    AdExtensionByAdReportRequest.class,
    ProductSearchQueryPerformanceReportRequest.class,
    AdDynamicTextPerformanceReportRequest.class,
    KeywordPerformanceReportRequest.class,
    ProfessionalDemographicsAudienceReportRequest.class,
    DSASearchQueryPerformanceReportRequest.class,
    AdExtensionByKeywordReportRequest.class,
    DestinationUrlPerformanceReportRequest.class,
    ShareOfVoiceReportRequest.class,
    PublisherUsagePerformanceReportRequest.class,
    CallDetailReportRequest.class,
    CampaignPerformanceReportRequest.class,
    ProductDimensionPerformanceReportRequest.class,
    GeographicPerformanceReportRequest.class,
    ProductPartitionPerformanceReportRequest.class,
    SearchQueryPerformanceReportRequest.class,
    AdPerformanceReportRequest.class,
    BudgetSummaryReportRequest.class,
    AudiencePerformanceReportRequest.class,
    AdGroupPerformanceReportRequest.class
})
public class ReportRequest {

    @XmlElement(name = "ExcludeColumnHeaders", nillable = true)
    protected Boolean excludeColumnHeaders;
    @XmlElement(name = "ExcludeReportFooter", nillable = true)
    protected Boolean excludeReportFooter;
    @XmlElement(name = "ExcludeReportHeader", nillable = true)
    protected Boolean excludeReportHeader;
    @XmlElement(name = "Format", nillable = true)
    @XmlSchemaType(name = "string")
    protected ReportFormat format;
    @XmlElement(name = "ReportName", nillable = true)
    protected String reportName;
    @XmlElement(name = "ReturnOnlyCompleteData", nillable = true)
    protected Boolean returnOnlyCompleteData;

    /**
     * Gets the value of the excludeColumnHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExcludeColumnHeaders() {
        return excludeColumnHeaders;
    }

    /**
     * Sets the value of the excludeColumnHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeColumnHeaders(Boolean value) {
        this.excludeColumnHeaders = value;
    }

    /**
     * Gets the value of the excludeReportFooter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExcludeReportFooter() {
        return excludeReportFooter;
    }

    /**
     * Sets the value of the excludeReportFooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeReportFooter(Boolean value) {
        this.excludeReportFooter = value;
    }

    /**
     * Gets the value of the excludeReportHeader property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExcludeReportHeader() {
        return excludeReportHeader;
    }

    /**
     * Sets the value of the excludeReportHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeReportHeader(Boolean value) {
        this.excludeReportHeader = value;
    }

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
