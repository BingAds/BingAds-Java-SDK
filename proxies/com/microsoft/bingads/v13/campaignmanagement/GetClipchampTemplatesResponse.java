
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
 *         <element name="Templates" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfClipchampTemplateInfo" minOccurs="0"/>
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
    "templates"
})
@XmlRootElement(name = "GetClipchampTemplatesResponse")
public class GetClipchampTemplatesResponse {

    @XmlElement(name = "Templates", nillable = true)
    protected ArrayOfClipchampTemplateInfo templates;

    /**
     * Gets the value of the templates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClipchampTemplateInfo }
     *     
     */
    public ArrayOfClipchampTemplateInfo getTemplates() {
        return templates;
    }

    /**
     * Sets the value of the templates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClipchampTemplateInfo }
     *     
     */
    public void setTemplates(ArrayOfClipchampTemplateInfo value) {
        this.templates = value;
    }

}
