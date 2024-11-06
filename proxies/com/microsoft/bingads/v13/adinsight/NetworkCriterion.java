
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NetworkCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}Criterion">
 *       <sequence>
 *         <element name="Network" type="{https://bingads.microsoft.com/AdInsight/v13}NetworkType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkCriterion", propOrder = {
    "network"
})
public class NetworkCriterion
    extends Criterion
{
    public NetworkCriterion() {
      this.type = "NetworkCriterion";
    }

    @XmlElement(name = "Network")
    @XmlSchemaType(name = "string")
    protected NetworkType network;

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkType }
     *     
     */
    public NetworkType getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkType }
     *     
     */
    public void setNetwork(NetworkType value) {
        this.network = value;
    }

}
