
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfAssetPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAssetPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssetPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}AssetPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssetPerformanceReportColumn", propOrder = {
    "assetPerformanceReportColumns"
})
public class ArrayOfAssetPerformanceReportColumn {

    @XmlElement(name = "AssetPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AssetPerformanceReportColumn> assetPerformanceReportColumns;
    public ArrayOfAssetPerformanceReportColumn()
    {
      this.assetPerformanceReportColumns = new ArrayList<AssetPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfAssetPerformanceReportColumn(List<AssetPerformanceReportColumn> assetperformancereportcolumns)
    {
      this.assetPerformanceReportColumns = assetperformancereportcolumns;
    }

    /**
     * Gets the value of the assetPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assetPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the assetPerformanceReportColumns property.
     */
    public List<AssetPerformanceReportColumn> getAssetPerformanceReportColumns() {
        if (assetPerformanceReportColumns == null) {
            assetPerformanceReportColumns = new ArrayList<>();
        }
        return this.assetPerformanceReportColumns;
    }

}
