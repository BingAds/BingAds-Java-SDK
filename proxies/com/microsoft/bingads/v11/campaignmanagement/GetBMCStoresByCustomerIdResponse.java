
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="BMCStores" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfBMCStore" minOccurs="0"/>
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
