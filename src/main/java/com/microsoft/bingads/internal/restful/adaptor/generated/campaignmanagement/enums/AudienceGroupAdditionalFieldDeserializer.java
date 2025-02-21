package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.campaignmanagement.AudienceGroupAdditionalField;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AudienceGroupAdditionalFieldDeserializer extends JsonDeserializer<Collection<AudienceGroupAdditionalField>> {
	@Override
	public Collection<AudienceGroupAdditionalField> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<AudienceGroupAdditionalField> res = new ArrayList<AudienceGroupAdditionalField>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(AudienceGroupAdditionalField.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
