
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
 *         <element name="ImportJobs" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfImportJob" minOccurs="0"/>
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
    "importJobs"
})
@XmlRootElement(name = "AddImportJobsRequest")
public class AddImportJobsRequest {

    @XmlElement(name = "ImportJobs", nillable = true)
    protected ArrayOfImportJob importJobs;

    /**
     * Gets the value of the importJobs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImportJob }
     *     
     */
    public ArrayOfImportJob getImportJobs() {
        return importJobs;
    }

    /**
     * Sets the value of the importJobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImportJob }
     *     
     */
    public void setImportJobs(ArrayOfImportJob value) {
        this.importJobs = value;
    }

}
