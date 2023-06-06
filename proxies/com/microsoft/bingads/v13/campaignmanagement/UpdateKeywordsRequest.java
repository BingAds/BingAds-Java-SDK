
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="Keywords" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfKeyword" minOccurs="0"/>
 *         <element name="ReturnInheritedBidStrategyTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "keywords",
    "returnInheritedBidStrategyTypes"
})
@XmlRootElement(name = "UpdateKeywordsRequest")
public class UpdateKeywordsRequest {

    @XmlElement(name = "AdGroupId")
    protected Long adGroupId;
    @XmlElement(name = "Keywords", nillable = true)
    protected ArrayOfKeyword keywords;
    @XmlElement(name = "ReturnInheritedBidStrategyTypes", nillable = true)
    protected Boolean returnInheritedBidStrategyTypes;

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
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyword }
     *     
     */
    public ArrayOfKeyword getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyword }
     *     
     */
    public void setKeywords(ArrayOfKeyword value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the returnInheritedBidStrategyTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getReturnInheritedBidStrategyTypes() {
        return returnInheritedBidStrategyTypes;
    }

    /**
     * Sets the value of the returnInheritedBidStrategyTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnInheritedBidStrategyTypes(Boolean value) {
        this.returnInheritedBidStrategyTypes = value;
    }

}
