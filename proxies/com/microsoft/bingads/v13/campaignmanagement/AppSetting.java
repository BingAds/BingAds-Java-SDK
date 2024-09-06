
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AppSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AppSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="AppId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AppStore" type="{https://bingads.microsoft.com/CampaignManagement/v13}AppStore" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppSetting", propOrder = {
    "appId",
    "appStore"
})
public class AppSetting
    extends Setting
{
    public AppSetting() {
      this.type = "AppSetting";
    }

    @XmlElement(name = "AppId", nillable = true)
    protected String appId;
    @XmlElement(name = "AppStore", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Collection<AppStore> appStore;

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * Gets the value of the appStore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AppStore> getAppStore() {
        return appStore;
    }

    /**
     * Sets the value of the appStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppStore(Collection<AppStore> value) {
        this.appStore = value;
    }

}
