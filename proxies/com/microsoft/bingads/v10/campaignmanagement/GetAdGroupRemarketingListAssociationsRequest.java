
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
 *         &lt;element name="AdGroupIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="ReturnExclusions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "returnExclusions"
})
@XmlRootElement(name = "GetAdGroupRemarketingListAssociationsRequest")
public class GetAdGroupRemarketingListAssociationsRequest {

    @XmlElement(name = "AdGroupIds", nillable = true)
    protected ArrayOflong adGroupIds;
    @XmlElement(name = "ReturnExclusions", nillable = true)
    protected Boolean returnExclusions;

    /**
     * Gets the value of the adGroupIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getAdGroupIds() {
        return adGroupIds;
    }

    /**
     * Sets the value of the adGroupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setAdGroupIds(ArrayOflong value) {
        this.adGroupIds = value;
    }

    /**
     * Gets the value of the returnExclusions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getReturnExclusions() {
        return returnExclusions;
    }

    /**
     * Sets the value of the returnExclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnExclusions(Boolean value) {
        this.returnExclusions = value;
    }

}
