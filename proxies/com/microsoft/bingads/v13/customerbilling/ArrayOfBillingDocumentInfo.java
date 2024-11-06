
package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfBillingDocumentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfBillingDocumentInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BillingDocumentInfo" type="{https://bingads.microsoft.com/Customer/v13/Entities}BillingDocumentInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBillingDocumentInfo", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "billingDocumentInfos"
})
public class ArrayOfBillingDocumentInfo {

    @XmlElement(name = "BillingDocumentInfo", nillable = true)
    protected List<BillingDocumentInfo> billingDocumentInfos;
    public ArrayOfBillingDocumentInfo()
    {
      this.billingDocumentInfos = new ArrayList<BillingDocumentInfo>();
    }
    @JsonCreator
    public ArrayOfBillingDocumentInfo(List<BillingDocumentInfo> billingdocumentinfos)
    {
      this.billingDocumentInfos = billingdocumentinfos;
    }

    /**
     * Gets the value of the billingDocumentInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the billingDocumentInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingDocumentInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingDocumentInfo }
     * 
     * 
     * @return
     *     The value of the billingDocumentInfos property.
     */
    public List<BillingDocumentInfo> getBillingDocumentInfos() {
        if (billingDocumentInfos == null) {
            billingDocumentInfos = new ArrayList<>();
        }
        return this.billingDocumentInfos;
    }

}
