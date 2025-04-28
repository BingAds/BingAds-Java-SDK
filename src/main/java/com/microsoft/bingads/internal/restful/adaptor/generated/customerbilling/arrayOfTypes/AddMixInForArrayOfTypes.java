package com.microsoft.bingads.internal.restful.adaptor.generated.customerbilling.arrayOfTypes;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.customerbilling.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForArrayOfTypes {
	public static void AddMixInForArrayOfTypes() {
		AdaptorUtil.mapper
				.addMixIn(ArrayOflong.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfstring.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfBillingDocumentInfo.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfBillingDocument.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfPredicate.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfOrderBy.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfInsertionOrder.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCoupon.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfKeyValueEntityOflongstring.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfKeyValueEntityOflongdateTime.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCouponInfoData.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdApiError.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfOperationError.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfBatchError.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfArrayOfOperationError.class, ArrayOfTypesMixIn.class)
				;
	}
}