
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
 *         <element name="Opportunities" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeywordOpportunity" minOccurs="0"/>
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
@XmlRootElement(name = "GetKeywordOpportunitiesResponse")
public class GetKeywordOpportunitiesResponse {

    @XmlElement(name = "Opportunities", nillable = true)
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
