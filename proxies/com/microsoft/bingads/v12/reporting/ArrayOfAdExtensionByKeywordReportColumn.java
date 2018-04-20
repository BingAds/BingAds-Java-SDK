
package com.microsoft.bingads.v12.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdExtensionByKeywordReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdExtensionByKeywordReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdExtensionByKeywordReportColumn" type="{https://bingads.microsoft.com/Reporting/v12}AdExtensionByKeywordReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdExtensionByKeywordReportColumn", propOrder = {
    "adExtensionByKeywordReportColumns"
})
public class ArrayOfAdExtensionByKeywordReportColumn {

    @XmlElement(name = "AdExtensionByKeywordReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AdExtensionByKeywordReportColumn> adExtensionByKeywordReportColumns;

    /**
     * Gets the value of the adExtensionByKeywordReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adExtensionByKeywordReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdExtensionByKeywordReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdExtensionByKeywordReportColumn }
     * 
     * 
     */
    public List<AdExtensionByKeywordReportColumn> getAdExtensionByKeywordReportColumns() {
        if (adExtensionByKeywordReportColumns == null) {
            adExtensionByKeywordReportColumns = new ArrayList<AdExtensionByKeywordReportColumn>();
        }
        return this.adExtensionByKeywordReportColumns;
    }

}
