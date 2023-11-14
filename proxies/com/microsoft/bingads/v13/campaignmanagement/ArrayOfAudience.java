
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAudience complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAudience">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Audience" type="{https://bingads.microsoft.com/CampaignManagement/v13}Audience" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAudience", propOrder = {
    "audiences"
})
public class ArrayOfAudience {

    @XmlElement(name = "Audience", nillable = true)
    protected List<Audience> audiences;
    public ArrayOfAudience()
    {
      this.audiences = new ArrayList<Audience>();
    }
    @JsonCreator
    public ArrayOfAudience(List<Audience> audiences)
    {
      this.audiences = audiences;
    }

    /**
     * Gets the value of the audiences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the audiences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudiences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Audience }
     * 
     * 
     * @return
     *     The value of the audiences property.
     */
    public List<Audience> getAudiences() {
        if (audiences == null) {
            audiences = new ArrayList<>();
        }
        return this.audiences;
    }

}
