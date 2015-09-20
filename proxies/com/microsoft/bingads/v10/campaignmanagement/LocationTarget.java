
package com.microsoft.bingads.v10.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CityTarget" type="{https://bingads.microsoft.com/CampaignManagement/v10}CityTarget" minOccurs="0"/>
 *         &lt;element name="CountryTarget" type="{https://bingads.microsoft.com/CampaignManagement/v10}CountryTarget" minOccurs="0"/>
 *         &lt;element name="IntentOption" type="{https://bingads.microsoft.com/CampaignManagement/v10}IntentOption" minOccurs="0"/>
 *         &lt;element name="MetroAreaTarget" type="{https://bingads.microsoft.com/CampaignManagement/v10}MetroAreaTarget" minOccurs="0"/>
 *         &lt;element name="PostalCodeTarget" type="{https://bingads.microsoft.com/CampaignManagement/v10}PostalCodeTarget" minOccurs="0"/>
 *         &lt;element name="RadiusTarget" type="{https://bingads.microsoft.com/CampaignManagement/v10}RadiusTarget" minOccurs="0"/>
 *         &lt;element name="StateTarget" type="{https://bingads.microsoft.com/CampaignManagement/v10}StateTarget" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationTarget", propOrder = {
    "cityTarget",
    "countryTarget",
    "intentOption",
    "metroAreaTarget",
    "postalCodeTarget",
    "radiusTarget",
    "stateTarget"
})
public class LocationTarget {

    @XmlElement(name = "CityTarget", nillable = true)
    protected CityTarget cityTarget;
    @XmlElement(name = "CountryTarget", nillable = true)
    protected CountryTarget countryTarget;
    @XmlElement(name = "IntentOption", nillable = true)
    @XmlSchemaType(name = "string")
    protected IntentOption intentOption;
    @XmlElement(name = "MetroAreaTarget", nillable = true)
    protected MetroAreaTarget metroAreaTarget;
    @XmlElement(name = "PostalCodeTarget", nillable = true)
    protected PostalCodeTarget postalCodeTarget;
    @XmlElement(name = "RadiusTarget", nillable = true)
    protected RadiusTarget radiusTarget;
    @XmlElement(name = "StateTarget", nillable = true)
    protected StateTarget stateTarget;

    /**
     * Gets the value of the cityTarget property.
     * 
     * @return
     *     possible object is
     *     {@link CityTarget }
     *     
     */
    public CityTarget getCityTarget() {
        return cityTarget;
    }

    /**
     * Sets the value of the cityTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityTarget }
     *     
     */
    public void setCityTarget(CityTarget value) {
        this.cityTarget = value;
    }

    /**
     * Gets the value of the countryTarget property.
     * 
     * @return
     *     possible object is
     *     {@link CountryTarget }
     *     
     */
    public CountryTarget getCountryTarget() {
        return countryTarget;
    }

    /**
     * Sets the value of the countryTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryTarget }
     *     
     */
    public void setCountryTarget(CountryTarget value) {
        this.countryTarget = value;
    }

    /**
     * Gets the value of the intentOption property.
     * 
     * @return
     *     possible object is
     *     {@link IntentOption }
     *     
     */
    public IntentOption getIntentOption() {
        return intentOption;
    }

    /**
     * Sets the value of the intentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntentOption }
     *     
     */
    public void setIntentOption(IntentOption value) {
        this.intentOption = value;
    }

    /**
     * Gets the value of the metroAreaTarget property.
     * 
     * @return
     *     possible object is
     *     {@link MetroAreaTarget }
     *     
     */
    public MetroAreaTarget getMetroAreaTarget() {
        return metroAreaTarget;
    }

    /**
     * Sets the value of the metroAreaTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetroAreaTarget }
     *     
     */
    public void setMetroAreaTarget(MetroAreaTarget value) {
        this.metroAreaTarget = value;
    }

    /**
     * Gets the value of the postalCodeTarget property.
     * 
     * @return
     *     possible object is
     *     {@link PostalCodeTarget }
     *     
     */
    public PostalCodeTarget getPostalCodeTarget() {
        return postalCodeTarget;
    }

    /**
     * Sets the value of the postalCodeTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCodeTarget }
     *     
     */
    public void setPostalCodeTarget(PostalCodeTarget value) {
        this.postalCodeTarget = value;
    }

    /**
     * Gets the value of the radiusTarget property.
     * 
     * @return
     *     possible object is
     *     {@link RadiusTarget }
     *     
     */
    public RadiusTarget getRadiusTarget() {
        return radiusTarget;
    }

    /**
     * Sets the value of the radiusTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadiusTarget }
     *     
     */
    public void setRadiusTarget(RadiusTarget value) {
        this.radiusTarget = value;
    }

    /**
     * Gets the value of the stateTarget property.
     * 
     * @return
     *     possible object is
     *     {@link StateTarget }
     *     
     */
    public StateTarget getStateTarget() {
        return stateTarget;
    }

    /**
     * Sets the value of the stateTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateTarget }
     *     
     */
    public void setStateTarget(StateTarget value) {
        this.stateTarget = value;
    }

}
