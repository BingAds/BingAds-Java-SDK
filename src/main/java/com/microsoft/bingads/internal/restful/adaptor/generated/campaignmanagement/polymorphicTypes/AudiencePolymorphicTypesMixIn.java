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
						
			@JsonSubTypes.Type(value = RemarketingList.class, name = "RemarketingList"),
						
			@JsonSubTypes.Type(value = CustomAudience.class, name = "Custom"),
						
			@JsonSubTypes.Type(value = InMarketAudience.class, name = "InMarket"),
						
			@JsonSubTypes.Type(value = ProductAudience.class, name = "Product"),
						
			@JsonSubTypes.Type(value = SimilarRemarketingList.class, name = "SimilarRemarketingList"),
						
			@JsonSubTypes.Type(value = CombinedList.class, name = "CombinedList"),
						
			@JsonSubTypes.Type(value = CustomerList.class, name = "CustomerList"),
				    })
@JsonInclude(JsonInclude.Include.NON_NULL)

public interface AudiencePolymorphicTypesMixIn extends AudienceEnumsMixIn{

}