package com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.reporting.DynamicAdTargetStatusReportFilter;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class DynamicAdTargetStatusReportFilterDeserializer extends JsonDeserializer<Collection<DynamicAdTargetStatusReportFilter>> {
	@Override
	public Collection<DynamicAdTargetStatusReportFilter> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<DynamicAdTargetStatusReportFilter> res = new ArrayList<DynamicAdTargetStatusReportFilter>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(DynamicAdTargetStatusReportFilter.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
