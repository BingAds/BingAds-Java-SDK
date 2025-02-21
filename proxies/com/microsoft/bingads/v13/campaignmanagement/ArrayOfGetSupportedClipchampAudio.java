
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfGetSupportedClipchampAudio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfGetSupportedClipchampAudio">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GetSupportedClipchampAudio" type="{https://bingads.microsoft.com/CampaignManagement/v13}GetSupportedClipchampAudio" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetSupportedClipchampAudio", propOrder = {
    "getSupportedClipchampAudios"
})
public class ArrayOfGetSupportedClipchampAudio {

    @XmlElement(name = "GetSupportedClipchampAudio", nillable = true)
    protected List<GetSupportedClipchampAudio> getSupportedClipchampAudios;
    public ArrayOfGetSupportedClipchampAudio()
    {
      this.getSupportedClipchampAudios = new ArrayList<GetSupportedClipchampAudio>();
    }
    @JsonCreator
    public ArrayOfGetSupportedClipchampAudio(List<GetSupportedClipchampAudio> getsupportedclipchampaudios)
    {
      this.getSupportedClipchampAudios = getsupportedclipchampaudios;
    }

    /**
     * Gets the value of the getSupportedClipchampAudios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the getSupportedClipchampAudios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetSupportedClipchampAudios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetSupportedClipchampAudio }
     * 
     * 
     * @return
     *     The value of the getSupportedClipchampAudios property.
     */
    public List<GetSupportedClipchampAudio> getGetSupportedClipchampAudios() {
        if (getSupportedClipchampAudios == null) {
            getSupportedClipchampAudios = new ArrayList<>();
        }
        return this.getSupportedClipchampAudios;
    }

}
