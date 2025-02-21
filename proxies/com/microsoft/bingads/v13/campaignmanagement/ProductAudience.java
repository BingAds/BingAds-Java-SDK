
package com.microsoft.bingads.v13.campaignmanagement;
import java.util.Collections;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProductAudience complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProductAudience">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Audience">
 *       <sequence>
 *         <element name="ProductAudienceType" type="{https://bingads.microsoft.com/CampaignManagement/v13}ProductAudienceType" minOccurs="0"/>
 *         <element name="TagId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAudience", propOrder = {
    "productAudienceType",
    "tagId"
})
public class ProductAudience
    extends Audience
{
    public ProductAudience() {
      this.type = Collections.singletonList(AudienceType.fromValue("Product"));
    }

    @XmlElement(name = "ProductAudienceType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter21 .class)
    protected Collection<ProductAudienceType> productAudienceType;
    @XmlElement(name = "TagId", nillable = true)
    protected Long tagId;

    /**
     * Gets the value of the productAudienceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<ProductAudienceType> getProductAudienceType() {
        return productAudienceType;
    }

    /**
     * Sets the value of the productAudienceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductAudienceType(Collection<ProductAudienceType> value) {
        this.productAudienceType = value;
    }

    /**
     * Gets the value of the tagId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * Sets the value of the tagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTagId(Long value) {
        this.tagId = value;
    }

}
