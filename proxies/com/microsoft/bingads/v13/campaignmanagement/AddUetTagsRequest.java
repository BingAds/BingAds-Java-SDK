
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
    "uetTags"
})
@XmlRootElement(name = "AddUetTagsRequest")
public class AddUetTagsRequest {

    @XmlElement(name = "UetTags", nillable = true)
    protected ArrayOfUetTag uetTags;

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

}
