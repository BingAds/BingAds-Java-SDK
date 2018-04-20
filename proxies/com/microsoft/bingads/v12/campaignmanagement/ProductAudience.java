
package com.microsoft.bingads.v12.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProductAudience complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAudience">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v12}Audience">
 *       &lt;sequence>
 *         &lt;element name="ProductAudienceType" type="{https://bingads.microsoft.com/CampaignManagement/v12}ProductAudienceType" minOccurs="0"/>
 *         &lt;element name="TagId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    @XmlElement(name = "ProductAudienceType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter8 .class)
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
