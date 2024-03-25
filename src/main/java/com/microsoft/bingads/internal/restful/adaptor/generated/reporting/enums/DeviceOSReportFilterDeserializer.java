package com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.reporting.DeviceOSReportFilter;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class DeviceOSReportFilterDeserializer extends JsonDeserializer<Collection<DeviceOSReportFilter>> {
	@Override
	public Collection<DeviceOSReportFilter> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<DeviceOSReportFilter> res = new ArrayList<DeviceOSReportFilter>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(DeviceOSReportFilter.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
