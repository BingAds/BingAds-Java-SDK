
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuctionInsightAvailableEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuctionInsightAvailableEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsValidAuctionInsightData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionInsightAvailableEntry", propOrder = {
    "entityId",
    "entityName",
    "isValidAuctionInsightData"
})
public class AuctionInsightAvailableEntry {

    @XmlElement(name = "EntityId")
    protected Long entityId;
    @XmlElement(name = "EntityName", nillable = true)
    protected String entityName;
    @XmlElement(name = "IsValidAuctionInsightData")
    protected Boolean isValidAuctionInsightData;

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntityId(Long value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the isValidAuctionInsightData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsValidAuctionInsightData() {
        return isValidAuctionInsightData;
    }

    /**
     * Sets the value of the isValidAuctionInsightData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValidAuctionInsightData(Boolean value) {
        this.isValidAuctionInsightData = value;
    }

}
