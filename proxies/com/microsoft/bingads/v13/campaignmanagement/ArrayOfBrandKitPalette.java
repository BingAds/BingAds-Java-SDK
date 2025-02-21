
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfBrandKitPalette complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfBrandKitPalette">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BrandKitPalette" type="{https://bingads.microsoft.com/CampaignManagement/v13}BrandKitPalette" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBrandKitPalette", propOrder = {
    "brandKitPalettes"
})
public class ArrayOfBrandKitPalette {

    @XmlElement(name = "BrandKitPalette", nillable = true)
    protected List<BrandKitPalette> brandKitPalettes;
    public ArrayOfBrandKitPalette()
    {
      this.brandKitPalettes = new ArrayList<BrandKitPalette>();
    }
    @JsonCreator
    public ArrayOfBrandKitPalette(List<BrandKitPalette> brandkitpalettes)
    {
      this.brandKitPalettes = brandkitpalettes;
    }

    /**
     * Gets the value of the brandKitPalettes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the brandKitPalettes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrandKitPalettes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrandKitPalette }
     * 
     * 
     * @return
     *     The value of the brandKitPalettes property.
     */
    public List<BrandKitPalette> getBrandKitPalettes() {
        if (brandKitPalettes == null) {
            brandKitPalettes = new ArrayList<>();
        }
        return this.brandKitPalettes;
    }

}
