
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImportResults" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfImportResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importResults"
})
@XmlRootElement(name = "GetImportResultsResponse")
public class GetImportResultsResponse {

    @XmlElement(name = "ImportResults", nillable = true)
    protected ArrayOfImportResult importResults;

    /**
     * Gets the value of the importResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImportResult }
     *     
     */
    public ArrayOfImportResult getImportResults() {
        return importResults;
    }

    /**
     * Sets the value of the importResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImportResult }
     *     
     */
    public void setImportResults(ArrayOfImportResult value) {
        this.importResults = value;
    }

}
