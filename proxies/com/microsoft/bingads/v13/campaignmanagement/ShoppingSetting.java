
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShoppingSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ShoppingSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="FeedLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="LocalInventoryAdsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="SalesCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ShoppableAdsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="StoreId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingSetting", propOrder = {
    "feedLabel",
    "localInventoryAdsEnabled",
    "priority",
    "salesCountryCode",
    "shoppableAdsEnabled",
    "storeId"
})
public class ShoppingSetting
    extends Setting
{

    @XmlElement(name = "FeedLabel", nillable = true)
    protected String feedLabel;
    @XmlElement(name = "LocalInventoryAdsEnabled", nillable = true)
    protected Boolean localInventoryAdsEnabled;
    @XmlElement(name = "Priority", nillable = true)
    protected Integer priority;
    @XmlElement(name = "SalesCountryCode", nillable = true)
    protected String salesCountryCode;
    @XmlElement(name = "ShoppableAdsEnabled", nillable = true)
    protected Boolean shoppableAdsEnabled;
    @XmlElement(name = "StoreId", nillable = true)
    protected Long storeId;

    /**
     * Gets the value of the feedLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedLabel() {
        return feedLabel;
    }

    /**
     * Sets the value of the feedLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedLabel(String value) {
        this.feedLabel = value;
    }

    /**
     * Gets the value of the localInventoryAdsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLocalInventoryAdsEnabled() {
        return localInventoryAdsEnabled;
    }

    /**
     * Sets the value of the localInventoryAdsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalInventoryAdsEnabled(Boolean value) {
        this.localInventoryAdsEnabled = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the salesCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesCountryCode() {
        return salesCountryCode;
    }

    /**
     * Sets the value of the salesCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesCountryCode(String value) {
        this.salesCountryCode = value;
    }

    /**
     * Gets the value of the shoppableAdsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getShoppableAdsEnabled() {
        return shoppableAdsEnabled;
    }

    /**
     * Sets the value of the shoppableAdsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShoppableAdsEnabled(Boolean value) {
        this.shoppableAdsEnabled = value;
    }

    /**
     * Gets the value of the storeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStoreId() {
        return storeId;
    }

    /**
     * Sets the value of the storeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStoreId(Long value) {
        this.storeId = value;
    }

}
