
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExperimentArm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExperimentArm">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CampaignIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="IsControlArm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="TrafficSplit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperimentArm", propOrder = {
    "campaignIds",
    "id",
    "isControlArm",
    "trafficSplit"
})
public class ExperimentArm {

    @XmlElement(name = "CampaignIds", nillable = true)
    protected ArrayOflong campaignIds;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "IsControlArm")
    protected Boolean isControlArm;
    @XmlElement(name = "TrafficSplit")
    protected Integer trafficSplit;

    /**
     * Gets the value of the campaignIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getCampaignIds() {
        return campaignIds;
    }

    /**
     * Sets the value of the campaignIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setCampaignIds(ArrayOflong value) {
        this.campaignIds = value;
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
     * Gets the value of the isControlArm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsControlArm() {
        return isControlArm;
    }

    /**
     * Sets the value of the isControlArm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsControlArm(Boolean value) {
        this.isControlArm = value;
    }

    /**
     * Gets the value of the trafficSplit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrafficSplit() {
        return trafficSplit;
    }

    /**
     * Sets the value of the trafficSplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrafficSplit(Integer value) {
        this.trafficSplit = value;
    }

}
