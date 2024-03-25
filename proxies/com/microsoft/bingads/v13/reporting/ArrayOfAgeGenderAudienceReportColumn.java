
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfAgeGenderAudienceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAgeGenderAudienceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgeGenderAudienceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}AgeGenderAudienceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public ArrayOfAgeGenderAudienceReportColumn()
    {
      this.ageGenderAudienceReportColumns = new ArrayList<AgeGenderAudienceReportColumn>();
    }
    @JsonCreator
    public ArrayOfAgeGenderAudienceReportColumn(List<AgeGenderAudienceReportColumn> agegenderaudiencereportcolumns)
    {
      this.ageGenderAudienceReportColumns = agegenderaudiencereportcolumns;
    }

    /**
     * Gets the value of the ageGenderAudienceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ageGenderAudienceReportColumns property.
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
     * @return
     *     The value of the ageGenderAudienceReportColumns property.
     */
    public List<AgeGenderAudienceReportColumn> getAgeGenderAudienceReportColumns() {
        if (ageGenderAudienceReportColumns == null) {
            ageGenderAudienceReportColumns = new ArrayList<>();
        }
        return this.ageGenderAudienceReportColumns;
    }

}
