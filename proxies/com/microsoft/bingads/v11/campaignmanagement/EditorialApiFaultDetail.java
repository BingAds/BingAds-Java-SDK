
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditorialApiFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditorialApiFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adapi.microsoft.com}ApplicationFault">
 *       &lt;sequence>
 *         &lt;element name="BatchErrors" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfBatchError" minOccurs="0"/>
 *         &lt;element name="EditorialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfEditorialError" minOccurs="0"/>
 *         &lt;element name="OperationErrors" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfOperationError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditorialApiFaultDetail", propOrder = {
    "batchErrors",
    "editorialErrors",
    "operationErrors"
})
public class EditorialApiFaultDetail
    extends ApplicationFault
{

    @XmlElement(name = "BatchErrors", nillable = true)
    protected ArrayOfBatchError batchErrors;
    @XmlElement(name = "EditorialErrors", nillable = true)
    protected ArrayOfEditorialError editorialErrors;
    @XmlElement(name = "OperationErrors", nillable = true)
    protected ArrayOfOperationError operationErrors;

    /**
     * Gets the value of the batchErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public ArrayOfBatchError getBatchErrors() {
        return batchErrors;
    }

    /**
     * Sets the value of the batchErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public void setBatchErrors(ArrayOfBatchError value) {
        this.batchErrors = value;
    }

    /**
     * Gets the value of the editorialErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEditorialError }
     *     
     */
    public ArrayOfEditorialError getEditorialErrors() {
        return editorialErrors;
    }

    /**
     * Sets the value of the editorialErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEditorialError }
     *     
     */
    public void setEditorialErrors(ArrayOfEditorialError value) {
        this.editorialErrors = value;
    }

    /**
     * Gets the value of the operationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOperationError }
     *     
     */
    public ArrayOfOperationError getOperationErrors() {
        return operationErrors;
    }

    /**
     * Sets the value of the operationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOperationError }
     *     
     */
    public void setOperationErrors(ArrayOfOperationError value) {
        this.operationErrors = value;
    }

}
