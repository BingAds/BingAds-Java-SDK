
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
 *         <element name="NegativeKeywordIds" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfIdCollection" minOccurs="0"/>
 *         <element name="NestedPartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBatchErrorCollection" minOccurs="0"/>
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
    "negativeKeywordIds",
    "nestedPartialErrors"
})
@XmlRootElement(name = "AddNegativeKeywordsToEntitiesResponse")
public class AddNegativeKeywordsToEntitiesResponse {

    @XmlElement(name = "NegativeKeywordIds", nillable = true)
    protected ArrayOfIdCollection negativeKeywordIds;
    @XmlElement(name = "NestedPartialErrors", nillable = true)
    protected ArrayOfBatchErrorCollection nestedPartialErrors;

    /**
     * Gets the value of the negativeKeywordIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIdCollection }
     *     
     */
    public ArrayOfIdCollection getNegativeKeywordIds() {
        return negativeKeywordIds;
    }

    /**
     * Sets the value of the negativeKeywordIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIdCollection }
     *     
     */
    public void setNegativeKeywordIds(ArrayOfIdCollection value) {
        this.negativeKeywordIds = value;
    }

    /**
     * Gets the value of the nestedPartialErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchErrorCollection }
     *     
     */
    public ArrayOfBatchErrorCollection getNestedPartialErrors() {
        return nestedPartialErrors;
    }

    /**
     * Sets the value of the nestedPartialErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchErrorCollection }
     *     
     */
    public void setNestedPartialErrors(ArrayOfBatchErrorCollection value) {
        this.nestedPartialErrors = value;
    }

}
