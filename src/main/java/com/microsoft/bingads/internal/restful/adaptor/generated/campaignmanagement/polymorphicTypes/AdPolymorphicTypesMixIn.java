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
						
			@JsonSubTypes.Type(value = TextAd.class, name = "Text"),
						
			@JsonSubTypes.Type(value = ProductAd.class, name = "Product"),
						
			@JsonSubTypes.Type(value = HotelAd.class, name = "Hotel"),
						
			@JsonSubTypes.Type(value = AppInstallAd.class, name = "AppInstall"),
						
			@JsonSubTypes.Type(value = ExpandedTextAd.class, name = "ExpandedText"),
						
			@JsonSubTypes.Type(value = DynamicSearchAd.class, name = "DynamicSearch"),
						
			@JsonSubTypes.Type(value = ResponsiveAd.class, name = "ResponsiveAd"),
						
			@JsonSubTypes.Type(value = ResponsiveSearchAd.class, name = "ResponsiveSearch"),
				    })
@JsonInclude(JsonInclude.Include.NON_NULL)

public interface AdPolymorphicTypesMixIn{

}