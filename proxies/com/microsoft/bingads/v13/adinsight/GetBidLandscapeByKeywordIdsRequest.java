
package com.microsoft.bingads.v13.adinsight;

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
 *         <element name="KeywordIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="IncludeCurrentBid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "keywordIds",
    "includeCurrentBid"
})
@XmlRootElement(name = "GetBidLandscapeByKeywordIdsRequest")
public class GetBidLandscapeByKeywordIdsRequest {

    @XmlElement(name = "KeywordIds", nillable = true)
    protected ArrayOflong keywordIds;
    @XmlElement(name = "IncludeCurrentBid", nillable = true)
    protected Boolean includeCurrentBid;

    /**
     * Gets the value of the keywordIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getKeywordIds() {
        return keywordIds;
    }

    /**
     * Sets the value of the keywordIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setKeywordIds(ArrayOflong value) {
        this.keywordIds = value;
    }

    /**
     * Gets the value of the includeCurrentBid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIncludeCurrentBid() {
        return includeCurrentBid;
    }

    /**
     * Sets the value of the includeCurrentBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCurrentBid(Boolean value) {
        this.includeCurrentBid = value;
    }

}
