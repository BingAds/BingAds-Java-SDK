package com.microsoft.bingads.internal.restful.adaptor.generated.adinsight.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.adinsight.BidOpportunityType;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class BidOpportunityTypeDeserializer extends JsonDeserializer<Collection<BidOpportunityType>> {
	@Override
	public Collection<BidOpportunityType> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<BidOpportunityType> res = new ArrayList<BidOpportunityType>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(BidOpportunityType.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
