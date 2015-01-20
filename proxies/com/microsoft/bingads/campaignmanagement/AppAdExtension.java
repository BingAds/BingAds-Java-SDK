
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppAdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppAdExtension">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v9}AdExtension">
 *       &lt;sequence>
 *         &lt;element name="AppPlatform" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AppStoreId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DestinationUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DevicePreference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DisplayText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppAdExtension", propOrder = {
    "appPlatform",
    "appStoreId",
    "destinationUrl",
    "devicePreference",
    "displayText"
})
public class AppAdExtension
    extends AdExtension
{

    @XmlElement(name = "AppPlatform", required = true, nillable = true)
    protected String appPlatform;
    @XmlElement(name = "AppStoreId", required = true, nillable = true)
    protected String appStoreId;
    @XmlElement(name = "DestinationUrl", required = true, nillable = true)
    protected String destinationUrl;
    @XmlElement(name = "DevicePreference", nillable = true)
    protected Long devicePreference;
    @XmlElement(name = "DisplayText", required = true, nillable = true)
    protected String displayText;

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
     * Gets the value of the destinationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    /**
     * Sets the value of the destinationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUrl(String value) {
        this.destinationUrl = value;
    }

    /**
     * Gets the value of the devicePreference property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevicePreference() {
        return devicePreference;
    }

    /**
     * Sets the value of the devicePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevicePreference(Long value) {
        this.devicePreference = value;
    }

    /**
     * Gets the value of the displayText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Sets the value of the displayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayText(String value) {
        this.displayText = value;
    }

}
