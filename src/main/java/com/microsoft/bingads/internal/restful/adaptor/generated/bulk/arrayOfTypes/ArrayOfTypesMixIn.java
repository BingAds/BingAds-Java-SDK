package com.microsoft.bingads.internal.restful.adaptor.generated.bulk.arrayOfTypes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.bulk.*;
import com.microsoft.bingads.internal.restful.adaptor.*;
import com.microsoft.bingads.v13.bulk.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring;

@JsonInclude(JsonInclude.Include.NON_NULL)
interface ArrayOfTypesMixIn{
	    
	@JsonValue
	List<DownloadEntity> getDownloadEntities();

            
	@JsonValue
	List<BatchError> getBatchErrors();

            
	@JsonValue
	List<OperationError> getOperationErrors();

            
	@JsonValue
	List<CampaignScope> getCampaignScopes();

            
	@JsonValue
	List<Long> getLongs();

            
	@JsonValue
	List<KeyValueOfstringstring> getKeyValueOfstringstrings();

            
	@JsonValue
	List<String> getStrings();

            
	@JsonValue
	List<AdApiError> getAdApiErrors();

            
	@JsonValue
	List<KeyValuePairOfstringstring> getKeyValuePairOfstringstrings();

        }