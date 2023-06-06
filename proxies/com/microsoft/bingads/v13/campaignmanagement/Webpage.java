
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Webpage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Webpage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       &lt;sequence>
 *         &lt;element name="Parameter" type="{https://bingads.microsoft.com/CampaignManagement/v13}WebpageParameter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
