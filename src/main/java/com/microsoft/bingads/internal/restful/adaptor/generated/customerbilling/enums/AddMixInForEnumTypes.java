package com.microsoft.bingads.internal.restful.adaptor.generated.customerbilling.enums;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.customerbilling.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForEnumTypes {
	public static void AddMixInForEnumTypes() {
		AdaptorUtil.mapper
				.addMixIn(DataType.class, DataTypeMixIn.class)
				.addMixIn(InsertionOrderStatus.class, InsertionOrderStatusMixIn.class)
				.addMixIn(InsertionOrderPendingChangesStatus.class, InsertionOrderPendingChangesStatusMixIn.class)
				.addMixIn(PredicateOperator.class, PredicateOperatorMixIn.class)
				.addMixIn(OrderByField.class, OrderByFieldMixIn.class)
				.addMixIn(SortOrder.class, SortOrderMixIn.class)
				.addMixIn(InsertionOrderAdditionalField.class, InsertionOrderAdditionalFieldMixIn.class)
				.addMixIn(AccountAdditionalField.class, AccountAdditionalFieldMixIn.class)
				;
	}
}