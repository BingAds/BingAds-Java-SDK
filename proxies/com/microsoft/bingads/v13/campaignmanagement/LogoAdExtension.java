
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogoAdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LogoAdExtension">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtension">
 *       <sequence>
 *         <element name="BusinessLogo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="BusinessLogoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogoAdExtension", propOrder = {
    "businessLogo",
    "businessLogoUrl",
    "businessName",
    "domainName"
})
public class LogoAdExtension
    extends AdExtension
{
    public LogoAdExtension() {
      this.type = "LogoAdExtension";
    }

    @XmlElement(name = "BusinessLogo", nillable = true)
    protected Long businessLogo;
    @XmlElement(name = "BusinessLogoUrl", nillable = true)
    protected String businessLogoUrl;
    @XmlElement(name = "BusinessName", nillable = true)
    protected String businessName;
    @XmlElement(name = "DomainName", nillable = true)
    protected String domainName;

    /**
     * Gets the value of the businessLogo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusinessLogo() {
        return businessLogo;
    }

    /**
     * Sets the value of the businessLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusinessLogo(Long value) {
        this.businessLogo = value;
    }

    /**
     * Gets the value of the businessLogoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessLogoUrl() {
        return businessLogoUrl;
    }

    /**
     * Sets the value of the businessLogoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessLogoUrl(String value) {
        this.businessLogoUrl = value;
    }

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

}
