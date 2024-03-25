
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfint">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="int" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfint", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", propOrder = {
    "ints"
})
public class ArrayOfint {

    @XmlElement(name = "int", type = Integer.class)
    protected List<Integer> ints;
    public ArrayOfint()
    {
      this.ints = new ArrayList<Integer>();
    }
    @JsonCreator
    public ArrayOfint(List<Integer> ints)
    {
      this.ints = ints;
    }

    /**
     * Gets the value of the ints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     * @return
     *     The value of the ints property.
     */
    public List<Integer> getInts() {
        if (ints == null) {
            ints = new ArrayList<>();
        }
        return this.ints;
    }

}
