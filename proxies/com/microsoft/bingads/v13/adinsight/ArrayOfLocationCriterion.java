
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfLocationCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfLocationCriterion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LocationCriterion" type="{https://bingads.microsoft.com/AdInsight/v13}LocationCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLocationCriterion", propOrder = {
    "locationCriterions"
})
public class ArrayOfLocationCriterion {

    @XmlElement(name = "LocationCriterion", nillable = true)
    protected List<LocationCriterion> locationCriterions;
    public ArrayOfLocationCriterion()
    {
      this.locationCriterions = new ArrayList<LocationCriterion>();
    }
    @JsonCreator
    public ArrayOfLocationCriterion(List<LocationCriterion> locationcriterions)
    {
      this.locationCriterions = locationcriterions;
    }

    /**
     * Gets the value of the locationCriterions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the locationCriterions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationCriterions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationCriterion }
     * 
     * 
     * @return
     *     The value of the locationCriterions property.
     */
    public List<LocationCriterion> getLocationCriterions() {
        if (locationCriterions == null) {
            locationCriterions = new ArrayList<>();
        }
        return this.locationCriterions;
    }

}
