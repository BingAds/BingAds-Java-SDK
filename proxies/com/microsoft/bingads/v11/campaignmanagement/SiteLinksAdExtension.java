
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteLinksAdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteLinksAdExtension">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v11}AdExtension">
 *       &lt;sequence>
 *         &lt;element name="SiteLinks" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfSiteLink"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLinksAdExtension", propOrder = {
    "siteLinks"
})
public class SiteLinksAdExtension
    extends AdExtension
{

    @XmlElement(name = "SiteLinks", required = true, nillable = true)
    protected ArrayOfSiteLink siteLinks;

    /**
     * Gets the value of the siteLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSiteLink }
     *     
     */
    public ArrayOfSiteLink getSiteLinks() {
        return siteLinks;
    }

    /**
     * Sets the value of the siteLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSiteLink }
     *     
     */
    public void setSiteLinks(ArrayOfSiteLink value) {
        this.siteLinks = value;
    }

}
