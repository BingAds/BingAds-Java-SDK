
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfSupportedClipchampAudio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfSupportedClipchampAudio">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SupportedClipchampAudio" type="{https://bingads.microsoft.com/CampaignManagement/v13}SupportedClipchampAudio" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSupportedClipchampAudio", propOrder = {
    "supportedClipchampAudios"
})
public class ArrayOfSupportedClipchampAudio {

    @XmlElement(name = "SupportedClipchampAudio", nillable = true)
    protected List<SupportedClipchampAudio> supportedClipchampAudios;
    public ArrayOfSupportedClipchampAudio()
    {
      this.supportedClipchampAudios = new ArrayList<SupportedClipchampAudio>();
    }
    @JsonCreator
    public ArrayOfSupportedClipchampAudio(List<SupportedClipchampAudio> supportedclipchampaudios)
    {
      this.supportedClipchampAudios = supportedclipchampaudios;
    }

    /**
     * Gets the value of the supportedClipchampAudios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the supportedClipchampAudios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedClipchampAudios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportedClipchampAudio }
     * 
     * 
     * @return
     *     The value of the supportedClipchampAudios property.
     */
    public List<SupportedClipchampAudio> getSupportedClipchampAudios() {
        if (supportedClipchampAudios == null) {
            supportedClipchampAudios = new ArrayList<>();
        }
        return this.supportedClipchampAudios;
    }

}
