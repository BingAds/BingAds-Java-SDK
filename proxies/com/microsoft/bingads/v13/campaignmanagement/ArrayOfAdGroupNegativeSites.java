
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdGroupNegativeSites complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdGroupNegativeSites">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdGroupNegativeSites" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdGroupNegativeSites" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdGroupNegativeSites", propOrder = {
    "adGroupNegativeSites"
})
public class ArrayOfAdGroupNegativeSites {

    @XmlElement(name = "AdGroupNegativeSites", nillable = true)
    protected List<AdGroupNegativeSites> adGroupNegativeSites;
    public ArrayOfAdGroupNegativeSites()
    {
      this.adGroupNegativeSites = new ArrayList<AdGroupNegativeSites>();
    }
    @JsonCreator
    public ArrayOfAdGroupNegativeSites(List<AdGroupNegativeSites> adgroupnegativesitess)
    {
      this.adGroupNegativeSites = adgroupnegativesitess;
    }

    /**
     * Gets the value of the adGroupNegativeSites property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adGroupNegativeSites property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdGroupNegativeSites().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupNegativeSites }
     * 
     * 
     * @return
     *     The value of the adGroupNegativeSites property.
     */
    public List<AdGroupNegativeSites> getAdGroupNegativeSites() {
        if (adGroupNegativeSites == null) {
            adGroupNegativeSites = new ArrayList<>();
        }
        return this.adGroupNegativeSites;
    }

}
