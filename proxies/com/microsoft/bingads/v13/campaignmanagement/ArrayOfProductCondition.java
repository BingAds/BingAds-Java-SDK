
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfProductCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfProductCondition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProductCondition" type="{https://bingads.microsoft.com/CampaignManagement/v13}ProductCondition" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductCondition", propOrder = {
    "productConditions"
})
public class ArrayOfProductCondition {

    @XmlElement(name = "ProductCondition", nillable = true)
    protected List<ProductCondition> productConditions;
    public ArrayOfProductCondition()
    {
      this.productConditions = new ArrayList<ProductCondition>();
    }
    @JsonCreator
    public ArrayOfProductCondition(List<ProductCondition> productconditions)
    {
      this.productConditions = productconditions;
    }

    /**
     * Gets the value of the productConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the productConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCondition }
     * 
     * 
     * @return
     *     The value of the productConditions property.
     */
    public List<ProductCondition> getProductConditions() {
        if (productConditions == null) {
            productConditions = new ArrayList<>();
        }
        return this.productConditions;
    }

}
