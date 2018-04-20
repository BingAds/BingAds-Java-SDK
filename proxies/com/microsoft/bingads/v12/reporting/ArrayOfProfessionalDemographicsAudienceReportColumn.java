
package com.microsoft.bingads.v12.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProfessionalDemographicsAudienceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProfessionalDemographicsAudienceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfessionalDemographicsAudienceReportColumn" type="{https://bingads.microsoft.com/Reporting/v12}ProfessionalDemographicsAudienceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfessionalDemographicsAudienceReportColumn", propOrder = {
    "professionalDemographicsAudienceReportColumns"
})
public class ArrayOfProfessionalDemographicsAudienceReportColumn {

    @XmlElement(name = "ProfessionalDemographicsAudienceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<ProfessionalDemographicsAudienceReportColumn> professionalDemographicsAudienceReportColumns;

    /**
     * Gets the value of the professionalDemographicsAudienceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the professionalDemographicsAudienceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfessionalDemographicsAudienceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfessionalDemographicsAudienceReportColumn }
     * 
     * 
     */
    public List<ProfessionalDemographicsAudienceReportColumn> getProfessionalDemographicsAudienceReportColumns() {
        if (professionalDemographicsAudienceReportColumns == null) {
            professionalDemographicsAudienceReportColumns = new ArrayList<ProfessionalDemographicsAudienceReportColumn>();
        }
        return this.professionalDemographicsAudienceReportColumns;
    }

}
