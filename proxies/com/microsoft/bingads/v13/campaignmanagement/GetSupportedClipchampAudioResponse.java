
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
 *         <element name="Data" type="{https://bingads.microsoft.com/CampaignManagement/v13}SupportedClipchampAudioData" minOccurs="0"/>
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
    "data"
})
@XmlRootElement(name = "GetSupportedClipchampAudioResponse")
public class GetSupportedClipchampAudioResponse {

    @XmlElement(name = "Data", nillable = true)
    protected SupportedClipchampAudioData data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedClipchampAudioData }
     *     
     */
    public SupportedClipchampAudioData getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedClipchampAudioData }
     *     
     */
    public void setData(SupportedClipchampAudioData value) {
        this.data = value;
    }

}
