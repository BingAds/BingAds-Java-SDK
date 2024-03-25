
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfCampaignPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCampaignPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CampaignPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}CampaignPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampaignPerformanceReportColumn", propOrder = {
    "campaignPerformanceReportColumns"
})
public class ArrayOfCampaignPerformanceReportColumn {

    @XmlElement(name = "CampaignPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<CampaignPerformanceReportColumn> campaignPerformanceReportColumns;
    public ArrayOfCampaignPerformanceReportColumn()
    {
      this.campaignPerformanceReportColumns = new ArrayList<CampaignPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfCampaignPerformanceReportColumn(List<CampaignPerformanceReportColumn> campaignperformancereportcolumns)
    {
      this.campaignPerformanceReportColumns = campaignperformancereportcolumns;
    }

    /**
     * Gets the value of the campaignPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the campaignPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the campaignPerformanceReportColumns property.
     */
    public List<CampaignPerformanceReportColumn> getCampaignPerformanceReportColumns() {
        if (campaignPerformanceReportColumns == null) {
            campaignPerformanceReportColumns = new ArrayList<>();
        }
        return this.campaignPerformanceReportColumns;
    }

}
