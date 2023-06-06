
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for HotelSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HotelSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="HotelAdGroupType" type="{https://bingads.microsoft.com/CampaignManagement/v13}HotelAdGroupType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelSetting", propOrder = {
    "hotelAdGroupType"
})
public class HotelSetting
    extends Setting
{

    @XmlElement(name = "HotelAdGroupType", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Collection<HotelAdGroupType> hotelAdGroupType;

    /**
     * Gets the value of the hotelAdGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<HotelAdGroupType> getHotelAdGroupType() {
        return hotelAdGroupType;
    }

    /**
     * Sets the value of the hotelAdGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelAdGroupType(Collection<HotelAdGroupType> value) {
        this.hotelAdGroupType = value;
    }

}
