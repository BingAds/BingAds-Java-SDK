
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfFeedItemPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfFeedItemPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FeedItemPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}FeedItemPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFeedItemPerformanceReportColumn", propOrder = {
    "feedItemPerformanceReportColumns"
})
public class ArrayOfFeedItemPerformanceReportColumn {

    @XmlElement(name = "FeedItemPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<FeedItemPerformanceReportColumn> feedItemPerformanceReportColumns;
    public ArrayOfFeedItemPerformanceReportColumn()
    {
      this.feedItemPerformanceReportColumns = new ArrayList<FeedItemPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfFeedItemPerformanceReportColumn(List<FeedItemPerformanceReportColumn> feeditemperformancereportcolumns)
    {
      this.feedItemPerformanceReportColumns = feeditemperformancereportcolumns;
    }

    /**
     * Gets the value of the feedItemPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the feedItemPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedItemPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedItemPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the feedItemPerformanceReportColumns property.
     */
    public List<FeedItemPerformanceReportColumn> getFeedItemPerformanceReportColumns() {
        if (feedItemPerformanceReportColumns == null) {
            feedItemPerformanceReportColumns = new ArrayList<>();
        }
        return this.feedItemPerformanceReportColumns;
    }

}
