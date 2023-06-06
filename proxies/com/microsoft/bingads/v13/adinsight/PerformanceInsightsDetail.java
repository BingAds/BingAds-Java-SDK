
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformanceInsightsDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PerformanceInsightsDetail">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="EntityType" type="{https://bingads.microsoft.com/AdInsight/v13}EntityType" minOccurs="0"/>
 *         <element name="KPIType" type="{https://bingads.microsoft.com/AdInsight/v13}KPIType" minOccurs="0"/>
 *         <element name="Date" type="{https://bingads.microsoft.com/AdInsight/v13}DayMonthAndYear" minOccurs="0"/>
 *         <element name="Description" type="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsMessage" minOccurs="0"/>
 *         <element name="RootCauses" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfPerformanceInsightsMessage" minOccurs="0"/>
 *         <element name="Actions" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfPerformanceInsightsMessage" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceInsightsDetail", propOrder = {
    "entityId",
    "entityType",
    "kpiType",
    "date",
    "description",
    "rootCauses",
    "actions"
})
public class PerformanceInsightsDetail {

    @XmlElement(name = "EntityId")
    protected Long entityId;
    @XmlElement(name = "EntityType")
    @XmlSchemaType(name = "string")
    protected EntityType entityType;
    @XmlElement(name = "KPIType")
    @XmlSchemaType(name = "string")
    protected KPIType kpiType;
    @XmlElement(name = "Date", nillable = true)
    protected DayMonthAndYear date;
    @XmlElement(name = "Description", nillable = true)
    protected PerformanceInsightsMessage description;
    @XmlElement(name = "RootCauses", nillable = true)
    protected ArrayOfPerformanceInsightsMessage rootCauses;
    @XmlElement(name = "Actions", nillable = true)
    protected ArrayOfPerformanceInsightsMessage actions;

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
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setEntityType(EntityType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the kpiType property.
     * 
     * @return
     *     possible object is
     *     {@link KPIType }
     *     
     */
    public KPIType getKPIType() {
        return kpiType;
    }

    /**
     * Sets the value of the kpiType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KPIType }
     *     
     */
    public void setKPIType(KPIType value) {
        this.kpiType = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DayMonthAndYear }
     *     
     */
    public DayMonthAndYear getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayMonthAndYear }
     *     
     */
    public void setDate(DayMonthAndYear value) {
        this.date = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceInsightsMessage }
     *     
     */
    public PerformanceInsightsMessage getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceInsightsMessage }
     *     
     */
    public void setDescription(PerformanceInsightsMessage value) {
        this.description = value;
    }

    /**
     * Gets the value of the rootCauses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPerformanceInsightsMessage }
     *     
     */
    public ArrayOfPerformanceInsightsMessage getRootCauses() {
        return rootCauses;
    }

    /**
     * Sets the value of the rootCauses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPerformanceInsightsMessage }
     *     
     */
    public void setRootCauses(ArrayOfPerformanceInsightsMessage value) {
        this.rootCauses = value;
    }

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPerformanceInsightsMessage }
     *     
     */
    public ArrayOfPerformanceInsightsMessage getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPerformanceInsightsMessage }
     *     
     */
    public void setActions(ArrayOfPerformanceInsightsMessage value) {
        this.actions = value;
    }

}
