
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConversionGoalIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="ConversionGoalTypes" type="{https://bingads.microsoft.com/CampaignManagement/v11}ConversionGoalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conversionGoalIds",
    "conversionGoalTypes"
})
@XmlRootElement(name = "GetConversionGoalsByIdsRequest")
public class GetConversionGoalsByIdsRequest {

    @XmlElement(name = "ConversionGoalIds", nillable = true)
    protected ArrayOflong conversionGoalIds;
    @XmlElement(name = "ConversionGoalTypes", type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    protected Collection<ConversionGoalType> conversionGoalTypes;

    /**
     * Gets the value of the conversionGoalIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getConversionGoalIds() {
        return conversionGoalIds;
    }

    /**
     * Sets the value of the conversionGoalIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setConversionGoalIds(ArrayOflong value) {
        this.conversionGoalIds = value;
    }

    /**
     * Gets the value of the conversionGoalTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<ConversionGoalType> getConversionGoalTypes() {
        return conversionGoalTypes;
    }

    /**
     * Sets the value of the conversionGoalTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionGoalTypes(Collection<ConversionGoalType> value) {
        this.conversionGoalTypes = value;
    }

}
