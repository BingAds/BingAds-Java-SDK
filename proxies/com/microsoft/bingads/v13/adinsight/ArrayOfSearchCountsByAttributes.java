
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSearchCountsByAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfSearchCountsByAttributes">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SearchCountsByAttributes" type="{https://bingads.microsoft.com/AdInsight/v13}SearchCountsByAttributes" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchCountsByAttributes", propOrder = {
    "searchCountsByAttributes"
})
public class ArrayOfSearchCountsByAttributes {

    @XmlElement(name = "SearchCountsByAttributes", nillable = true)
    protected List<SearchCountsByAttributes> searchCountsByAttributes;

    /**
     * Gets the value of the searchCountsByAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the searchCountsByAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCountsByAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchCountsByAttributes }
     * 
     * 
     * @return
     *     The value of the searchCountsByAttributes property.
     */
    public List<SearchCountsByAttributes> getSearchCountsByAttributes() {
        if (searchCountsByAttributes == null) {
            searchCountsByAttributes = new ArrayList<>();
        }
        return this.searchCountsByAttributes;
    }

}
