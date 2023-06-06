
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpandedTextAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExpandedTextAd">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Ad">
 *       <sequence>
 *         <element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Path1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Path2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TextPart2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TitlePart1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TitlePart2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TitlePart3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpandedTextAd", propOrder = {
    "domain",
    "path1",
    "path2",
    "text",
    "textPart2",
    "titlePart1",
    "titlePart2",
    "titlePart3"
})
public class ExpandedTextAd
    extends Ad
{

    @XmlElement(name = "Domain", nillable = true)
    protected String domain;
    @XmlElement(name = "Path1", nillable = true)
    protected String path1;
    @XmlElement(name = "Path2", nillable = true)
    protected String path2;
    @XmlElement(name = "Text", nillable = true)
    protected String text;
    @XmlElement(name = "TextPart2", nillable = true)
    protected String textPart2;
    @XmlElement(name = "TitlePart1", nillable = true)
    protected String titlePart1;
    @XmlElement(name = "TitlePart2", nillable = true)
    protected String titlePart2;
    @XmlElement(name = "TitlePart3", nillable = true)
    protected String titlePart3;

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

    /**
     * Gets the value of the textPart2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextPart2() {
        return textPart2;
    }

    /**
     * Sets the value of the textPart2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextPart2(String value) {
        this.textPart2 = value;
    }

    /**
     * Gets the value of the titlePart1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitlePart1() {
        return titlePart1;
    }

    /**
     * Sets the value of the titlePart1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitlePart1(String value) {
        this.titlePart1 = value;
    }

    /**
     * Gets the value of the titlePart2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitlePart2() {
        return titlePart2;
    }

    /**
     * Sets the value of the titlePart2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitlePart2(String value) {
        this.titlePart2 = value;
    }

    /**
     * Gets the value of the titlePart3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitlePart3() {
        return titlePart3;
    }

    /**
     * Sets the value of the titlePart3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitlePart3(String value) {
        this.titlePart3 = value;
    }

}
