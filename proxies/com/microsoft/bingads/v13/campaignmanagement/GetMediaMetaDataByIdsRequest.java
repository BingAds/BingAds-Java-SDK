
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         <element name="MediaIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="ReturnAdditionalFields" type="{https://bingads.microsoft.com/CampaignManagement/v13}MediaAdditionalField" minOccurs="0"/>
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
    "mediaIds",
    "returnAdditionalFields"
})
@XmlRootElement(name = "GetMediaMetaDataByIdsRequest")
public class GetMediaMetaDataByIdsRequest {

    @XmlElement(name = "MediaIds", nillable = true)
    protected ArrayOflong mediaIds;
    @XmlElement(name = "ReturnAdditionalFields", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter11 .class)
    protected Collection<MediaAdditionalField> returnAdditionalFields;

    /**
     * Gets the value of the mediaIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getMediaIds() {
        return mediaIds;
    }

    /**
     * Sets the value of the mediaIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setMediaIds(ArrayOflong value) {
        this.mediaIds = value;
    }

    /**
     * Gets the value of the returnAdditionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<MediaAdditionalField> getReturnAdditionalFields() {
        return returnAdditionalFields;
    }

    /**
     * Sets the value of the returnAdditionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAdditionalFields(Collection<MediaAdditionalField> value) {
        this.returnAdditionalFields = value;
    }

}
