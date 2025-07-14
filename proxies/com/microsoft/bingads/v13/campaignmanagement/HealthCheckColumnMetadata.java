
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HealthCheckColumnMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HealthCheckColumnMetadata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HealthCheckActionLinksMetadata" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfHealthCheckActionLinkMetadata" minOccurs="0"/>
 *         <element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthCheckColumnMetadata", propOrder = {
    "healthCheckActionLinksMetadata",
    "key",
    "title",
    "type"
})
public class HealthCheckColumnMetadata {

    @XmlElement(name = "HealthCheckActionLinksMetadata", nillable = true)
    protected ArrayOfHealthCheckActionLinkMetadata healthCheckActionLinksMetadata;
    @XmlElement(name = "Key", nillable = true)
    protected String key;
    @XmlElement(name = "Title", nillable = true)
    protected String title;
    @XmlElement(name = "Type", nillable = true)
    protected String type;

    /**
     * Gets the value of the healthCheckActionLinksMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHealthCheckActionLinkMetadata }
     *     
     */
    public ArrayOfHealthCheckActionLinkMetadata getHealthCheckActionLinksMetadata() {
        return healthCheckActionLinksMetadata;
    }

    /**
     * Sets the value of the healthCheckActionLinksMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHealthCheckActionLinkMetadata }
     *     
     */
    public void setHealthCheckActionLinksMetadata(ArrayOfHealthCheckActionLinkMetadata value) {
        this.healthCheckActionLinksMetadata = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
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

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
