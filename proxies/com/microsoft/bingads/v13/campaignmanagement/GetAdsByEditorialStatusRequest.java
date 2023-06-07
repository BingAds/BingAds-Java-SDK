
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="EditorialStatus" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdEditorialStatus" minOccurs="0"/>
 *         <element name="AdTypes" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdType" minOccurs="0"/>
 *         <element name="ReturnAdditionalFields" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdAdditionalField" minOccurs="0"/>
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
    "adGroupId",
    "editorialStatus",
    "adTypes",
    "returnAdditionalFields"
})
@XmlRootElement(name = "GetAdsByEditorialStatusRequest")
public class GetAdsByEditorialStatusRequest {

    @XmlElement(name = "AdGroupId")
    protected Long adGroupId;
    @XmlElement(name = "EditorialStatus")
    @XmlSchemaType(name = "string")
    protected AdEditorialStatus editorialStatus;
    @XmlElement(name = "AdTypes", nillable = true)
    protected ArrayOfAdType adTypes;
    @XmlElement(name = "ReturnAdditionalFields", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected Collection<AdAdditionalField> returnAdditionalFields;

    /**
     * Gets the value of the adGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the value of the adGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdGroupId(Long value) {
        this.adGroupId = value;
    }

    /**
     * Gets the value of the editorialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AdEditorialStatus }
     *     
     */
    public AdEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }

    /**
     * Sets the value of the editorialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdEditorialStatus }
     *     
     */
    public void setEditorialStatus(AdEditorialStatus value) {
        this.editorialStatus = value;
    }

    /**
     * Gets the value of the adTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdType }
     *     
     */
    public ArrayOfAdType getAdTypes() {
        return adTypes;
    }

    /**
     * Sets the value of the adTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdType }
     *     
     */
    public void setAdTypes(ArrayOfAdType value) {
        this.adTypes = value;
    }

    /**
     * Gets the value of the returnAdditionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdAdditionalField> getReturnAdditionalFields() {
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
    public void setReturnAdditionalFields(Collection<AdAdditionalField> value) {
        this.returnAdditionalFields = value;
    }

}
