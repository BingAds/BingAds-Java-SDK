
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="EntityIdsMapping" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOflonglong" minOccurs="0"/>
 *         &lt;element name="PartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBatchError" minOccurs="0"/>
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
    "entityIdsMapping",
    "partialErrors"
})
@XmlRootElement(name = "GetImportEntityIdsMappingResponse")
public class GetImportEntityIdsMappingResponse {

    @XmlElement(name = "EntityIdsMapping", nillable = true)
    protected ArrayOfKeyValuePairOflonglong entityIdsMapping;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

    /**
     * Gets the value of the entityIdsMapping property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValuePairOflonglong }
     *     
     */
    public ArrayOfKeyValuePairOflonglong getEntityIdsMapping() {
        return entityIdsMapping;
    }

    /**
     * Sets the value of the entityIdsMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePairOflonglong }
     *     
     */
    public void setEntityIdsMapping(ArrayOfKeyValuePairOflonglong value) {
        this.entityIdsMapping = value;
    }

    /**
     * Gets the value of the partialErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public ArrayOfBatchError getPartialErrors() {
        return partialErrors;
    }

    /**
     * Sets the value of the partialErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public void setPartialErrors(ArrayOfBatchError value) {
        this.partialErrors = value;
    }

}
