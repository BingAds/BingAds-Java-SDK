
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BidStrategy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BidStrategy">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssociatedCampaignType" type="{https://bingads.microsoft.com/CampaignManagement/v13}CampaignType" minOccurs="0"/>
 *         <element name="AssociationCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="BiddingScheme" type="{https://bingads.microsoft.com/CampaignManagement/v13}BiddingScheme" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidStrategy", propOrder = {
    "associatedCampaignType",
    "associationCount",
    "biddingScheme",
    "id",
    "name"
})
public class BidStrategy {

    @XmlElement(name = "AssociatedCampaignType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Collection<CampaignType> associatedCampaignType;
    @XmlElement(name = "AssociationCount", nillable = true)
    protected Integer associationCount;
    @XmlElement(name = "BiddingScheme", nillable = true)
    protected BiddingScheme biddingScheme;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "Name", nillable = true)
    protected String name;

    /**
     * Gets the value of the associatedCampaignType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<CampaignType> getAssociatedCampaignType() {
        return associatedCampaignType;
    }

    /**
     * Sets the value of the associatedCampaignType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedCampaignType(Collection<CampaignType> value) {
        this.associatedCampaignType = value;
    }

    /**
     * Gets the value of the associationCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssociationCount() {
        return associationCount;
    }

    /**
     * Sets the value of the associationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssociationCount(Integer value) {
        this.associationCount = value;
    }

    /**
     * Gets the value of the biddingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingScheme }
     *     
     */
    public BiddingScheme getBiddingScheme() {
        return biddingScheme;
    }

    /**
     * Sets the value of the biddingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingScheme }
     *     
     */
    public void setBiddingScheme(BiddingScheme value) {
        this.biddingScheme = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
