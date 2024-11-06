
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LocationSearchParameter">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter">
 *       <sequence>
 *         <element name="Locations" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfLocationCriterion" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationSearchParameter", propOrder = {
    "locations"
})
public class LocationSearchParameter
    extends SearchParameter
{
    public LocationSearchParameter() {
      this.type = "LocationSearchParameter";
    }

    @XmlElement(name = "Locations", nillable = true)
    protected ArrayOfLocationCriterion locations;

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocationCriterion }
     *     
     */
    public ArrayOfLocationCriterion getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocationCriterion }
     *     
     */
    public void setLocations(ArrayOfLocationCriterion value) {
        this.locations = value;
    }

}
