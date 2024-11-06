package com.microsoft.bingads.internal.restful.adaptor.generated.customermanagement.enums;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.customermanagement.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForComplexTypesWithEnumList {
	public static void AddMixInForComplexTypesWithEnumList() {
				AdaptorUtil.mapper.addMixIn(GetAccountRequest.class, GetAccountRequestEnumsMixIn.class);
				AdaptorUtil.mapper.addMixIn(FindAccountsOrCustomersInfoRequest.class, FindAccountsOrCustomersInfoRequestEnumsMixIn.class);
				AdaptorUtil.mapper.addMixIn(SearchAccountsRequest.class, SearchAccountsRequestEnumsMixIn.class);
			}
}