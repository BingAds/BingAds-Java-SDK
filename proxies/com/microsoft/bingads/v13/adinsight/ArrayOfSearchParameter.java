
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfSearchParameter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SearchParameter" type="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchParameter", propOrder = {
    "searchParameters"
})
public class ArrayOfSearchParameter {

    @XmlElement(name = "SearchParameter", nillable = true)
    protected List<SearchParameter> searchParameters;
    public ArrayOfSearchParameter()
    {
      this.searchParameters = new ArrayList<SearchParameter>();
    }
    @JsonCreator
    public ArrayOfSearchParameter(List<SearchParameter> searchparameters)
    {
      this.searchParameters = searchparameters;
    }

    /**
     * Gets the value of the searchParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the searchParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchParameter }
     * 
     * 
     * @return
     *     The value of the searchParameters property.
     */
    public List<SearchParameter> getSearchParameters() {
        if (searchParameters == null) {
            searchParameters = new ArrayList<>();
        }
        return this.searchParameters;
    }

}
