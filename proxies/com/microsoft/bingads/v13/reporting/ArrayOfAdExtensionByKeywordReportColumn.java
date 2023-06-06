
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdExtensionByKeywordReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdExtensionByKeywordReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdExtensionByKeywordReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}AdExtensionByKeywordReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adExtensionByKeywordReportColumns property.
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
     * @return
     *     The value of the adExtensionByKeywordReportColumns property.
     */
    public List<AdExtensionByKeywordReportColumn> getAdExtensionByKeywordReportColumns() {
        if (adExtensionByKeywordReportColumns == null) {
            adExtensionByKeywordReportColumns = new ArrayList<>();
        }
        return this.adExtensionByKeywordReportColumns;
    }

}
