
package com.microsoft.bingads.v13.adinsight;

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
 *         <element name="Opportunities" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfBidOpportunity" minOccurs="0"/>
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
    "opportunities"
})
@XmlRootElement(name = "GetBidOpportunitiesResponse")
public class GetBidOpportunitiesResponse {

    @XmlElement(name = "Opportunities", nillable = true)
    protected ArrayOfBidOpportunity opportunities;

    /**
     * Gets the value of the opportunities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBidOpportunity }
     *     
     */
    public ArrayOfBidOpportunity getOpportunities() {
        return opportunities;
    }

    /**
     * Sets the value of the opportunities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBidOpportunity }
     *     
     */
    public void setOpportunities(ArrayOfBidOpportunity value) {
        this.opportunities = value;
    }

}
