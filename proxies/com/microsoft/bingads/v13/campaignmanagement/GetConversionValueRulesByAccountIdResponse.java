
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="ConversionValueRules" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfConversionValueRule" minOccurs="0"/>
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
    "conversionValueRules"
})
@XmlRootElement(name = "GetConversionValueRulesByAccountIdResponse")
public class GetConversionValueRulesByAccountIdResponse {

    @XmlElement(name = "ConversionValueRules", nillable = true)
    protected ArrayOfConversionValueRule conversionValueRules;

    /**
     * Gets the value of the conversionValueRules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConversionValueRule }
     *     
     */
    public ArrayOfConversionValueRule getConversionValueRules() {
        return conversionValueRules;
    }

    /**
     * Sets the value of the conversionValueRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConversionValueRule }
     *     
     */
    public void setConversionValueRules(ArrayOfConversionValueRule value) {
        this.conversionValueRules = value;
    }

}
