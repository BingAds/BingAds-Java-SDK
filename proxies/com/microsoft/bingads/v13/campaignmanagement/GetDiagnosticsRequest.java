
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
 *         <element name="Entities" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfDiagnosticsEntity" minOccurs="0"/>
 *         <element name="Checks" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfDiagnosticsFilter" minOccurs="0"/>
 *         <element name="Settings" type="{https://bingads.microsoft.com/CampaignManagement/v13}DiagnosticsSettings" minOccurs="0"/>
 *         <element name="CallerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "entities",
    "checks",
    "settings",
    "callerName"
})
@XmlRootElement(name = "GetDiagnosticsRequest")
public class GetDiagnosticsRequest {

    @XmlElement(name = "Entities", nillable = true)
    protected ArrayOfDiagnosticsEntity entities;
    @XmlElement(name = "Checks", nillable = true)
    protected ArrayOfDiagnosticsFilter checks;
    @XmlElement(name = "Settings", nillable = true)
    protected DiagnosticsSettings settings;
    @XmlElement(name = "CallerName", nillable = true)
    protected String callerName;

    /**
     * Gets the value of the entities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDiagnosticsEntity }
     *     
     */
    public ArrayOfDiagnosticsEntity getEntities() {
        return entities;
    }

    /**
     * Sets the value of the entities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDiagnosticsEntity }
     *     
     */
    public void setEntities(ArrayOfDiagnosticsEntity value) {
        this.entities = value;
    }

    /**
     * Gets the value of the checks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDiagnosticsFilter }
     *     
     */
    public ArrayOfDiagnosticsFilter getChecks() {
        return checks;
    }

    /**
     * Sets the value of the checks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDiagnosticsFilter }
     *     
     */
    public void setChecks(ArrayOfDiagnosticsFilter value) {
        this.checks = value;
    }

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticsSettings }
     *     
     */
    public DiagnosticsSettings getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticsSettings }
     *     
     */
    public void setSettings(DiagnosticsSettings value) {
        this.settings = value;
    }

    /**
     * Gets the value of the callerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerName() {
        return callerName;
    }

    /**
     * Sets the value of the callerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerName(String value) {
        this.callerName = value;
    }

}
