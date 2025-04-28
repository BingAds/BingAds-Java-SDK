
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportedClipchampAudioData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SupportedClipchampAudioData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Audio" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfSupportedClipchampAudio" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportedClipchampAudioData", propOrder = {
    "audio"
})
public class SupportedClipchampAudioData {

    @XmlElement(name = "Audio", nillable = true)
    protected ArrayOfSupportedClipchampAudio audio;

    /**
     * Gets the value of the audio property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupportedClipchampAudio }
     *     
     */
    public ArrayOfSupportedClipchampAudio getAudio() {
        return audio;
    }

    /**
     * Sets the value of the audio property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupportedClipchampAudio }
     *     
     */
    public void setAudio(ArrayOfSupportedClipchampAudio value) {
        this.audio = value;
    }

}
