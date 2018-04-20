
package com.microsoft.bingads.v12.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdExtensionByAdReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdExtensionByAdReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdExtensionByAdReportColumn" type="{https://bingads.microsoft.com/Reporting/v12}AdExtensionByAdReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdExtensionByAdReportColumn", propOrder = {
    "adExtensionByAdReportColumns"
})
public class ArrayOfAdExtensionByAdReportColumn {

    @XmlElement(name = "AdExtensionByAdReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AdExtensionByAdReportColumn> adExtensionByAdReportColumns;

    /**
     * Gets the value of the adExtensionByAdReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adExtensionByAdReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdExtensionByAdReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdExtensionByAdReportColumn }
     * 
     * 
     */
    public List<AdExtensionByAdReportColumn> getAdExtensionByAdReportColumns() {
        if (adExtensionByAdReportColumns == null) {
            adExtensionByAdReportColumns = new ArrayList<AdExtensionByAdReportColumn>();
        }
        return this.adExtensionByAdReportColumns;
    }

}
