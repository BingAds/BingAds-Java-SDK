
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
 *         <element name="UetTags" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfUetTag" minOccurs="0"/>
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
    "uetTags",
    "partialErrors"
})
@XmlRootElement(name = "GetUetTagsByIdsResponse")
public class GetUetTagsByIdsResponse {

    @XmlElement(name = "UetTags", nillable = true)
    protected ArrayOfUetTag uetTags;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

    /**
     * Gets the value of the uetTags property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUetTag }
     *     
     */
    public ArrayOfUetTag getUetTags() {
        return uetTags;
    }

    /**
     * Sets the value of the uetTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUetTag }
     *     
     */
    public void setUetTags(ArrayOfUetTag value) {
        this.uetTags = value;
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
