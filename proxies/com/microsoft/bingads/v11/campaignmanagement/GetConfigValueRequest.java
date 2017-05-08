
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConfigKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "configKey"
})
@XmlRootElement(name = "GetConfigValueRequest")
public class GetConfigValueRequest {

    @XmlElement(name = "ConfigKey", nillable = true)
    protected String configKey;

    /**
     * Gets the value of the configKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigKey() {
        return configKey;
    }

    /**
     * Sets the value of the configKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigKey(String value) {
        this.configKey = value;
    }

}
