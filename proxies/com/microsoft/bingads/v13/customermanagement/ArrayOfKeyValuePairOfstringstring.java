
package com.microsoft.bingads.v13.customermanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeyValuePairOfstringstring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeyValuePairOfstringstring">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyValuePairOfstringstring" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfstringstring" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValuePairOfstringstring", namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", propOrder = {
    "keyValuePairOfstringstrings"
})
public class ArrayOfKeyValuePairOfstringstring {

    @XmlElement(name = "KeyValuePairOfstringstring")
    protected List<KeyValuePairOfstringstring> keyValuePairOfstringstrings;

    /**
     * Gets the value of the keyValuePairOfstringstrings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyValuePairOfstringstrings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOfstringstrings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOfstringstring }
     * 
     * 
     * @return
     *     The value of the keyValuePairOfstringstrings property.
     */
    public List<KeyValuePairOfstringstring> getKeyValuePairOfstringstrings() {
        if (keyValuePairOfstringstrings == null) {
            keyValuePairOfstringstrings = new ArrayList<>();
        }
        return this.keyValuePairOfstringstrings;
    }

}
