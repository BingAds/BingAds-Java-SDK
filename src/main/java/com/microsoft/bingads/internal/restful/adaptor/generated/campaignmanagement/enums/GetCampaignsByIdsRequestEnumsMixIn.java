package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums;

import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.campaignmanagement.*;
import com.microsoft.bingads.internal.restful.adaptor.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public interface GetCampaignsByIdsRequestEnumsMixIn{
		
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = CampaignTypeDeserializer.class)
	Collection<CampaignType> getCampaignType();

    	
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = CampaignAdditionalFieldDeserializer.class)
	Collection<CampaignAdditionalField> getReturnAdditionalFields();

    }