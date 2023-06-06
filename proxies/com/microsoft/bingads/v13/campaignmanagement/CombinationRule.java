
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CombinationRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CombinationRule">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AudienceIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong"/>
 *         <element name="Operator" type="{https://bingads.microsoft.com/CampaignManagement/v13}LogicalOperator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CombinationRule", propOrder = {
    "audienceIds",
    "operator"
})
public class CombinationRule {

    @XmlElement(name = "AudienceIds", required = true, nillable = true)
    protected ArrayOflong audienceIds;
    @XmlElement(name = "Operator", required = true)
    @XmlSchemaType(name = "string")
    protected LogicalOperator operator;

    /**
     * Gets the value of the audienceIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getAudienceIds() {
        return audienceIds;
    }

    /**
     * Sets the value of the audienceIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setAudienceIds(ArrayOflong value) {
        this.audienceIds = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperator }
     *     
     */
    public LogicalOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperator }
     *     
     */
    public void setOperator(LogicalOperator value) {
        this.operator = value;
    }

}
