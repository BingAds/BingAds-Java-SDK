
package com.microsoft.bingads.v13.adinsight;

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
 *         <element name="EntityType" type="{https://bingads.microsoft.com/AdInsight/v13}EntityType" minOccurs="0"/>
 *         <element name="EntityIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="SearchParameters" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfSearchParameter" minOccurs="0"/>
 *         <element name="ReturnAdditionalFields" type="{https://bingads.microsoft.com/AdInsight/v13}AuctionInsightKpiAdditionalField" minOccurs="0"/>
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
    "entityType",
    "entityIds",
    "searchParameters",
    "returnAdditionalFields"
})
@XmlRootElement(name = "GetAuctionInsightDataRequest")
public class GetAuctionInsightDataRequest {

    @XmlElement(name = "EntityType")
    @XmlSchemaType(name = "string")
    protected EntityType entityType;
    @XmlElement(name = "EntityIds", nillable = true)
    protected ArrayOflong entityIds;
    @XmlElement(name = "SearchParameters", nillable = true)
    protected ArrayOfSearchParameter searchParameters;
    @XmlElement(name = "ReturnAdditionalFields", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Collection<AuctionInsightKpiAdditionalField> returnAdditionalFields;

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setEntityType(EntityType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the entityIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getEntityIds() {
        return entityIds;
    }

    /**
     * Sets the value of the entityIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setEntityIds(ArrayOflong value) {
        this.entityIds = value;
    }

    /**
     * Gets the value of the searchParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchParameter }
     *     
     */
    public ArrayOfSearchParameter getSearchParameters() {
        return searchParameters;
    }

    /**
     * Sets the value of the searchParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchParameter }
     *     
     */
    public void setSearchParameters(ArrayOfSearchParameter value) {
        this.searchParameters = value;
    }

    /**
     * Gets the value of the returnAdditionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AuctionInsightKpiAdditionalField> getReturnAdditionalFields() {
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
    public void setReturnAdditionalFields(Collection<AuctionInsightKpiAdditionalField> value) {
        this.returnAdditionalFields = value;
    }

}
