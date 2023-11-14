
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfSharedEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfSharedEntity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SharedEntity" type="{https://bingads.microsoft.com/CampaignManagement/v13}SharedEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSharedEntity", propOrder = {
    "sharedEntities"
})
public class ArrayOfSharedEntity {

    @XmlElement(name = "SharedEntity", nillable = true)
    protected List<SharedEntity> sharedEntities;
    public ArrayOfSharedEntity()
    {
      this.sharedEntities = new ArrayList<SharedEntity>();
    }
    @JsonCreator
    public ArrayOfSharedEntity(List<SharedEntity> sharedentitys)
    {
      this.sharedEntities = sharedentitys;
    }

    /**
     * Gets the value of the sharedEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sharedEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharedEntity }
     * 
     * 
     * @return
     *     The value of the sharedEntities property.
     */
    public List<SharedEntity> getSharedEntities() {
        if (sharedEntities == null) {
            sharedEntities = new ArrayList<>();
        }
        return this.sharedEntities;
    }

}
