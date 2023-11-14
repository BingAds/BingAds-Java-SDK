
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdGroup">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdGroup" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdGroup", propOrder = {
    "adGroups"
})
public class ArrayOfAdGroup {

    @XmlElement(name = "AdGroup", nillable = true)
    protected List<AdGroup> adGroups;
    public ArrayOfAdGroup()
    {
      this.adGroups = new ArrayList<AdGroup>();
    }
    @JsonCreator
    public ArrayOfAdGroup(List<AdGroup> adgroups)
    {
      this.adGroups = adgroups;
    }

    /**
     * Gets the value of the adGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroup }
     * 
     * 
     * @return
     *     The value of the adGroups property.
     */
    public List<AdGroup> getAdGroups() {
        if (adGroups == null) {
            adGroups = new ArrayList<>();
        }
        return this.adGroups;
    }

}
