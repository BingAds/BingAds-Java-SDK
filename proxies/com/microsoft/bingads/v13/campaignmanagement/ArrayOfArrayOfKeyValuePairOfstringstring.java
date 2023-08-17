
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfArrayOfKeyValuePairOfstringstring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfArrayOfKeyValuePairOfstringstring">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ArrayOfKeyValuePairOfstringstring" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfKeyValuePairOfstringstring", namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", propOrder = {
    "arrayOfKeyValuePairOfstringstrings"
})
public class ArrayOfArrayOfKeyValuePairOfstringstring {

    @XmlElement(name = "ArrayOfKeyValuePairOfstringstring", nillable = true)
    protected List<ArrayOfKeyValuePairOfstringstring> arrayOfKeyValuePairOfstringstrings;
    public ArrayOfArrayOfKeyValuePairOfstringstring()
    {
      this.arrayOfKeyValuePairOfstringstrings = new ArrayList<ArrayOfKeyValuePairOfstringstring>();
    }
    @JsonCreator
    public ArrayOfArrayOfKeyValuePairOfstringstring(List<ArrayOfKeyValuePairOfstringstring> arrayofkeyvaluepairofstringstrings)
    {
      this.arrayOfKeyValuePairOfstringstrings = arrayofkeyvaluepairofstringstrings;
    }

    /**
     * Gets the value of the arrayOfKeyValuePairOfstringstrings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the arrayOfKeyValuePairOfstringstrings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfKeyValuePairOfstringstrings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValuePairOfstringstring }
     * 
     * 
     * @return
     *     The value of the arrayOfKeyValuePairOfstringstrings property.
     */
    public List<ArrayOfKeyValuePairOfstringstring> getArrayOfKeyValuePairOfstringstrings() {
        if (arrayOfKeyValuePairOfstringstrings == null) {
            arrayOfKeyValuePairOfstringstrings = new ArrayList<>();
        }
        return this.arrayOfKeyValuePairOfstringstrings;
    }

}
