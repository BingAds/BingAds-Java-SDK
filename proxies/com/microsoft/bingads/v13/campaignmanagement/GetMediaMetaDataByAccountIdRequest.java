
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
 *         <element name="MediaEnabledEntities" type="{https://bingads.microsoft.com/CampaignManagement/v13}MediaEnabledEntityFilter" minOccurs="0"/>
 *         <element name="PageInfo" type="{https://bingads.microsoft.com/CampaignManagement/v13}Paging" minOccurs="0"/>
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
    "mediaEnabledEntities",
    "pageInfo",
    "returnAdditionalFields"
})
@XmlRootElement(name = "GetMediaMetaDataByAccountIdRequest")
public class GetMediaMetaDataByAccountIdRequest {

    @XmlElement(name = "MediaEnabledEntities", type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    protected Collection<MediaEnabledEntityFilter> mediaEnabledEntities;
    @XmlElement(name = "PageInfo", nillable = true)
    protected Paging pageInfo;
    @XmlElement(name = "ReturnAdditionalFields", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter11 .class)
    protected Collection<MediaAdditionalField> returnAdditionalFields;

    /**
     * Gets the value of the mediaEnabledEntities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<MediaEnabledEntityFilter> getMediaEnabledEntities() {
        return mediaEnabledEntities;
    }

    /**
     * Sets the value of the mediaEnabledEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaEnabledEntities(Collection<MediaEnabledEntityFilter> value) {
        this.mediaEnabledEntities = value;
    }

    /**
     * Gets the value of the pageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPageInfo() {
        return pageInfo;
    }

    /**
     * Sets the value of the pageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPageInfo(Paging value) {
        this.pageInfo = value;
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
