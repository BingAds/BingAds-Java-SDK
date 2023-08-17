
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProductScope">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="Conditions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfProductCondition" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductScope", propOrder = {
    "conditions"
})
public class ProductScope
    extends Criterion
{
    public ProductScope() {
      this.type = "ProductScope";
    }

    @XmlElement(name = "Conditions", nillable = true)
    protected ArrayOfProductCondition conditions;

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductCondition }
     *     
     */
    public ArrayOfProductCondition getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductCondition }
     *     
     */
    public void setConditions(ArrayOfProductCondition value) {
        this.conditions = value;
    }

}
