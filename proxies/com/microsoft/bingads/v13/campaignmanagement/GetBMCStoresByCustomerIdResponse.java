
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
 *         <element name="BMCStores" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBMCStore" minOccurs="0"/>
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
    "bmcStores"
})
@XmlRootElement(name = "GetBMCStoresByCustomerIdResponse")
public class GetBMCStoresByCustomerIdResponse {

    @XmlElement(name = "BMCStores", nillable = true)
    protected ArrayOfBMCStore bmcStores;

    /**
     * Gets the value of the bmcStores property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBMCStore }
     *     
     */
    public ArrayOfBMCStore getBMCStores() {
        return bmcStores;
    }

    /**
     * Sets the value of the bmcStores property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBMCStore }
     *     
     */
    public void setBMCStores(ArrayOfBMCStore value) {
        this.bmcStores = value;
    }

}
