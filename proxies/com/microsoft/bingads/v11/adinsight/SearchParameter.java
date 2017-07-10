
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchParameter", namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity.SearchParameters")
@XmlSeeAlso({
    SuggestedBidSearchParameter.class,
    IdeaTextSearchParameter.class,
    LocationSearchParameter.class,
    UrlSearchParameter.class,
    NetworkSearchParameter.class,
    LanguageSearchParameter.class,
    QuerySearchParameter.class,
    ExcludeAccountKeywordsSearchParameter.class,
    ImpressionShareSearchParameter.class,
    DateRangeSearchParameter.class,
    CategorySearchParameter.class,
    DeviceSearchParameter.class,
    SearchVolumeSearchParameter.class,
    CompetitionSearchParameter.class
})
public class SearchParameter {


}
