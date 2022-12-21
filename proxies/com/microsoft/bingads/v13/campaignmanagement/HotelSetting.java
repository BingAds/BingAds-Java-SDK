
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for HotelSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       &lt;sequence>
 *         &lt;element name="HotelAdGroupType" type="{https://bingads.microsoft.com/CampaignManagement/v13}HotelAdGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
    @XmlJavaTypeAdapter(Adapter16 .class)
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
