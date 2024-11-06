package com.microsoft.bingads.internal.restful.adaptor.generated.customerbilling.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.customerbilling.InsertionOrderAdditionalField;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class InsertionOrderAdditionalFieldDeserializer extends JsonDeserializer<Collection<InsertionOrderAdditionalField>> {
	@Override
	public Collection<InsertionOrderAdditionalField> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<InsertionOrderAdditionalField> res = new ArrayList<InsertionOrderAdditionalField>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(InsertionOrderAdditionalField.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
