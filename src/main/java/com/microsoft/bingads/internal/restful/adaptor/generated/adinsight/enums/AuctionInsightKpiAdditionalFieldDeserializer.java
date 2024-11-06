package com.microsoft.bingads.internal.restful.adaptor.generated.adinsight.enums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.bingads.v13.adinsight.AuctionInsightKpiAdditionalField;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AuctionInsightKpiAdditionalFieldDeserializer extends JsonDeserializer<Collection<AuctionInsightKpiAdditionalField>> {
	@Override
	public Collection<AuctionInsightKpiAdditionalField> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String s = p.getValueAsString();
		String[] strs = s.split(",");
		Collection<AuctionInsightKpiAdditionalField> res = new ArrayList<AuctionInsightKpiAdditionalField>();
		for (String str : strs)
		{
			res.add(Enum.valueOf(AuctionInsightKpiAdditionalField.class, AdaptorUtil.convertStringToEnumValue(str.trim())));
		}
		return res;
	}
}
