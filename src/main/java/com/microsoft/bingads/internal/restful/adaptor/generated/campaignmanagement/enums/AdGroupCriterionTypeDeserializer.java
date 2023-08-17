package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.campaignmanagement.AdGroupCriterionType;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AdGroupCriterionTypeDeserializer extends JsonDeserializer<Collection<AdGroupCriterionType>> {
	@Override
	public Collection<AdGroupCriterionType> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<AdGroupCriterionType> res = new ArrayList<AdGroupCriterionType>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(AdGroupCriterionType.class, AdaptorUtil.convertStringToEnumValue(str.strip())));
		}
		return res;
	}
}
