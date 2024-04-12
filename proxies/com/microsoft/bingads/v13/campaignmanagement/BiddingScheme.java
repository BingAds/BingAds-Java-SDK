
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BiddingScheme">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiddingScheme", propOrder = {
    "type"
})
@XmlSeeAlso({
    MaxClicksBiddingScheme.class,
    MaxConversionsBiddingScheme.class,
    TargetCpaBiddingScheme.class,
    ManualCpcBiddingScheme.class,
    EnhancedCpcBiddingScheme.class,
    ManualCpvBiddingScheme.class,
    ManualCpmBiddingScheme.class,
    InheritFromParentBiddingScheme.class,
    TargetRoasBiddingScheme.class,
    MaxRoasBiddingScheme.class,
    MaxConversionValueBiddingScheme.class,
    TargetImpressionShareBiddingScheme.class,
    PercentCpcBiddingScheme.class,
    CommissionBiddingScheme.class,
    ManualCpaBiddingScheme.class,
    CostPerSaleBiddingScheme.class
})
public class BiddingScheme {

    @XmlElement(name = "Type", nillable = true)
    protected String type;

    public BiddingScheme() {
        this.type = "BiddingScheme";
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {

    }

}
