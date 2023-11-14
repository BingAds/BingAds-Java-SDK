
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditorialApiFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EditorialApiFaultDetail">
 *   <complexContent>
 *     <extension base="{https://adapi.microsoft.com}ApplicationFault">
 *       <sequence>
 *         <element name="BatchErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBatchError" minOccurs="0"/>
 *         <element name="EditorialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfEditorialError" minOccurs="0"/>
 *         <element name="OperationErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfOperationError" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public EditorialApiFaultDetail() {
      this.type = "EditorialApiFaultDetail";
    }

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
