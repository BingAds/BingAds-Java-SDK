
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
 *         <element name="AudioFilter" type="{https://bingads.microsoft.com/CampaignManagement/v13}AudioFilter" minOccurs="0"/>
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
    "audioFilter"
})
@XmlRootElement(name = "GetSupportedClipchampAudioRequest")
public class GetSupportedClipchampAudioRequest {

    @XmlElement(name = "AudioFilter", nillable = true)
    protected AudioFilter audioFilter;

    /**
     * Gets the value of the audioFilter property.
     * 
     * @return
     *     possible object is
     *     {@link AudioFilter }
     *     
     */
    public AudioFilter getAudioFilter() {
        return audioFilter;
    }

    /**
     * Sets the value of the audioFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioFilter }
     *     
     */
    public void setAudioFilter(AudioFilter value) {
        this.audioFilter = value;
    }

}
