
package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGeographicalLocationReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGeographicalLocationReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeographicalLocationReportColumn" type="{https://bingads.microsoft.com/Reporting/v9}GeographicalLocationReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGeographicalLocationReportColumn", propOrder = {
    "geographicalLocationReportColumns"
})
public class ArrayOfGeographicalLocationReportColumn {

    @XmlElement(name = "GeographicalLocationReportColumn")
    @XmlSchemaType(name = "string")
    protected List<GeographicalLocationReportColumn> geographicalLocationReportColumns;

    /**
     * Gets the value of the geographicalLocationReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicalLocationReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicalLocationReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographicalLocationReportColumn }
     * 
     * 
     */
    public List<GeographicalLocationReportColumn> getGeographicalLocationReportColumns() {
        if (geographicalLocationReportColumns == null) {
            geographicalLocationReportColumns = new ArrayList<GeographicalLocationReportColumn>();
        }
        return this.geographicalLocationReportColumns;
    }

}
