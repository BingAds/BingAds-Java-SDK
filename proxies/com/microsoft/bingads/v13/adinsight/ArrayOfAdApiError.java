
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdApiError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdApiError">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdApiError" type="{https://adapi.microsoft.com}AdApiError" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdApiError", namespace = "https://adapi.microsoft.com", propOrder = {
    "adApiErrors"
})
public class ArrayOfAdApiError {

    @XmlElement(name = "AdApiError", nillable = true)
    protected List<AdApiError> adApiErrors;
    public ArrayOfAdApiError()
    {
      this.adApiErrors = new ArrayList<AdApiError>();
    }
    @JsonCreator
    public ArrayOfAdApiError(List<AdApiError> adapierrors)
    {
      this.adApiErrors = adapierrors;
    }

    /**
     * Gets the value of the adApiErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adApiErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdApiErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdApiError }
     * 
     * 
     * @return
     *     The value of the adApiErrors property.
     */
    public List<AdApiError> getAdApiErrors() {
        if (adApiErrors == null) {
            adApiErrors = new ArrayList<>();
        }
        return this.adApiErrors;
    }

}
