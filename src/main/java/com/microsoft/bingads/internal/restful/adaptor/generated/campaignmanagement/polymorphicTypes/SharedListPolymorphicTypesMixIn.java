package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.polymorphicTypes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.campaignmanagement.*;
import com.microsoft.bingads.internal.restful.adaptor.*;
import com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums.*;

@JsonTypeInfo(
	      use = JsonTypeInfo.Id.NAME, 
	      include = JsonTypeInfo.As.EXISTING_PROPERTY,   
		  property = "Type",
		  visible = true)
	    @JsonSubTypes({
						
			@JsonSubTypes.Type(value = NegativeKeywordList.class, name = "NegativeKeywordList"),
						
			@JsonSubTypes.Type(value = PlacementExclusionList.class, name = "PlacementExclusionList"),
						
			@JsonSubTypes.Type(value = AccountNegativeKeywordList.class, name = "AccountNegativeKeywordList"),
						
			@JsonSubTypes.Type(value = BrandList.class, name = "BrandList"),
						
			@JsonSubTypes.Type(value = AccountPlacementExclusionList.class, name = "AccountPlacementExclusionList"),
						
			@JsonSubTypes.Type(value = AccountPlacementInclusionList.class, name = "AccountPlacementInclusionList"),
				    })
@JsonInclude(JsonInclude.Include.NON_NULL)

public interface SharedListPolymorphicTypesMixIn{

}