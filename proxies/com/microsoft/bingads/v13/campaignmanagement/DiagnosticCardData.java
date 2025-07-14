
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticCardData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DiagnosticCardData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CheckpointsData" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfHealthCheckData" minOccurs="0"/>
 *         <element name="Metadata" type="{https://bingads.microsoft.com/CampaignManagement/v13}HealthCheckMetadata" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticCardData", propOrder = {
    "checkpointsData",
    "metadata"
})
public class DiagnosticCardData {

    @XmlElement(name = "CheckpointsData", nillable = true)
    protected ArrayOfHealthCheckData checkpointsData;
    @XmlElement(name = "Metadata", nillable = true)
    protected HealthCheckMetadata metadata;

    /**
     * Gets the value of the checkpointsData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHealthCheckData }
     *     
     */
    public ArrayOfHealthCheckData getCheckpointsData() {
        return checkpointsData;
    }

    /**
     * Sets the value of the checkpointsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHealthCheckData }
     *     
     */
    public void setCheckpointsData(ArrayOfHealthCheckData value) {
        this.checkpointsData = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link HealthCheckMetadata }
     *     
     */
    public HealthCheckMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthCheckMetadata }
     *     
     */
    public void setMetadata(HealthCheckMetadata value) {
        this.metadata = value;
    }

}
