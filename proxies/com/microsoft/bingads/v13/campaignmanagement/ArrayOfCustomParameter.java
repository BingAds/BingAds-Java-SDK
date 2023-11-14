
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfCustomParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCustomParameter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CustomParameter" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomParameter", propOrder = {
    "customParameters"
})
public class ArrayOfCustomParameter {

    @XmlElement(name = "CustomParameter", nillable = true)
    protected List<CustomParameter> customParameters;
    public ArrayOfCustomParameter()
    {
      this.customParameters = new ArrayList<CustomParameter>();
    }
    @JsonCreator
    public ArrayOfCustomParameter(List<CustomParameter> customparameters)
    {
      this.customParameters = customparameters;
    }

    /**
     * Gets the value of the customParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the customParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomParameter }
     * 
     * 
     * @return
     *     The value of the customParameters property.
     */
    public List<CustomParameter> getCustomParameters() {
        if (customParameters == null) {
            customParameters = new ArrayList<>();
        }
        return this.customParameters;
    }

}
