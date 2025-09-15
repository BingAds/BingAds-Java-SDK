
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
 *         <element name="HTML5Assets" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfHTML5" minOccurs="0"/>
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
    "html5Assets",
    "partialErrors"
})
@XmlRootElement(name = "GetHTML5sByIdsResponse")
public class GetHTML5SByIdsResponse {

    @XmlElement(name = "HTML5Assets", nillable = true)
    protected ArrayOfHTML5 html5Assets;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

    /**
     * Gets the value of the html5Assets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHTML5 }
     *     
     */
    public ArrayOfHTML5 getHTML5Assets() {
        return html5Assets;
    }

    /**
     * Sets the value of the html5Assets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHTML5 }
     *     
     */
    public void setHTML5Assets(ArrayOfHTML5 value) {
        this.html5Assets = value;
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
