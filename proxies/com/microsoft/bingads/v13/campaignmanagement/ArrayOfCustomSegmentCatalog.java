
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfCustomSegmentCatalog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCustomSegmentCatalog">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CustomSegmentCatalog" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomSegmentCatalog" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomSegmentCatalog", propOrder = {
    "customSegmentCatalogs"
})
public class ArrayOfCustomSegmentCatalog {

    @XmlElement(name = "CustomSegmentCatalog", nillable = true)
    protected List<CustomSegmentCatalog> customSegmentCatalogs;
    public ArrayOfCustomSegmentCatalog()
    {
      this.customSegmentCatalogs = new ArrayList<CustomSegmentCatalog>();
    }
    @JsonCreator
    public ArrayOfCustomSegmentCatalog(List<CustomSegmentCatalog> customsegmentcatalogs)
    {
      this.customSegmentCatalogs = customsegmentcatalogs;
    }

    /**
     * Gets the value of the customSegmentCatalogs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the customSegmentCatalogs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSegmentCatalogs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomSegmentCatalog }
     * 
     * 
     * @return
     *     The value of the customSegmentCatalogs property.
     */
    public List<CustomSegmentCatalog> getCustomSegmentCatalogs() {
        if (customSegmentCatalogs == null) {
            customSegmentCatalogs = new ArrayList<>();
        }
        return this.customSegmentCatalogs;
    }

}
