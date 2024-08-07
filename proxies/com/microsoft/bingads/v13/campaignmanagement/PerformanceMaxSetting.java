
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformanceMaxSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PerformanceMaxSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="AutoGeneratedImageOptOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AutoGeneratedTextOptOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="CostPerSaleOptOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="FinalUrlExpansionOptOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="PageFeedIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMaxSetting", propOrder = {
    "autoGeneratedImageOptOut",
    "autoGeneratedTextOptOut",
    "costPerSaleOptOut",
    "finalUrlExpansionOptOut",
    "pageFeedIds"
})
public class PerformanceMaxSetting
    extends Setting
{
    public PerformanceMaxSetting() {
      this.type = "PerformanceMaxSetting";
    }

    @XmlElement(name = "AutoGeneratedImageOptOut", nillable = true)
    protected Boolean autoGeneratedImageOptOut;
    @XmlElement(name = "AutoGeneratedTextOptOut", nillable = true)
    protected Boolean autoGeneratedTextOptOut;
    @XmlElement(name = "CostPerSaleOptOut", nillable = true)
    protected Boolean costPerSaleOptOut;
    @XmlElement(name = "FinalUrlExpansionOptOut")
    protected Boolean finalUrlExpansionOptOut;
    @XmlElement(name = "PageFeedIds", nillable = true)
    protected ArrayOflong pageFeedIds;

    /**
     * Gets the value of the autoGeneratedImageOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutoGeneratedImageOptOut() {
        return autoGeneratedImageOptOut;
    }

    /**
     * Sets the value of the autoGeneratedImageOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoGeneratedImageOptOut(Boolean value) {
        this.autoGeneratedImageOptOut = value;
    }

    /**
     * Gets the value of the autoGeneratedTextOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutoGeneratedTextOptOut() {
        return autoGeneratedTextOptOut;
    }

    /**
     * Sets the value of the autoGeneratedTextOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoGeneratedTextOptOut(Boolean value) {
        this.autoGeneratedTextOptOut = value;
    }

    /**
     * Gets the value of the costPerSaleOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCostPerSaleOptOut() {
        return costPerSaleOptOut;
    }

    /**
     * Sets the value of the costPerSaleOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCostPerSaleOptOut(Boolean value) {
        this.costPerSaleOptOut = value;
    }

    /**
     * Gets the value of the finalUrlExpansionOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFinalUrlExpansionOptOut() {
        return finalUrlExpansionOptOut;
    }

    /**
     * Sets the value of the finalUrlExpansionOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalUrlExpansionOptOut(Boolean value) {
        this.finalUrlExpansionOptOut = value;
    }

    /**
     * Gets the value of the pageFeedIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getPageFeedIds() {
        return pageFeedIds;
    }

    /**
     * Sets the value of the pageFeedIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setPageFeedIds(ArrayOflong value) {
        this.pageFeedIds = value;
    }

}
