package com.microsoft.bingads.internal.restful.adaptor.generated.customermanagement.enums;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.customermanagement.*;
import com.microsoft.bingads.internal.restful.adaptor.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public interface AccountAdditionalFieldMixIn{
	
	@JsonValue
	String value();

    @JsonCreator
	AccountAdditionalField fromValue(String v);

    }