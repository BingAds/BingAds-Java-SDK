
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
 *         <element name="AudienceGroupIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="ReturnAdditionalFields" type="{https://bingads.microsoft.com/CampaignManagement/v13}AudienceGroupAdditionalField" minOccurs="0"/>
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
    "audienceGroupIds",
    "returnAdditionalFields"
})
@XmlRootElement(name = "GetAudienceGroupsByIdsRequest")
public class GetAudienceGroupsByIdsRequest {

    @XmlElement(name = "AudienceGroupIds", nillable = true)
    protected ArrayOflong audienceGroupIds;
    @XmlElement(name = "ReturnAdditionalFields", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected Collection<AudienceGroupAdditionalField> returnAdditionalFields;

    /**
     * Gets the value of the audienceGroupIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getAudienceGroupIds() {
        return audienceGroupIds;
    }

    /**
     * Sets the value of the audienceGroupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setAudienceGroupIds(ArrayOflong value) {
        this.audienceGroupIds = value;
    }

    /**
     * Gets the value of the returnAdditionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AudienceGroupAdditionalField> getReturnAdditionalFields() {
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
    public void setReturnAdditionalFields(Collection<AudienceGroupAdditionalField> value) {
        this.returnAdditionalFields = value;
    }

}
