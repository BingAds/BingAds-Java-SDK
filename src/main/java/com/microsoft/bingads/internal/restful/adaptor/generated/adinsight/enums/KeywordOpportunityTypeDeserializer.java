package com.microsoft.bingads.internal.restful.adaptor.generated.adinsight.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.adinsight.KeywordOpportunityType;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class KeywordOpportunityTypeDeserializer extends JsonDeserializer<Collection<KeywordOpportunityType>> {
	@Override
	public Collection<KeywordOpportunityType> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<KeywordOpportunityType> res = new ArrayList<KeywordOpportunityType>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(KeywordOpportunityType.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
