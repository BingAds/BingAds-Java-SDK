
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfDiagnosticsFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDiagnosticsFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DiagnosticsFilter" type="{https://bingads.microsoft.com/CampaignManagement/v13}DiagnosticsFilter" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDiagnosticsFilter", propOrder = {
    "diagnosticsFilters"
})
public class ArrayOfDiagnosticsFilter {

    @XmlElement(name = "DiagnosticsFilter", nillable = true)
    protected List<DiagnosticsFilter> diagnosticsFilters;
    public ArrayOfDiagnosticsFilter()
    {
      this.diagnosticsFilters = new ArrayList<DiagnosticsFilter>();
    }
    @JsonCreator
    public ArrayOfDiagnosticsFilter(List<DiagnosticsFilter> diagnosticsfilters)
    {
      this.diagnosticsFilters = diagnosticsfilters;
    }

    /**
     * Gets the value of the diagnosticsFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the diagnosticsFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosticsFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticsFilter }
     * 
     * 
     * @return
     *     The value of the diagnosticsFilters property.
     */
    public List<DiagnosticsFilter> getDiagnosticsFilters() {
        if (diagnosticsFilters == null) {
            diagnosticsFilters = new ArrayList<>();
        }
        return this.diagnosticsFilters;
    }

}
