
package com.microsoft.bingads.v11.customerbilling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPredicate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPredicate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Predicate" type="{https://bingads.microsoft.com/Customer/v11/Entities}Predicate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPredicate", namespace = "https://bingads.microsoft.com/Customer/v11/Entities", propOrder = {
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
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predicates property.
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
     */
    public List<Predicate> getPredicates() {
        if (predicates == null) {
            predicates = new ArrayList<Predicate>();
        }
        return this.predicates;
    }

}
