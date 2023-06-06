
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element name="AdGroupCriterionIds" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfNullableOflong" minOccurs="0"/>
 *         <element name="NestedPartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBatchErrorCollection" minOccurs="0"/>
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
    "adGroupCriterionIds",
    "nestedPartialErrors"
})
@XmlRootElement(name = "AddAdGroupCriterionsResponse")
public class AddAdGroupCriterionsResponse {

    @XmlElement(name = "AdGroupCriterionIds", nillable = true)
    protected ArrayOfNullableOflong adGroupCriterionIds;
    @XmlElement(name = "NestedPartialErrors", nillable = true)
    protected ArrayOfBatchErrorCollection nestedPartialErrors;

    /**
     * Gets the value of the adGroupCriterionIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNullableOflong }
     *     
     */
    public ArrayOfNullableOflong getAdGroupCriterionIds() {
        return adGroupCriterionIds;
    }

    /**
     * Sets the value of the adGroupCriterionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNullableOflong }
     *     
     */
    public void setAdGroupCriterionIds(ArrayOfNullableOflong value) {
        this.adGroupCriterionIds = value;
    }

    /**
     * Gets the value of the nestedPartialErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchErrorCollection }
     *     
     */
    public ArrayOfBatchErrorCollection getNestedPartialErrors() {
        return nestedPartialErrors;
    }

    /**
     * Sets the value of the nestedPartialErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchErrorCollection }
     *     
     */
    public void setNestedPartialErrors(ArrayOfBatchErrorCollection value) {
        this.nestedPartialErrors = value;
    }

}
