package com.microsoft.bingads.internal.restful.adaptor.generated.adinsight.enums;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.adinsight.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForComplexTypesWithEnumList {
	public static void AddMixInForComplexTypesWithEnumList() {
				AdaptorUtil.mapper.addMixIn(GetBidOpportunitiesRequest.class, GetBidOpportunitiesRequestEnumsMixIn.class);
				AdaptorUtil.mapper.addMixIn(GetKeywordOpportunitiesRequest.class, GetKeywordOpportunitiesRequestEnumsMixIn.class);
				AdaptorUtil.mapper.addMixIn(GetAuctionInsightDataRequest.class, GetAuctionInsightDataRequestEnumsMixIn.class);
			}
}