
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfUetTag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfUetTag">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UetTag" type="{https://bingads.microsoft.com/CampaignManagement/v13}UetTag" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUetTag", propOrder = {
    "uetTags"
})
public class ArrayOfUetTag {

    @XmlElement(name = "UetTag", nillable = true)
    protected List<UetTag> uetTags;
    public ArrayOfUetTag()
    {
      this.uetTags = new ArrayList<UetTag>();
    }
    @JsonCreator
    public ArrayOfUetTag(List<UetTag> uettags)
    {
      this.uetTags = uettags;
    }

    /**
     * Gets the value of the uetTags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the uetTags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUetTags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UetTag }
     * 
     * 
     * @return
     *     The value of the uetTags property.
     */
    public List<UetTag> getUetTags() {
        if (uetTags == null) {
            uetTags = new ArrayList<>();
        }
        return this.uetTags;
    }

}
