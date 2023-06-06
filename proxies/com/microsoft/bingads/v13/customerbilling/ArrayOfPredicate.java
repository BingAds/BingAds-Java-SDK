
package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPredicate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfPredicate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Predicate" type="{https://bingads.microsoft.com/Customer/v13/Entities}Predicate" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPredicate", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "predicates"
})
public class ArrayOfPredicate {

    @XmlElement(name = "Predicate", nillable = true)
    protected List<Predicate> predicates;

    /**
     * Gets the value of the predicates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the predicates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredicates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Predicate }
     * 
     * 
     * @return
     *     The value of the predicates property.
     */
    public List<Predicate> getPredicates() {
        if (predicates == null) {
            predicates = new ArrayList<>();
        }
        return this.predicates;
    }

}
