
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppInstallAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AppInstallAd">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Ad">
 *       <sequence>
 *         <element name="AppPlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AppStoreId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppInstallAd", propOrder = {
    "appPlatform",
    "appStoreId",
    "text",
    "title"
})
public class AppInstallAd
    extends Ad
{
    public AppInstallAd() {
      this.type = AdType.fromValue("AppInstall");
    }

    @XmlElement(name = "AppPlatform", nillable = true)
    protected String appPlatform;
    @XmlElement(name = "AppStoreId", nillable = true)
    protected String appStoreId;
    @XmlElement(name = "Text", nillable = true)
    protected String text;
    @XmlElement(name = "Title", nillable = true)
    protected String title;

    /**
     * Gets the value of the appPlatform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppPlatform() {
        return appPlatform;
    }

    /**
     * Sets the value of the appPlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPlatform(String value) {
        this.appPlatform = value;
    }

    /**
     * Gets the value of the appStoreId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppStoreId() {
        return appStoreId;
    }

    /**
     * Sets the value of the appStoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppStoreId(String value) {
        this.appStoreId = value;
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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
