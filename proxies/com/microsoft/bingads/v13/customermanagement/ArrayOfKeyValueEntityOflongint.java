
package com.microsoft.bingads.v13.customermanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfKeyValueEntityOflongint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeyValueEntityOflongint">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyValueEntityOflongint" type="{https://bingads.microsoft.com/Customer/v13/Entities}KeyValueEntityOflongint" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueEntityOflongint", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "keyValueEntityOflongints"
})
public class ArrayOfKeyValueEntityOflongint {

    @XmlElement(name = "KeyValueEntityOflongint", nillable = true)
    protected List<KeyValueEntityOflongint> keyValueEntityOflongints;
    public ArrayOfKeyValueEntityOflongint()
    {
      this.keyValueEntityOflongints = new ArrayList<KeyValueEntityOflongint>();
    }
    @JsonCreator
    public ArrayOfKeyValueEntityOflongint(List<KeyValueEntityOflongint> keyvalueentityoflongints)
    {
      this.keyValueEntityOflongints = keyvalueentityoflongints;
    }

    /**
     * Gets the value of the keyValueEntityOflongints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyValueEntityOflongints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueEntityOflongints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueEntityOflongint }
     * 
     * 
     * @return
     *     The value of the keyValueEntityOflongints property.
     */
    public List<KeyValueEntityOflongint> getKeyValueEntityOflongints() {
        if (keyValueEntityOflongints == null) {
            keyValueEntityOflongints = new ArrayList<>();
        }
        return this.keyValueEntityOflongints;
    }

}
