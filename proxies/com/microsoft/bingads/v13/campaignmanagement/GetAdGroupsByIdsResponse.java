
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
 *         <element name="AdGroups" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdGroup" minOccurs="0"/>
 *         <element name="PartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBatchError" minOccurs="0"/>
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
    "adGroups",
    "partialErrors"
})
@XmlRootElement(name = "GetAdGroupsByIdsResponse")
public class GetAdGroupsByIdsResponse {

    @XmlElement(name = "AdGroups", nillable = true)
    protected ArrayOfAdGroup adGroups;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

    /**
     * Gets the value of the adGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdGroup }
     *     
     */
    public ArrayOfAdGroup getAdGroups() {
        return adGroups;
    }

    /**
     * Sets the value of the adGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdGroup }
     *     
     */
    public void setAdGroups(ArrayOfAdGroup value) {
        this.adGroups = value;
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
