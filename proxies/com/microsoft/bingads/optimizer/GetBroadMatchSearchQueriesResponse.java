
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
 *         &lt;element name="SearchQueries" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}ArrayOfBroadMatchSearchQuery" minOccurs="0"/>
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
    "searchQueries"
})
@XmlRootElement(name = "GetBroadMatchSearchQueriesResponse", namespace = "https://bingads.microsoft.com/Optimizer/v9")
public class GetBroadMatchSearchQueriesResponse {

    @XmlElement(name = "SearchQueries", namespace = "https://bingads.microsoft.com/Optimizer/v9", nillable = true)
    protected ArrayOfBroadMatchSearchQuery searchQueries;

    /**
     * Gets the value of the searchQueries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBroadMatchSearchQuery }
     *     
     */
    public ArrayOfBroadMatchSearchQuery getSearchQueries() {
        return searchQueries;
    }

    /**
     * Sets the value of the searchQueries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBroadMatchSearchQuery }
     *     
     */
    public void setSearchQueries(ArrayOfBroadMatchSearchQuery value) {
        this.searchQueries = value;
    }

}
