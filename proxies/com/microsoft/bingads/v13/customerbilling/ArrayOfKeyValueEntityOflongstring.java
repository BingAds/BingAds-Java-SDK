
package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeyValueEntityOflongstring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeyValueEntityOflongstring">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyValueEntityOflongstring" type="{https://bingads.microsoft.com/Customer/v13/Entities}KeyValueEntityOflongstring" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueEntityOflongstring", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "keyValueEntityOflongstrings"
})
public class ArrayOfKeyValueEntityOflongstring {

    @XmlElement(name = "KeyValueEntityOflongstring", nillable = true)
    protected List<KeyValueEntityOflongstring> keyValueEntityOflongstrings;

    /**
     * Gets the value of the keyValueEntityOflongstrings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyValueEntityOflongstrings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueEntityOflongstrings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueEntityOflongstring }
     * 
     * 
     * @return
     *     The value of the keyValueEntityOflongstrings property.
     */
    public List<KeyValueEntityOflongstring> getKeyValueEntityOflongstrings() {
        if (keyValueEntityOflongstrings == null) {
            keyValueEntityOflongstrings = new ArrayList<>();
        }
        return this.keyValueEntityOflongstrings;
    }

}
