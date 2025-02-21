
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfBrandKitColor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfBrandKitColor">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BrandKitColor" type="{https://bingads.microsoft.com/CampaignManagement/v13}BrandKitColor" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBrandKitColor", propOrder = {
    "brandKitColors"
})
public class ArrayOfBrandKitColor {

    @XmlElement(name = "BrandKitColor", nillable = true)
    protected List<BrandKitColor> brandKitColors;
    public ArrayOfBrandKitColor()
    {
      this.brandKitColors = new ArrayList<BrandKitColor>();
    }
    @JsonCreator
    public ArrayOfBrandKitColor(List<BrandKitColor> brandkitcolors)
    {
      this.brandKitColors = brandkitcolors;
    }

    /**
     * Gets the value of the brandKitColors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the brandKitColors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrandKitColors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrandKitColor }
     * 
     * 
     * @return
     *     The value of the brandKitColors property.
     */
    public List<BrandKitColor> getBrandKitColors() {
        if (brandKitColors == null) {
            brandKitColors = new ArrayList<>();
        }
        return this.brandKitColors;
    }

}
