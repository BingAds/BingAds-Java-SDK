package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.campaignmanagement.AdGroupAdditionalField;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AdGroupAdditionalFieldDeserializer extends JsonDeserializer<Collection<AdGroupAdditionalField>> {
	@Override
	public Collection<AdGroupAdditionalField> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<AdGroupAdditionalField> res = new ArrayList<AdGroupAdditionalField>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(AdGroupAdditionalField.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
