package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.campaignmanagement.BMCStoreAdditionalField;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class BMCStoreAdditionalFieldDeserializer extends JsonDeserializer<Collection<BMCStoreAdditionalField>> {
	@Override
	public Collection<BMCStoreAdditionalField> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<BMCStoreAdditionalField> res = new ArrayList<BMCStoreAdditionalField>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(BMCStoreAdditionalField.class, AdaptorUtil.convertStringToEnumValue(str.strip())));
		}
		return res;
	}
}
