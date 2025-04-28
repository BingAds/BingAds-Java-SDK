
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
 *         <element name="AdSubType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdSubType" minOccurs="0"/>
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
    "adSubType"
})
@XmlRootElement(name = "GetSupportedFontsRequest")
public class GetSupportedFontsRequest {

    @XmlElement(name = "AdSubType", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Collection<AdSubType> adSubType;

    /**
     * Gets the value of the adSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdSubType> getAdSubType() {
        return adSubType;
    }

    /**
     * Sets the value of the adSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdSubType(Collection<AdSubType> value) {
        this.adSubType = value;
    }

}
