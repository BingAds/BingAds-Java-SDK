
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfDiagnosticCardData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDiagnosticCardData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DiagnosticCardData" type="{https://bingads.microsoft.com/CampaignManagement/v13}DiagnosticCardData" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDiagnosticCardData", propOrder = {
    "diagnosticCardDatas"
})
public class ArrayOfDiagnosticCardData {

    @XmlElement(name = "DiagnosticCardData", nillable = true)
    protected List<DiagnosticCardData> diagnosticCardDatas;
    public ArrayOfDiagnosticCardData()
    {
      this.diagnosticCardDatas = new ArrayList<DiagnosticCardData>();
    }
    @JsonCreator
    public ArrayOfDiagnosticCardData(List<DiagnosticCardData> diagnosticcarddatas)
    {
      this.diagnosticCardDatas = diagnosticcarddatas;
    }

    /**
     * Gets the value of the diagnosticCardDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the diagnosticCardDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosticCardDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticCardData }
     * 
     * 
     * @return
     *     The value of the diagnosticCardDatas property.
     */
    public List<DiagnosticCardData> getDiagnosticCardDatas() {
        if (diagnosticCardDatas == null) {
            diagnosticCardDatas = new ArrayList<>();
        }
        return this.diagnosticCardDatas;
    }

}
