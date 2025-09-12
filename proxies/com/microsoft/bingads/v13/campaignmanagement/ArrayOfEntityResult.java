
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfEntityResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfEntityResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntityResult" type="{https://bingads.microsoft.com/CampaignManagement/v13}EntityResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEntityResult", propOrder = {
    "entityResults"
})
public class ArrayOfEntityResult {

    @XmlElement(name = "EntityResult", nillable = true)
    protected List<EntityResult> entityResults;
    public ArrayOfEntityResult()
    {
      this.entityResults = new ArrayList<EntityResult>();
    }
    @JsonCreator
    public ArrayOfEntityResult(List<EntityResult> entityresults)
    {
      this.entityResults = entityresults;
    }

    /**
     * Gets the value of the entityResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the entityResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityResult }
     * 
     * 
     * @return
     *     The value of the entityResults property.
     */
    public List<EntityResult> getEntityResults() {
        if (entityResults == null) {
            entityResults = new ArrayList<>();
        }
        return this.entityResults;
    }

}
