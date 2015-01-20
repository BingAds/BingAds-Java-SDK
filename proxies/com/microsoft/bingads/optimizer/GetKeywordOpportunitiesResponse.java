
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
 *         &lt;element name="Opportunities" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}ArrayOfKeywordOpportunity" minOccurs="0"/>
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
    "opportunities"
})
@XmlRootElement(name = "GetKeywordOpportunitiesResponse", namespace = "https://bingads.microsoft.com/Optimizer/v9")
public class GetKeywordOpportunitiesResponse {

    @XmlElement(name = "Opportunities", namespace = "https://bingads.microsoft.com/Optimizer/v9", nillable = true)
    protected ArrayOfKeywordOpportunity opportunities;

    /**
     * Gets the value of the opportunities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordOpportunity }
     *     
     */
    public ArrayOfKeywordOpportunity getOpportunities() {
        return opportunities;
    }

    /**
     * Sets the value of the opportunities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordOpportunity }
     *     
     */
    public void setOpportunities(ArrayOfKeywordOpportunity value) {
        this.opportunities = value;
    }

}
