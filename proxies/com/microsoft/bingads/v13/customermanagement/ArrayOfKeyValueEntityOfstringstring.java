
package com.microsoft.bingads.v13.customermanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeyValueEntityOfstringstring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeyValueEntityOfstringstring">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyValueEntityOfstringstring" type="{https://bingads.microsoft.com/Customer/v13/Entities}KeyValueEntityOfstringstring" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueEntityOfstringstring", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "keyValueEntityOfstringstrings"
})
public class ArrayOfKeyValueEntityOfstringstring {

    @XmlElement(name = "KeyValueEntityOfstringstring", nillable = true)
    protected List<KeyValueEntityOfstringstring> keyValueEntityOfstringstrings;

    /**
     * Gets the value of the keyValueEntityOfstringstrings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyValueEntityOfstringstrings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueEntityOfstringstrings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueEntityOfstringstring }
     * 
     * 
     * @return
     *     The value of the keyValueEntityOfstringstrings property.
     */
    public List<KeyValueEntityOfstringstring> getKeyValueEntityOfstringstrings() {
        if (keyValueEntityOfstringstrings == null) {
            keyValueEntityOfstringstrings = new ArrayList<>();
        }
        return this.keyValueEntityOfstringstrings;
    }

}
