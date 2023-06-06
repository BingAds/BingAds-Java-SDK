
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsMessageParameter">
 *       &lt;sequence>
 *         &lt;element name="EntityCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EntityDetails" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfEntityDetail" minOccurs="0"/>
 *         &lt;element name="EntityType" type="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsEntityType" minOccurs="0"/>
 *         &lt;element name="SuggestedText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityParameter", propOrder = {
    "entityCount",
    "entityDetails",
    "entityType",
    "suggestedText"
})
public class EntityParameter
    extends PerformanceInsightsMessageParameter
{

    @XmlElement(name = "EntityCount")
    protected Integer entityCount;
    @XmlElement(name = "EntityDetails", nillable = true)
    protected ArrayOfEntityDetail entityDetails;
    @XmlElement(name = "EntityType")
    @XmlSchemaType(name = "string")
    protected PerformanceInsightsEntityType entityType;
    @XmlElement(name = "SuggestedText", nillable = true)
    protected String suggestedText;

    /**
     * Gets the value of the entityCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntityCount() {
        return entityCount;
    }

    /**
     * Sets the value of the entityCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntityCount(Integer value) {
        this.entityCount = value;
    }

    /**
     * Gets the value of the entityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityDetail }
     *     
     */
    public ArrayOfEntityDetail getEntityDetails() {
        return entityDetails;
    }

    /**
     * Sets the value of the entityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityDetail }
     *     
     */
    public void setEntityDetails(ArrayOfEntityDetail value) {
        this.entityDetails = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceInsightsEntityType }
     *     
     */
    public PerformanceInsightsEntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceInsightsEntityType }
     *     
     */
    public void setEntityType(PerformanceInsightsEntityType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the suggestedText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedText() {
        return suggestedText;
    }

    /**
     * Sets the value of the suggestedText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedText(String value) {
        this.suggestedText = value;
    }

}
