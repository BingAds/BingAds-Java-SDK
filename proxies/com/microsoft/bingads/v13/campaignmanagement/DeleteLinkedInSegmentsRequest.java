
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
 *         <element name="LinkedInSegmentIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
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
    "linkedInSegmentIds"
})
@XmlRootElement(name = "DeleteLinkedInSegmentsRequest")
public class DeleteLinkedInSegmentsRequest {

    @XmlElement(name = "LinkedInSegmentIds", nillable = true)
    protected ArrayOflong linkedInSegmentIds;

    /**
     * Gets the value of the linkedInSegmentIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getLinkedInSegmentIds() {
        return linkedInSegmentIds;
    }

    /**
     * Sets the value of the linkedInSegmentIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setLinkedInSegmentIds(ArrayOflong value) {
        this.linkedInSegmentIds = value;
    }

}
