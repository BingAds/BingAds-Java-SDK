package com.microsoft.bingads.internal.restful.adaptor.generated.customerbilling.enums;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.customerbilling.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForComplexTypesWithEnumList {
	public static void AddMixInForComplexTypesWithEnumList() {
				AdaptorUtil.mapper.addMixIn(SearchInsertionOrdersRequest.class, SearchInsertionOrdersRequestEnumsMixIn.class);
				AdaptorUtil.mapper.addMixIn(SearchCouponsRequest.class, SearchCouponsRequestEnumsMixIn.class);
			}
}