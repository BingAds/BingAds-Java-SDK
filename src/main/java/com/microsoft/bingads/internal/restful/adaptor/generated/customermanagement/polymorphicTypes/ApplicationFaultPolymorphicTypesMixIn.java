package com.microsoft.bingads.internal.restful.adaptor.generated.customermanagement.polymorphicTypes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.customermanagement.*;
import com.microsoft.bingads.internal.restful.adaptor.*;
import com.microsoft.bingads.internal.restful.adaptor.generated.customermanagement.enums.*;

@JsonTypeInfo(
	      use = JsonTypeInfo.Id.NAME, 
	      include = JsonTypeInfo.As.EXISTING_PROPERTY,   
		  property = "Type")
	    @JsonSubTypes({
						
			@JsonSubTypes.Type(value = AdApiFaultDetail.class, name = "AdApiFaultDetail"),
						
			@JsonSubTypes.Type(value = ApiFault.class, name = "ApiFault"),
				    })
@JsonInclude(JsonInclude.Include.NON_NULL)

public interface ApplicationFaultPolymorphicTypesMixIn{

}