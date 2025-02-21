
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSupportedClipchampAudioData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GetSupportedClipchampAudioData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Audio" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfGetSupportedClipchampAudio" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupportedClipchampAudioData", propOrder = {
    "audio"
})
public class GetSupportedClipchampAudioData {

    @XmlElement(name = "Audio", nillable = true)
    protected ArrayOfGetSupportedClipchampAudio audio;

    /**
     * Gets the value of the audio property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGetSupportedClipchampAudio }
     *     
     */
    public ArrayOfGetSupportedClipchampAudio getAudio() {
        return audio;
    }

    /**
     * Sets the value of the audio property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGetSupportedClipchampAudio }
     *     
     */
    public void setAudio(ArrayOfGetSupportedClipchampAudio value) {
        this.audio = value;
    }

}
