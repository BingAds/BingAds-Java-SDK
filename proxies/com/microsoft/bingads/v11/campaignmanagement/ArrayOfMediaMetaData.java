
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMediaMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMediaMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MediaMetaData" type="{https://bingads.microsoft.com/CampaignManagement/v11}MediaMetaData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    /**
     * Gets the value of the mediaMetaDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaMetaDatas property.
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
     */
    public List<MediaMetaData> getMediaMetaDatas() {
        if (mediaMetaDatas == null) {
            mediaMetaDatas = new ArrayList<MediaMetaData>();
        }
        return this.mediaMetaDatas;
    }

}
