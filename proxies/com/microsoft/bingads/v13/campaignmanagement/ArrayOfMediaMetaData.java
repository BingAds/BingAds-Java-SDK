
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfMediaMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfMediaMetaData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MediaMetaData" type="{https://bingads.microsoft.com/CampaignManagement/v13}MediaMetaData" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMediaMetaData", propOrder = {
    "mediaMetaDatas"
})
public class ArrayOfMediaMetaData {

    @XmlElement(name = "MediaMetaData", nillable = true)
    protected List<MediaMetaData> mediaMetaDatas;
    public ArrayOfMediaMetaData()
    {
      this.mediaMetaDatas = new ArrayList<MediaMetaData>();
    }
    @JsonCreator
    public ArrayOfMediaMetaData(List<MediaMetaData> mediametadatas)
    {
      this.mediaMetaDatas = mediametadatas;
    }

    /**
     * Gets the value of the mediaMetaDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mediaMetaDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaMetaDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaMetaData }
     * 
     * 
     * @return
     *     The value of the mediaMetaDatas property.
     */
    public List<MediaMetaData> getMediaMetaDatas() {
        if (mediaMetaDatas == null) {
            mediaMetaDatas = new ArrayList<>();
        }
        return this.mediaMetaDatas;
    }

}
