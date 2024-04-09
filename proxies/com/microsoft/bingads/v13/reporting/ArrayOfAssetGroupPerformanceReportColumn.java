
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfAssetGroupPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAssetGroupPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssetGroupPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}AssetGroupPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssetGroupPerformanceReportColumn", propOrder = {
    "assetGroupPerformanceReportColumns"
})
public class ArrayOfAssetGroupPerformanceReportColumn {

    @XmlElement(name = "AssetGroupPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AssetGroupPerformanceReportColumn> assetGroupPerformanceReportColumns;
    public ArrayOfAssetGroupPerformanceReportColumn()
    {
      this.assetGroupPerformanceReportColumns = new ArrayList<AssetGroupPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfAssetGroupPerformanceReportColumn(List<AssetGroupPerformanceReportColumn> assetgroupperformancereportcolumns)
    {
      this.assetGroupPerformanceReportColumns = assetgroupperformancereportcolumns;
    }

    /**
     * Gets the value of the assetGroupPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assetGroupPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetGroupPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetGroupPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the assetGroupPerformanceReportColumns property.
     */
    public List<AssetGroupPerformanceReportColumn> getAssetGroupPerformanceReportColumns() {
        if (assetGroupPerformanceReportColumns == null) {
            assetGroupPerformanceReportColumns = new ArrayList<>();
        }
        return this.assetGroupPerformanceReportColumns;
    }

}
