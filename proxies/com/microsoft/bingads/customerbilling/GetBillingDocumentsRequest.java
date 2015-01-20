
package com.microsoft.bingads.customerbilling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="Type" type="{https://bingads.microsoft.com/Customer/v9/Entities}DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentIds",
    "type"
})
@XmlRootElement(name = "GetBillingDocumentsRequest")
public class GetBillingDocumentsRequest {

    @XmlElement(name = "DocumentIds", nillable = true)
    protected ArrayOflong documentIds;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected DataType type;

    /**
     * Gets the value of the documentIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getDocumentIds() {
        return documentIds;
    }

    /**
     * Sets the value of the documentIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setDocumentIds(ArrayOflong value) {
        this.documentIds = value;
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
