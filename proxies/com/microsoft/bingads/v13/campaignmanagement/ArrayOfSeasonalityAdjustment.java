
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfSeasonalityAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfSeasonalityAdjustment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SeasonalityAdjustment" type="{https://bingads.microsoft.com/CampaignManagement/v13}SeasonalityAdjustment" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSeasonalityAdjustment", propOrder = {
    "seasonalityAdjustments"
})
public class ArrayOfSeasonalityAdjustment {

    @XmlElement(name = "SeasonalityAdjustment", nillable = true)
    protected List<SeasonalityAdjustment> seasonalityAdjustments;
    public ArrayOfSeasonalityAdjustment()
    {
      this.seasonalityAdjustments = new ArrayList<SeasonalityAdjustment>();
    }
    @JsonCreator
    public ArrayOfSeasonalityAdjustment(List<SeasonalityAdjustment> seasonalityadjustments)
    {
      this.seasonalityAdjustments = seasonalityadjustments;
    }

    /**
     * Gets the value of the seasonalityAdjustments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the seasonalityAdjustments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeasonalityAdjustments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeasonalityAdjustment }
     * 
     * 
     * @return
     *     The value of the seasonalityAdjustments property.
     */
    public List<SeasonalityAdjustment> getSeasonalityAdjustments() {
        if (seasonalityAdjustments == null) {
            seasonalityAdjustments = new ArrayList<>();
        }
        return this.seasonalityAdjustments;
    }

}
