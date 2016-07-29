
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
 *         &lt;element name="UetTags" type="{https://bingads.microsoft.com/CampaignManagement/v10}ArrayOfUetTag" minOccurs="0"/>
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
