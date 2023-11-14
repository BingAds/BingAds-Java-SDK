
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicSearchAdsSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DynamicSearchAdsSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="DomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DynamicDescriptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PageFeedIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="Source" type="{https://bingads.microsoft.com/CampaignManagement/v13}DynamicSearchAdsSource" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicSearchAdsSetting", propOrder = {
    "domainName",
    "dynamicDescriptionEnabled",
    "language",
    "pageFeedIds",
    "source"
})
public class DynamicSearchAdsSetting
    extends Setting
{
    public DynamicSearchAdsSetting() {
      this.type = "DynamicSearchAdsSetting";
    }

    @XmlElement(name = "DomainName", nillable = true)
    protected String domainName;
    @XmlElement(name = "DynamicDescriptionEnabled", nillable = true)
    protected Boolean dynamicDescriptionEnabled;
    @XmlElement(name = "Language", nillable = true)
    protected String language;
    @XmlElement(name = "PageFeedIds", nillable = true)
    protected ArrayOflong pageFeedIds;
    @XmlElement(name = "Source", nillable = true)
    @XmlSchemaType(name = "string")
    protected DynamicSearchAdsSource source;

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the dynamicDescriptionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDynamicDescriptionEnabled() {
        return dynamicDescriptionEnabled;
    }

    /**
     * Sets the value of the dynamicDescriptionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicDescriptionEnabled(Boolean value) {
        this.dynamicDescriptionEnabled = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the pageFeedIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getPageFeedIds() {
        return pageFeedIds;
    }

    /**
     * Sets the value of the pageFeedIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setPageFeedIds(ArrayOflong value) {
        this.pageFeedIds = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicSearchAdsSource }
     *     
     */
    public DynamicSearchAdsSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicSearchAdsSource }
     *     
     */
    public void setSource(DynamicSearchAdsSource value) {
        this.source = value;
    }

}
