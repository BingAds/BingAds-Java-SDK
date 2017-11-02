
package com.microsoft.bingads.v11.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAgeGenderDemographicReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAgeGenderDemographicReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgeGenderDemographicReportColumn" type="{https://bingads.microsoft.com/Reporting/v11}AgeGenderDemographicReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAgeGenderDemographicReportColumn", propOrder = {
    "ageGenderDemographicReportColumns"
})
public class ArrayOfAgeGenderDemographicReportColumn {

    @XmlElement(name = "AgeGenderDemographicReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AgeGenderDemographicReportColumn> ageGenderDemographicReportColumns;

    /**
     * Gets the value of the ageGenderDemographicReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ageGenderDemographicReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgeGenderDemographicReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgeGenderDemographicReportColumn }
     * 
     * 
     */
    public List<AgeGenderDemographicReportColumn> getAgeGenderDemographicReportColumns() {
        if (ageGenderDemographicReportColumns == null) {
            ageGenderDemographicReportColumns = new ArrayList<AgeGenderDemographicReportColumn>();
        }
        return this.ageGenderDemographicReportColumns;
    }

}
