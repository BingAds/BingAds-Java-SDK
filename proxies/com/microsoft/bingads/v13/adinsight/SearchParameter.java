
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SearchParameter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchParameter")
@XmlSeeAlso({
    QuerySearchParameter.class,
    UrlSearchParameter.class,
    CategorySearchParameter.class,
    SearchVolumeSearchParameter.class,
    SuggestedBidSearchParameter.class,
    IdeaTextSearchParameter.class,
    ExcludeAccountKeywordsSearchParameter.class,
    ImpressionShareSearchParameter.class,
    LocationSearchParameter.class,
    NetworkSearchParameter.class,
    DeviceSearchParameter.class,
    LanguageSearchParameter.class,
    CompetitionSearchParameter.class,
    DateRangeSearchParameter.class,
    AuctionSegmentSearchParameter.class
})
public class SearchParameter {


}
