package com.microsoft.bingads.internal.restful.adaptor.generated.adinsight.polymorphicTypes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.adinsight.*;
import com.microsoft.bingads.internal.restful.adaptor.*;
import com.microsoft.bingads.internal.restful.adaptor.generated.adinsight.enums.*;

@JsonTypeInfo(
	      use = JsonTypeInfo.Id.NAME, 
	      include = JsonTypeInfo.As.EXISTING_PROPERTY,   
		  property = "Type")
	    @JsonSubTypes({
						
			@JsonSubTypes.Type(value = QuerySearchParameter.class, name = "QuerySearchParameter"),
						
			@JsonSubTypes.Type(value = UrlSearchParameter.class, name = "UrlSearchParameter"),
						
			@JsonSubTypes.Type(value = CategorySearchParameter.class, name = "CategorySearchParameter"),
						
			@JsonSubTypes.Type(value = SearchVolumeSearchParameter.class, name = "SearchVolumeSearchParameter"),
						
			@JsonSubTypes.Type(value = SuggestedBidSearchParameter.class, name = "SuggestedBidSearchParameter"),
						
			@JsonSubTypes.Type(value = IdeaTextSearchParameter.class, name = "IdeaTextSearchParameter"),
						
			@JsonSubTypes.Type(value = ExcludeAccountKeywordsSearchParameter.class, name = "ExcludeAccountKeywordsSearchParameter"),
						
			@JsonSubTypes.Type(value = ImpressionShareSearchParameter.class, name = "ImpressionShareSearchParameter"),
						
			@JsonSubTypes.Type(value = LocationSearchParameter.class, name = "LocationSearchParameter"),
						
			@JsonSubTypes.Type(value = NetworkSearchParameter.class, name = "NetworkSearchParameter"),
						
			@JsonSubTypes.Type(value = DeviceSearchParameter.class, name = "DeviceSearchParameter"),
						
			@JsonSubTypes.Type(value = LanguageSearchParameter.class, name = "LanguageSearchParameter"),
						
			@JsonSubTypes.Type(value = CompetitionSearchParameter.class, name = "CompetitionSearchParameter"),
						
			@JsonSubTypes.Type(value = DateRangeSearchParameter.class, name = "DateRangeSearchParameter"),
						
			@JsonSubTypes.Type(value = AuctionSegmentSearchParameter.class, name = "AuctionSegmentSearchParameter"),
				    })
@JsonInclude(JsonInclude.Include.NON_NULL)

public interface SearchParameterPolymorphicTypesMixIn{

}