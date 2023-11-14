
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdExtension">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdExtension" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdExtension", propOrder = {
    "adExtensions"
})
public class ArrayOfAdExtension {

    @XmlElement(name = "AdExtension", nillable = true)
    protected List<AdExtension> adExtensions;
    public ArrayOfAdExtension()
    {
      this.adExtensions = new ArrayList<AdExtension>();
    }
    @JsonCreator
    public ArrayOfAdExtension(List<AdExtension> adextensions)
    {
      this.adExtensions = adextensions;
    }

    /**
     * Gets the value of the adExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdExtension }
     * 
     * 
     * @return
     *     The value of the adExtensions property.
     */
    public List<AdExtension> getAdExtensions() {
        if (adExtensions == null) {
            adExtensions = new ArrayList<>();
        }
        return this.adExtensions;
    }

}
