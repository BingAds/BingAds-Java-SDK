
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfDomainCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDomainCategory">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DomainCategory" type="{https://bingads.microsoft.com/AdInsight/v13}DomainCategory" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDomainCategory", propOrder = {
    "domainCategories"
})
public class ArrayOfDomainCategory {

    @XmlElement(name = "DomainCategory", nillable = true)
    protected List<DomainCategory> domainCategories;
    public ArrayOfDomainCategory()
    {
      this.domainCategories = new ArrayList<DomainCategory>();
    }
    @JsonCreator
    public ArrayOfDomainCategory(List<DomainCategory> domaincategorys)
    {
      this.domainCategories = domaincategorys;
    }

    /**
     * Gets the value of the domainCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the domainCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomainCategory }
     * 
     * 
     * @return
     *     The value of the domainCategories property.
     */
    public List<DomainCategory> getDomainCategories() {
        if (domainCategories == null) {
            domainCategories = new ArrayList<>();
        }
        return this.domainCategories;
    }

}
