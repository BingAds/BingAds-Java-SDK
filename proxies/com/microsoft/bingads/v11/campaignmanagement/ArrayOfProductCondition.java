
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductCondition" type="{https://bingads.microsoft.com/CampaignManagement/v11}ProductCondition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    /**
     * Gets the value of the productConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productConditions property.
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
     */
    public List<ProductCondition> getProductConditions() {
        if (productConditions == null) {
            productConditions = new ArrayList<ProductCondition>();
        }
        return this.productConditions;
    }

}
