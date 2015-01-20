
package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBrandZonePerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBrandZonePerformanceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BrandZonePerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v9}BrandZonePerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBrandZonePerformanceReportColumn", propOrder = {
    "brandZonePerformanceReportColumns"
})
public class ArrayOfBrandZonePerformanceReportColumn {

    @XmlElement(name = "BrandZonePerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<BrandZonePerformanceReportColumn> brandZonePerformanceReportColumns;

    /**
     * Gets the value of the brandZonePerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brandZonePerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrandZonePerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrandZonePerformanceReportColumn }
     * 
     * 
     */
    public List<BrandZonePerformanceReportColumn> getBrandZonePerformanceReportColumns() {
        if (brandZonePerformanceReportColumns == null) {
            brandZonePerformanceReportColumns = new ArrayList<BrandZonePerformanceReportColumn>();
        }
        return this.brandZonePerformanceReportColumns;
    }

}
