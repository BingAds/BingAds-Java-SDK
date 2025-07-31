
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
 *         <element name="TagIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="ReturnAdditionalFields" type="{https://bingads.microsoft.com/CampaignManagement/v13}UetTagAdditionalField" minOccurs="0"/>
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
    "tagIds",
    "returnAdditionalFields"
})
@XmlRootElement(name = "GetUetTagsByIdsRequest")
public class GetUetTagsByIdsRequest {

    @XmlElement(name = "TagIds", nillable = true)
    protected ArrayOflong tagIds;
    @XmlElement(name = "ReturnAdditionalFields", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter26 .class)
    protected Collection<UetTagAdditionalField> returnAdditionalFields;

    /**
     * Gets the value of the tagIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getTagIds() {
        return tagIds;
    }

    /**
     * Sets the value of the tagIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setTagIds(ArrayOflong value) {
        this.tagIds = value;
    }

    /**
     * Gets the value of the returnAdditionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<UetTagAdditionalField> getReturnAdditionalFields() {
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
    public void setReturnAdditionalFields(Collection<UetTagAdditionalField> value) {
        this.returnAdditionalFields = value;
    }

}
