package com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.reporting.DeviceTypeReportFilter;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class DeviceTypeReportFilterDeserializer extends JsonDeserializer<Collection<DeviceTypeReportFilter>> {
	@Override
	public Collection<DeviceTypeReportFilter> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<DeviceTypeReportFilter> res = new ArrayList<DeviceTypeReportFilter>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(DeviceTypeReportFilter.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
