package com.microsoft.bingads.internal.restful.adaptor.generated.customermanagement.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.customermanagement.AccountAdditionalField;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AccountAdditionalFieldDeserializer extends JsonDeserializer<Collection<AccountAdditionalField>> {
	@Override
	public Collection<AccountAdditionalField> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<AccountAdditionalField> res = new ArrayList<AccountAdditionalField>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(AccountAdditionalField.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
