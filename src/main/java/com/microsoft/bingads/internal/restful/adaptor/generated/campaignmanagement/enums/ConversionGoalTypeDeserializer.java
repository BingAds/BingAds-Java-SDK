package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoalType;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class ConversionGoalTypeDeserializer extends JsonDeserializer<Collection<ConversionGoalType>> {
	@Override
	public Collection<ConversionGoalType> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<ConversionGoalType> res = new ArrayList<ConversionGoalType>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(ConversionGoalType.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
