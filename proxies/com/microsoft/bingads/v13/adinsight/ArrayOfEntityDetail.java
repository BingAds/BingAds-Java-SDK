
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfEntityDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfEntityDetail">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntityDetail" type="{https://bingads.microsoft.com/AdInsight/v13}EntityDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEntityDetail", propOrder = {
    "entityDetails"
})
public class ArrayOfEntityDetail {

    @XmlElement(name = "EntityDetail", nillable = true)
    protected List<EntityDetail> entityDetails;
    public ArrayOfEntityDetail()
    {
      this.entityDetails = new ArrayList<EntityDetail>();
    }
    @JsonCreator
    public ArrayOfEntityDetail(List<EntityDetail> entitydetails)
    {
      this.entityDetails = entitydetails;
    }

    /**
     * Gets the value of the entityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the entityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityDetail }
     * 
     * 
     * @return
     *     The value of the entityDetails property.
     */
    public List<EntityDetail> getEntityDetails() {
        if (entityDetails == null) {
            entityDetails = new ArrayList<>();
        }
        return this.entityDetails;
    }

}
