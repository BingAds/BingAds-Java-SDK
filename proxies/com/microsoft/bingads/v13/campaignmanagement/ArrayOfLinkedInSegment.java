
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfLinkedInSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfLinkedInSegment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LinkedInSegment" type="{https://bingads.microsoft.com/CampaignManagement/v13}LinkedInSegment" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLinkedInSegment", propOrder = {
    "linkedInSegments"
})
public class ArrayOfLinkedInSegment {

    @XmlElement(name = "LinkedInSegment", nillable = true)
    protected List<LinkedInSegment> linkedInSegments;
    public ArrayOfLinkedInSegment()
    {
      this.linkedInSegments = new ArrayList<LinkedInSegment>();
    }
    @JsonCreator
    public ArrayOfLinkedInSegment(List<LinkedInSegment> linkedinsegments)
    {
      this.linkedInSegments = linkedinsegments;
    }

    /**
     * Gets the value of the linkedInSegments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the linkedInSegments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedInSegments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedInSegment }
     * 
     * 
     * @return
     *     The value of the linkedInSegments property.
     */
    public List<LinkedInSegment> getLinkedInSegments() {
        if (linkedInSegments == null) {
            linkedInSegments = new ArrayList<>();
        }
        return this.linkedInSegments;
    }

}
