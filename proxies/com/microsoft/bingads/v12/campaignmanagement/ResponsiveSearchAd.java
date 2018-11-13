
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponsiveSearchAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsiveSearchAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v12}Ad">
 *       &lt;sequence>
 *         &lt;element name="Descriptions" type="{https://bingads.microsoft.com/CampaignManagement/v12}ArrayOfAssetLink" minOccurs="0"/>
 *         &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Headlines" type="{https://bingads.microsoft.com/CampaignManagement/v12}ArrayOfAssetLink" minOccurs="0"/>
 *         &lt;element name="Path1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Path2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsiveSearchAd", propOrder = {
    "descriptions",
    "domain",
    "headlines",
    "path1",
    "path2"
})
public class ResponsiveSearchAd
    extends Ad
{

    @XmlElement(name = "Descriptions", nillable = true)
    protected ArrayOfAssetLink descriptions;
    @XmlElement(name = "Domain", nillable = true)
    protected String domain;
    @XmlElement(name = "Headlines", nillable = true)
    protected ArrayOfAssetLink headlines;
    @XmlElement(name = "Path1", nillable = true)
    protected String path1;
    @XmlElement(name = "Path2", nillable = true)
    protected String path2;

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetLink }
     *     
     */
    public ArrayOfAssetLink getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetLink }
     *     
     */
    public void setDescriptions(ArrayOfAssetLink value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the headlines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetLink }
     *     
     */
    public ArrayOfAssetLink getHeadlines() {
        return headlines;
    }

    /**
     * Sets the value of the headlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetLink }
     *     
     */
    public void setHeadlines(ArrayOfAssetLink value) {
        this.headlines = value;
    }

    /**
     * Gets the value of the path1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath1() {
        return path1;
    }

    /**
     * Sets the value of the path1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath1(String value) {
        this.path1 = value;
    }

    /**
     * Gets the value of the path2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath2() {
        return path2;
    }

    /**
     * Sets the value of the path2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath2(String value) {
        this.path2 = value;
    }

}
