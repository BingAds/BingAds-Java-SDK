
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticsSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DiagnosticsSettings">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EnableCache" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="LastCheckTimeUTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticsSettings", propOrder = {
    "enableCache",
    "lastCheckTimeUTC"
})
public class DiagnosticsSettings {

    @XmlElement(name = "EnableCache")
    protected Boolean enableCache;
    @XmlElement(name = "LastCheckTimeUTC", nillable = true)
    protected String lastCheckTimeUTC;

    /**
     * Gets the value of the enableCache property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEnableCache() {
        return enableCache;
    }

    /**
     * Sets the value of the enableCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCache(Boolean value) {
        this.enableCache = value;
    }

    /**
     * Gets the value of the lastCheckTimeUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastCheckTimeUTC() {
        return lastCheckTimeUTC;
    }

    /**
     * Sets the value of the lastCheckTimeUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCheckTimeUTC(String value) {
        this.lastCheckTimeUTC = value;
    }

}
