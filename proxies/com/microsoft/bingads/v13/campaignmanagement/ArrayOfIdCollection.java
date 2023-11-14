
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfIdCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfIdCollection">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IdCollection" type="{https://bingads.microsoft.com/CampaignManagement/v13}IdCollection" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIdCollection", propOrder = {
    "idCollections"
})
public class ArrayOfIdCollection {

    @XmlElement(name = "IdCollection", nillable = true)
    protected List<IdCollection> idCollections;
    public ArrayOfIdCollection()
    {
      this.idCollections = new ArrayList<IdCollection>();
    }
    @JsonCreator
    public ArrayOfIdCollection(List<IdCollection> idcollections)
    {
      this.idCollections = idcollections;
    }

    /**
     * Gets the value of the idCollections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the idCollections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdCollections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdCollection }
     * 
     * 
     * @return
     *     The value of the idCollections property.
     */
    public List<IdCollection> getIdCollections() {
        if (idCollections == null) {
            idCollections = new ArrayList<>();
        }
        return this.idCollections;
    }

}
