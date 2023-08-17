package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.campaignmanagement.CampaignCriterionType;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class CampaignCriterionTypeDeserializer extends JsonDeserializer<Collection<CampaignCriterionType>> {
	@Override
	public Collection<CampaignCriterionType> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<CampaignCriterionType> res = new ArrayList<CampaignCriterionType>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(CampaignCriterionType.class, AdaptorUtil.convertStringToEnumValue(str.strip())));
		}
		return res;
	}
}
