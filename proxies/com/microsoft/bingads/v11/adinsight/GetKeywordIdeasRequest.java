
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExpandIdeas" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IdeaAttributes" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity.Common}ArrayOfKeywordIdeaAttribute" minOccurs="0"/>
 *         &lt;element name="SearchParameters" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity.SearchParameters}ArrayOfSearchParameter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "expandIdeas",
    "ideaAttributes",
    "searchParameters"
})
@XmlRootElement(name = "GetKeywordIdeasRequest", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11")
public class GetKeywordIdeasRequest {

    @XmlElement(name = "ExpandIdeas", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected Boolean expandIdeas;
    @XmlElement(name = "IdeaAttributes", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected ArrayOfKeywordIdeaAttribute ideaAttributes;
    @XmlElement(name = "SearchParameters", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected ArrayOfSearchParameter searchParameters;

    /**
     * Gets the value of the expandIdeas property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExpandIdeas() {
        return expandIdeas;
    }

    /**
     * Sets the value of the expandIdeas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpandIdeas(Boolean value) {
        this.expandIdeas = value;
    }

    /**
     * Gets the value of the ideaAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordIdeaAttribute }
     *     
     */
    public ArrayOfKeywordIdeaAttribute getIdeaAttributes() {
        return ideaAttributes;
    }

    /**
     * Sets the value of the ideaAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordIdeaAttribute }
     *     
     */
    public void setIdeaAttributes(ArrayOfKeywordIdeaAttribute value) {
        this.ideaAttributes = value;
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

}
