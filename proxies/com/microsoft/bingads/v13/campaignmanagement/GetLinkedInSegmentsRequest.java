
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         <element name="Type" type="{https://bingads.microsoft.com/CampaignManagement/v13}LinkedInSegmentType" minOccurs="0"/>
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
    "linkedInSegmentIds",
    "type"
})
@XmlRootElement(name = "GetLinkedInSegmentsRequest")
public class GetLinkedInSegmentsRequest {

    @XmlElement(name = "LinkedInSegmentIds", nillable = true)
    protected ArrayOflong linkedInSegmentIds;
    @XmlElement(name = "Type", type = String.class)
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected Collection<LinkedInSegmentType> type;

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

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<LinkedInSegmentType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(Collection<LinkedInSegmentType> value) {
        this.type = value;
    }

}
