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
						
			@JsonSubTypes.Type(value = LocationAdExtension.class, name = "LocationAdExtension"),
						
			@JsonSubTypes.Type(value = CallAdExtension.class, name = "CallAdExtension"),
						
			@JsonSubTypes.Type(value = ImageAdExtension.class, name = "ImageAdExtension"),
						
			@JsonSubTypes.Type(value = AppAdExtension.class, name = "AppAdExtension"),
						
			@JsonSubTypes.Type(value = ReviewAdExtension.class, name = "ReviewAdExtension"),
						
			@JsonSubTypes.Type(value = CalloutAdExtension.class, name = "CalloutAdExtension"),
						
			@JsonSubTypes.Type(value = SitelinkAdExtension.class, name = "SitelinkAdExtension"),
						
			@JsonSubTypes.Type(value = ActionAdExtension.class, name = "ActionAdExtension"),
						
			@JsonSubTypes.Type(value = StructuredSnippetAdExtension.class, name = "StructuredSnippetAdExtension"),
						
			@JsonSubTypes.Type(value = PriceAdExtension.class, name = "PriceAdExtension"),
						
			@JsonSubTypes.Type(value = PromotionAdExtension.class, name = "PromotionAdExtension"),
						
			@JsonSubTypes.Type(value = FilterLinkAdExtension.class, name = "FilterLinkAdExtension"),
						
			@JsonSubTypes.Type(value = FlyerAdExtension.class, name = "FlyerAdExtension"),
						
			@JsonSubTypes.Type(value = VideoAdExtension.class, name = "VideoAdExtension"),
						
			@JsonSubTypes.Type(value = DisclaimerAdExtension.class, name = "DisclaimerAdExtension"),
				    })
@JsonInclude(JsonInclude.Include.NON_NULL)

public interface AdExtensionPolymorphicTypesMixIn{

}