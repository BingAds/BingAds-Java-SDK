
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportRequest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ExcludeColumnHeaders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ExcludeReportFooter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ExcludeReportHeader" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Format" type="{https://bingads.microsoft.com/Reporting/v13}ReportFormat" minOccurs="0"/>
 *         <element name="FormatVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ReportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ReturnOnlyCompleteData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportRequest", propOrder = {
    "type",
    "excludeColumnHeaders",
    "excludeReportFooter",
    "excludeReportHeader",
    "format",
    "formatVersion",
    "reportName",
    "returnOnlyCompleteData"
})
@XmlSeeAlso({
    AccountPerformanceReportRequest.class,
    CampaignPerformanceReportRequest.class,
    AdDynamicTextPerformanceReportRequest.class,
    AdGroupPerformanceReportRequest.class,
    AdPerformanceReportRequest.class,
    KeywordPerformanceReportRequest.class,
    DestinationUrlPerformanceReportRequest.class,
    BudgetSummaryReportRequest.class,
    AgeGenderAudienceReportRequest.class,
    ProfessionalDemographicsAudienceReportRequest.class,
    UserLocationPerformanceReportRequest.class,
    PublisherUsagePerformanceReportRequest.class,
    SearchQueryPerformanceReportRequest.class,
    ConversionPerformanceReportRequest.class,
    GoalsAndFunnelsReportRequest.class,
    NegativeKeywordConflictReportRequest.class,
    SearchCampaignChangeHistoryReportRequest.class,
    AdExtensionByAdReportRequest.class,
    AdExtensionByKeywordReportRequest.class,
    AudiencePerformanceReportRequest.class,
    AdExtensionDetailReportRequest.class,
    ShareOfVoiceReportRequest.class,
    ProductDimensionPerformanceReportRequest.class,
    ProductPartitionPerformanceReportRequest.class,
    ProductPartitionUnitPerformanceReportRequest.class,
    ProductSearchQueryPerformanceReportRequest.class,
    ProductMatchCountReportRequest.class,
    ProductNegativeKeywordConflictReportRequest.class,
    CallDetailReportRequest.class,
    GeographicPerformanceReportRequest.class,
    DSASearchQueryPerformanceReportRequest.class,
    DSAAutoTargetPerformanceReportRequest.class,
    DSACategoryPerformanceReportRequest.class,
    HotelDimensionPerformanceReportRequest.class,
    HotelGroupPerformanceReportRequest.class,
    AssetGroupPerformanceReportRequest.class,
    SearchInsightPerformanceReportRequest.class,
    AssetPerformanceReportRequest.class,
    CategoryInsightsReportRequest.class,
    CategoryClickCoverageReportRequest.class,
    CombinationPerformanceReportRequest.class,
    AppsPerformanceReportRequest.class
})
public class ReportRequest {
    protected String type;

    public String getType() {
        return type;
    }
    public void setType(String value) {

    }

    public ReportRequest() {
        this.type = "ReportRequest";
    }

    protected Boolean excludeColumnHeaders;
    @XmlElement(name = "ExcludeReportFooter", nillable = true)
    protected Boolean excludeReportFooter;
    @XmlElement(name = "ExcludeReportHeader", nillable = true)
    protected Boolean excludeReportHeader;
    @XmlElement(name = "Format", nillable = true)
    @XmlSchemaType(name = "string")
    protected ReportFormat format;
    @XmlElement(name = "FormatVersion", nillable = true)
    protected String formatVersion;
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
     * Gets the value of the formatVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatVersion() {
        return formatVersion;
    }

    /**
     * Sets the value of the formatVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatVersion(String value) {
        this.formatVersion = value;
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
