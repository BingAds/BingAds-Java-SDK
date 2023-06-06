
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditorialErrorCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EditorialErrorCollection">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}BatchErrorCollection">
 *       <sequence>
 *         <element name="Appealable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="DisapprovedText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PublisherCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditorialErrorCollection", propOrder = {
    "appealable",
    "disapprovedText",
    "location",
    "publisherCountry",
    "reasonCode"
})
public class EditorialErrorCollection
    extends BatchErrorCollection
{

    @XmlElement(name = "Appealable", nillable = true)
    protected Boolean appealable;
    @XmlElement(name = "DisapprovedText", nillable = true)
    protected String disapprovedText;
    @XmlElement(name = "Location", nillable = true)
    protected String location;
    @XmlElement(name = "PublisherCountry", nillable = true)
    protected String publisherCountry;
    @XmlElement(name = "ReasonCode")
    protected Integer reasonCode;

    /**
     * Gets the value of the appealable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAppealable() {
        return appealable;
    }

    /**
     * Sets the value of the appealable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppealable(Boolean value) {
        this.appealable = value;
    }

    /**
     * Gets the value of the disapprovedText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisapprovedText() {
        return disapprovedText;
    }

    /**
     * Sets the value of the disapprovedText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisapprovedText(String value) {
        this.disapprovedText = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the publisherCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherCountry() {
        return publisherCountry;
    }

    /**
     * Sets the value of the publisherCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherCountry(String value) {
        this.publisherCountry = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReasonCode(Integer value) {
        this.reasonCode = value;
    }

}
