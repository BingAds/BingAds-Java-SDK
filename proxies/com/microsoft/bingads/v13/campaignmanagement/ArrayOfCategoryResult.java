
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfCategoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCategoryResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CategoryResult" type="{https://bingads.microsoft.com/CampaignManagement/v13}CategoryResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCategoryResult", propOrder = {
    "categoryResults"
})
public class ArrayOfCategoryResult {

    @XmlElement(name = "CategoryResult", nillable = true)
    protected List<CategoryResult> categoryResults;
    public ArrayOfCategoryResult()
    {
      this.categoryResults = new ArrayList<CategoryResult>();
    }
    @JsonCreator
    public ArrayOfCategoryResult(List<CategoryResult> categoryresults)
    {
      this.categoryResults = categoryresults;
    }

    /**
     * Gets the value of the categoryResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the categoryResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryResult }
     * 
     * 
     * @return
     *     The value of the categoryResults property.
     */
    public List<CategoryResult> getCategoryResults() {
        if (categoryResults == null) {
            categoryResults = new ArrayList<>();
        }
        return this.categoryResults;
    }

}
