
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
 *         <element name="LinkedInSegments" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfLinkedInSegment" minOccurs="0"/>
 *         <element name="PartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBatchError" minOccurs="0"/>
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
    "linkedInSegments",
    "partialErrors"
})
@XmlRootElement(name = "GetLinkedInSegmentsResponse")
public class GetLinkedInSegmentsResponse {

    @XmlElement(name = "LinkedInSegments", nillable = true)
    protected ArrayOfLinkedInSegment linkedInSegments;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

    /**
     * Gets the value of the linkedInSegments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLinkedInSegment }
     *     
     */
    public ArrayOfLinkedInSegment getLinkedInSegments() {
        return linkedInSegments;
    }

    /**
     * Sets the value of the linkedInSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLinkedInSegment }
     *     
     */
    public void setLinkedInSegments(ArrayOfLinkedInSegment value) {
        this.linkedInSegments = value;
    }

    /**
     * Gets the value of the partialErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public ArrayOfBatchError getPartialErrors() {
        return partialErrors;
    }

    /**
     * Sets the value of the partialErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public void setPartialErrors(ArrayOfBatchError value) {
        this.partialErrors = value;
    }

}
