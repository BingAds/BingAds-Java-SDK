
package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeyValuePairOflongstring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeyValuePairOflongstring">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyValuePairOflongstring" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOflongstring" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValuePairOflongstring", namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", propOrder = {
    "keyValuePairOflongstrings"
})
public class ArrayOfKeyValuePairOflongstring {

    @XmlElement(name = "KeyValuePairOflongstring")
    protected List<KeyValuePairOflongstring> keyValuePairOflongstrings;

    /**
     * Gets the value of the keyValuePairOflongstrings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyValuePairOflongstrings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOflongstrings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOflongstring }
     * 
     * 
     * @return
     *     The value of the keyValuePairOflongstrings property.
     */
    public List<KeyValuePairOflongstring> getKeyValuePairOflongstrings() {
        if (keyValuePairOflongstrings == null) {
            keyValuePairOflongstrings = new ArrayList<>();
        }
        return this.keyValuePairOflongstrings;
    }

}
