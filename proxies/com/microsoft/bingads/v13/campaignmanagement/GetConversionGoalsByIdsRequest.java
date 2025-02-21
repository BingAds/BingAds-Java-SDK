
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ConversionGoalIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="ConversionGoalTypes" type="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoalType" minOccurs="0"/>
 *         <element name="ReturnAdditionalFields" type="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoalAdditionalField" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conversionGoalIds",
    "conversionGoalTypes",
    "returnAdditionalFields"
})
@XmlRootElement(name = "GetConversionGoalsByIdsRequest")
public class GetConversionGoalsByIdsRequest {

    @XmlElement(name = "ConversionGoalIds", nillable = true)
    protected ArrayOflong conversionGoalIds;
    @XmlElement(name = "ConversionGoalTypes", type = String.class)
    @XmlJavaTypeAdapter(Adapter23 .class)
    protected Collection<ConversionGoalType> conversionGoalTypes;
    @XmlElement(name = "ReturnAdditionalFields", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter24 .class)
    protected Collection<ConversionGoalAdditionalField> returnAdditionalFields;

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

    /**
     * Gets the value of the returnAdditionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<ConversionGoalAdditionalField> getReturnAdditionalFields() {
        return returnAdditionalFields;
    }

    /**
     * Sets the value of the returnAdditionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAdditionalFields(Collection<ConversionGoalAdditionalField> value) {
        this.returnAdditionalFields = value;
    }

}
