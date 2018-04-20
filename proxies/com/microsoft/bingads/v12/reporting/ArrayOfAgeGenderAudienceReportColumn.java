
package com.microsoft.bingads.v12.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAgeGenderAudienceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAgeGenderAudienceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgeGenderAudienceReportColumn" type="{https://bingads.microsoft.com/Reporting/v12}AgeGenderAudienceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAgeGenderAudienceReportColumn", propOrder = {
    "ageGenderAudienceReportColumns"
})
public class ArrayOfAgeGenderAudienceReportColumn {

    @XmlElement(name = "AgeGenderAudienceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AgeGenderAudienceReportColumn> ageGenderAudienceReportColumns;

    /**
     * Gets the value of the ageGenderAudienceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ageGenderAudienceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgeGenderAudienceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgeGenderAudienceReportColumn }
     * 
     * 
     */
    public List<AgeGenderAudienceReportColumn> getAgeGenderAudienceReportColumns() {
        if (ageGenderAudienceReportColumns == null) {
            ageGenderAudienceReportColumns = new ArrayList<AgeGenderAudienceReportColumn>();
        }
        return this.ageGenderAudienceReportColumns;
    }

}
