
package com.microsoft.bingads.v11.campaignmanagement;

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
 *         &lt;element name="AdGroupCriterionIds" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfNullableOflong" minOccurs="0"/>
 *         &lt;element name="IsMigrated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NestedPartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfBatchErrorCollection" minOccurs="0"/>
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
    "adGroupCriterionIds",
    "isMigrated",
    "nestedPartialErrors"
})
@XmlRootElement(name = "AddAdGroupCriterionsResponse")
public class AddAdGroupCriterionsResponse {

    @XmlElement(name = "AdGroupCriterionIds", nillable = true)
    protected ArrayOfNullableOflong adGroupCriterionIds;
    @XmlElement(name = "IsMigrated")
    protected Boolean isMigrated;
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
     * Gets the value of the isMigrated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsMigrated() {
        return isMigrated;
    }

    /**
     * Sets the value of the isMigrated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMigrated(Boolean value) {
        this.isMigrated = value;
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
