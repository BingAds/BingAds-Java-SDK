
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
 *         &lt;element name="AdGroupIds" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfNullableOflong" minOccurs="0"/>
 *         &lt;element name="InheritedBidStrategyTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
    "adGroupIds",
    "inheritedBidStrategyTypes",
    "partialErrors"
})
@XmlRootElement(name = "AddAdGroupsResponse")
public class AddAdGroupsResponse {

    @XmlElement(name = "AdGroupIds", nillable = true)
    protected ArrayOfNullableOflong adGroupIds;
    @XmlElement(name = "InheritedBidStrategyTypes", nillable = true)
    protected ArrayOfstring inheritedBidStrategyTypes;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

    /**
     * Gets the value of the adGroupIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNullableOflong }
     *     
     */
    public ArrayOfNullableOflong getAdGroupIds() {
        return adGroupIds;
    }

    /**
     * Sets the value of the adGroupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNullableOflong }
     *     
     */
    public void setAdGroupIds(ArrayOfNullableOflong value) {
        this.adGroupIds = value;
    }

    /**
     * Gets the value of the inheritedBidStrategyTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getInheritedBidStrategyTypes() {
        return inheritedBidStrategyTypes;
    }

    /**
     * Sets the value of the inheritedBidStrategyTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setInheritedBidStrategyTypes(ArrayOfstring value) {
        this.inheritedBidStrategyTypes = value;
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
