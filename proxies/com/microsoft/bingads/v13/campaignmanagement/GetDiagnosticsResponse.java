
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DiagnosticTileData" type="{https://bingads.microsoft.com/CampaignManagement/v13}DiagnosticTileData" minOccurs="0"/>
 *         <element name="DiagnosticCategoryData" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfDiagnosticCategoryData" minOccurs="0"/>
 *         <element name="DiagnosticCardData" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfDiagnosticCardData" minOccurs="0"/>
 *         <element name="DiagnosticErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfHealthCheckError" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "diagnosticTileData",
    "diagnosticCategoryData",
    "diagnosticCardData",
    "diagnosticErrors"
})
@XmlRootElement(name = "GetDiagnosticsResponse")
public class GetDiagnosticsResponse {

    @XmlElement(name = "DiagnosticTileData", nillable = true)
    protected DiagnosticTileData diagnosticTileData;
    @XmlElement(name = "DiagnosticCategoryData", nillable = true)
    protected ArrayOfDiagnosticCategoryData diagnosticCategoryData;
    @XmlElement(name = "DiagnosticCardData", nillable = true)
    protected ArrayOfDiagnosticCardData diagnosticCardData;
    @XmlElement(name = "DiagnosticErrors", nillable = true)
    protected ArrayOfHealthCheckError diagnosticErrors;

    /**
     * Gets the value of the diagnosticTileData property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticTileData }
     *     
     */
    public DiagnosticTileData getDiagnosticTileData() {
        return diagnosticTileData;
    }

    /**
     * Sets the value of the diagnosticTileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticTileData }
     *     
     */
    public void setDiagnosticTileData(DiagnosticTileData value) {
        this.diagnosticTileData = value;
    }

    /**
     * Gets the value of the diagnosticCategoryData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDiagnosticCategoryData }
     *     
     */
    public ArrayOfDiagnosticCategoryData getDiagnosticCategoryData() {
        return diagnosticCategoryData;
    }

    /**
     * Sets the value of the diagnosticCategoryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDiagnosticCategoryData }
     *     
     */
    public void setDiagnosticCategoryData(ArrayOfDiagnosticCategoryData value) {
        this.diagnosticCategoryData = value;
    }

    /**
     * Gets the value of the diagnosticCardData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDiagnosticCardData }
     *     
     */
    public ArrayOfDiagnosticCardData getDiagnosticCardData() {
        return diagnosticCardData;
    }

    /**
     * Sets the value of the diagnosticCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDiagnosticCardData }
     *     
     */
    public void setDiagnosticCardData(ArrayOfDiagnosticCardData value) {
        this.diagnosticCardData = value;
    }

    /**
     * Gets the value of the diagnosticErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHealthCheckError }
     *     
     */
    public ArrayOfHealthCheckError getDiagnosticErrors() {
        return diagnosticErrors;
    }

    /**
     * Sets the value of the diagnosticErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHealthCheckError }
     *     
     */
    public void setDiagnosticErrors(ArrayOfHealthCheckError value) {
        this.diagnosticErrors = value;
    }

}
