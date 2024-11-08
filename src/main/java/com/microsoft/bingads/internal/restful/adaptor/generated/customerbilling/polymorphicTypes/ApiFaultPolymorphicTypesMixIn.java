package com.microsoft.bingads.internal.restful.adaptor.generated.customerbilling.polymorphicTypes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.customerbilling.*;
import com.microsoft.bingads.internal.restful.adaptor.*;
import com.microsoft.bingads.internal.restful.adaptor.generated.customerbilling.enums.*;

@JsonTypeInfo(
	      use = JsonTypeInfo.Id.NAME, 
	      include = JsonTypeInfo.As.EXISTING_PROPERTY,   
		  property = "Type",
		  visible = true)
	    @JsonSubTypes({
						
			@JsonSubTypes.Type(value = ApiBatchFault.class, name = "ApiBatchFault"),
				    })
@JsonInclude(JsonInclude.Include.NON_NULL)

public interface ApiFaultPolymorphicTypesMixIn{

}