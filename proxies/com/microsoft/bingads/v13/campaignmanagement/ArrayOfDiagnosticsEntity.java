
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfDiagnosticsEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDiagnosticsEntity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DiagnosticsEntity" type="{https://bingads.microsoft.com/CampaignManagement/v13}DiagnosticsEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDiagnosticsEntity", propOrder = {
    "diagnosticsEntities"
})
public class ArrayOfDiagnosticsEntity {

    @XmlElement(name = "DiagnosticsEntity", nillable = true)
    protected List<DiagnosticsEntity> diagnosticsEntities;
    public ArrayOfDiagnosticsEntity()
    {
      this.diagnosticsEntities = new ArrayList<DiagnosticsEntity>();
    }
    @JsonCreator
    public ArrayOfDiagnosticsEntity(List<DiagnosticsEntity> diagnosticsentitys)
    {
      this.diagnosticsEntities = diagnosticsentitys;
    }

    /**
     * Gets the value of the diagnosticsEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the diagnosticsEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosticsEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticsEntity }
     * 
     * 
     * @return
     *     The value of the diagnosticsEntities property.
     */
    public List<DiagnosticsEntity> getDiagnosticsEntities() {
        if (diagnosticsEntities == null) {
            diagnosticsEntities = new ArrayList<>();
        }
        return this.diagnosticsEntities;
    }

}
