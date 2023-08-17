
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Webpage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Webpage">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="Parameter" type="{https://bingads.microsoft.com/CampaignManagement/v13}WebpageParameter" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Webpage", propOrder = {
    "parameter"
})
public class Webpage
    extends Criterion
{
    public Webpage() {
      this.type = "Webpage";
    }

    @XmlElement(name = "Parameter", nillable = true)
    protected WebpageParameter parameter;

    /**
     * Gets the value of the parameter property.
     * 
     * @return
     *     possible object is
     *     {@link WebpageParameter }
     *     
     */
    public WebpageParameter getParameter() {
        return parameter;
    }

    /**
     * Sets the value of the parameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebpageParameter }
     *     
     */
    public void setParameter(WebpageParameter value) {
        this.parameter = value;
    }

}
