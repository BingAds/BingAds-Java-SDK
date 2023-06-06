
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCriterion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Criterion" type="{https://bingads.microsoft.com/AdInsight/v13}Criterion" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCriterion", propOrder = {
    "criterions"
})
public class ArrayOfCriterion {

    @XmlElement(name = "Criterion", nillable = true)
    protected List<Criterion> criterions;

    /**
     * Gets the value of the criterions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the criterions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriterions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Criterion }
     * 
     * 
     * @return
     *     The value of the criterions property.
     */
    public List<Criterion> getCriterions() {
        if (criterions == null) {
            criterions = new ArrayList<>();
        }
        return this.criterions;
    }

}
