
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NetworkSearchParameter">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter">
 *       <sequence>
 *         <element name="Network" type="{https://bingads.microsoft.com/AdInsight/v13}NetworkCriterion" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkSearchParameter", propOrder = {
    "network"
})
public class NetworkSearchParameter
    extends SearchParameter
{
    public NetworkSearchParameter() {
      this.type = "NetworkSearchParameter";
    }

    @XmlElement(name = "Network", nillable = true)
    protected NetworkCriterion network;

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkCriterion }
     *     
     */
    public NetworkCriterion getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkCriterion }
     *     
     */
    public void setNetwork(NetworkCriterion value) {
        this.network = value;
    }

}
