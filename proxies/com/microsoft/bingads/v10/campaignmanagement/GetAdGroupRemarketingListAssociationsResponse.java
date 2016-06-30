
package com.microsoft.bingads.v10.campaignmanagement;

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
 *         &lt;element name="AdGroupRemarketingListAssociations" type="{https://bingads.microsoft.com/CampaignManagement/v10}ArrayOfAdGroupRemarketingListAssociation" minOccurs="0"/>
 *         &lt;element name="PartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v10}ArrayOfBatchError" minOccurs="0"/>
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
    "adGroupRemarketingListAssociations",
    "partialErrors"
})
@XmlRootElement(name = "GetAdGroupRemarketingListAssociationsResponse")
public class GetAdGroupRemarketingListAssociationsResponse {

    @XmlElement(name = "AdGroupRemarketingListAssociations", nillable = true)
    protected ArrayOfAdGroupRemarketingListAssociation adGroupRemarketingListAssociations;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

    /**
     * Gets the value of the adGroupRemarketingListAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdGroupRemarketingListAssociation }
     *     
     */
    public ArrayOfAdGroupRemarketingListAssociation getAdGroupRemarketingListAssociations() {
        return adGroupRemarketingListAssociations;
    }

    /**
     * Sets the value of the adGroupRemarketingListAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdGroupRemarketingListAssociation }
     *     
     */
    public void setAdGroupRemarketingListAssociations(ArrayOfAdGroupRemarketingListAssociation value) {
        this.adGroupRemarketingListAssociations = value;
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
