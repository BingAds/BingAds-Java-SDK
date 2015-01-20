
package com.microsoft.bingads.campaignmanagement;

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
 *         &lt;element name="AdGroupCriterions" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfAdGroupCriterion" minOccurs="0"/>
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
    "adGroupCriterions"
})
@XmlRootElement(name = "GetAdGroupCriterionsByAdGroupIdResponse")
public class GetAdGroupCriterionsByAdGroupIdResponse {

    @XmlElement(name = "AdGroupCriterions", nillable = true)
    protected ArrayOfAdGroupCriterion adGroupCriterions;

    /**
     * Gets the value of the adGroupCriterions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdGroupCriterion }
     *     
     */
    public ArrayOfAdGroupCriterion getAdGroupCriterions() {
        return adGroupCriterions;
    }

    /**
     * Sets the value of the adGroupCriterions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdGroupCriterion }
     *     
     */
    public void setAdGroupCriterions(ArrayOfAdGroupCriterion value) {
        this.adGroupCriterions = value;
    }

}
