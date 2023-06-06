
package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBillingDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfBillingDocument">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BillingDocument" type="{https://bingads.microsoft.com/Customer/v13/Entities}BillingDocument" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBillingDocument", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "billingDocuments"
})
public class ArrayOfBillingDocument {

    @XmlElement(name = "BillingDocument", nillable = true)
    protected List<BillingDocument> billingDocuments;

    /**
     * Gets the value of the billingDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the billingDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingDocument }
     * 
     * 
     * @return
     *     The value of the billingDocuments property.
     */
    public List<BillingDocument> getBillingDocuments() {
        if (billingDocuments == null) {
            billingDocuments = new ArrayList<>();
        }
        return this.billingDocuments;
    }

}
