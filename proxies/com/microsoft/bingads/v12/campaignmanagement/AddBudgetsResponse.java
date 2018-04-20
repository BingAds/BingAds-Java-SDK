
package com.microsoft.bingads.v12.campaignmanagement;

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
 *         &lt;element name="BudgetIds" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfNullableOflong" minOccurs="0"/>
 *         &lt;element name="PartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v12}ArrayOfBatchError" minOccurs="0"/>
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
    "budgetIds",
    "partialErrors"
})
@XmlRootElement(name = "AddBudgetsResponse")
public class AddBudgetsResponse {

    @XmlElement(name = "BudgetIds", nillable = true)
    protected ArrayOfNullableOflong budgetIds;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

    /**
     * Gets the value of the budgetIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNullableOflong }
     *     
     */
    public ArrayOfNullableOflong getBudgetIds() {
        return budgetIds;
    }

    /**
     * Sets the value of the budgetIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNullableOflong }
     *     
     */
    public void setBudgetIds(ArrayOfNullableOflong value) {
        this.budgetIds = value;
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
