
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponsiveAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsiveAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v12}Ad">
 *       &lt;sequence>
 *         &lt;element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallToAction" type="{https://bingads.microsoft.com/CampaignManagement/v12}CallToAction" minOccurs="0"/>
 *         &lt;element name="Headline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LandscapeImageMediaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LandscapeLogoMediaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LongHeadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SquareImageMediaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SquareLogoMediaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsiveAd", propOrder = {
    "businessName",
    "callToAction",
    "headline",
    "landscapeImageMediaId",
    "landscapeLogoMediaId",
    "longHeadline",
    "squareImageMediaId",
    "squareLogoMediaId",
    "text"
})
public class ResponsiveAd
    extends Ad
{

    @XmlElement(name = "BusinessName", nillable = true)
    protected String businessName;
    @XmlElement(name = "CallToAction", nillable = true)
    @XmlSchemaType(name = "string")
    protected CallToAction callToAction;
    @XmlElement(name = "Headline", nillable = true)
    protected String headline;
    @XmlElement(name = "LandscapeImageMediaId", nillable = true)
    protected Long landscapeImageMediaId;
    @XmlElement(name = "LandscapeLogoMediaId", nillable = true)
    protected Long landscapeLogoMediaId;
    @XmlElement(name = "LongHeadline", nillable = true)
    protected String longHeadline;
    @XmlElement(name = "SquareImageMediaId", nillable = true)
    protected Long squareImageMediaId;
    @XmlElement(name = "SquareLogoMediaId", nillable = true)
    protected Long squareLogoMediaId;
    @XmlElement(name = "Text", nillable = true)
    protected String text;

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the callToAction property.
     * 
     * @return
     *     possible object is
     *     {@link CallToAction }
     *     
     */
    public CallToAction getCallToAction() {
        return callToAction;
    }

    /**
     * Sets the value of the callToAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallToAction }
     *     
     */
    public void setCallToAction(CallToAction value) {
        this.callToAction = value;
    }

    /**
     * Gets the value of the headline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * Sets the value of the headline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadline(String value) {
        this.headline = value;
    }

    /**
     * Gets the value of the landscapeImageMediaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLandscapeImageMediaId() {
        return landscapeImageMediaId;
    }

    /**
     * Sets the value of the landscapeImageMediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLandscapeImageMediaId(Long value) {
        this.landscapeImageMediaId = value;
    }

    /**
     * Gets the value of the landscapeLogoMediaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLandscapeLogoMediaId() {
        return landscapeLogoMediaId;
    }

    /**
     * Sets the value of the landscapeLogoMediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLandscapeLogoMediaId(Long value) {
        this.landscapeLogoMediaId = value;
    }

    /**
     * Gets the value of the longHeadline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongHeadline() {
        return longHeadline;
    }

    /**
     * Sets the value of the longHeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongHeadline(String value) {
        this.longHeadline = value;
    }

    /**
     * Gets the value of the squareImageMediaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSquareImageMediaId() {
        return squareImageMediaId;
    }

    /**
     * Sets the value of the squareImageMediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSquareImageMediaId(Long value) {
        this.squareImageMediaId = value;
    }

    /**
     * Gets the value of the squareLogoMediaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSquareLogoMediaId() {
        return squareLogoMediaId;
    }

    /**
     * Sets the value of the squareLogoMediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSquareLogoMediaId(Long value) {
        this.squareLogoMediaId = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
