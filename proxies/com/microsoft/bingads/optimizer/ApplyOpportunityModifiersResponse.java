
package com.microsoft.bingads.optimizer;

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
 *         &lt;element name="AppliedResults" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}ArrayOfAppliedResult" minOccurs="0"/>
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
    "appliedResults"
})
@XmlRootElement(name = "ApplyOpportunityModifiersResponse", namespace = "https://bingads.microsoft.com/Optimizer/v9")
public class ApplyOpportunityModifiersResponse {

    @XmlElement(name = "AppliedResults", namespace = "https://bingads.microsoft.com/Optimizer/v9", nillable = true)
    protected ArrayOfAppliedResult appliedResults;

    /**
     * Gets the value of the appliedResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAppliedResult }
     *     
     */
    public ArrayOfAppliedResult getAppliedResults() {
        return appliedResults;
    }

    /**
     * Sets the value of the appliedResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAppliedResult }
     *     
     */
    public void setAppliedResults(ArrayOfAppliedResult value) {
        this.appliedResults = value;
    }

}
