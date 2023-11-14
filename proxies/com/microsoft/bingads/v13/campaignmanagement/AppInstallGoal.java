
package com.microsoft.bingads.v13.campaignmanagement;
import java.util.Collections;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppInstallGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AppInstallGoal">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoal">
 *       <sequence>
 *         <element name="AppPlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AppStoreId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppInstallGoal", propOrder = {
    "appPlatform",
    "appStoreId"
})
public class AppInstallGoal
    extends ConversionGoal
{
    public AppInstallGoal() {
      this.type = Collections.singletonList(ConversionGoalType.fromValue("AppInstall"));
    }

    @XmlElement(name = "AppPlatform", nillable = true)
    protected String appPlatform;
    @XmlElement(name = "AppStoreId", nillable = true)
    protected String appStoreId;

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

}
