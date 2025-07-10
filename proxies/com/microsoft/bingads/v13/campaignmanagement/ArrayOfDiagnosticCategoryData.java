
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfDiagnosticCategoryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDiagnosticCategoryData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DiagnosticCategoryData" type="{https://bingads.microsoft.com/CampaignManagement/v13}DiagnosticCategoryData" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDiagnosticCategoryData", propOrder = {
    "diagnosticCategoryDatas"
})
public class ArrayOfDiagnosticCategoryData {

    @XmlElement(name = "DiagnosticCategoryData", nillable = true)
    protected List<DiagnosticCategoryData> diagnosticCategoryDatas;
    public ArrayOfDiagnosticCategoryData()
    {
      this.diagnosticCategoryDatas = new ArrayList<DiagnosticCategoryData>();
    }
    @JsonCreator
    public ArrayOfDiagnosticCategoryData(List<DiagnosticCategoryData> diagnosticcategorydatas)
    {
      this.diagnosticCategoryDatas = diagnosticcategorydatas;
    }

    /**
     * Gets the value of the diagnosticCategoryDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the diagnosticCategoryDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosticCategoryDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticCategoryData }
     * 
     * 
     * @return
     *     The value of the diagnosticCategoryDatas property.
     */
    public List<DiagnosticCategoryData> getDiagnosticCategoryDatas() {
        if (diagnosticCategoryDatas == null) {
            diagnosticCategoryDatas = new ArrayList<>();
        }
        return this.diagnosticCategoryDatas;
    }

}
