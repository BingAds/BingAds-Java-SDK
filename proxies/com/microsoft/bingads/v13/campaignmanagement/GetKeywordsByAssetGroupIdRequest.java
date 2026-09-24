
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
 *         <element name="AssetGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="ReturnAdditionalFields" type="{https://bingads.microsoft.com/CampaignManagement/v13}KeywordAdditionalField" minOccurs="0"/>
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
    "assetGroupId",
    "returnAdditionalFields"
})
@XmlRootElement(name = "GetKeywordsByAssetGroupIdRequest")
public class GetKeywordsByAssetGroupIdRequest {

    @XmlElement(name = "AssetGroupId")
    protected Long assetGroupId;
    @XmlElement(name = "ReturnAdditionalFields", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected Collection<KeywordAdditionalField> returnAdditionalFields;

    /**
     * Gets the value of the assetGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssetGroupId() {
        return assetGroupId;
    }

    /**
     * Sets the value of the assetGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssetGroupId(Long value) {
        this.assetGroupId = value;
    }

    /**
     * Gets the value of the returnAdditionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<KeywordAdditionalField> getReturnAdditionalFields() {
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
    public void setReturnAdditionalFields(Collection<KeywordAdditionalField> value) {
        this.returnAdditionalFields = value;
    }

}
