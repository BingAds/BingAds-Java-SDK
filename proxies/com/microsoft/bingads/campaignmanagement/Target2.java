
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Target2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Target2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Age" type="{https://bingads.microsoft.com/CampaignManagement/v9}AgeTarget" minOccurs="0"/>
 *         &lt;element name="DayTime" type="{https://bingads.microsoft.com/CampaignManagement/v9}DayTimeTarget" minOccurs="0"/>
 *         &lt;element name="DeviceOS" type="{https://bingads.microsoft.com/CampaignManagement/v9}DeviceOSTarget" minOccurs="0"/>
 *         &lt;element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         &lt;element name="Gender" type="{https://bingads.microsoft.com/CampaignManagement/v9}GenderTarget" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IsLibraryTarget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Location" type="{https://bingads.microsoft.com/CampaignManagement/v9}LocationTarget2" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Network" type="{https://bingads.microsoft.com/CampaignManagement/v9}NetworkTarget" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Target2", propOrder = {
    "age",
    "dayTime",
    "deviceOS",
    "forwardCompatibilityMap",
    "gender",
    "id",
    "isLibraryTarget",
    "location",
    "name",
    "network"
})
public class Target2 {

    @XmlElement(name = "Age", nillable = true)
    protected AgeTarget age;
    @XmlElement(name = "DayTime", nillable = true)
    protected DayTimeTarget dayTime;
    @XmlElement(name = "DeviceOS", nillable = true)
    protected DeviceOSTarget deviceOS;
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "Gender", nillable = true)
    protected GenderTarget gender;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "IsLibraryTarget", nillable = true)
    protected Boolean isLibraryTarget;
    @XmlElement(name = "Location", nillable = true)
    protected LocationTarget2 location;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Network", nillable = true)
    protected NetworkTarget network;

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link AgeTarget }
     *     
     */
    public AgeTarget getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeTarget }
     *     
     */
    public void setAge(AgeTarget value) {
        this.age = value;
    }

    /**
     * Gets the value of the dayTime property.
     * 
     * @return
     *     possible object is
     *     {@link DayTimeTarget }
     *     
     */
    public DayTimeTarget getDayTime() {
        return dayTime;
    }

    /**
     * Sets the value of the dayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTimeTarget }
     *     
     */
    public void setDayTime(DayTimeTarget value) {
        this.dayTime = value;
    }

    /**
     * Gets the value of the deviceOS property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceOSTarget }
     *     
     */
    public DeviceOSTarget getDeviceOS() {
        return deviceOS;
    }

    /**
     * Sets the value of the deviceOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceOSTarget }
     *     
     */
    public void setDeviceOS(DeviceOSTarget value) {
        this.deviceOS = value;
    }

    /**
     * Gets the value of the forwardCompatibilityMap property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public ArrayOfKeyValuePairOfstringstring getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }

    /**
     * Sets the value of the forwardCompatibilityMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public void setForwardCompatibilityMap(ArrayOfKeyValuePairOfstringstring value) {
        this.forwardCompatibilityMap = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderTarget }
     *     
     */
    public GenderTarget getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderTarget }
     *     
     */
    public void setGender(GenderTarget value) {
        this.gender = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the isLibraryTarget property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsLibraryTarget() {
        return isLibraryTarget;
    }

    /**
     * Sets the value of the isLibraryTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLibraryTarget(Boolean value) {
        this.isLibraryTarget = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTarget2 }
     *     
     */
    public LocationTarget2 getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTarget2 }
     *     
     */
    public void setLocation(LocationTarget2 value) {
        this.location = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkTarget }
     *     
     */
    public NetworkTarget getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkTarget }
     *     
     */
    public void setNetwork(NetworkTarget value) {
        this.network = value;
    }

}
