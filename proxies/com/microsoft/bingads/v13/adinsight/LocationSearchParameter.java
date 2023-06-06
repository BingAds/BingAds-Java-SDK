
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="Locations" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfLocationCriterion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
