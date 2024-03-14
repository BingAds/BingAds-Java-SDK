
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfAgeRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAgeRange">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgeRange" type="{https://bingads.microsoft.com/CampaignManagement/v13}AgeRange" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAgeRange", propOrder = {
    "ageRanges"
})
public class ArrayOfAgeRange {

    @XmlElement(name = "AgeRange")
    @XmlSchemaType(name = "string")
    protected List<AgeRange> ageRanges;
    public ArrayOfAgeRange()
    {
      this.ageRanges = new ArrayList<AgeRange>();
    }
    @JsonCreator
    public ArrayOfAgeRange(List<AgeRange> ageranges)
    {
      this.ageRanges = ageranges;
    }

    /**
     * Gets the value of the ageRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ageRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgeRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgeRange }
     * 
     * 
     * @return
     *     The value of the ageRanges property.
     */
    public List<AgeRange> getAgeRanges() {
        if (ageRanges == null) {
            ageRanges = new ArrayList<>();
        }
        return this.ageRanges;
    }

}
