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
		  property = "Type",
		  visible = true)
	    @JsonSubTypes({
						
			@JsonSubTypes.Type(value = CampaignBudgetRecommendation.class, name = "CampaignBudgetRecommendation"),
						
			@JsonSubTypes.Type(value = KeywordRecommendation.class, name = "KeywordRecommendation"),
						
			@JsonSubTypes.Type(value = ResponsiveSearchAdRecommendation.class, name = "ResponsiveSearchAdRecommendation"),
						
			@JsonSubTypes.Type(value = RemoveConflictingNegativeKeywordRecommendation.class, name = "RemoveConflictingNegativeKeywordRecommendation"),
						
			@JsonSubTypes.Type(value = UseBroadMatchKeywordRecommendation.class, name = "UseBroadMatchKeywordRecommendation"),
						
			@JsonSubTypes.Type(value = ResponsiveSearchAdAssetRecommendation.class, name = "ResponsiveSearchAdAssetRecommendation"),
				    })
@JsonInclude(JsonInclude.Include.NON_NULL)

public interface RecommendationBasePolymorphicTypesMixIn{

}