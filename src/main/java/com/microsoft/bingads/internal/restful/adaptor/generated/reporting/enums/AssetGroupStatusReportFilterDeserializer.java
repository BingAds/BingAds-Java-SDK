package com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.reporting.AssetGroupStatusReportFilter;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AssetGroupStatusReportFilterDeserializer extends JsonDeserializer<Collection<AssetGroupStatusReportFilter>> {
	@Override
	public Collection<AssetGroupStatusReportFilter> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<AssetGroupStatusReportFilter> res = new ArrayList<AssetGroupStatusReportFilter>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(AssetGroupStatusReportFilter.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
