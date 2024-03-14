package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.campaignmanagement.AdExtensionsTypeFilter;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AdExtensionsTypeFilterDeserializer extends JsonDeserializer<Collection<AdExtensionsTypeFilter>> {
	@Override
	public Collection<AdExtensionsTypeFilter> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<AdExtensionsTypeFilter> res = new ArrayList<AdExtensionsTypeFilter>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(AdExtensionsTypeFilter.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
