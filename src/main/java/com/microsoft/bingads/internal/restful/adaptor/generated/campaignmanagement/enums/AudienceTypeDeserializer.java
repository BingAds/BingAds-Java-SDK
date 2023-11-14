package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.campaignmanagement.AudienceType;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AudienceTypeDeserializer extends JsonDeserializer<Collection<AudienceType>> {
	@Override
	public Collection<AudienceType> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<AudienceType> res = new ArrayList<AudienceType>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(AudienceType.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
