
package com.microsoft.bingads.v13.customerbilling;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BillingDocumentsInfo" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfBillingDocumentInfo" minOccurs="0"/>
 *         <element name="Type" type="{https://bingads.microsoft.com/Customer/v13/Entities}DataType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "billingDocumentsInfo",
    "type"
})
@XmlRootElement(name = "GetBillingDocumentsRequest")
public class GetBillingDocumentsRequest {

    @XmlElement(name = "BillingDocumentsInfo", nillable = true)
    protected ArrayOfBillingDocumentInfo billingDocumentsInfo;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected DataType type;

    /**
     * Gets the value of the billingDocumentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBillingDocumentInfo }
     *     
     */
    public ArrayOfBillingDocumentInfo getBillingDocumentsInfo() {
        return billingDocumentsInfo;
    }

    /**
     * Sets the value of the billingDocumentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBillingDocumentInfo }
     *     
     */
    public void setBillingDocumentsInfo(ArrayOfBillingDocumentInfo value) {
        this.billingDocumentsInfo = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setType(DataType value) {
        this.type = value;
    }

}
