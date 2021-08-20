
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArrayOfKeyValuePairOfstringstring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfKeyValuePairOfstringstring">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfKeyValuePairOfstringstring" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    /**
     * Gets the value of the arrayOfKeyValuePairOfstringstrings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfKeyValuePairOfstringstrings property.
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
     */
    public List<ArrayOfKeyValuePairOfstringstring> getArrayOfKeyValuePairOfstringstrings() {
        if (arrayOfKeyValuePairOfstringstrings == null) {
            arrayOfKeyValuePairOfstringstrings = new ArrayList<ArrayOfKeyValuePairOfstringstring>();
        }
        return this.arrayOfKeyValuePairOfstringstrings;
    }

}
