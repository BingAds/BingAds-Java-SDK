
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
    "html5Assets"
})
@XmlRootElement(name = "AddHTML5sRequest")
public class AddHTML5SRequest {

    @XmlElement(name = "HTML5Assets", nillable = true)
    protected ArrayOfHTML5 html5Assets;

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

}
