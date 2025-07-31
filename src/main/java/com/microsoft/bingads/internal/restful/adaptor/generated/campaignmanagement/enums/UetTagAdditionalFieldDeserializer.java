package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.campaignmanagement.UetTagAdditionalField;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class UetTagAdditionalFieldDeserializer extends JsonDeserializer<Collection<UetTagAdditionalField>> {
	@Override
	public Collection<UetTagAdditionalField> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<UetTagAdditionalField> res = new ArrayList<UetTagAdditionalField>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(UetTagAdditionalField.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
