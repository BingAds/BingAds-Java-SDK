
package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductConditionCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductConditionCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductConditionCollection" type="{https://bingads.microsoft.com/CampaignManagement/v9}ProductConditionCollection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductConditionCollection", propOrder = {
    "productConditionCollections"
})
public class ArrayOfProductConditionCollection {

    @XmlElement(name = "ProductConditionCollection", nillable = true)
    protected List<ProductConditionCollection> productConditionCollections;

    /**
     * Gets the value of the productConditionCollections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productConditionCollections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductConditionCollections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductConditionCollection }
     * 
     * 
     */
    public List<ProductConditionCollection> getProductConditionCollections() {
        if (productConditionCollections == null) {
            productConditionCollections = new ArrayList<ProductConditionCollection>();
        }
        return this.productConditionCollections;
    }

}
