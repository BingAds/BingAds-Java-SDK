
package com.microsoft.bingads.v13.campaignmanagement;
import java.util.Collections;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomSegment">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Audience">
 *       <sequence>
 *         <element name="CustomSegmentCatalogList" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfCustomSegmentCatalog" minOccurs="0"/>
 *         <element name="EditorialStatus" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomSegmentEditorialStatus" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomSegment", propOrder = {
    "customSegmentCatalogList",
    "editorialStatus"
})
public class CustomSegment
    extends Audience
{
    public CustomSegment() {
      this.type = Collections.singletonList(AudienceType.fromValue("CustomSegment"));
    }

    @XmlElement(name = "CustomSegmentCatalogList", nillable = true)
    protected ArrayOfCustomSegmentCatalog customSegmentCatalogList;
    @XmlElement(name = "EditorialStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected CustomSegmentEditorialStatus editorialStatus;

    /**
     * Gets the value of the customSegmentCatalogList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomSegmentCatalog }
     *     
     */
    public ArrayOfCustomSegmentCatalog getCustomSegmentCatalogList() {
        return customSegmentCatalogList;
    }

    /**
     * Sets the value of the customSegmentCatalogList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomSegmentCatalog }
     *     
     */
    public void setCustomSegmentCatalogList(ArrayOfCustomSegmentCatalog value) {
        this.customSegmentCatalogList = value;
    }

    /**
     * Gets the value of the editorialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSegmentEditorialStatus }
     *     
     */
    public CustomSegmentEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }

    /**
     * Sets the value of the editorialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSegmentEditorialStatus }
     *     
     */
    public void setEditorialStatus(CustomSegmentEditorialStatus value) {
        this.editorialStatus = value;
    }

}
