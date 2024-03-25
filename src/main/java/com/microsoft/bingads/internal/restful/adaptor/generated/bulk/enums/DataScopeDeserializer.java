package com.microsoft.bingads.internal.restful.adaptor.generated.bulk.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.bulk.DataScope;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class DataScopeDeserializer extends JsonDeserializer<Collection<DataScope>> {
	@Override
	public Collection<DataScope> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<DataScope> res = new ArrayList<DataScope>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(DataScope.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
