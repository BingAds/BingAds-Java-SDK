package com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.reporting.LanguageReportFilter;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class LanguageReportFilterDeserializer extends JsonDeserializer<Collection<LanguageReportFilter>> {
	@Override
	public Collection<LanguageReportFilter> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<LanguageReportFilter> res = new ArrayList<LanguageReportFilter>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(LanguageReportFilter.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
